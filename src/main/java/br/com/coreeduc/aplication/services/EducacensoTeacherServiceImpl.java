package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.contraints.CorRaca;
import br.com.coreeduc.aplication.contraints.LocalizacaoDiferenciadaResidencia;
import br.com.coreeduc.aplication.contraints.LocalizacaoZonaResidencia;
import br.com.coreeduc.aplication.contraints.Nacionalidade;
import br.com.coreeduc.aplication.contraints.Paises;
import br.com.coreeduc.aplication.contraints.Sexo;
import br.com.coreeduc.aplication.contraints.TipoFiliacao;
import br.com.coreeduc.aplication.contraints.TipoPosGraduacao;
import br.com.coreeduc.aplication.contraints.YepNo;
import br.com.coreeduc.aplication.entities.AreaConhecimentoEntity;
import br.com.coreeduc.aplication.entities.FormacaoComplementarPedagogicaProfessorEntity;
import br.com.coreeduc.aplication.entities.OutrosCursosEspecificosEntity;
import br.com.coreeduc.aplication.entities.PessoaEntity;
import br.com.coreeduc.aplication.entities.PosGraduacaoConcluidaProfessorEntity;
import br.com.coreeduc.aplication.entities.ProfessorEntity;
import br.com.coreeduc.aplication.entities.TipoDeficienciaEspectroAltasHabilidadesEntity;
import br.com.coreeduc.aplication.records.CityRecord;
import br.com.coreeduc.aplication.records.OtherSpecificCoursesEducacensoRecord;
import br.com.coreeduc.aplication.records.TeacherEducacensoRecord;
import br.com.coreeduc.aplication.records.TypeImpairmentSpectrumHighSkillsEducacensoRecord;
import br.com.coreeduc.aplication.repositories.AreaConhecimentoRepository;
import br.com.coreeduc.aplication.repositories.AreaPosGraduacaoRepository;
import br.com.coreeduc.aplication.repositories.CityRepository;
import br.com.coreeduc.aplication.repositories.ProfessorRepository;
import br.com.coreeduc.architecture.exceptions.UnserializedMessageRabbitMQ;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Function;

import static br.com.coreeduc.aplication.utils.Util.isCpfValido;

@Service
public class EducacensoTeacherServiceImpl implements EducacensoTeacherService {

    private final ProfessorRepository professorRepository;
    private ObjectMapper objectMapper;
    private PessoaService pessoaService;
    private CityRepository cityRepository;
    private AreaConhecimentoRepository areaConhecimentoRepository;
    private AreaPosGraduacaoRepository areaPosGraduacaoRepository;

    @Autowired
    public EducacensoTeacherServiceImpl(ObjectMapper objectMapper,
                                        CityRepository cityRepository,
                                        AreaConhecimentoRepository areaConhecimentoRepository,
                                        AreaPosGraduacaoRepository areaPosGraduacaoRepository,
                                        PessoaService pessoaService, ProfessorRepository professorRepository) {
        this.objectMapper = objectMapper;
        this.cityRepository = cityRepository;
        this.areaConhecimentoRepository = areaConhecimentoRepository;
        this.areaPosGraduacaoRepository = areaPosGraduacaoRepository;
        this.pessoaService = pessoaService;
        this.professorRepository = professorRepository;
    }

    @Override
    public TeacherEducacensoRecord desealizedObject(String serializedMessage) {
        try {
            return objectMapper.readValue(serializedMessage, TeacherEducacensoRecord.class);
        } catch (JsonProcessingException e) {
            throw new UnserializedMessageRabbitMQ(e.getMessage());
        }
    }

    @Override
    public ProfessorEntity convertSerializedMessageInPersonEntity(String dados) {
        var teacherEducacensoRecord = desealizedObject(dados);
        var pessoa = findPersonOfRecord(teacherEducacensoRecord);
        return createTeacherEntityToRecord(teacherEducacensoRecord, pessoa);
    }

