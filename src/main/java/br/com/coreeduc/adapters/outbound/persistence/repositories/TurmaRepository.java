package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.TurmaEntityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<TurmaEntityEntity, Long> {
    TurmaEntityEntity findTurmaByCodigoInep(Long codigoInep);
}
