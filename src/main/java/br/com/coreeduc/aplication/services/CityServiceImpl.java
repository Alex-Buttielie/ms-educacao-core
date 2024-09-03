package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.CityAutoCompleteComponent;
import br.com.coreeduc.aplication.entities.CityEntity;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;


    @Override
    public PropertiesViewRecord findPropertiesView() {
        return null;
    }

    @Override
    public Map<String, OptionSelectedViewRecord> findPropertiesFromSeleted() {
        return Map.of();
    }

    @Override
    public List<CityEntity> autoComplete(String value, String key) {
        return CityAutoCompleteComponent.getTipoBuscaAutoComplete(key).findCitys(value, key);
    }
}
