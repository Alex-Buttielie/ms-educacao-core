package br.com.coreeduc.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.LocalFuncionamentoEscolaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LocalFuncionamentoEscolaRepository extends JpaRepository<LocalFuncionamentoEscolaEntity, Long> {
}