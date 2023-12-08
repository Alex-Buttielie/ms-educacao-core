package br.com.coreeduc.adapters.outbound.consumers;

import br.com.coreeduc.aplication.domains.Pessoa;
import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import br.com.coreeduc.aplication.ports.repositories.PessoaRepositoryPort;
import br.com.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;
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

    private UnidadeEnsinoRepositoryPort unidadeEnsinoRepositoryPort;
    private PessoaRepositoryPort pessoaRepositoryPort;
    private ObjectMapper objectMapper;

    @Autowired
    public EducacensoConsumer(UnidadeEnsinoRepositoryPort unidadeEnsinoRepositoryPort,
                              PessoaRepositoryPort pessoaRepositoryPort,
                              ObjectMapper objectMapper) {
        this.unidadeEnsinoRepositoryPort = unidadeEnsinoRepositoryPort;
        this.pessoaRepositoryPort = pessoaRepositoryPort;
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
            UnidadeEnsino entity = objectMapper.readValue(serializedMessage, UnidadeEnsino.class);
            unidadeEnsinoRepositoryPort.save(entity);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    private void processPessoa(String serializedMessage) {
        try {
            Pessoa entity = objectMapper.readValue(serializedMessage, Pessoa.class);
            pessoaRepositoryPort.save(entity);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
