package br.com.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.adapters.outbound.persistence.entities.LocalFuncionamentoEscolaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LocalFuncionamentoEscolaRepository extends JpaRepository<LocalFuncionamentoEscolaEntity, Long> {
}
