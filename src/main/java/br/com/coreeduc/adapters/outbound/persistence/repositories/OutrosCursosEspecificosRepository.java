package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.OutrosCursosEspecificosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutrosCursosEspecificosRepository extends JpaRepository<OutrosCursosEspecificosEntity, Long> {
}
