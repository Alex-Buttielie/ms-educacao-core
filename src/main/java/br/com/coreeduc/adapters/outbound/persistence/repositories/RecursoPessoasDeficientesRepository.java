package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.RecursoPessoasDeficientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecursoPessoasDeficientesRepository extends JpaRepository<RecursoPessoasDeficientesEntity, Long> {
}