    private ProfessorEntity createTeacherEntityToRecord(TeacherEducacensoRecord teacherEducacensoRecord, PessoaEntity pessoa) {
        var teacherEntity = consultarProfessorPelaPessoa(pessoa);
        teacherEntity.setPessoa(pessoa);
        teacherEntity.setOutrosCursosEspecificos(convertRecordOtherCoursesInEntity(teacherEducacensoRecord.otherSpecificCoursesEducacensoRecord()));
        teacherEntity.setFormacaoComplementarPedagogicaProfessor(convertRecordTeacherInFormasOrganizacaoEntity(teacherEducacensoRecord));
        teacherEntity.setPosGraduacaoConcluidaProfessor(convertRecordTeacherInPosGraducaoEntity(teacherEducacensoRecord));
        teacherEntity.setTipoDeficienciaEspectroAltasHabilidades(convertRecordTypeSpectrumHighSkillsInEntity(teacherEducacensoRecord.typeImpairmentSpectrumHighSkillsEducacensoRecord()));
        return teacherEntity;
    }

    private ProfessorEntity consultarProfessorPelaPessoa(PessoaEntity pessoa) {
        return professorRepository
                .findProfessorEntityByPessoa(pessoaService.rastrearPessoaCacteristicasIndiv(pessoa.getCpf(), pessoa.getNome(), pessoa.getCodigo()).orElse(null))
                .orElseGet(ProfessorEntity::new);
    }

    private TipoDeficienciaEspectroAltasHabilidadesEntity convertRecordTypeSpectrumHighSkillsInEntity(TypeImpairmentSpectrumHighSkillsEducacensoRecord typeImpairmentSpectrumHighSkillsEducacensoRecord) {
        return Optional.ofNullable(typeImpairmentSpectrumHighSkillsEducacensoRecord).map(functionConvertRecordTypeImpaimentInEntity()).orElse(null);
    }

    private Function<TypeImpairmentSpectrumHighSkillsEducacensoRecord, TipoDeficienciaEspectroAltasHabilidadesEntity> functionConvertRecordTypeImpaimentInEntity() {
        return type -> {
            var tipoDeficienciaEspectroAltasHabilidades = new TipoDeficienciaEspectroAltasHabilidadesEntity();
            tipoDeficienciaEspectroAltasHabilidades.setPessoaComDeficienciaEspectroAutistaSuperdotacao(YepNo.getByCodeToBoolean(type.personWithAutismSpectrumDisorderGiftedness()));
            tipoDeficienciaEspectroAltasHabilidades.setCegueira(YepNo.getByCodeToBoolean(type.blindness()));
            tipoDeficienciaEspectroAltasHabilidades.setBaixaVisao(YepNo.getByCodeToBoolean(type.lowVision()));
            tipoDeficienciaEspectroAltasHabilidades.setSurdez(YepNo.getByCodeToBoolean(type.deafness()));
            tipoDeficienciaEspectroAltasHabilidades.setDeficienciaAuditiva(YepNo.getByCodeToBoolean(type.hearingImpairment()));
            tipoDeficienciaEspectroAltasHabilidades.setSurdoCegueira(YepNo.getByCodeToBoolean(type.deafBlindness()));
            tipoDeficienciaEspectroAltasHabilidades.setDeficienciaFisica(YepNo.getByCodeToBoolean(type.physicalDisability()));
            tipoDeficienciaEspectroAltasHabilidades.setDeficienciaIntectual(YepNo.getByCodeToBoolean(type.intellectualDisability()));
            tipoDeficienciaEspectroAltasHabilidades.setDeficienciaMultipla(YepNo.getByCodeToBoolean(type.multipleDisability()));
            tipoDeficienciaEspectroAltasHabilidades.setTranstornoEspectroAutista(YepNo.getByCodeToBoolean(type.autismSpectrumDisorder()));
            tipoDeficienciaEspectroAltasHabilidades.setAltasHabilidadesSuperdotacao(YepNo.getByCodeToBoolean(type.highAbilitiesGiftedness()));
            return tipoDeficienciaEspectroAltasHabilidades;
        };
    }

