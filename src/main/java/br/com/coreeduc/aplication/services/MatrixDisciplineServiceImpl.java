package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.MatrixDisciplineAutoCompleteComponent;
import br.com.coreeduc.aplication.records.MatrixDisciplineRecord;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MatrixDisciplineServiceImpl implements MatrixDisciplineService {

    @Override
    public PropertiesViewRecord findPropertiesView() {
        return null;
    }

    @Override
    public Map<String, OptionSelectedViewRecord> findPropertiesFromSeleted() {
        return Map.of();
    }

    @Override
    public List<MatrixDisciplineRecord> autoComplete(String value, String key) {
        return MatrixDisciplineAutoCompleteComponent.getTipoBuscaAutoComplete(key).findDisciplines(value, key);
    }

}
