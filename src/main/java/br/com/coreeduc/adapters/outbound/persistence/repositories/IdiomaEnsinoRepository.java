package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.IdiomaEnsinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdiomaEnsinoRepository extends JpaRepository<IdiomaEnsinoEntity, Long> {
}
