package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.contraints.CategoriaEscola;
import br.com.coreeduc.aplication.contraints.DependenciaAdministrativa;
import br.com.coreeduc.aplication.contraints.EducacaoBasica;
import br.com.coreeduc.aplication.contraints.FormaOcupacaoPredio;
import br.com.coreeduc.aplication.contraints.LocalizacaoDiferenciadaResidencia;
import br.com.coreeduc.aplication.contraints.LocalizacaoZonaResidencia;
import br.com.coreeduc.aplication.contraints.ProjetoPoliticoLeiLdb12;
import br.com.coreeduc.aplication.contraints.Regulamentacao;
import br.com.coreeduc.aplication.contraints.SituacaoFuncionamento;
import br.com.coreeduc.aplication.entities.AbastecimentoAguaEntity;
import br.com.coreeduc.aplication.entities.AcessoInternetEntity;
import br.com.coreeduc.aplication.entities.CityEntity;
import br.com.coreeduc.aplication.entities.DependenciasFisicasEntity;
import br.com.coreeduc.aplication.entities.DestinacaoLixoEntity;
import br.com.coreeduc.aplication.entities.EnderecoUnidadeEntity;
import br.com.coreeduc.aplication.entities.EquipamentosExistentesUnidadeEntity;
import br.com.coreeduc.aplication.entities.EquipamentosUsadosAlunosAcessoInternetEntity;
import br.com.coreeduc.aplication.entities.EscolasComQualCompartilhaEntity;
import br.com.coreeduc.aplication.entities.EsferaAdministrativaEntity;
import br.com.coreeduc.aplication.entities.EsgotamentoSanitarioEntity;
import br.com.coreeduc.aplication.entities.FonteEnergiaEletricaEntity;
import br.com.coreeduc.aplication.entities.FormasContratacaoEntity;
import br.com.coreeduc.aplication.entities.IdiomaEnsinoEntity;
import br.com.coreeduc.aplication.entities.InstrumentosMateriaisSocioCulturaisEntity;
import br.com.coreeduc.aplication.entities.LinguaIndigenaEntity;
import br.com.coreeduc.aplication.entities.LocalFuncionamentoEscolaEntity;
import br.com.coreeduc.aplication.entities.MantenedoraEscolaPrivadaEntity;
import br.com.coreeduc.aplication.entities.NumeroMatriculasAtendidasParceriaConvenioEntity;
import br.com.coreeduc.aplication.entities.OrgaosColegiadosFuncionamentoEscolaEntity;
import br.com.coreeduc.aplication.entities.QuantidadeComputadoresEmUsoAlunosEntity;
import br.com.coreeduc.aplication.entities.QuantidadeEquipamentosProcessoAprendizagemEntity;
import br.com.coreeduc.aplication.entities.RecursoPessoasDeficientesEntity;
import br.com.coreeduc.aplication.entities.RedeLocalInterligacaoComputadoresEntity;
import br.com.coreeduc.aplication.entities.ReservaVagasSistemaCotasEntity;
import br.com.coreeduc.aplication.entities.TotalProfissionaisAtivosEscolaEntity;
import br.com.coreeduc.aplication.entities.TratamentoLixoEntity;
import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.records.AdministrativeSphereEducacensoRecord;
import br.com.coreeduc.aplication.records.AdressUnitEducacensoRecord;
import br.com.coreeduc.aplication.records.DisabledPeopleResourceEducacensoRecord;
import br.com.coreeduc.aplication.records.ElectricEnergySourceEducacensoRecord;
import br.com.coreeduc.aplication.records.ExistingUnitEquipmentEducacensoRecord;
import br.com.coreeduc.aplication.records.FormsOfHiringEducacensoRecord;
import br.com.coreeduc.aplication.records.InstrumentsMaterialsSocioCulturalEducacensoRecord;
import br.com.coreeduc.aplication.records.InternetAccessEducacensoRecord;
import br.com.coreeduc.aplication.records.LanguageTeachingEducacensoRecord;
import br.com.coreeduc.aplication.records.LocalNetworkInterconnectionComputersEducacensoRecord;
import br.com.coreeduc.aplication.records.NumberComputersInUseByStudentsEducacensoRecord;
import br.com.coreeduc.aplication.records.NumberRegistrationsServedPartnershipAgreementEducacensoRecord;
import br.com.coreeduc.aplication.records.OrganizationsCollegiateOperationSchoolEducacensoRecord;
import br.com.coreeduc.aplication.records.PhysicalDependenciesEducacensoRecord;
import br.com.coreeduc.aplication.records.PrivateSchoolSupporterEducacensoRecord;
import br.com.coreeduc.aplication.records.QuantityEquipmentLearningProcessEducacensoRecord;
import br.com.coreeduc.aplication.records.ReservationVacanciesSystemQuotasEducacensoRecord;
import br.com.coreeduc.aplication.records.SanitarySewageEducacensoRecord;
import br.com.coreeduc.aplication.records.SchoolLocationEducacensoRecord;
import br.com.coreeduc.aplication.records.SchoolParticipationEducacensoRecord;
import br.com.coreeduc.aplication.records.TotalProfessionalsActivesSchoolEducacensoRecord;
import br.com.coreeduc.aplication.records.UnitEducacensoRecord;
import br.com.coreeduc.aplication.records.UsedEquipmentStudentsInternetAccessEducacensoRecord;
import br.com.coreeduc.aplication.records.WasteDisposalEducacensoRecord;
import br.com.coreeduc.aplication.records.WasteTreatmentEducacensoRecord;
import br.com.coreeduc.aplication.records.WaterSupplyEducacensoRecord;
import br.com.coreeduc.architecture.exceptions.UnserializedMessageRabbitMQ;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.coreeduc.aplication.contraints.YepNo.getByCodeToBoolean;
import static java.util.Optional.ofNullable;

