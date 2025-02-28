package br.com.coreeduc.aplication.records;

public record MatrixDisciplineRecord(
        Long id,
        Integer cargaHorariaDisciplina,
        Long disciplina,
        Long idMatrix
) {
}
