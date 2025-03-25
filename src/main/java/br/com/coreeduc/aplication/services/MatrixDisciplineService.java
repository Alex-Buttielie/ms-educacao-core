package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.records.MatrixDisciplineRecord;

import java.util.List;

public interface MatrixDisciplineService extends CommomService {
    List<MatrixDisciplineRecord> findDisciplinasMatriz(String matrixCode);
}
