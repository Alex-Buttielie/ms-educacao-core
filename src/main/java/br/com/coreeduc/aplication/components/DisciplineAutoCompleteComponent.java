package br.com.coreeduc.aplication.components;

import br.com.coreeduc.aplication.entities.DisciplinaEntity;
import br.com.coreeduc.aplication.factorys.DisciplineFactory;
import br.com.coreeduc.aplication.records.DisciplineRecord;
import br.com.coreeduc.aplication.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;

public enum DisciplineAutoCompleteComponent {

    BY_ID ("id"){
        @Override
        public List<DisciplineRecord> findDisciplines(String value, String key) {
            var disciplineFactory = new DisciplineFactory(getProperties(value, key)).getDisciplinaEntity();
            var discipline = Optional.ofNullable(disciplineFactory.getId()).flatMap(disciplinaRepository::findById);
            return find(discipline.map(List::of).orElseGet(Collections::emptyList));
        }
    },
    BY_NAME ("nome"){
        @Override
        public List<DisciplineRecord> findDisciplines(String value, String key) {
            var discipline = new DisciplineFactory(getProperties(value, key)).getDisciplinaEntity();
            return find(disciplinaRepository.findAllByNomeIgnoreCase(discipline.getNome()));
        }
    };

    public List<DisciplineRecord> find(List<DisciplinaEntity> all) {
        var returning = all.isEmpty() ? disciplinaRepository.findAll() : all;
        return returning
                .stream()
                .filter(c -> Objects.nonNull(c.getNome()) && !c.getNome().isBlank())
                .map(DisciplineFactory::new).map(DisciplineFactory::getRecord)
                .toList();
    }

    public abstract List<DisciplineRecord> findDisciplines(String value, String key);

    protected Properties getProperties(String value, String key) {
        var prop = new Properties();
        prop.put(key, value);
        return prop;
    }

    protected DisciplinaRepository disciplinaRepository;
    private String key;

    DisciplineAutoCompleteComponent(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static DisciplineAutoCompleteComponent getTipoBuscaAutoComplete(String key) {
        for (DisciplineAutoCompleteComponent value : values()) {
            if (value.getKey().equals(key)) {
                return value;
            }
        }

        throw new RuntimeException("Programador problema ao idenficar o tipo da disciplina do autocomplete.");

    }

    public void setDisciplinaRepository(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    @Component
    private static class ServiceInjector {
        @Autowired
        protected DisciplinaRepository disciplinaRepository;

        @PostConstruct
        private void postConstruct() {
            for (var item : EnumSet.allOf(DisciplineAutoCompleteComponent.class)) {
                item.setDisciplinaRepository(disciplinaRepository);
            }
        }
    }

}
