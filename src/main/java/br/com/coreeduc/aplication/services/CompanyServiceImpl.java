package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.contraints.StatesBrazil;
import br.com.coreeduc.aplication.dto.OptionSelectedView;
import br.com.coreeduc.aplication.dto.PropertiesOptionSelectedView;
import br.com.coreeduc.aplication.dto.PropertiesView;
import br.com.coreeduc.aplication.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository repository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository repository) {
        this.repository = repository;
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