    private PosGraduacaoConcluidaProfessorEntity convertRecordTeacherInPosGraducaoEntity(TeacherEducacensoRecord teacherEducacensoRecord) {
        var pos =  new PosGraduacaoConcluidaProfessorEntity();

        Optional.ofNullable(teacherEducacensoRecord.postGraduationTeacher1()).ifPresent(posRecord -> {
            pos.setTipoPosGraducacao1(TipoPosGraduacao.getTipoPosGraduacaoByCode(posRecord.type()));
            pos.setAreaPosGraduacao1(areaPosGraduacaoRepository.findById(posRecord.code()).orElse(null));
            pos.setAnoConclusao1(teacherEducacensoRecord.postGraduationTeacher1().yearCompletion());
        });

        Optional.ofNullable(teacherEducacensoRecord.postGraduationTeacher2()).ifPresent(posRecord -> {
            pos.setTipoPosGraducacao2(TipoPosGraduacao.getTipoPosGraduacaoByCode(posRecord.type()));
            pos.setAreaPosGraduacao2(areaPosGraduacaoRepository.findById(posRecord.code()).orElse(null));
            pos.setAnoConclusao2(teacherEducacensoRecord.postGraduationTeacher2().yearCompletion());
        });

        Optional.ofNullable(teacherEducacensoRecord.postGraduationTeacher3()).ifPresent(posRecord -> {
            pos.setTipoPosGraducacao3(TipoPosGraduacao.getTipoPosGraduacaoByCode(posRecord.type()));
            pos.setAreaPosGraduacao3(areaPosGraduacaoRepository.findById(posRecord.code()).orElse(null));
            pos.setAnoConclusao3(teacherEducacensoRecord.postGraduationTeacher3().yearCompletion());
        });

        Optional.ofNullable(teacherEducacensoRecord.postGraduationTeacher4()).ifPresent(posRecord -> {
            pos.setTipoPosGraducacao4(TipoPosGraduacao.getTipoPosGraduacaoByCode(posRecord.type()));
            pos.setAreaPosGraduacao4(areaPosGraduacaoRepository.findById(posRecord.code()).orElse(null));
            pos.setAnoConclusao4(teacherEducacensoRecord.postGraduationTeacher4().yearCompletion());
        });

        Optional.ofNullable(teacherEducacensoRecord.postGraduationTeacher5()).ifPresent(posRecord -> {
            pos.setTipoPosGraducacao5(TipoPosGraduacao.getTipoPosGraduacaoByCode(posRecord.type()));
            pos.setAreaPosGraduacao5(areaPosGraduacaoRepository.findById(posRecord.code()).orElse(null));
            pos.setAnoConclusao5(teacherEducacensoRecord.postGraduationTeacher5().yearCompletion());
        });

        Optional.ofNullable(teacherEducacensoRecord.postGraduationTeacher6()).ifPresent(posRecord -> {
            pos.setTipoPosGraducacao6(TipoPosGraduacao.getTipoPosGraduacaoByCode(posRecord.type()));
            pos.setAreaPosGraduacao6(areaPosGraduacaoRepository.findById(posRecord.code()).orElse(null));
            pos.setAnoConclusao6(teacherEducacensoRecord.postGraduationTeacher6().yearCompletion());

        });

        return pos;
    }

    private FormacaoComplementarPedagogicaProfessorEntity convertRecordTeacherInFormasOrganizacaoEntity(TeacherEducacensoRecord teacherEducacensoRecord) {
        return new FormacaoComplementarPedagogicaProfessorEntity(
                findKnowledgeAreaCurricularComponentsByCode(teacherEducacensoRecord.knowledgeAreaCurricularComponents1()),
                findKnowledgeAreaCurricularComponentsByCode(teacherEducacensoRecord.knowledgeAreaCurricularComponents2()),
                findKnowledgeAreaCurricularComponentsByCode(teacherEducacensoRecord.knowledgeAreaCurricularComponents3())
        );
    }

    private AreaConhecimentoEntity findKnowledgeAreaCurricularComponentsByCode(Long code) {
        return areaConhecimentoRepository.findById(code != null ? code : 0).orElse(null);
    }

