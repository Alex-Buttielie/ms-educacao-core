package br.com.coreeduc.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.EsferaAdministrativaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsferaAdministrativaRepository extends JpaRepository<EsferaAdministrativaEntity, Long> {
}