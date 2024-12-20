package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.AbastecimentoAguaEntity;
import br.com.coreeduc.aplication.entities.AcessoInternetEntity;
import br.com.coreeduc.aplication.entities.DependenciasFisicasEntity;
import br.com.coreeduc.aplication.entities.DestinacaoLixoEntity;
import br.com.coreeduc.aplication.entities.EquipamentosExistentesUnidadeEntity;
import br.com.coreeduc.aplication.entities.EquipamentosUsadosAlunosAcessoInternetEntity;
import br.com.coreeduc.aplication.entities.EscolasComQualCompartilhaEntity;
import br.com.coreeduc.aplication.entities.EsgotamentoSanitarioEntity;
import br.com.coreeduc.aplication.entities.FonteEnergiaEletricaEntity;
import br.com.coreeduc.aplication.entities.LocalFuncionamentoEscolaEntity;
import br.com.coreeduc.aplication.entities.QuantidadeComputadoresEmUsoAlunosEntity;
import br.com.coreeduc.aplication.entities.QuantidadeEquipamentosProcessoAprendizagemEntity;
import br.com.coreeduc.aplication.entities.RecursoPessoasDeficientesEntity;
import br.com.coreeduc.aplication.entities.TratamentoLixoEntity;
import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.records.InfrastructureUnitEducacensoRecord;
import br.com.coreeduc.aplication.repositories.UnidadeEnsinoRepository;
import br.com.coreeduc.architecture.exceptions.UnserializedMessageRabbitMQ;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EducacensoInfraestructureUnitServiceImpl implements EducacensoInfraestructureUnitService {

    private final ObjectMapper objectMapper;
    private final EducacensoUnitService educacensoUnitService;
    private final UnidadeEnsinoRepository unidadeEnsinoRepository;

    @Autowired
    public EducacensoInfraestructureUnitServiceImpl(ObjectMapper objectMapper,
                                                    EducacensoUnitService educacensoUnitService,
                                                    UnidadeEnsinoRepository unidadeEnsinoRepository) {
        this.objectMapper = objectMapper;
        this.educacensoUnitService = educacensoUnitService;
        this.unidadeEnsinoRepository = unidadeEnsinoRepository;
    }

    @Override
    public UnidadeEnsinoEntity convetSerializedMessageInUnitInfraEntity(String serializedMessage) {
        var  infrastructureUnitEducacensoRecord = desealizedObject(serializedMessage);
        var unitEntity = unidadeEnsinoRepository.findById(infrastructureUnitEducacensoRecord.inepCodeSchool()).orElseGet(UnidadeEnsinoEntity::new);

        unitEntity.setCodigoInep(infrastructureUnitEducacensoRecord.inepCodeSchool());
        unitEntity.setLocalFuncionamentoEscola(Optional.ofNullable(infrastructureUnitEducacensoRecord.schoolLocationEducacenso()).map(item -> educacensoUnitService.convertSchoolLocationRecordInEntity(item)).orElseGet(LocalFuncionamentoEscolaEntity::new));
        unitEntity.setEscolasComQualCompartilha(Optional.ofNullable(infrastructureUnitEducacensoRecord.schoolParticipationEducacenso()).map(item -> educacensoUnitService.convertScoolParticipationRecordInEntity(item)).orElseGet(EscolasComQualCompartilhaEntity::new));
        unitEntity.setAbastecimentoAgua(Optional.ofNullable(infrastructureUnitEducacensoRecord.waterSupplyEducacenso()).map(item -> educacensoUnitService.convertWaterSupplyRecordInEntity(item)).orElseGet(AbastecimentoAguaEntity::new));
        unitEntity.setFonteEnergiaEletrica(Optional.ofNullable(infrastructureUnitEducacensoRecord.electricEnergySourceEducacenso()).map(item -> educacensoUnitService.convertEletricEnergySourceRecordInEntity(item)).orElseGet(FonteEnergiaEletricaEntity::new));
        unitEntity.setEsgotamentoSanitario(Optional.ofNullable(infrastructureUnitEducacensoRecord.sanitarySewageEducacenso()).map(item -> educacensoUnitService.convertSanitarySewageRecordInEntity(item)).orElseGet(EsgotamentoSanitarioEntity::new));
        unitEntity.setDestinacaoLixo(Optional.ofNullable(infrastructureUnitEducacensoRecord.wasteDisposalEducacenso()).map(item -> educacensoUnitService.convertWasteDisposalRecordInEntity(item)).orElseGet(DestinacaoLixoEntity::new));
        unitEntity.setTratamentoLixo(Optional.ofNullable(infrastructureUnitEducacensoRecord.wasteTreatmentEducacenso()).map(item -> educacensoUnitService.convertWasteTreatmentRecordInentity(item)).orElseGet(TratamentoLixoEntity::new));
        unitEntity.setDependenciasFisicas(Optional.ofNullable(infrastructureUnitEducacensoRecord.physicalDependenciesEducacenso()).map(item -> educacensoUnitService.convertPhysicalDependenciesRecordInEntity(item)).orElseGet(DependenciasFisicasEntity::new));
        unitEntity.setRecursoPessoasDeficientes(Optional.ofNullable(infrastructureUnitEducacensoRecord.disabledPeopleResourceEducacenso()).map(item -> educacensoUnitService.convertDisabledPeopleResourceRecordInEntity(item)).orElseGet(RecursoPessoasDeficientesEntity::new));
        unitEntity.setEquipamentosExistentesUnidade(Optional.ofNullable(infrastructureUnitEducacensoRecord.existingUnitEquipmentEducacenso()).map(item -> educacensoUnitService.convertExistingUnitEquipmentRecordInEntity(item)).orElseGet(EquipamentosExistentesUnidadeEntity::new));
        unitEntity.setQuantidadeEquipamentosProcessoAprendizagem(Optional.ofNullable(infrastructureUnitEducacensoRecord.quantityEquipmentLearningProcessEducacenso()).map(item -> educacensoUnitService.quantityEquimentLearningProcessRecordInEntity(item)).orElseGet(QuantidadeEquipamentosProcessoAprendizagemEntity::new));
        unitEntity.setQuantidadeComputadoresEmUsoAlunos(Optional.ofNullable(infrastructureUnitEducacensoRecord.numberComputersInUseByStudentsEducacenso()).map(item -> educacensoUnitService.convertComputersInUseByStudentsRecordInEntity(item)).orElseGet(QuantidadeComputadoresEmUsoAlunosEntity::new));
        unitEntity.setAcessoInternet(Optional.ofNullable(infrastructureUnitEducacensoRecord.internetAccessEducacenso()).map(item -> educacensoUnitService.convertAccessEducacensoRecordInEntity(item)).orElseGet(AcessoInternetEntity::new));
        unitEntity.setEquipamentosUsadosAlunosAcessoInternet(Optional.ofNullable(infrastructureUnitEducacensoRecord.usedEquipmentStudentsInternetAccessEducacenso()).map(item -> educacensoUnitService.convertEquipmentStudentsInternetAccessRecordInEntity(item)).orElseGet(EquipamentosUsadosAlunosAcessoInternetEntity::new));

        return unitEntity;
    }


    public InfrastructureUnitEducacensoRecord desealizedObject(String serializedMessage) {
        try {
            return objectMapper.readValue(serializedMessage, InfrastructureUnitEducacensoRecord.class);
        } catch (JsonProcessingException e) {
            throw new UnserializedMessageRabbitMQ(e.getMessage());
        }
    }

}
