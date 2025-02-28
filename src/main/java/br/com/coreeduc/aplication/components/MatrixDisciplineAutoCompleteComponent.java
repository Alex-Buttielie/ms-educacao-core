package br.com.coreeduc.aplication.components;

import br.com.coreeduc.aplication.entities.DisciplinasMatrizEntity;
import br.com.coreeduc.aplication.factorys.DisciplineFactory;
import br.com.coreeduc.aplication.factorys.MatrixDisciplineFactory;
import br.com.coreeduc.aplication.records.MatrixDisciplineRecord;
import br.com.coreeduc.aplication.repositories.DisciplinasMatrizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;

public enum MatrixDisciplineAutoCompleteComponent {

    BY_ID ("id"){
        @Override
        public List<MatrixDisciplineRecord> findDisciplines(String value, String key) {
            var disciplinasMatrizEntity = new MatrixDisciplineFactory(getProperties(value, key)).getDisciplinasMatrizEntity();
            var discipline = Optional.ofNullable(disciplinasMatrizEntity.getId()).flatMap(this.disciplinasMatrizRepository::findById);
            return this.find(discipline.map(List::of).orElseGet(Collections::emptyList));
        }
    };

    public List<MatrixDisciplineRecord> find(List<DisciplinasMatrizEntity> all) {
        var returning = all.isEmpty() ? disciplinasMatrizRepository.findAll() : all;
        return returning
                .stream()
                .filter(c -> Objects.nonNull(c.getId()))
                .map(MatrixDisciplineFactory::new)
                .map(MatrixDisciplineFactory::getRecord)
                .toList();
    }

    public abstract List<MatrixDisciplineRecord> findDisciplines(String value, String key);

    protected Properties getProperties(String value, String key) {
        var prop = new Properties();
        prop.put(key, value);
        return prop;
    }

    protected DisciplinasMatrizRepository disciplinasMatrizRepository;
    private String key;

    MatrixDisciplineAutoCompleteComponent(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static MatrixDisciplineAutoCompleteComponent getTipoBuscaAutoComplete(String key) {
        for (MatrixDisciplineAutoCompleteComponent value : values()) {
            if (value.getKey().equals(key)) {
                return value;
            }
        }

        throw new RuntimeException("Programador problema ao idenficar o tipo da disciplina do autocomplete.");

    }

    public void setDisciplinasMatrizRepository(DisciplinasMatrizRepository disciplinasMatrizRepository) {
        this.disciplinasMatrizRepository = disciplinasMatrizRepository;
    }

    @Component
    private static class ServiceInjector {
        @Autowired
        protected DisciplinasMatrizRepository disciplinasMatrizRepository;

        @PostConstruct
        private void postConstruct() {
            for (var item : EnumSet.allOf(MatrixDisciplineAutoCompleteComponent.class)) {
                item.setDisciplinasMatrizRepository(disciplinasMatrizRepository);
            }
        }
    }

}
