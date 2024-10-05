package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Long> {
}
