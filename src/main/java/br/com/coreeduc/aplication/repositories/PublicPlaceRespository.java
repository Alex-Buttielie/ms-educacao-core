package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.PublicPlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublicPlaceRespository extends JpaRepository<PublicPlaceEntity, Long> {
    List<PublicPlaceEntity> findPublicPlaceEntityByPostalCode(String postalCode);
    List<PublicPlaceEntity> findPublicPlaceEntityByDescriptionIgnoreCase(String description);
}
