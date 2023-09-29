package br.com.coreeduc.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.FormasContratacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormasContratacaoRepository extends JpaRepository<FormasContratacaoEntity, Long> {
}
