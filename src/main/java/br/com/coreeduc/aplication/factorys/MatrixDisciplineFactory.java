package br.com.coreeduc.aplication.factorys;

import br.com.coreeduc.aplication.entities.DisciplinaEntity;
import br.com.coreeduc.aplication.entities.DisciplinasMatrizEntity;
import br.com.coreeduc.aplication.entities.MatrizCurricularEntity;
import br.com.coreeduc.aplication.records.MatrixDisciplineRecord;
import br.com.coreeduc.aplication.utils.Util;

import java.util.Optional;
import java.util.Properties;

public class MatrixDisciplineFactory {

    private DisciplinasMatrizEntity disciplinasMatrizEntity;

    public MatrixDisciplineFactory(Properties properties) {

        setDisciplinasMatrizEntity(
                new Builder()
                        .id(Optional.ofNullable(properties.getProperty("id")).map(id -> !id.isEmpty() ? id : null).map(Long::valueOf).orElse(null))
                        .disciplina(null)
                        .matrizCurricularEntity(null)
                        .cargaHorariaDisciplina(null)
                        .build()
                        .getDisciplinasMatrizEntity()
        );

    }

    public MatrixDisciplineFactory(DisciplinasMatrizEntity disciplinasMatrizEntity) {
        setDisciplinasMatrizEntity(disciplinasMatrizEntity);
    }

    public MatrixDisciplineRecord getRecord() {
        return new MatrixDisciplineRecord(
                disciplinasMatrizEntity.getId(),
                disciplinasMatrizEntity.getCargaHorariaDisciplina().toString(),
                disciplinasMatrizEntity.getDisciplina().getId(),
                disciplinasMatrizEntity.getMatrizCurricularEntities().getId(),
                disciplinasMatrizEntity.getDisciplina().getNome(),
                disciplinasMatrizEntity.getDisciplina().getAbreviacao());
    }

    public MatrixDisciplineRecord getRecordHoraFormatada() {
        return new MatrixDisciplineRecord(
                disciplinasMatrizEntity.getId(),
                Util.formatarHora(disciplinasMatrizEntity.getCargaHorariaDisciplina().toString()),
                disciplinasMatrizEntity.getDisciplina().getId(),
                disciplinasMatrizEntity.getMatrizCurricularEntities().getId(),
                disciplinasMatrizEntity.getDisciplina().getNome(),
                disciplinasMatrizEntity.getDisciplina().getAbreviacao());
    }

    private MatrixDisciplineFactory(Builder builder) {
        setDisciplinasMatrizEntity(builder.disciplinasMatrizEntity);
    }

    private void setDisciplinasMatrizEntity(DisciplinasMatrizEntity disciplinasMatrizEntity) {
        this.disciplinasMatrizEntity = disciplinasMatrizEntity;
    }

    public DisciplinasMatrizEntity getDisciplinasMatrizEntity() {
        return disciplinasMatrizEntity;
    }

    public static final class Builder {

        private DisciplinasMatrizEntity disciplinasMatrizEntity;

        public Builder() {
            disciplinasMatrizEntity = new DisciplinasMatrizEntity();
        }

        public Builder id(Long id) {
            disciplinasMatrizEntity.setId(id);
            return this;
        }

        public Builder cargaHorariaDisciplina(Integer cargaHorariaDisciplina) {
            disciplinasMatrizEntity.setCargaHorariaDisciplina(cargaHorariaDisciplina);
            return this;
        }

        public Builder disciplina(DisciplinaEntity disciplina) {
            disciplinasMatrizEntity.setDisciplina(disciplina);
            return this;
        }

        public Builder matrizCurricularEntity(MatrizCurricularEntity matrizCurricularEntity) {
            disciplinasMatrizEntity.setMatrizCurricularEntities(matrizCurricularEntity);
            return this;
        }

        public MatrixDisciplineFactory build() {
            return new MatrixDisciplineFactory(this);
        }
    }

}
