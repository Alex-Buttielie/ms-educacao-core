package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnidadeEnsinoRepository extends JpaRepository<UnidadeEnsinoEntity, Long> {
}
