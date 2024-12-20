package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
}
