package br.com.coreeduc.aplication.records;

public record InternetAccessEducacensoRecord(Integer forAdministrativeUse,
                                             Integer forLearningProcessUse,
                                             Integer forStudentUse,
                                             Integer forCommunityUse,
                                             Integer noInternetAccess) {
}
