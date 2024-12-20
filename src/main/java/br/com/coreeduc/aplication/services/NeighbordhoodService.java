package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.entities.CityEntity;
import br.com.coreeduc.aplication.entities.NeighbordhoodEntity;
import br.com.coreeduc.aplication.records.CompanyRecord;
import br.com.coreeduc.aplication.records.NeighbordhoodRecord;

import java.util.List;
import java.util.Optional;

public interface NeighbordhoodService extends CommomService {
    List<NeighbordhoodRecord> autoComplete(String value, String key);
    Optional<NeighbordhoodEntity> findNeighbordhoodEntityByDescriptionAndCity(String description, CityEntity city);
    NeighbordhoodEntity createNeighbordhood(CompanyRecord record);
}
