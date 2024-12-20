package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.TurmaEntity;

public interface EducacensoClassService extends EducacensoService {
    TurmaEntity convertSerializedMessageInClassEntity(String dados);
}
