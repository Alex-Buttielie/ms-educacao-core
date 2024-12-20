package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.NeighbordhoodEntity;
import br.com.coreeduc.aplication.entities.PublicPlaceEntity;
import br.com.coreeduc.aplication.records.CompanyRecord;

import java.util.List;
import java.util.Optional;

public interface PublicPlaceService extends CommomService {
    List<PublicPlaceEntity> autoComplete(String value, String key);
    Optional<PublicPlaceEntity> findPublicPlaceEntityByDescriptionAndPostalCodeAndNeighbordhood(String description, String postalCode, NeighbordhoodEntity neighbordhood);
    PublicPlaceEntity createPublicPlace(CompanyRecord record, NeighbordhoodEntity neighbordhood);
}
