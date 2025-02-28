package br.com.coreeduc.aplication.components;

import br.com.coreeduc.aplication.entities.MatrizCurricularEntity;
import br.com.coreeduc.aplication.factorys.CurriculumMatrixFactory;
import br.com.coreeduc.aplication.records.CurriculumMatrixRecord;
import br.com.coreeduc.aplication.repositories.CurriculumMatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;

public enum CurriculumMatrixAutoCompleteComponent {

    NAME ("nome"){
        @Override
        public List<CurriculumMatrixRecord> findCurriculumsMatrix(String value, String key) {
            var curriculumMatrix = new CurriculumMatrixFactory(getProperties(value, key)).getMatrizCurricularEntity();
            return findd(repository.findAllByNomeIgnoreCase(curriculumMatrix.getNome()));
        }
    },
    ID ("id"){
        @Override
        public List<CurriculumMatrixRecord> findCurriculumsMatrix(String value, String key) {
            var curriculumMatrix = new CurriculumMatrixFactory(getProperties(value, key)).getMatrizCurricularEntity();
            var optionalCompany = Optional.ofNullable(curriculumMatrix.getId())
                    .flatMap(repository::findById);

            return findd(optionalCompany.map(List::of).orElseGet(Collections::emptyList));
        }
    };

    public List<CurriculumMatrixRecord> findd(List<MatrizCurricularEntity> all) {
        var returning = all.isEmpty() ? repository.findAll() : all;
        return returning.stream()
                .filter(c -> Objects.nonNull(c.getNome()) && !c.getNome().isBlank())
                .map(CurriculumMatrixFactory::new)
                .map(CurriculumMatrixFactory::getRecord)
                .toList();
    }

    public abstract List<CurriculumMatrixRecord> findCurriculumsMatrix(String value, String key);


    public Properties getProperties(String value, String key) {
        var prop = new Properties();
        prop.put(key, value);
        return prop;
    }

    protected CurriculumMatrixRepository repository;

    private String key;

    CurriculumMatrixAutoCompleteComponent(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static CurriculumMatrixAutoCompleteComponent getTipoBuscaAutoComplete(String valor) {
        for (CurriculumMatrixAutoCompleteComponent value : values()) {
            if (value.getKey().equals(valor)) {
                return value;
            }
        }

        throw new RuntimeException("Programador problema ao idenficar o tipo de busca da matriz.");

    }

    public void setCurriculumMatrixRepository(CurriculumMatrixRepository repository) {
        this.repository = repository;
    }

    @Component
    final static class ServiceInjector {
        @Autowired
        protected CurriculumMatrixRepository repository;

        @PostConstruct
        private void postConstruct() {
            for (var item : EnumSet.allOf(CurriculumMatrixAutoCompleteComponent.class)) {
                item.setCurriculumMatrixRepository(repository);
            }
        }
    }

}
