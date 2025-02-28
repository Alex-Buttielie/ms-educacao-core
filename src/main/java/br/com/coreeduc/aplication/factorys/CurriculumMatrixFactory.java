package br.com.coreeduc.aplication.factorys;

import br.com.coreeduc.aplication.entities.MatrizCurricularEntity;
import br.com.coreeduc.aplication.records.CurriculumMatrixRecord;

import java.util.Optional;
import java.util.Properties;

public class CurriculumMatrixFactory {

    private MatrizCurricularEntity matrizCurricularEntity;

    public CurriculumMatrixFactory(Properties properties) {

        setMatrizCurricularEntity(
                new Builder()
                        .id(Optional.ofNullable(properties.getProperty("id")).map(id -> !id.isEmpty() ? id : null).map(Long::valueOf).orElse(null))
                        .chHorariaTotal(properties.getProperty("chHorariaTotal"))
                        .name(properties.getProperty("nome"))
                        .build()
                        .getMatrizCurricularEntity()
        );

    }

    public CurriculumMatrixFactory(MatrizCurricularEntity matrizCurricularEntity) {
        setMatrizCurricularEntity(matrizCurricularEntity);
    }

    public CurriculumMatrixRecord getRecord() {
        return new CurriculumMatrixRecord(
                matrizCurricularEntity.getId(),
                matrizCurricularEntity.getNome(),
                matrizCurricularEntity.getChHorariaTotal(),
                0
        );
    }

    private CurriculumMatrixFactory(Builder builder) {
        setMatrizCurricularEntity(builder.matrizCurricular);
    }

    private void setMatrizCurricularEntity(MatrizCurricularEntity matrizCurricularEntity) {
        this.matrizCurricularEntity = matrizCurricularEntity;
    }

    public MatrizCurricularEntity getMatrizCurricularEntity() {
        return matrizCurricularEntity;
    }

    public static final class Builder {

        private MatrizCurricularEntity matrizCurricular;

        public Builder() {
            matrizCurricular = new MatrizCurricularEntity();
        }

        public Builder id(Long id) {
            matrizCurricular.setId(id);
            return this;
        }
        public Builder chHorariaTotal(String cargaHoraria) {
            matrizCurricular.setChHorariaTotal(cargaHoraria);
            return this;
        }

        public Builder name(String name) {
            matrizCurricular.setNome(name);
            return this;
        }

        public CurriculumMatrixFactory build() {
            return new CurriculumMatrixFactory(this);
        }
    }

}
