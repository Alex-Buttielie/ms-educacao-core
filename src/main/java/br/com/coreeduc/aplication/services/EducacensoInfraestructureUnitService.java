package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;

public interface EducacensoInfraestructureUnitService extends EducacensoService{
    UnidadeEnsinoEntity convetSerializedMessageInUnitInfraEntity(String serializedMessage);
}
