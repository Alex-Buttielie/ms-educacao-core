package br.com.coreeduc.aplication.consumers;

import br.com.coreeduc.aplication.entities.PessoaEntity;
import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.repositories.PessoaRepository;
import br.com.coreeduc.aplication.repositories.UnidadeEnsinoRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Component
public class EducacensoConsumer {

    private UnidadeEnsinoRepository unidadeEnsinoRepository;
    private PessoaRepository pessoaRepository;
    private ObjectMapper objectMapper;

    @Autowired
    public EducacensoConsumer(UnidadeEnsinoRepository unidadeEnsinoRepository,
                              PessoaRepository pessoaRepository,
                              ObjectMapper objectMapper) {
        this.unidadeEnsinoRepository = unidadeEnsinoRepository;
        this.pessoaRepository = pessoaRepository;
        this.objectMapper = objectMapper;
    }

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    @Transactional
    public void processMensagem(@Payload Map<String, Object> messageMap) {
        String tipo = (String) messageMap.get("tipo");
        String dados = (String) messageMap.get("dados");

        switch (tipo) {
            case "unidade":
                processUnidade(dados);
                break;
            case "pessoa":
                processPessoa(dados);
                break;
            default:
                break;
        }
    }

    private void processUnidade(String serializedMessage) {
        try {
            UnidadeEnsinoEntity entity = objectMapper.readValue(serializedMessage, UnidadeEnsinoEntity.class);
            unidadeEnsinoRepository.save(entity);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    private void processPessoa(String serializedMessage) {
        try {
            PessoaEntity entity = objectMapper.readValue(serializedMessage, PessoaEntity.class);
            pessoaRepository.save(entity);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
