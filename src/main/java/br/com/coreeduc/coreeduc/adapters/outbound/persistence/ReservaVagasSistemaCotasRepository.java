package br.com.coreeduc.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.ReservaVagasSistemaCotasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaVagasSistemaCotasRepository extends JpaRepository<ReservaVagasSistemaCotasEntity, Long> {
}