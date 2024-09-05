package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.components.BranchActignAutoCompleteComponent;
import br.com.coreeduc.aplication.entities.BranchActing;
import br.com.coreeduc.aplication.entities.DivisionGroupBranchActing;
import br.com.coreeduc.aplication.entities.GroupBranchActing;
import br.com.coreeduc.aplication.entities.SessionBranchActing;
import br.com.coreeduc.aplication.factorys.BranchActingFactory;
import br.com.coreeduc.aplication.records.BranchActingRecord;
import br.com.coreeduc.aplication.records.DivisionBranchActingRecord;
import br.com.coreeduc.aplication.records.GroupBranchActingRecord;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.records.SessionBranchActingRecord;
import br.com.coreeduc.aplication.repositories.BranchActingRepository;
import br.com.coreeduc.aplication.repositories.DivisionGroupBranchActingRepository;
import br.com.coreeduc.aplication.repositories.GroupBranchActingRepository;
import br.com.coreeduc.aplication.repositories.SessionBranchActingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BranchActingServiceImpl implements BranchActingService {

    private BranchActingRepository repository;
    private SessionBranchActingRepository sessionBranchActingRepository;
    private DivisionGroupBranchActingRepository divisionGroupBranchActingRepository;
    private GroupBranchActingRepository groupBranchActingRepository;

    @Autowired
    public BranchActingServiceImpl(BranchActingRepository repository,
                                   SessionBranchActingRepository sessionBranchActingRepository,
                                   DivisionGroupBranchActingRepository divisionGroupBranchActingRepository,
                                   GroupBranchActingRepository groupBranchActingRepository) {
        this.repository = repository;
        this.sessionBranchActingRepository = sessionBranchActingRepository;
        this.divisionGroupBranchActingRepository = divisionGroupBranchActingRepository;
        this.groupBranchActingRepository = groupBranchActingRepository;
    }

    @Override
    public PropertiesViewRecord findPropertiesView() {
        return null;
    }

    @Override
    public Map<String, OptionSelectedViewRecord> findPropertiesFromSeleted() {
        return Map.of();
    }

    @Override
    public List<BranchActingRecord> autoComplete(String value, String key) {
        return BranchActignAutoCompleteComponent
                .getTipoBuscaAutoComplete(key)
                .findBranchsActing(value, key)
                .stream()
                .map(BranchActingFactory::new)
                .map(BranchActingFactory::getBranchActingRecord)
                .collect(Collectors.toList());
    }

    @Override
    public void importBranchActings(List<BranchActingRecord> branchActings) {
        branchActings.forEach(this::processBranchActing);
    }

    private void processBranchActing(BranchActingRecord branch) {
        var secao = branch.grupo().divisao().secao();
        var division = branch.grupo().divisao();
        var group = branch.grupo();

        var sessionBranchActing = getOrCreateSessionBranchActing(secao);
        var divisionGroupBranchActing = getOrCreateDivisionGroupBranchActing(division, sessionBranchActing);
        var groupBranchActing = getOrCreateGroupBranchActing(group, divisionGroupBranchActing);
        var branchActing = getOrCreateBranchActing(branch, groupBranchActing);

        Optional.ofNullable(branchActing).orElseGet(()-> repository.save(branchActing));

    }

    private SessionBranchActing getOrCreateSessionBranchActing(SessionBranchActingRecord secao) {
        return sessionBranchActingRepository.
                findSessionBranchActingByCodeAndDescription(secao.id(), secao.descricao())
                .orElseGet(() -> sessionBranchActingRepository.save(new SessionBranchActing(secao.id(), secao.descricao())));
    }

    private DivisionGroupBranchActing getOrCreateDivisionGroupBranchActing(DivisionBranchActingRecord division, SessionBranchActing sessionBranchActing) {
        return divisionGroupBranchActingRepository.
                findDivisionGroupBranchActingByCodeAndAndDescriptionAndSessionBranchActing(division.id(), division.descricao(),sessionBranchActing)
                .orElseGet(()-> divisionGroupBranchActingRepository.save(new DivisionGroupBranchActing(division.id(), division.descricao(), sessionBranchActing)));
    }

    private GroupBranchActing getOrCreateGroupBranchActing(GroupBranchActingRecord group, DivisionGroupBranchActing divisionGroupBranchActing) {
        return groupBranchActingRepository.
                findGroupBranchActingByCodeAndDescriptionAndDivisionGroupBranchActing(group.id(), group.descricao(), divisionGroupBranchActing)
                .orElseGet(() -> groupBranchActingRepository.save(new GroupBranchActing(group.id(), group.descricao(), divisionGroupBranchActing)));
    }

    private BranchActing getOrCreateBranchActing(BranchActingRecord branch, GroupBranchActing groupBranchActing) {

        String observation =  branch.observacoes().stream().collect(Collectors.joining(";"));

        return repository.
                findBranchActingByCodeAndDescriptionAndObservationAndGroupBranchActing(branch.id(), branch.descricao(), observation,groupBranchActing)
                .orElseGet(() -> repository.save(new BranchActing(branch.id(), branch.descricao(), observation, groupBranchActing)));
    }

}
