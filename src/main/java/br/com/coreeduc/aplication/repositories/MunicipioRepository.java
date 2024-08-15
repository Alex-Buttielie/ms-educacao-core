package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.MunicipioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipioRepository extends JpaRepository<MunicipioEntity, Long> {
}
