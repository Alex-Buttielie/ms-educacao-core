package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.components.NeighbordhoodAutoCompleteComponent;
import br.com.coreeduc.aplication.entities.CityEntity;
import br.com.coreeduc.aplication.entities.NeighbordhoodEntity;
import br.com.coreeduc.aplication.records.CompanyRecord;
import br.com.coreeduc.aplication.records.NeighbordhoodRecord;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.repositories.NeighbordhoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class NeighbordhoodServiceImpl implements NeighbordhoodService {

    private final NeighbordhoodRepository neighbordhoodRepository;
    private final CityService cityService;

    @Autowired
    public NeighbordhoodServiceImpl(NeighbordhoodRepository neighbordhoodRepository, CityService cityService) {
        this.neighbordhoodRepository = neighbordhoodRepository;
        this.cityService = cityService;
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
    public List<NeighbordhoodRecord> autoComplete(String value, String key) {
        return NeighbordhoodAutoCompleteComponent.getTipoBuscaAutoComplete(key).findNeighbordhoods(value, key);
    }

    @Override
    public Optional<NeighbordhoodEntity> findNeighbordhoodEntityByDescriptionAndCity(String description, CityEntity city) {
        return neighbordhoodRepository.findNeighbordhoodEntityByDescriptionAndCity(description, city);
    }

    @Override
    public NeighbordhoodEntity createNeighbordhood(CompanyRecord record) {
        var neighbordhood = new NeighbordhoodEntity();
        neighbordhood.setCity(cityService.findCityByCodeMec(record.idCity()));
        neighbordhood.setDescription(record.neighbordhood());
        return neighbordhoodRepository.save(neighbordhood);
    }

}
