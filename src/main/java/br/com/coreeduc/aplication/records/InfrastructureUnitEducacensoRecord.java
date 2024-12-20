package br.com.coreeduc.aplication.records;

public record InfrastructureUnitEducacensoRecord(
        Long inepCodeSchool,
        SchoolLocationEducacensoRecord schoolLocationEducacenso,
        SchoolParticipationEducacensoRecord schoolParticipationEducacenso,
        WaterSupplyEducacensoRecord waterSupplyEducacenso,
        ElectricEnergySourceEducacensoRecord electricEnergySourceEducacenso,
        SanitarySewageEducacensoRecord sanitarySewageEducacenso,
        WasteDisposalEducacensoRecord wasteDisposalEducacenso,
        WasteTreatmentEducacensoRecord wasteTreatmentEducacenso,
        PhysicalDependenciesEducacensoRecord physicalDependenciesEducacenso,
        DisabledPeopleResourceEducacensoRecord disabledPeopleResourceEducacenso,
        ExistingUnitEquipmentEducacensoRecord existingUnitEquipmentEducacenso,
        QuantityEquipmentLearningProcessEducacensoRecord quantityEquipmentLearningProcessEducacenso,
        NumberComputersInUseByStudentsEducacensoRecord numberComputersInUseByStudentsEducacenso,
        InternetAccessEducacensoRecord internetAccessEducacenso,
        UsedEquipmentStudentsInternetAccessEducacensoRecord usedEquipmentStudentsInternetAccessEducacenso,
        LocalNetworkInterconnectionComputersEducacensoRecord localNetworkInterconnectionComputersEducacenso,
        Integer agronomistsTechniciansInAgronomyAndAgriculturalEngineering,
        Integer pedagogue,
        Integer socialAssistant,
        Integer otherEducationalAndCommunitySupportTechnicians
) { }
