package br.com.coreeduc.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.EsgotamentoSanitarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsgotamentoSanitarioRepository extends JpaRepository<EsgotamentoSanitarioEntity, Long> {
}
