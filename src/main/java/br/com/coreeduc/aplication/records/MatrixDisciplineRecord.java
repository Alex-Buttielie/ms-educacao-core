package br.com.coreeduc.aplication.records;

public record MatrixDisciplineRecord(
        Long id,
        String cargaHorariaDisciplina,
        Long disciplina,
        Long idMatrix,
        String nome,
        String abreviacao
) {
}
