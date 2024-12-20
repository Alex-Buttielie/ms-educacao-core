package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.AlunoEntity;

public interface EducacensoStudentService extends EducacensoService{
    AlunoEntity convertSerializedMessageInStudentEntity(String dados);
}
