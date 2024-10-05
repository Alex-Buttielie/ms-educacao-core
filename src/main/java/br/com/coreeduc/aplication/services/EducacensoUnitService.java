package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;

public interface EducacensoUnitService extends EducacensoService{
    UnidadeEnsinoEntity convetSerializedMessageInUnitEntity(String serializedMessage);
}
