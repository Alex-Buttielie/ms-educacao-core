package br.com.coreeduc.aplication.records;

public record ClassEducacensoRecord (
        Long inepCode,
        String codeClass,
        String name,
        Integer mediationType,
        OpeningHoursEducacensoRecord openingHoursEducacensoRecord,
        WeekDaysEducacensoRecord weekDaysEducacensoRecord,
        Integer schooling,
        Integer complementaryActivity,
        Integer specializedService,
        Integer basicGeneralTraining,
        Integer informativeItinerary,
        Integer doesNotApply,
        ComplementaryActivityTypeEducacensoRecord complementaryActivityTypeEducacensoRecord,
        ClassOrganizationFormsEducacensoRecord classOrganizationFormsEducacensoRecord,
        ClassCurricularUnitEducacensoRecord classCurricularUnitEducacensoRecord
) {
}
