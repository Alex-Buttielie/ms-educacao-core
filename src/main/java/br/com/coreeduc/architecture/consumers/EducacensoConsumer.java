package br.com.coreeduc.architecture.consumers;

import br.com.coreeduc.aplication.entities.TurmaEntity;
import br.com.coreeduc.aplication.repositories.PessoaRepository;
import br.com.coreeduc.aplication.repositories.ProfessorRepository;
import br.com.coreeduc.aplication.repositories.TurmaRepository;
import br.com.coreeduc.aplication.repositories.UnidadeEnsinoRepository;
import br.com.coreeduc.aplication.services.EducacensoStudentService;
import br.com.coreeduc.aplication.services.EducacensoTeacherService;
import br.com.coreeduc.aplication.services.EducacensoUnitService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Component
public class EducacensoConsumer {

    private static final Logger log = LoggerFactory.getLogger(EducacensoConsumer.class);
    private UnidadeEnsinoRepository unidadeEnsinoRepository;
    private TurmaRepository turmaRepository;
    private PessoaRepository pessoaRepository;
    private ObjectMapper objectMapper;
    private EducacensoUnitService educacensoUnitService;
    private EducacensoStudentService educacensoStudentService;
    private EducacensoTeacherService educacensoTeacherService;
    private ProfessorRepository professorRepository;

    @Autowired
    public EducacensoConsumer(UnidadeEnsinoRepository unidadeEnsinoRepository,
                              PessoaRepository pessoaRepository,
                              TurmaRepository turmaRepository,
                              ObjectMapper objectMapper,
                              EducacensoUnitService educacensoUnitService,
                              EducacensoStudentService educacensoStudentService,
                              EducacensoTeacherService educacensoTeacherService,
                              ProfessorRepository professorRepository) {
        this.unidadeEnsinoRepository = unidadeEnsinoRepository;
        this.pessoaRepository = pessoaRepository;
        this.objectMapper = objectMapper;
        this.turmaRepository = turmaRepository;
        this.educacensoUnitService = educacensoUnitService;
        this.educacensoStudentService = educacensoStudentService;
        this.educacensoTeacherService = educacensoTeacherService;
        this.professorRepository = professorRepository;
    }

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    @Transactional
    public void processMensagem(@Payload Map<String, Object> messageMap) {
        var tipo = (String) messageMap.get("tipo");
        var dados = (String) messageMap.get("dados");

        switch (tipo) {
            case "unidade":
                var unidade = unidadeEnsinoRepository.save(educacensoUnitService.convetSerializedMessageInUnitEntity(dados));
                log.info("Unidade Salva: '{}'", unidade.getNome());
                break;
            case "docenteIndentificacao":
                var pessoaSalva = professorRepository.save(educacensoTeacherService.convertSerializedMessageInPersonEntity(dados));
                log.info("Professor(a) Salvo(a): '{}'", pessoaSalva.getPessoa().getNome());
                break;
            case "turma":
                var turma = processTurma(dados);
                log.info("Turma Salva: '{}'", turma.getNome());
                break;
            default:
                break;
        }
    }

    private TurmaEntity processTurma(String serializedMessage) {
        try {
            var entity = objectMapper.readValue(serializedMessage, TurmaEntity.class);
            return turmaRepository.save(entity);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }


}
