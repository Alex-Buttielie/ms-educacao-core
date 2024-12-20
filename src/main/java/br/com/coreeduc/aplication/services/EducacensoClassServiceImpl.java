package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.contraints.TipoMediacao;
import br.com.coreeduc.aplication.contraints.YepNo;
import br.com.coreeduc.aplication.entities.DiasSemanaTurmaEntity;
import br.com.coreeduc.aplication.entities.FormaOrganizacaoTurmaEntity;
import br.com.coreeduc.aplication.entities.HorarioFuncionamentoTurmaEntity;
import br.com.coreeduc.aplication.entities.TipoAtividadeComplementarEntity;
import br.com.coreeduc.aplication.entities.TurmaEntity;
import br.com.coreeduc.aplication.entities.UnidadeCurricularTurmaEntity;
import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.records.ClassCurricularUnitEducacensoRecord;
import br.com.coreeduc.aplication.records.ClassEducacensoRecord;
import br.com.coreeduc.aplication.records.ClassOrganizationFormsEducacensoRecord;
import br.com.coreeduc.aplication.records.ComplementaryActivityTypeEducacensoRecord;
import br.com.coreeduc.aplication.records.OpeningHoursEducacensoRecord;
import br.com.coreeduc.aplication.records.WeekDaysEducacensoRecord;
import br.com.coreeduc.aplication.repositories.UnidadeEnsinoRepository;
import br.com.coreeduc.architecture.exceptions.UnserializedMessageRabbitMQ;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Function;

@Service
public class EducacensoClassServiceImpl implements EducacensoClassService {

    private ObjectMapper objectMapper;
    private UnidadeEnsinoRepository unidadeEnsinoRepository;

    @Autowired()
    public EducacensoClassServiceImpl(ObjectMapper objectMapper,
                                      UnidadeEnsinoRepository unidadeEnsinoRepository) {
        this.objectMapper = objectMapper;
        this.unidadeEnsinoRepository = unidadeEnsinoRepository;
    }

    @Override
    public ClassEducacensoRecord desealizedObject(String serializedMessage) {
        try {
            return objectMapper.readValue(serializedMessage, ClassEducacensoRecord.class);
        } catch (JsonProcessingException e) {
            throw new UnserializedMessageRabbitMQ(e.getMessage());
        }
    }

    @Override
    public TurmaEntity convertSerializedMessageInClassEntity(String dados) {
        var classEducacensoRecord = desealizedObject(dados);
        var classSchool = new TurmaEntity();
        return convertRecordInEntityTurma(classEducacensoRecord);
    }

    private TurmaEntity convertRecordInEntityTurma(ClassEducacensoRecord classEducacensoRecord) {
        var classSchool = new TurmaEntity();
        classSchool.setCodigoInep(classEducacensoRecord.inepCode());
        classSchool.setCodigoTurma(classEducacensoRecord.codeClass());
        classSchool.setNome(classEducacensoRecord.name());
        classSchool.setTipoMediacao(TipoMediacao.getOrdinalPeloCodigo(classEducacensoRecord.mediationType().toString()));
        classSchool.setHorarioFuncionamento(convertRecordInEntityHorarioFuncionamento(classEducacensoRecord.openingHoursEducacensoRecord()));
        classSchool.setDiasSemana(convertRecordInDiasSemana(classEducacensoRecord.weekDaysEducacensoRecord()));
        classSchool.setEscolarizacao(YepNo.getByCodeToBoolean(classEducacensoRecord.schooling()));
        classSchool.setUnidadeEnsino(findByUnidadeEnsinoEntityFromCodeMec(classEducacensoRecord.inepCode()));
        classSchool.setAtividadeComplementar(YepNo.getByCodeToBoolean(classEducacensoRecord.complementaryActivity()));
        classSchool.setFormaOrganizacaoTurma(convertRecordInEntityFormaOrganizacaoTurma(classEducacensoRecord.classOrganizationFormsEducacensoRecord()));
        classSchool.setFormacaoGeralBasica(YepNo.getByCodeToBoolean(classEducacensoRecord.basicGeneralTraining()));
        classSchool.setItinerarioInformativo(YepNo.getByCodeToBoolean(classEducacensoRecord.informativeItinerary()));
        classSchool.setNaoSeAplica(YepNo.getByCodeToBoolean(classEducacensoRecord.doesNotApply()));
        classSchool.setTipoAtividadeComplementar(convertRecordInEntityTipoAtividadeComplementar(classEducacensoRecord.complementaryActivityTypeEducacensoRecord()));
        classSchool.setUnidadeCurricularTurma(convertRecordInEntityUnidadeCurricularTurma(classEducacensoRecord.classCurricularUnitEducacensoRecord()));
        return classSchool;
    }

