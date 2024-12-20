package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.AlunoEntity;
import br.com.coreeduc.aplication.entities.AlunoTurmaEntity;
import br.com.coreeduc.aplication.entities.MatriculaEntity;
import br.com.coreeduc.aplication.entities.PessoaEntity;
import br.com.coreeduc.aplication.entities.TurmaEntity;
import br.com.coreeduc.aplication.records.StudentEducacensoRecord;
import br.com.coreeduc.aplication.repositories.AlunoTurmaRepository;
import br.com.coreeduc.aplication.repositories.MatriculaRepository;
import br.com.coreeduc.aplication.repositories.TurmaRepository;
import br.com.coreeduc.architecture.exceptions.UnserializedMessageRabbitMQ;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class EducacensoStudentServiceImpl implements EducacensoStudentService {

    private final ObjectMapper objectMapper;
    private final AlunoTurmaRepository alunoTurmaRepository;
    private final MatriculaRepository matriculaRepository;
    private final PessoaService pessoaService;
    private final TurmaRepository turmaRepository;

    @Autowired
    public EducacensoStudentServiceImpl(ObjectMapper objectMapper,
                                        AlunoTurmaRepository alunoTurmaRepository,
                                        MatriculaRepository matriculaRepository,
                                        PessoaService pessoaService,
                                        TurmaRepository turmaRepository) {
        this.objectMapper = objectMapper;
        this.alunoTurmaRepository = alunoTurmaRepository;
        this.matriculaRepository = matriculaRepository;
        this.pessoaService = pessoaService;
        this.turmaRepository= turmaRepository;
    }

    @Override
    public AlunoEntity convertSerializedMessageInStudentEntity(String serializedMessage) {
        return convertRecordInEntity(this.desealizedObject(serializedMessage));
    }

    private AlunoEntity convertRecordInEntity(StudentEducacensoRecord studentEducacensoRecord) {
        final var student =  createStudentEntity();
        final var person = getOrCreatePerson(studentEducacensoRecord);
        final var studentsClassEntity =  getStudentClassEntity(studentEducacensoRecord, student);

        student.setPessoa(person);
        student.setAlunoTurma(studentsClassEntity);

        return student;
    }

    private List<AlunoTurmaEntity> getStudentClassEntity(StudentEducacensoRecord studentEducacensoRecord, AlunoEntity student) {
        return findByStudentClassEntity(studentEducacensoRecord, student).stream().map(functionAlterStudent(student)).toList();
    }

    private Function<AlunoTurmaEntity, AlunoTurmaEntity> functionAlterStudent(AlunoEntity student) {
        return studentClass -> {
            studentClass.setAluno(student);
            return studentClass;
        };
    }

    private AlunoEntity createStudentEntity() {
        return new AlunoEntity();
    }

    private PessoaEntity getOrCreatePerson(StudentEducacensoRecord studentEducacensoRecord) {
        return convertRecordInPessoaEntity(studentEducacensoRecord.personCodeSystem());
    }

    private PessoaEntity convertRecordInPessoaEntity(Long personCodeSystem) {
        return pessoaService.rastrearPessoaCacteristicasIndiv(null, null, personCodeSystem)
                .orElseGet(() -> createNewPerson(personCodeSystem));
    }

    private PessoaEntity createNewPerson(Long personCodeSystem) {
        var pessoa = new PessoaEntity();
        pessoa.setCodigo(personCodeSystem);
        return pessoa;
    }

    private List<AlunoTurmaEntity> findByStudentClassEntity(StudentEducacensoRecord studentEducacensoRecord,
                                                            AlunoEntity student) {
        Long enrollmentId = Optional.ofNullable(studentEducacensoRecord.enrollment()).orElse(0L);

        return matriculaRepository.findById(enrollmentId)
                .map(alunoTurmaRepository::findAlunoTurmaByMatricula)
                .map(List::of)
                .orElseGet(() -> processCreateStudentInClass(studentEducacensoRecord.classCodeSchool(), student));
    }

    private List<AlunoTurmaEntity> processCreateStudentInClass(Long classCodeSchool, AlunoEntity student) {
        return Optional.ofNullable(classCodeSchool).map(String::valueOf)
                .map(classCode -> processCreateStudentImport(classCode, student))
                .orElse(Collections.emptyList());
    }

    private List<AlunoTurmaEntity> processCreateStudentImport(String classCode, AlunoEntity student) {
        return turmaRepository.findByCodigoTurma(classCode)
                .map(createStudentInClassExisting(student))
                .orElseGet(() -> createStudentAndClass(classCode));
    }

    private Function<TurmaEntity, List<AlunoTurmaEntity>> createStudentInClassExisting (AlunoEntity student) {
        return classSchool -> {
            var studentClass = new AlunoTurmaEntity();
            studentClass.setTurma(classSchool);
            studentClass.setMatricula(new MatriculaEntity());
            studentClass.setAluno(student);
            return List.of(studentClass);
        };

    }

    private List<AlunoTurmaEntity> createStudentAndClass(String classCode) {
        var studentClass = new AlunoTurmaEntity();
        var turma = new TurmaEntity();
        turma.setCodigoTurma(classCode);
        studentClass.setMatricula(new MatriculaEntity());
        studentClass.setTurma(turma);
        return List.of(studentClass);
    }

    public StudentEducacensoRecord desealizedObject(String serializedMessage) {
        try {
            return objectMapper.readValue(serializedMessage, StudentEducacensoRecord.class);
        } catch (JsonProcessingException e) {
            throw new UnserializedMessageRabbitMQ(e.getMessage());
        }
    }

}
