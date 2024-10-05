package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.PessoaEntity;

public interface EducacensoStudentService extends EducacensoService{
    PessoaEntity convetSerializedMessageInPersonEntity(String serializedMessage);
}
