package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.DisciplinaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinaRepository extends JpaRepository<DisciplinaEntity, Long> {
    List<DisciplinaEntity> findAllByNomeIgnoreCase(String nome);
}
