package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.EsgotamentoSanitarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsgotamentoSanitarioRepository extends JpaRepository<EsgotamentoSanitarioEntity, Long> {
}
