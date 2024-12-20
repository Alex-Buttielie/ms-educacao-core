package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.AlunoTurmaEntity;
import br.com.coreeduc.aplication.entities.MatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoTurmaRepository extends JpaRepository<AlunoTurmaEntity, Long> {
    AlunoTurmaEntity findAlunoTurmaByMatricula(MatriculaEntity matricula);
}
