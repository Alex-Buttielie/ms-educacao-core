package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.CurriculumMatrixAutoCompleteComponent;
import br.com.coreeduc.aplication.entities.MatrizCurricularEntity;
import br.com.coreeduc.aplication.records.CurriculumMatrixRecord;
import br.com.coreeduc.aplication.repositories.CurriculumMatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CurriculumMatrixServiceImpl implements CurriculumMatrixService{

    private CurriculumMatrixRepository repository;

    @Autowired
    public CurriculumMatrixServiceImpl(CurriculumMatrixRepository repository) {
        this.repository = repository;
    }

    @Override
    public CurriculumMatrixRecord save(CurriculumMatrixRecord curriculumMatrixRecord) {
        var matriz = new MatrizCurricularEntity();

        if(Objects.nonNull(curriculumMatrixRecord.id())) {
            matriz.setId(curriculumMatrixRecord.id());
        }

        matriz.setNome(curriculumMatrixRecord.nome());
        matriz.setChHorariaTotal(curriculumMatrixRecord.chHorariaTotal());
        matriz = repository.save(matriz);
        return new CurriculumMatrixRecord(matriz.getId(), matriz.getNome(), matriz.getChHorariaTotal(), 0);
    }

    @Override
    public List<CurriculumMatrixRecord> autoComplete(String value, String key) {
        return CurriculumMatrixAutoCompleteComponent.getTipoBuscaAutoComplete(key).findCurriculumsMatrix(value, key);
    }

}
