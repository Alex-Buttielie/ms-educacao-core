package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.CompanyEntity;
import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
    List<CompanyEntity> findAllByFantasyName(String fantasyName);
    List<CompanyEntity> findAllByNameCompany(String nameCompany);
}
