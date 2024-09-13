package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.PublicPlaceEntity;

import java.util.List;

public interface PublicPlaceService extends CommomService {
    @Override
    List<PublicPlaceEntity> autoComplete(String value, String key);
}
