package br.com.coreeduc.architecture.consumers;

import br.com.coreeduc.aplication.repositories.AlunoRepository;
import br.com.coreeduc.aplication.repositories.ProfessorRepository;
import br.com.coreeduc.aplication.repositories.TurmaRepository;
import br.com.coreeduc.aplication.repositories.UnidadeEnsinoRepository;
import br.com.coreeduc.aplication.services.EducacensoClassService;
import br.com.coreeduc.aplication.services.EducacensoInfraestructureUnitService;
import br.com.coreeduc.aplication.services.EducacensoStudentService;
import br.com.coreeduc.aplication.services.EducacensoTeacherService;
import br.com.coreeduc.aplication.services.EducacensoUnitService;
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
    private EducacensoUnitService educacensoUnitService;
    private EducacensoStudentService educacensoStudentService;
    private EducacensoTeacherService educacensoTeacherService;
    private EducacensoClassService educacensoClassService;
    private ProfessorRepository professorRepository;
    private AlunoRepository alunoRepository;
    private EducacensoInfraestructureUnitService educacensoInfraestructureUnitService;

    @Autowired
    public EducacensoConsumer(UnidadeEnsinoRepository unidadeEnsinoRepository,
                              TurmaRepository turmaRepository,
                              EducacensoUnitService educacensoUnitService,
                              EducacensoStudentService educacensoStudentService,
                              EducacensoTeacherService educacensoTeacherService,
                              EducacensoClassService educacensoClassService,
                              ProfessorRepository professorRepository,
                              AlunoRepository alunoRepository,
                              EducacensoInfraestructureUnitService educacensoInfraestructureUnitService) {

        this.unidadeEnsinoRepository = unidadeEnsinoRepository;
        this.turmaRepository = turmaRepository;
        this.educacensoUnitService = educacensoUnitService;
        this.educacensoStudentService = educacensoStudentService;
        this.educacensoTeacherService = educacensoTeacherService;
        this.educacensoClassService = educacensoClassService;
        this.professorRepository = professorRepository;
        this.alunoRepository = alunoRepository;
        this.educacensoInfraestructureUnitService = educacensoInfraestructureUnitService;
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
            case "unidadeInfra":
                var unidadeInfra = unidadeEnsinoRepository.save(educacensoInfraestructureUnitService.convetSerializedMessageInUnitInfraEntity(dados));
                log.info("Unidade Infraestrutura Salva: '{}'", unidadeInfra.getCodigoInep());
                break;
            case "docenteIndentificacao":
                var pessoaSalva = professorRepository.save(educacensoTeacherService.convertSerializedMessageInPersonEntity(dados));
                log.info("Professor(a) Salvo(a): '{}'", pessoaSalva.getPessoa().getNome());
                break;
            case "turma":
                var turma  = turmaRepository.save(educacensoClassService.convertSerializedMessageInClassEntity(dados));
                log.info("Turma Salva: '{}'", turma.getNome());
                break;
            case "aluno":
                var aluno  = alunoRepository.save(educacensoStudentService.convertSerializedMessageInStudentEntity(dados));
                log.info("Aluno(a) Salvo(a): '{}'", aluno.getId());
                break;
            default:
                break;
        }
    }

}
