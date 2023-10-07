package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.DestinacaoLixoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DestinacaoLixoRepository extends JpaRepository<DestinacaoLixoEntity, Long> {
}
