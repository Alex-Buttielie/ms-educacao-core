package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.contraints.StatesBrazil;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesOptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.repositories.UnidadeEnsinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

@Service
public class UnidadeEnsinoServiceImpl implements UnidadeEnsinoService {

    private UnidadeEnsinoRepository repository;

    @Autowired
    public UnidadeEnsinoServiceImpl(UnidadeEnsinoRepository repository) {
        this.repository = repository;
    }

    @Override
    public UnidadeEnsinoEntity salvar(UnidadeEnsinoEntity unidadeEnsino) {
        return repository.save(unidadeEnsino);
    }

    @Override
    public List<UnidadeEnsinoEntity> buscar() {
        return repository.findAll();
    }

    @Override
    public Optional<UnidadeEnsinoEntity> findById(Long codigoInep) {
        return repository.findById(codigoInep);
    }

    @Override
    public PropertiesViewRecord findPropertiesView() {
        return new PropertiesViewRecord(findPropertiesFromSeleted());
    }

    @Override
    public Map<String, OptionSelectedViewRecord> findPropertiesFromSeleted() {
        var retorno = new HashMap<String, OptionSelectedViewRecord>();
        retorno.put("states", getStates());
        return retorno;
    }

    @Override
    public List<UnidadeEnsinoEntity> autoComplete(String properties, String key) {
        return null;
    }

    private OptionSelectedViewRecord getStates() {
        return new OptionSelectedViewRecord(Arrays.stream(StatesBrazil.values())
                .map(state -> new PropertiesOptionSelectedViewRecord(state.getCodigo(), state.getNome()))
                .toList());
    }

}
