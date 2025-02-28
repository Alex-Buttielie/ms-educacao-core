package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.DisciplinasMatrizEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinasMatrizRepository extends JpaRepository<DisciplinasMatrizEntity, Long> {
}
