package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.CityEntity;

import java.util.List;
import java.util.Map;

public interface CityService extends CommomService{
    List<CityEntity> autoComplete(String value, String key);
    void importCitys(List<Map<String, Object>> citys);
}
