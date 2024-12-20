package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.ProfessorEntity;

public interface EducacensoTeacherService extends EducacensoService{
    ProfessorEntity convertSerializedMessageInPersonEntity(String dados);
}