    private UnidadeEnsinoEntity findByUnidadeEnsinoEntityFromCodeMec(Long inepCode) {
        return inepCode!= null ? unidadeEnsinoRepository.findById(inepCode).orElse(null): null;
    }

    private UnidadeCurricularTurmaEntity convertRecordInEntityUnidadeCurricularTurma(ClassCurricularUnitEducacensoRecord classCurricularUnitEducacensoRecord) {
        return Optional.ofNullable(classCurricularUnitEducacensoRecord)
                .map(functionConvertRecordInEntityUnidadeCurricularTurma())
                .orElseGet(UnidadeCurricularTurmaEntity::new);
    }

    private Function<ClassCurricularUnitEducacensoRecord, UnidadeCurricularTurmaEntity> functionConvertRecordInEntityUnidadeCurricularTurma() {
        return classCurricularUnitEducacensoRecord -> {
            var unidadeCurricularTurma = new UnidadeCurricularTurmaEntity();
            unidadeCurricularTurma.setEletivas(YepNo.getByCodeToBoolean(classCurricularUnitEducacensoRecord.electives()));
            unidadeCurricularTurma.setLibras(YepNo.getByCodeToBoolean(classCurricularUnitEducacensoRecord.libas()));
            unidadeCurricularTurma.setLingua_indigina(YepNo.getByCodeToBoolean(classCurricularUnitEducacensoRecord.indigenousLanguage()));
            unidadeCurricularTurma.setLinguaLitEspanhol(YepNo.getByCodeToBoolean(classCurricularUnitEducacensoRecord.languageLiteractureSpanish()));
            unidadeCurricularTurma.setLinguaLitFrances(YepNo.getByCodeToBoolean(classCurricularUnitEducacensoRecord.languageLiteractureFrench()));
            unidadeCurricularTurma.setLinguaLitOutras(YepNo.getByCodeToBoolean(classCurricularUnitEducacensoRecord.indigenousLanguage()));
            unidadeCurricularTurma.setProjetoVida(YepNo.getByCodeToBoolean(classCurricularUnitEducacensoRecord.lifeProject()));
            unidadeCurricularTurma.setTrilhaAprofAprendizagem(YepNo.getByCodeToBoolean(classCurricularUnitEducacensoRecord.deepeningLearningTrail()));
            return unidadeCurricularTurma;
        };
    }

    private TipoAtividadeComplementarEntity convertRecordInEntityTipoAtividadeComplementar(ComplementaryActivityTypeEducacensoRecord complementaryActivityTypeEducacensoRecord) {
        return Optional.ofNullable(complementaryActivityTypeEducacensoRecord)
                .map(functionConvertRecordInEntityTipoAtividadeComplementar())
                .orElseGet(TipoAtividadeComplementarEntity::new);
    }

    private Function<ComplementaryActivityTypeEducacensoRecord, TipoAtividadeComplementarEntity> functionConvertRecordInEntityTipoAtividadeComplementar() {
        return complementaryActivityTypeEducacensoRecord -> {
            var tipoAtividadeComplementarEntity = new TipoAtividadeComplementarEntity();
            tipoAtividadeComplementarEntity.setCodigo1(complementaryActivityTypeEducacensoRecord.oneCode());
            tipoAtividadeComplementarEntity.setCodigo2(complementaryActivityTypeEducacensoRecord.twoCode());
            tipoAtividadeComplementarEntity.setCodigo3(complementaryActivityTypeEducacensoRecord.treeCode());
            tipoAtividadeComplementarEntity.setCodigo4(complementaryActivityTypeEducacensoRecord.forCode());
            tipoAtividadeComplementarEntity.setCodigo5(complementaryActivityTypeEducacensoRecord.fiveCode());
            tipoAtividadeComplementarEntity.setCodigo6(complementaryActivityTypeEducacensoRecord.sixCode());
            tipoAtividadeComplementarEntity.setLocalFuncDiferenciado(complementaryActivityTypeEducacensoRecord.differentiatedOperatingLocation());
            tipoAtividadeComplementarEntity.setModalidade(complementaryActivityTypeEducacensoRecord.modality());
            tipoAtividadeComplementarEntity.setEtapa(complementaryActivityTypeEducacensoRecord.step());
            tipoAtividadeComplementarEntity.setCodigoCurso(complementaryActivityTypeEducacensoRecord.courseCode());
            return tipoAtividadeComplementarEntity;
        };
    }

