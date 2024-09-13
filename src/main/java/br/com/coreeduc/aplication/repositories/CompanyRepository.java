package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
    List<CompanyEntity> findAllByFantasyNameIgnoreCase(String fantasyName);
    List<CompanyEntity> findAllByNameCompanyIgnoreCase(String nameCompany);
}
