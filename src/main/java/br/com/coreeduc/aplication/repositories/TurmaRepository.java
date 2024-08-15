package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.TurmaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<TurmaEntity, Long> {
    TurmaEntity findTurmaByCodigoInep(Long codigoInep);
}
