package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.DisciplineAutoCompleteComponent;
import br.com.coreeduc.aplication.records.DisciplineRecord;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DisciplineServiceImpl implements DisciplineService {

    private DisciplinaRepository disciplinaRepository;

    @Autowired
    public DisciplineServiceImpl(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    @Override
    public PropertiesViewRecord findPropertiesView() {
        return null;
    }

    @Override
    public Map<String, OptionSelectedViewRecord> findPropertiesFromSeleted() {
        return Map.of();
    }

    @Override
    public List<DisciplineRecord> autoComplete(String value, String key) {
        return DisciplineAutoCompleteComponent.getTipoBuscaAutoComplete(key).findDisciplines(value, key);
    }

}
