package br.com.coreeduc.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.QuantidadeComputadoresEmUsoAlunosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuantidadeComputadoresEmUsoAlunosRepository extends JpaRepository<QuantidadeComputadoresEmUsoAlunosEntity, Long> {
}