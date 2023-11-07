package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.TurmaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<TurmaEntity, Long> {
    TurmaEntity findTurmaByCodigoInep(Long codigoInep);
}