    private FormaOrganizacaoTurmaEntity convertRecordInEntityFormaOrganizacaoTurma(ClassOrganizationFormsEducacensoRecord classOrganizationFormsEducacensoRecord) {
        return Optional.ofNullable(classOrganizationFormsEducacensoRecord)
                .map(functionConvertRecordInEntityFormaOrganizacaoTurma())
                .orElseGet(FormaOrganizacaoTurmaEntity::new);
    }

    private Function<ClassOrganizationFormsEducacensoRecord, FormaOrganizacaoTurmaEntity> functionConvertRecordInEntityFormaOrganizacaoTurma() {
        return classOrganizationFormsEducacensoRecord -> {
            var formaOrganizacaoTurma = new FormaOrganizacaoTurmaEntity();
            formaOrganizacaoTurma.setSeriesAnuais(YepNo.getByCodeToBoolean(classOrganizationFormsEducacensoRecord.annualSeries()));
            formaOrganizacaoTurma.setPeriodosSemestrais(YepNo.getByCodeToBoolean(classOrganizationFormsEducacensoRecord.semesterPeriod()));
            formaOrganizacaoTurma.setCiclos(YepNo.getByCodeToBoolean(classOrganizationFormsEducacensoRecord.cicles()));
            formaOrganizacaoTurma.setGruposNaoSeriados(YepNo.getByCodeToBoolean(classOrganizationFormsEducacensoRecord.nonSerialGroups()));
            formaOrganizacaoTurma.setModulos(YepNo.getByCodeToBoolean(classOrganizationFormsEducacensoRecord.modules()));
            formaOrganizacaoTurma.setAlternanciaPeriodos(YepNo.getByCodeToBoolean(classOrganizationFormsEducacensoRecord.periodAlternation()));
            return formaOrganizacaoTurma;
        };
    }

    private DiasSemanaTurmaEntity convertRecordInDiasSemana(WeekDaysEducacensoRecord weekDaysEducacensoRecord) {
        return Optional.ofNullable(weekDaysEducacensoRecord)
                .map(functionConvertRecordInEntityDiasSemana())
                .orElseGet(DiasSemanaTurmaEntity::new);
    }

    private Function<WeekDaysEducacensoRecord, DiasSemanaTurmaEntity> functionConvertRecordInEntityDiasSemana() {
        return weekDaysEducacensoRecord -> {
            var diasSemana = new DiasSemanaTurmaEntity();
            diasSemana.setDomingo(YepNo.getByCodeToBoolean(weekDaysEducacensoRecord.sunday()));
            diasSemana.setSegunda(YepNo.getByCodeToBoolean(weekDaysEducacensoRecord.monday()));
            diasSemana.setTerca(YepNo.getByCodeToBoolean(weekDaysEducacensoRecord.tuesday()));
            diasSemana.setQuarta(YepNo.getByCodeToBoolean(weekDaysEducacensoRecord.wednesday()));
            diasSemana.setQuinta(YepNo.getByCodeToBoolean(weekDaysEducacensoRecord.thursday()));
            diasSemana.setSexta(YepNo.getByCodeToBoolean(weekDaysEducacensoRecord.friday()));
            diasSemana.setSabado(YepNo.getByCodeToBoolean(weekDaysEducacensoRecord.saturday()));
            return diasSemana;
        };
    }

    private HorarioFuncionamentoTurmaEntity convertRecordInEntityHorarioFuncionamento(OpeningHoursEducacensoRecord openingHoursEducacensoRecord) {
        return Optional.ofNullable(openingHoursEducacensoRecord)
                .map(functionConvertRecordInEntityHorarioFuncionamento())
                .orElseGet(HorarioFuncionamentoTurmaEntity::new);
    }

    private Function<OpeningHoursEducacensoRecord, HorarioFuncionamentoTurmaEntity> functionConvertRecordInEntityHorarioFuncionamento() {
        return openingHoursEducacensoRecord -> {
            var horarioFuncionamentoTurma = new HorarioFuncionamentoTurmaEntity();
            horarioFuncionamentoTurma.setHoraInicial(openingHoursEducacensoRecord.initialHour());
            horarioFuncionamentoTurma.setMinutoInicial(openingHoursEducacensoRecord.initialMinute());
            horarioFuncionamentoTurma.setHoraFinal(openingHoursEducacensoRecord.finalHour());
            horarioFuncionamentoTurma.setMinutoFinal(openingHoursEducacensoRecord.finalMinute());
            return horarioFuncionamentoTurma;
        };
    }

}
