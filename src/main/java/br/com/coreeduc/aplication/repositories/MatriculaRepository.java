package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.MatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<MatriculaEntity, Long> {
}
