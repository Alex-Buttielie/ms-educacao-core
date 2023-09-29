package br.com.coreeduc.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.IdiomaEnsinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdiomaEnsinoRepository extends JpaRepository<IdiomaEnsinoEntity, Long> {
}
