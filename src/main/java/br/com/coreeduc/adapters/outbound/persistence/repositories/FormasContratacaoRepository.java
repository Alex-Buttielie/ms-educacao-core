package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.FormasContratacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormasContratacaoRepository extends JpaRepository<FormasContratacaoEntity, Long> {
}
