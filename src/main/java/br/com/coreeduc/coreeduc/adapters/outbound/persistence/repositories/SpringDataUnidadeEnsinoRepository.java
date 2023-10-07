package br.com.coreeduc.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataUnidadeEnsinoRepository extends JpaRepository<UnidadeEnsinoEntity, Long> {
}