@Service
public class EducacensoUnitServiceImpl implements EducacensoUnitService{

    protected ObjectMapper objectMapper;

    @Autowired
    public EducacensoUnitServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public UnidadeEnsinoEntity convetSerializedMessageInUnitEntity(String serializedMessage) {
        return convertRecordInEntity((UnitEducacensoRecord) this.desealizedObject(serializedMessage));
    }

    private UnidadeEnsinoEntity convertRecordInEntity(UnitEducacensoRecord unitEducacensoRecord) {
        return new UnidadeEnsinoEntity(
                unitEducacensoRecord.codeInep(),
                unitEducacensoRecord.name(),
                SituacaoFuncionamento.getFromCode(unitEducacensoRecord.operatingStatus()),
                unitEducacensoRecord.dateStartYearSchool(),
                unitEducacensoRecord.dateEndYearSchool(),
                unitEducacensoRecord.telephone(),
                unitEducacensoRecord.otherPhoneContact(),
                unitEducacensoRecord.addressElectronicEmailSchool(),
                unitEducacensoRecord.regionalEducationBodyCode(),
                LocalizacaoZonaResidencia.getByCode(unitEducacensoRecord.locationSchoolZone()),
                LocalizacaoDiferenciadaResidencia.getByCode(unitEducacensoRecord.locationDifferentiatedSchool()),
                DependenciaAdministrativa.getFromCode(unitEducacensoRecord.dependencyAdministrative()),
                getByCodeToBoolean(unitEducacensoRecord.secretariatEducation()),
                getByCodeToBoolean(unitEducacensoRecord.publicSecuritySecretariat()),
                getByCodeToBoolean(unitEducacensoRecord.secretaryHealth()),
                getByCodeToBoolean(unitEducacensoRecord.otherPublicAdministrationBody()),
                getByCodeToBoolean(unitEducacensoRecord.stateSecretariat()),
                getByCodeToBoolean(unitEducacensoRecord.municipalSecretariat()),
                getByCodeToBoolean(unitEducacensoRecord.NoPartnershipAgreement()),
                ofNullable(unitEducacensoRecord.administrativeSphereEducacensoRecord()).map(this::convertAdministrativeSphereRecordInEntity).orElse(new EsferaAdministrativaEntity()),
                ofNullable(unitEducacensoRecord.adressUnitEducacensoRecord()).map(this::convetAdressUnitRecordInEntity).orElse(new EnderecoUnidadeEntity()),
                ofNullable(unitEducacensoRecord.privateSchoolSupporterEducacensoRecord()).map(this::convertPrivateSchoolSupporterRecordInEntity).orElse(new MantenedoraEscolaPrivadaEntity()),
                ofNullable(unitEducacensoRecord.formsOfHiringEducacensoRecord()).map(this::convertFormsOfHiringRecordInEntity).orElse(new FormasContratacaoEntity()),
                ofNullable(unitEducacensoRecord.numberRegistrationsServedPartnershipAgreementEducacensoRecord()).map(this::convertNumberRegistrationServedRecordInEntity).orElse(new NumeroMatriculasAtendidasParceriaConvenioEntity()),
                ofNullable(unitEducacensoRecord.schoolLocationEducacensoRecord()).map(this::convertSchoolLocationRecordInEntity).orElse(new LocalFuncionamentoEscolaEntity()),
                ofNullable(unitEducacensoRecord.schoolParticipationEducacensoRecord()).map(this::convertScoolParticipationRecordInEntity).orElse(new EscolasComQualCompartilhaEntity()),
                ofNullable(unitEducacensoRecord.waterSupplyEducacensoRecord()).map(this::convertWaterSupplyRecordInEntity).orElse(new AbastecimentoAguaEntity()),
                ofNullable(unitEducacensoRecord.electricEnergySourceEducacensoRecord()).map(this::convertEletricEnergySourceRecordInEntity).orElse(new FonteEnergiaEletricaEntity()),
                ofNullable(unitEducacensoRecord.sanitarySewageEducacensoRecord()).map(this::convertSanitarySewageRecordInEntity).orElse(new EsgotamentoSanitarioEntity()),
                ofNullable(unitEducacensoRecord.wasteDisposalEducacensoRecord()).map(this::convertWasteDisposalRecordInEntity).orElse(new DestinacaoLixoEntity()),
                ofNullable(unitEducacensoRecord.wasteTreatmentEducacensoRecord()).map(this::convertWasteTreatmentRecordInentity).orElse(new TratamentoLixoEntity()),
                ofNullable(unitEducacensoRecord.physicalDependenciesEducacensoRecord()).map(this::convertPhysicalDependenciesRecordInEntity).orElse(new DependenciasFisicasEntity()),
                ofNullable(unitEducacensoRecord.disabledPeopleResourceEducacensoRecord()).map(this::convertDisabledPeopleResourceRecordInEntity).orElse(new RecursoPessoasDeficientesEntity()),
                ofNullable(unitEducacensoRecord.existingUnitEquipmentEducacensoRecord()).map(this::convertExistingUnitEquipmentRecordInEntity).orElse(new EquipamentosExistentesUnidadeEntity()),
                ofNullable(unitEducacensoRecord.quantityEquipmentLearningProcessEducacensoRecord()).map(this::quantityEquimentLearningProcessRecordInEntity).orElse(new QuantidadeEquipamentosProcessoAprendizagemEntity()),
                ofNullable(unitEducacensoRecord.numberComputersInUseByStudentsEducacensoRecord()).map(this::convertComputersInUseByStudentsRecordInEntity).orElse(new QuantidadeComputadoresEmUsoAlunosEntity()),
                ofNullable(unitEducacensoRecord.internetAccessEducacensoRecord()).map(this::convertAccessEducacensoRecordInEntity).orElse(new AcessoInternetEntity()),
                ofNullable(unitEducacensoRecord.usedEquipmentStudentsInternetAccessEducacensoRecord()).map(this::convertEquipmentStudentsInternetAccessRecordInEntity).orElse(new EquipamentosUsadosAlunosAcessoInternetEntity()),
                ofNullable(unitEducacensoRecord.localNetworkInterconnectionComputersEducacensoRecord()).map(this::convertNetworkInterconnectionComputersRecordInEntity).orElse(new RedeLocalInterligacaoComputadoresEntity()),
                ofNullable(unitEducacensoRecord.totalProfessionalsActivesSchoolEducacensoRecord()).map(this::convertTotalProfessionalsActivesSchoolRecordInEntity).orElse(new TotalProfissionaisAtivosEscolaEntity()),
                ofNullable(unitEducacensoRecord.instrumentsMaterialsSocioCulturalEducacensoRecord()).map(this::convertInstrumentsMaterialsSocioCulturalRecordInEntity).orElse(new InstrumentosMateriaisSocioCulturaisEntity()),
                ofNullable(unitEducacensoRecord.languageTeachingEducacensoRecord()).map(this::convertLanguageTeachingEducacensoRecord).orElse(new IdiomaEnsinoEntity()),
                ofNullable(unitEducacensoRecord.reservationVacanciesSystemQuotasEducacensoRecord()).map(this::convertReservationVacanciesSystemQuotasRecordInEntity).orElse(new ReservaVagasSistemaCotasEntity()),
                ofNullable(unitEducacensoRecord.organizationsCollegiateOperationSchoolEducacensoRecord()).map(this::convertOrganizationsCollegiateOperationSchoolRecordInEntity).orElse(new OrgaosColegiadosFuncionamentoEscolaEntity())
        );
    }