    private OutrosCursosEspecificosEntity convertRecordOtherCoursesInEntity(OtherSpecificCoursesEducacensoRecord otherSpecificCoursesEducacensoRecord) {
        return new OutrosCursosEspecificosEntity(
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.nursery()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.preSchool()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.earlyYearsElementarySchool()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.finalYearsElementarySchool()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.highSchool()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.adultEducation()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.specialEducation()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.indigenousEducation()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.ruralEducation()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.environmentalEducation()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.humanRightsEducation()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.genderAndSexualDiversity()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.childAndAdolescentRights()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.ethnicRacialRelationsEducationAfroBrazilianCulture()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.schoolManagement()),
                YepNo.getByCodeToBoolean(otherSpecificCoursesEducacensoRecord.others())
        );
    }

    private PessoaEntity findPersonOfRecord(TeacherEducacensoRecord teacherEducacensoRecord) {
        var pessoa = pessoaService.rastrearPessoaCacteristicasIndiv(teacherEducacensoRecord.cpf(), teacherEducacensoRecord.name(), teacherEducacensoRecord.personCodeInOwnSystem())
                .orElseGet(PessoaEntity::new);

        var cityCodeResidense = Optional.ofNullable(teacherEducacensoRecord.cityResidense()).map(CityRecord::codigoMec).orElse(0L);
        var cityCodeNativity = Optional.ofNullable(teacherEducacensoRecord.cityNativity()).map(CityRecord::codigoMec).orElse(0L);

        pessoa.setIdentificacaoUnica(teacherEducacensoRecord.uniqueIdentification());
        pessoa.setCodigo(teacherEducacensoRecord.personCodeInOwnSystem());
        pessoa.setCpf(isCpfValido(teacherEducacensoRecord.cpf()) ? teacherEducacensoRecord.cpf() : null);
        pessoa.setNome(teacherEducacensoRecord.name());
        pessoa.setDataNascimento(teacherEducacensoRecord.dateBirth());
        pessoa.setTipoFiliacao(TipoFiliacao.getAffiliationTypeByCode(teacherEducacensoRecord.affiliationType()));
        pessoa.setNomeMae(teacherEducacensoRecord.nameMom());
        pessoa.setNomePai(teacherEducacensoRecord.nameFather());
        pessoa.setSexo(Sexo.getSexByCode(Optional.ofNullable(teacherEducacensoRecord.gender()).orElse(0)));
        pessoa.setCorRaca(CorRaca.getColorRaceByCode(teacherEducacensoRecord.colorRace()));
        pessoa.setNacionalidade(Nacionalidade.getNacionalityByCode(Optional.ofNullable(teacherEducacensoRecord.nationality()).orElse(0)));
        pessoa.setPaisNacionalidade(Paises.getCountryByValue(Optional.ofNullable(teacherEducacensoRecord.countryNationality()).orElse(0)));
        pessoa.setFkCityNasc(cityRepository.findById(cityCodeNativity).orElse(null));
        pessoa.setNumeroMatriculaCertidaoNascimento(teacherEducacensoRecord.registrationNumberBirthCertificate());
        pessoa.setPaisResidencia(Paises.getCountryByValue(Optional.ofNullable(teacherEducacensoRecord.countryResidence()).orElse(0)));
        pessoa.setCep(teacherEducacensoRecord.postalCode());
        pessoa.setFkCityResid(cityRepository.findById(cityCodeResidense).orElse(null));
        pessoa.setLocalizacaoZonaResidencia(LocalizacaoZonaResidencia.getByCode(Optional.ofNullable(teacherEducacensoRecord.locationResidentialArea()).orElse(0)));
        pessoa.setLocalizacaoDiferenciadaResidencia(LocalizacaoDiferenciadaResidencia.getByCode(Optional.ofNullable(teacherEducacensoRecord.differentiatedLocationResidence()).orElse(0)));
        pessoa.setEnderecoEletronicoEmail(Optional.ofNullable(teacherEducacensoRecord.otherSpecificCoursesEducacensoRecord()).map(OtherSpecificCoursesEducacensoRecord::electronicAddressEmail).orElse(null));

        return pessoa;
    }

}
