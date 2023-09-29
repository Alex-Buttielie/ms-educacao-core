package br.com.coreeduc.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.MunicipioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipioRepository extends JpaRepository<MunicipioEntity, Long> {
}
