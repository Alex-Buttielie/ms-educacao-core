package br.com.coreeduc.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.DependenciasFisicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DependenciasFisicasRepository extends JpaRepository<DependenciasFisicasEntity, Long> {
}