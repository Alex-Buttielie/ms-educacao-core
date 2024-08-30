package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.contraints.StatesBrazil;
import br.com.coreeduc.aplication.dto.OptionSelectedView;
import br.com.coreeduc.aplication.dto.PropertiesOptionSelectedView;
import br.com.coreeduc.aplication.dto.PropertiesView;
import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.repositories.UnidadeEnsinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
    public PropertiesView findPropertiesView() {
        return new PropertiesView(findPropertiesFromSeleted());
    }

    @Override
    public Map<String, OptionSelectedView> findPropertiesFromSeleted() {
        var retorno = new HashMap<String, OptionSelectedView>();
        retorno.put("states", getStates());
        return retorno;
    }

    private OptionSelectedView getStates() {
        return new OptionSelectedView(Arrays.stream(StatesBrazil.values())
                .map(state -> new PropertiesOptionSelectedView(state.getCodigo(), state.getNome()))
                .toList());
    }

}