    private OrgaosColegiadosFuncionamentoEscolaEntity convertOrganizationsCollegiateOperationSchoolRecordInEntity(OrganizationsCollegiateOperationSchoolEducacensoRecord organizationsCollegiateOperationSchoolEducacensoRecord) {
        return new OrgaosColegiadosFuncionamentoEscolaEntity(
                getByCodeToBoolean(organizationsCollegiateOperationSchoolEducacensoRecord.parentsAssociation()),
                getByCodeToBoolean(organizationsCollegiateOperationSchoolEducacensoRecord.parentsAndTeachersAssociation()),
                getByCodeToBoolean(organizationsCollegiateOperationSchoolEducacensoRecord.schoolCouncil()),
                getByCodeToBoolean(organizationsCollegiateOperationSchoolEducacensoRecord.studentUnion()),
                getByCodeToBoolean(organizationsCollegiateOperationSchoolEducacensoRecord.others()),
                getByCodeToBoolean(organizationsCollegiateOperationSchoolEducacensoRecord.areCollegiateBodiesOperational()),
                ProjetoPoliticoLeiLdb12.getForCode(organizationsCollegiateOperationSchoolEducacensoRecord.politicalProjectLawLdb12())
        );
    }

    private ReservaVagasSistemaCotasEntity convertReservationVacanciesSystemQuotasRecordInEntity(ReservationVacanciesSystemQuotasEducacensoRecord reservationVacanciesSystemQuotasEducacensoRecord) {
        return new ReservaVagasSistemaCotasEntity(
                getByCodeToBoolean(reservationVacanciesSystemQuotasEducacensoRecord.selfDeclaredBlackBrownOrIndigenous()),
                getByCodeToBoolean(reservationVacanciesSystemQuotasEducacensoRecord.incomeCondition()),
                getByCodeToBoolean(reservationVacanciesSystemQuotasEducacensoRecord.fromPublicSchool()),
                getByCodeToBoolean(reservationVacanciesSystemQuotasEducacensoRecord.personWithDisability()),
                getByCodeToBoolean(reservationVacanciesSystemQuotasEducacensoRecord.otherNonListedGroups()),
                getByCodeToBoolean(reservationVacanciesSystemQuotasEducacensoRecord.hasVacancyReservationQuotas()),
                getByCodeToBoolean(reservationVacanciesSystemQuotasEducacensoRecord.schoolHasInstitutionalCommunicationNetworks()),
                getByCodeToBoolean(reservationVacanciesSystemQuotasEducacensoRecord.schoolSharesSpacesWithCommunity()),
                getByCodeToBoolean(reservationVacanciesSystemQuotasEducacensoRecord.spaceUsedForStudentActivities()));
    }

