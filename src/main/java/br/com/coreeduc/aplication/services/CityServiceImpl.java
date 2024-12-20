package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.CityAutoCompleteComponent;
import br.com.coreeduc.aplication.contraints.StatesBrazil;
import br.com.coreeduc.aplication.entities.CityEntity;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
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
    public List<CityEntity> autoComplete(String value, String key) {
        return CityAutoCompleteComponent.getTipoBuscaAutoComplete(key).findCitys(value, key);
    }

    @Override
    public void importCitys(List<Map<String, Object>> citys) {
        var citysEntitys = citys.stream().map(functionReturnCityEntityToMap).collect(Collectors.toList());
        cityRepository.saveAllAndFlush(citysEntitys);
        cityRepository.flush();

    }

    @Override
    public CityEntity findCityByCodeMec(Number id) {
        return Optional.ofNullable(id).map(idd->cityRepository.findById(idd.longValue()).orElse(null)).orElse(null);
    }

    private Function<Map<String, Object>, CityEntity> functionReturnCityEntityToMap = cityMap -> {
        var state = StatesBrazil.fromCodigoState(Long.parseLong(cityMap.get("state_id").toString())).getCodigo();
        var id = Long.parseLong(cityMap.get("id").toString());
        var name = cityMap.get("name").toString();
        var city = new CityEntity();
        city.setCodigoMec(id);
        city.setName(name);
        city.setState(state);
        return city;
    };

}
