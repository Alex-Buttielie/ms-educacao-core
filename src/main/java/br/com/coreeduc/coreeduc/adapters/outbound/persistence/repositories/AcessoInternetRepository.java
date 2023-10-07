package br.com.coreeduc.coreeduc.adapters.outbound.persistence.repositories;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.AcessoInternetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcessoInternetRepository extends JpaRepository<AcessoInternetEntity, Long> {
}
