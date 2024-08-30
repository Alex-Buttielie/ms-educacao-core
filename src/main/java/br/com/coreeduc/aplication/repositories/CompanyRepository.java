package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.CompanyEntity;
import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
