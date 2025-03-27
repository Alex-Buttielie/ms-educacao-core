package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.MatrixDisciplineAutoCompleteComponent;
import br.com.coreeduc.aplication.factorys.MatrixDisciplineFactory;
import br.com.coreeduc.aplication.records.MatrixDisciplineRecord;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.repositories.DisciplinasMatrizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MatrixDisciplineServiceImpl implements MatrixDisciplineService {

    private DisciplinasMatrizRepository disciplinasMatrizRepository;

    @Autowired
    public MatrixDisciplineServiceImpl(DisciplinasMatrizRepository disciplinasMatrizRepository) {
        this.disciplinasMatrizRepository = disciplinasMatrizRepository;
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
    public List<MatrixDisciplineRecord> autoComplete(String value, String key) {
        return MatrixDisciplineAutoCompleteComponent.getTipoBuscaAutoComplete(key).findDisciplines(value, key);
    }

    @Override
    public List<MatrixDisciplineRecord> findDisciplinasMatriz(String matrixCode) {
        return disciplinasMatrizRepository.findDisciplinasMatrizEntityByMatrizCurricularEntitiesId(Long.parseLong(matrixCode))
                .stream().map(MatrixDisciplineFactory::new)
                .map(MatrixDisciplineFactory::getRecordHoraFormatada)
                .toList();
    }

}
