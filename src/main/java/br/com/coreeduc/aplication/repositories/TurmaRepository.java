package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.TurmaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TurmaRepository extends JpaRepository<TurmaEntity, Long> {
    Optional<TurmaEntity> findByCodigoTurma(String codigoTurma);
}
