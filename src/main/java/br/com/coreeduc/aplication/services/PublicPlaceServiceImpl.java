package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.PublicPlaceAutoCompleteComponent;
import br.com.coreeduc.aplication.entities.PublicPlaceEntity;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.repositories.PublicPlaceRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PublicPlaceServiceImpl implements PublicPlaceService {

    private PublicPlaceRespository repository;

    @Autowired
    public PublicPlaceServiceImpl(PublicPlaceRespository repository) {
        this.repository = repository;
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
    public List<PublicPlaceEntity> autoComplete(String value, String key) {
        return PublicPlaceAutoCompleteComponent.getTipoBuscaAutoComplete(key).findPublicPlaces(value, key);
    }

}
