package br.com.coreeduc.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.AreaConhecimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaConhecimentoRepository extends JpaRepository<AreaConhecimentoEntity, Long> {
}