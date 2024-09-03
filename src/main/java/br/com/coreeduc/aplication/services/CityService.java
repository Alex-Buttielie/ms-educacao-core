package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.CityEntity;

import java.util.List;

public interface CityService extends CommomService{
    List<CityEntity> autoComplete(String value, String key);
}
