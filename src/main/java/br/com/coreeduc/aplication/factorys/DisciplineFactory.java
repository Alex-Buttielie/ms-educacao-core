package br.com.coreeduc.aplication.factorys;

import br.com.coreeduc.aplication.entities.AreaConhecimentoEntity;
import br.com.coreeduc.aplication.entities.DisciplinaEntity;
import br.com.coreeduc.aplication.entities.DisciplinasMatrizEntity;
import br.com.coreeduc.aplication.records.DisciplineRecord;

import java.util.Collection;
import java.util.Optional;
import java.util.Properties;

public class DisciplineFactory {

    private DisciplinaEntity disciplinaEntity;

    public DisciplineFactory(Properties properties) {

        setDisciplinaEntity(
                new Builder()
                        .id(Optional.ofNullable(properties.getProperty("id")).map(id -> !id.isEmpty() ? id : null).map(Long::valueOf).orElse(null))
                        .nome(properties.getProperty("nome"))
                        .codigoMec(Optional.ofNullable(properties.getProperty("codigoMec")).map(id -> !id.isEmpty() ? id : null).map(Long::valueOf).orElse(null))
                        .abreviacao(properties.getProperty("nome"))
                        .build()
                        .getDisciplinaEntity()
        );

    }

    public DisciplineFactory(DisciplinaEntity disciplinaEntity) {
        setDisciplinaEntity(disciplinaEntity);
    }

    public DisciplineRecord getRecord() {
        return new DisciplineRecord(
                disciplinaEntity.getId(),
                disciplinaEntity.getCodigoMec(),
                disciplinaEntity.getNome(),
                disciplinaEntity.getAbreviacao());
    }

    private DisciplineFactory(Builder builder) {
        setDisciplinaEntity(builder.disciplinaEntity);
    }

    private void setDisciplinaEntity(DisciplinaEntity disciplinaEntity) {
        this.disciplinaEntity = disciplinaEntity;
    }

    public DisciplinaEntity getDisciplinaEntity() {
        return disciplinaEntity;
    }

    public static final class Builder {

        private DisciplinaEntity disciplinaEntity;

        public Builder() {
            disciplinaEntity = new DisciplinaEntity();
        }

        public Builder id(Long id) {
            disciplinaEntity.setId(id);
            return this;
        }

        public Builder codigoMec(Long codigoMec) {
            disciplinaEntity.setCodigoMec(codigoMec);
            return this;
        }

        public Builder nome(String nome) {
            disciplinaEntity.setNome(nome);
            return this;
        }

        public Builder abreviacao(String abreviacao) {
            disciplinaEntity.setAbreviacao(abreviacao);
            return this;
        }

        public Builder areaConhecimento(AreaConhecimentoEntity areaConhecimento) {
            disciplinaEntity.setAreaConhecimento(areaConhecimento);
            return this;
        }

        public DisciplineFactory build() {
            return new DisciplineFactory(this);
        }
    }

}
