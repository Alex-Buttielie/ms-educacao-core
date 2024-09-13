package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.components.NeighbordhoodAutoCompleteComponent;
import br.com.coreeduc.aplication.entities.NeighbordhoodEntity;
import br.com.coreeduc.aplication.records.NeighbordhoodRecord;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NeighbordhoodServiceImpl implements NeighbordhoodService {

    @Override
    public PropertiesViewRecord findPropertiesView() {
        return null;
    }

    @Override
    public Map<String, OptionSelectedViewRecord> findPropertiesFromSeleted() {
        return Map.of();
    }

    @Override
    public List<NeighbordhoodRecord> autoComplete(String value, String key) {
        return NeighbordhoodAutoCompleteComponent.getTipoBuscaAutoComplete(key).findNeighbordhoods(value, key);
    }

}
