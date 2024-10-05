package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.PessoaEntity;
import br.com.coreeduc.aplication.records.StudentEducacensoRecord;
import br.com.coreeduc.aplication.records.UnitEducacensoRecord;
import br.com.coreeduc.architecture.exceptions.UnserializedMessageRabbitMQ;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacensoStudentServiceImpl implements EducacensoStudentService {

    private ObjectMapper objectMapper;

    @Autowired
    public EducacensoStudentServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public PessoaEntity convetSerializedMessageInPersonEntity(String serializedMessage) {
        return convertRecordInEntity(this.desealizedObject(serializedMessage));
    }

    private PessoaEntity convertRecordInEntity(StudentEducacensoRecord studentEducacensoRecord) {
        return new PessoaEntity(
        );
    }


    public StudentEducacensoRecord desealizedObject(String serializedMessage) {
        try {
            return objectMapper.readValue(serializedMessage, StudentEducacensoRecord.class);
        } catch (JsonProcessingException e) {
            throw new UnserializedMessageRabbitMQ(e.getMessage());
        }
    }

}
