package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.CompanyAutoCompleteComponent;
import br.com.coreeduc.aplication.contraints.StatesBrazil;
import br.com.coreeduc.aplication.entities.CompanyEntity;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesOptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
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
    public List<CompanyEntity> autoComplete(String value, String key) {
        return CompanyAutoCompleteComponent.getTipoBuscaAutoComplete(key).findCompanys(value, key);
    }

    protected OptionSelectedViewRecord getStates() {
        return new OptionSelectedViewRecord(Arrays.stream(StatesBrazil.values())
                .map(state -> new PropertiesOptionSelectedViewRecord(state.getCodigo(), state.getNome()))
                .toList());
    }

}