    private IdiomaEnsinoEntity convertLanguageTeachingEducacensoRecord(LanguageTeachingEducacensoRecord languageTeachingEducacensoRecord) {
        return new IdiomaEnsinoEntity(
                getByCodeToBoolean(languageTeachingEducacensoRecord.indigenousLanguage()),
                getByCodeToBoolean(languageTeachingEducacensoRecord.portugueseLanguage()),
                getLanguageIndigenous(languageTeachingEducacensoRecord.indigenousLanguageCode1()),
                getLanguageIndigenous(languageTeachingEducacensoRecord.indigenousLanguageCode2()),
                getLanguageIndigenous(languageTeachingEducacensoRecord.indigenousLanguageCode3()),
                getByCodeToBoolean(languageTeachingEducacensoRecord.conductsStudentAssessmentExams())
        );
    }

    private LinguaIndigenaEntity getLanguageIndigenous(Integer value) {
        return value != null ? new LinguaIndigenaEntity(Long.parseLong(value.toString())) : null;
    }

    private InstrumentosMateriaisSocioCulturaisEntity convertInstrumentsMaterialsSocioCulturalRecordInEntity(InstrumentsMaterialsSocioCulturalEducacensoRecord instrumentsMaterialsSocioCulturalEducacensoRecord) {
        return new InstrumentosMateriaisSocioCulturaisEntity(
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.multimediaCollection()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.earlyChildhoodToys()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.scientificMaterialsSet()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.amplificationEquipment()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.musicalInstruments()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.educationalGames()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.culturalActivityMaterials()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.vocationalEducationMaterials()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.sportsRecreationMaterials()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.pedagogicalMaterialsIndigenousEducation()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.pedagogicalMaterialsEthnicRacialEducation()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.pedagogicalMaterialsRuralEducation()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.noneOfTheListedInstruments()),
                getByCodeToBoolean(instrumentsMaterialsSocioCulturalEducacensoRecord.indigenousSchoolEducation()));
    }

    private TotalProfissionaisAtivosEscolaEntity convertTotalProfessionalsActivesSchoolRecordInEntity(TotalProfessionalsActivesSchoolEducacensoRecord totalProfessionalsActivesSchoolEducacensoRecord) {
        return new TotalProfissionaisAtivosEscolaEntity(
                totalProfessionalsActivesSchoolEducacensoRecord.administrativeAssistants(),
                totalProfessionalsActivesSchoolEducacensoRecord.generalServicesAssistant(),
                totalProfessionalsActivesSchoolEducacensoRecord.librarianAssistantMonitor(),
                totalProfessionalsActivesSchoolEducacensoRecord.firefighterBrigadier(),
                totalProfessionalsActivesSchoolEducacensoRecord.disciplinaryTurnCoordinator(),
                totalProfessionalsActivesSchoolEducacensoRecord.speechTherapist(),
                totalProfessionalsActivesSchoolEducacensoRecord.nutritionist(),
                totalProfessionalsActivesSchoolEducacensoRecord.schoolPsychologist(),
                totalProfessionalsActivesSchoolEducacensoRecord.preparationProfessionals(),
                totalProfessionalsActivesSchoolEducacensoRecord.supportSupervisionProfessionals(),
                totalProfessionalsActivesSchoolEducacensoRecord.schoolSecretary(),
                totalProfessionalsActivesSchoolEducacensoRecord.securityGuardOrAssetProtection(),
                totalProfessionalsActivesSchoolEducacensoRecord.laboratoryAssistants(),
                totalProfessionalsActivesSchoolEducacensoRecord.vicePrincipal(),
                totalProfessionalsActivesSchoolEducacensoRecord.communityAdvisor(),
                getByCodeToBoolean(totalProfessionalsActivesSchoolEducacensoRecord.listedFunctionProfessionals()),
                getByCodeToBoolean(totalProfessionalsActivesSchoolEducacensoRecord.schoolMealsForStudents()));
    }

    private RedeLocalInterligacaoComputadoresEntity convertNetworkInterconnectionComputersRecordInEntity(LocalNetworkInterconnectionComputersEducacensoRecord localNetworkInterconnectionComputersEducacensoRecord) {
        return new RedeLocalInterligacaoComputadoresEntity(
                getByCodeToBoolean(localNetworkInterconnectionComputersEducacensoRecord.cable()),
                getByCodeToBoolean(localNetworkInterconnectionComputersEducacensoRecord.wireless()),
                getByCodeToBoolean(localNetworkInterconnectionComputersEducacensoRecord.noLocalNetworkInterconnection()));
    }

    public EquipamentosUsadosAlunosAcessoInternetEntity convertEquipmentStudentsInternetAccessRecordInEntity(UsedEquipmentStudentsInternetAccessEducacensoRecord usedEquipmentStudentsInternetAccessEducacensoRecord) {
        return new EquipamentosUsadosAlunosAcessoInternetEntity(
                getByCodeToBoolean(usedEquipmentStudentsInternetAccessEducacensoRecord.libraryUnitComputersTablets()),
                getByCodeToBoolean(usedEquipmentStudentsInternetAccessEducacensoRecord.personalDevicesPortableComputers()),
                getByCodeToBoolean(usedEquipmentStudentsInternetAccessEducacensoRecord.broadbandInternet()));
    }

    public AcessoInternetEntity convertAccessEducacensoRecordInEntity(InternetAccessEducacensoRecord internetAccessEducacensoRecord) {
        var acessoInternet = new AcessoInternetEntity();
        acessoInternet.setParaUsoAdministrativo(getByCodeToBoolean(internetAccessEducacensoRecord.forAdministrativeUse()));
        acessoInternet.setParaUsoProcessoApredizagem(getByCodeToBoolean(internetAccessEducacensoRecord.forLearningProcessUse()));
        acessoInternet.setParaUsoAlunos(getByCodeToBoolean(internetAccessEducacensoRecord.forStudentUse()));
        acessoInternet.setParaUsoComunidade(getByCodeToBoolean(internetAccessEducacensoRecord.forCommunityUse()));
        acessoInternet.setNaoPossuiAcessoInternet(getByCodeToBoolean(internetAccessEducacensoRecord.noInternetAccess()));
        return acessoInternet;
    }

    public QuantidadeComputadoresEmUsoAlunosEntity convertComputersInUseByStudentsRecordInEntity(NumberComputersInUseByStudentsEducacensoRecord numberComputersInUseByStudentsEducacensoRecord) {
        return new QuantidadeComputadoresEmUsoAlunosEntity(
                numberComputersInUseByStudentsEducacensoRecord.desktopComputers(),
                numberComputersInUseByStudentsEducacensoRecord.portableComputers(),
                numberComputersInUseByStudentsEducacensoRecord.tablets()
        );
    }

    public QuantidadeEquipamentosProcessoAprendizagemEntity quantityEquimentLearningProcessRecordInEntity(QuantityEquipmentLearningProcessEducacensoRecord quantityEquipmentLearningProcessEducacensoRecord) {
        return new QuantidadeEquipamentosProcessoAprendizagemEntity(
                quantityEquipmentLearningProcessEducacensoRecord.dVDBlurayPlayer(),
                quantityEquipmentLearningProcessEducacensoRecord.soundSystem(),
                quantityEquipmentLearningProcessEducacensoRecord.television(),
                quantityEquipmentLearningProcessEducacensoRecord.digitalWhiteboard(),
                quantityEquipmentLearningProcessEducacensoRecord.multimediaProjector()
        );
    }

    public EquipamentosExistentesUnidadeEntity convertExistingUnitEquipmentRecordInEntity(ExistingUnitEquipmentEducacensoRecord existingUnitEquipmentEducacensoRecord) {
        return new EquipamentosExistentesUnidadeEntity(
                getByCodeToBoolean(existingUnitEquipmentEducacensoRecord.satelliteDish()),
                getByCodeToBoolean(existingUnitEquipmentEducacensoRecord.computers()),
                getByCodeToBoolean(existingUnitEquipmentEducacensoRecord.copier()),
                getByCodeToBoolean(existingUnitEquipmentEducacensoRecord.printer()),
                getByCodeToBoolean(existingUnitEquipmentEducacensoRecord.multifunctionPrinter()),
                getByCodeToBoolean(existingUnitEquipmentEducacensoRecord.scanner()),
                getByCodeToBoolean(existingUnitEquipmentEducacensoRecord.noneOfTheListedEquipment())
        );
    }

    public RecursoPessoasDeficientesEntity convertDisabledPeopleResourceRecordInEntity(DisabledPeopleResourceEducacensoRecord disabledPeopleResourceEducacensoRecord) {
        return new RecursoPessoasDeficientesEntity(
                getByCodeToBoolean(disabledPeopleResourceEducacensoRecord.handrailsGuardRails()),
                getByCodeToBoolean(disabledPeopleResourceEducacensoRecord.elevator()),
                getByCodeToBoolean(disabledPeopleResourceEducacensoRecord.tactileFloors()),
                getByCodeToBoolean(disabledPeopleResourceEducacensoRecord.doorsWithFreePass()),
                getByCodeToBoolean(disabledPeopleResourceEducacensoRecord.ramps()),
                getByCodeToBoolean(disabledPeopleResourceEducacensoRecord.auditorySignage()),
                getByCodeToBoolean(disabledPeopleResourceEducacensoRecord.tactileSignage()),
                getByCodeToBoolean(disabledPeopleResourceEducacensoRecord.visualSignage()),
                getByCodeToBoolean(disabledPeopleResourceEducacensoRecord.noAccessibilityResources()),
                disabledPeopleResourceEducacensoRecord.numberOfClassroomsInBuilding(),
                disabledPeopleResourceEducacensoRecord.numberOfClassroomsUsedOutsideBuilding(),
                disabledPeopleResourceEducacensoRecord.numberOfClimateControlledClassrooms(),
                disabledPeopleResourceEducacensoRecord.numberOfClassroomsAccessibleForDisabledPersons()
        );
    }

    public DependenciasFisicasEntity convertPhysicalDependenciesRecordInEntity(PhysicalDependenciesEducacensoRecord physicalDependenciesEducacensoRecord) {
        return new DependenciasFisicasEntity(
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.storageRoom()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.greenArea()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.auditorium()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.restroom()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.accessibleRestroomForDisabledPersons()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.restroomSuitableForEarlyChildhoodEducation()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.restroomExclusiveForStaff()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.restroomOrChangingRoomWithShower()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.library()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.kitchen()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.pantry()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.studentDormitory()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.teacherDormitory()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.scienceLaboratory()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.computerLaboratory()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.vocationalEducationSpecificLaboratory()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.playground()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.coveredPatio()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.uncoveredPatio()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.swimmingPool()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.coveredSportsCourt()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.uncoveredSportsCourt()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.cafeteria()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.studentRestRoom()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.artsStudio()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.musicAndChoirRoom()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.danceStudio()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.multipurposeRoomForMusicDanceArts()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.recreationalGround()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.animalBreedingNursery()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.principalOffice()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.readingRoom()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.teachersRoom()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.multifunctionalResourcesRoom()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.administrativeOffice()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.vocationalEducationWorkshops()),
                getByCodeToBoolean(physicalDependenciesEducacensoRecord.noneOfTheListedDependencies())
        );
    }

    public TratamentoLixoEntity convertWasteTreatmentRecordInentity(WasteTreatmentEducacensoRecord wasteTreatmentEducacensoRecord) {
        return new TratamentoLixoEntity(
                getByCodeToBoolean(wasteTreatmentEducacensoRecord.wasteSeparation()),
                getByCodeToBoolean(wasteTreatmentEducacensoRecord.reuseRecycling()),
                getByCodeToBoolean(wasteTreatmentEducacensoRecord.recycling()),
                getByCodeToBoolean(wasteTreatmentEducacensoRecord.noTreatment())
        );
    }

    public DestinacaoLixoEntity convertWasteDisposalRecordInEntity(WasteDisposalEducacensoRecord wasteDisposalEducacensoRecord) {
        return new DestinacaoLixoEntity(
                getByCodeToBoolean(wasteDisposalEducacensoRecord.collectionService()),
                getByCodeToBoolean(wasteDisposalEducacensoRecord.burning()),
                getByCodeToBoolean(wasteDisposalEducacensoRecord.burying()),
                getByCodeToBoolean(wasteDisposalEducacensoRecord.publicAuthorityLicensedDisposal()),
                getByCodeToBoolean(wasteDisposalEducacensoRecord.disposalInAnotherArea())
        );
    }

    public EsgotamentoSanitarioEntity convertSanitarySewageRecordInEntity(SanitarySewageEducacensoRecord sanitarySewageEducacensoRecord) {
        return new EsgotamentoSanitarioEntity(
                getByCodeToBoolean(sanitarySewageEducacensoRecord.publicSewageSystem()),
                getByCodeToBoolean(sanitarySewageEducacensoRecord.septicTank()),
                getByCodeToBoolean(sanitarySewageEducacensoRecord.rudimentaryCommonPit()),
                getByCodeToBoolean(sanitarySewageEducacensoRecord.noSanitarySewage())
        );
    }

    public FonteEnergiaEletricaEntity convertEletricEnergySourceRecordInEntity(ElectricEnergySourceEducacensoRecord electricEnergySourceEducacensoRecord) {
        return new FonteEnergiaEletricaEntity(
                getByCodeToBoolean(electricEnergySourceEducacensoRecord.publicGrid()),
                getByCodeToBoolean(electricEnergySourceEducacensoRecord.fossilFuelPoweredGenerator()),
                getByCodeToBoolean(electricEnergySourceEducacensoRecord.renewableAlternativeEnergySources()),
                getByCodeToBoolean(electricEnergySourceEducacensoRecord.noElectricity())
        );
    }

    public AbastecimentoAguaEntity convertWaterSupplyRecordInEntity(WaterSupplyEducacensoRecord waterSupplyEducacensoRecord) {
        var abastecimento =  new AbastecimentoAguaEntity();
        abastecimento.setRedePublica(getByCodeToBoolean(waterSupplyEducacensoRecord.publicWaterSupply()));
        abastecimento.setPocoArtesiano(getByCodeToBoolean(waterSupplyEducacensoRecord.artesianWell()));
        abastecimento.setCacimbaCisternaPoco(getByCodeToBoolean(waterSupplyEducacensoRecord.wellCistern()));
        abastecimento.setFonteRioIgarapeRiachoCorrego(getByCodeToBoolean(waterSupplyEducacensoRecord.springRiverStream()));
        abastecimento.setNaoHaAbastecimentoAgua(getByCodeToBoolean(waterSupplyEducacensoRecord.noWaterSupply()));
        return abastecimento;
    }

    public EscolasComQualCompartilhaEntity convertScoolParticipationRecordInEntity(SchoolParticipationEducacensoRecord schoolParticipationEducacensoRecord) {
        return new EscolasComQualCompartilhaEntity(
                getShool(schoolParticipationEducacensoRecord.sharedSchoolCode1()),
                getShool(schoolParticipationEducacensoRecord.sharedSchoolCode2()),
                getShool(schoolParticipationEducacensoRecord.sharedSchoolCode3()),
                getShool(schoolParticipationEducacensoRecord.sharedSchoolCode4()),
                getShool(schoolParticipationEducacensoRecord.sharedSchoolCode5()),
                getShool(schoolParticipationEducacensoRecord.sharedSchoolCode6()),
                getByCodeToBoolean(schoolParticipationEducacensoRecord.providesDrinkingWaterForConsumption())
        );
    }

    private UnidadeEnsinoEntity getShool(Long cdMec) {
        return cdMec != null ? new UnidadeEnsinoEntity(cdMec) : null;
    }

    public LocalFuncionamentoEscolaEntity convertSchoolLocationRecordInEntity(SchoolLocationEducacensoRecord schoolLocationEducacensoRecord) {
        return new LocalFuncionamentoEscolaEntity(
                getByCodeToBoolean(schoolLocationEducacensoRecord.schoolBuilding()),
                getByCodeToBoolean(schoolLocationEducacensoRecord.classroomsInAnotherSchool()),
                getByCodeToBoolean(schoolLocationEducacensoRecord.shedBarnWarehouse()),
                getByCodeToBoolean(schoolLocationEducacensoRecord.socioEducationalUnit()),
                getByCodeToBoolean(schoolLocationEducacensoRecord.prisonUnit()),
                getByCodeToBoolean(schoolLocationEducacensoRecord.others()),
                FormaOcupacaoPredio.getForCode(schoolLocationEducacensoRecord.buildingOccupationForm()),
                getByCodeToBoolean(schoolLocationEducacensoRecord.schoolBuildingSharedWithAnotherSchool())
        );
    }

    private NumeroMatriculasAtendidasParceriaConvenioEntity convertNumberRegistrationServedRecordInEntity(NumberRegistrationsServedPartnershipAgreementEducacensoRecord numberRegistrationsServedPartnershipAgreementEducacensoRecord) {
        return new NumeroMatriculasAtendidasParceriaConvenioEntity(
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.complementaryActivity(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.specializedEducationalService(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.regularPartialDaycareEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.regularFullDaycareEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.regularPartialPreschoolEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.regularComprehensivePreschoolEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.regularPartialElementaryInitialYearsEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.regularFullElementaryInitialYearsEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.regularPartialElementaryFinalYearsEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.regularFullElementaryFinalYearsEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.regularPartialHighSchoolEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.regularFullHighSchoolEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.specialPartialClassEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.specialFullClassEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.youthAdultFundamentalMediumPartialEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.youthAdultFundamentalMediumFullEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalPartialYouthAdultFundamentalEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalFullYouthAdultFundamentalEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalPartialYouthAdultMediumEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalFullYouthAdultMediumEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalConcurrentYouthAdultMediumPartialEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalConcurrentYouthAdultMediumFullEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalConcurrentIntermediateYouthAdultMediumPartialEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalConcurrentIntermediateYouthAdultMediumFullEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalPartialHighSchoolEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalFullHighSchoolEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalConcurrentHighSchoolPartialEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalConcurrentHighSchoolFullEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalConcurrentIntermediateHighSchoolPartialEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalConcurrentIntermediateHighSchoolFullEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumFullYouthAdultPartialEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumFullYouthAdultFullEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumConcurrentYouthAdultPartialEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumConcurrentYouthAdultFullEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumConcurrentIntermediateYouthAdultPartialEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumConcurrentIntermediateYouthAdultFullEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumPartialHighSchoolEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumFullHighSchoolEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumConcurrentHighSchoolPartialEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalSubsequentHighSchoolEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumConcurrentHighSchoolFullEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumConcurrentIntermediateHighSchoolPartialEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.vocationalMediumConcurrentIntermediateHighSchoolFullEducation(),
                numberRegistrationsServedPartnershipAgreementEducacensoRecord.privateSchoolMainMaintainerCNPJ(),
                Regulamentacao.getFromCode(numberRegistrationsServedPartnershipAgreementEducacensoRecord.municipalStateFederalCouncilAuthorization())
        );
    }

    private FormasContratacaoEntity convertFormsOfHiringRecordInEntity(FormsOfHiringEducacensoRecord formsOfHiringEducacensoRecord) {
        return new FormasContratacaoEntity(
                getByCodeToBoolean(formsOfHiringEducacensoRecord.termofCollaboration()),
                getByCodeToBoolean(formsOfHiringEducacensoRecord.termPromotion()),
                getByCodeToBoolean(formsOfHiringEducacensoRecord.agreementCooperation()),
                getByCodeToBoolean(formsOfHiringEducacensoRecord.serviceProvisionContract()),
                getByCodeToBoolean(formsOfHiringEducacensoRecord.termFinancialTechnicalCooperation()),
                getByCodeToBoolean(formsOfHiringEducacensoRecord.contractPublicConsortiumCooperationAgreement())
        );
    }

    private MantenedoraEscolaPrivadaEntity convertPrivateSchoolSupporterRecordInEntity(PrivateSchoolSupporterEducacensoRecord privateSchoolSupporterEducacensoRecord) {
        return new MantenedoraEscolaPrivadaEntity(
                getByCodeToBoolean(privateSchoolSupporterEducacensoRecord.companyBusinessGroupsPrivateSectorIndividuals()),
                getByCodeToBoolean(privateSchoolSupporterEducacensoRecord.unionsWorkersEmployersAssociationsCooperatives()),
                getByCodeToBoolean(privateSchoolSupporterEducacensoRecord.nonOrganizationGovernment()),
                getByCodeToBoolean(privateSchoolSupporterEducacensoRecord.nonProfitInstitution()),
                getByCodeToBoolean(privateSchoolSupporterEducacensoRecord.systemsSesiSenaiSescOthers()),
                getByCodeToBoolean(privateSchoolSupporterEducacensoRecord.organizationOfCivilSocietyOfPublicInterest()),
                CategoriaEscola.getFromCode(privateSchoolSupporterEducacensoRecord.categorySchool())
        );
    }

    private EnderecoUnidadeEntity convetAdressUnitRecordInEntity(AdressUnitEducacensoRecord adressUnitEducacensoRecord) {
        return new EnderecoUnidadeEntity(
                adressUnitEducacensoRecord.zipCode(),
                getCity(adressUnitEducacensoRecord.city()),
                adressUnitEducacensoRecord.adress(),
                adressUnitEducacensoRecord.number(),
                adressUnitEducacensoRecord.complement(),
                adressUnitEducacensoRecord.neighborhood(),
                adressUnitEducacensoRecord.ddd()
        );
    }

    private CityEntity getCity(Long mecCode) {
        return new CityEntity(mecCode);
    }

    private EsferaAdministrativaEntity convertAdministrativeSphereRecordInEntity(AdministrativeSphereEducacensoRecord administrativeSphereEducacensoRecord) {
        return new EsferaAdministrativaEntity(
                getByCodeToBoolean(administrativeSphereEducacensoRecord.federal()),
                getByCodeToBoolean(administrativeSphereEducacensoRecord.state()),
                getByCodeToBoolean(administrativeSphereEducacensoRecord.municipal()),
                EducacaoBasica.getFromCode(administrativeSphereEducacensoRecord.linkSchoolBasicEducationUnitHigherEducationOfferingUnit()),
                getShool(administrativeSphereEducacensoRecord.hostSchool()),
                administrativeSphereEducacensoRecord.codeIes()
        );
    }

    public Object desealizedObject(String serializedMessage) {
        try {
            return objectMapper.readValue(serializedMessage, UnitEducacensoRecord.class);
        } catch (JsonProcessingException e) {
            throw new UnserializedMessageRabbitMQ(e.getMessage());
        }
    }

}
