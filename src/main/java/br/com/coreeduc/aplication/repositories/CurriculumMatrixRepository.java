package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.MatrizCurricularEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurriculumMatrixRepository extends JpaRepository<MatrizCurricularEntity, Long> {
    List<MatrizCurricularEntity> findAllByNomeIgnoreCase(String nome);
}
