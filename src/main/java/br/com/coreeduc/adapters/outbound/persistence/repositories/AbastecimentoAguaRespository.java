package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.AbastecimentoAguaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AbastecimentoAguaRespository extends JpaRepository<AbastecimentoAguaEntity, Long> {
}
