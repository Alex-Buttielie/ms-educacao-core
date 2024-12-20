package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.PessoaEntity;
import br.com.coreeduc.aplication.entities.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Long> {
    Optional<ProfessorEntity> findProfessorEntityByPessoa(PessoaEntity pessoa);
}
