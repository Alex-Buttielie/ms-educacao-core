package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.records.CurriculumMatrixRecord;

import java.util.List;

public interface CurriculumMatrixService {
    CurriculumMatrixRecord save(CurriculumMatrixRecord curriculumMatrixRecord);
    List<CurriculumMatrixRecord> autoComplete(String value, String key);
}
