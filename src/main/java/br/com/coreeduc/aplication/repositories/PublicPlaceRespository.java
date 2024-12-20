package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.NeighbordhoodEntity;
import br.com.coreeduc.aplication.entities.PublicPlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PublicPlaceRespository extends JpaRepository<PublicPlaceEntity, Long> {
    List<PublicPlaceEntity> findPublicPlaceEntityByPostalCode(String postalCode);
    List<PublicPlaceEntity> findPublicPlaceEntitiesByDescriptionIgnoreCase(String description);
    Optional<PublicPlaceEntity> findPublicPlaceEntityByDescriptionAndPostalCodeAndNeighbordhood(String description,
                                                                                                 String postalCode, NeighbordhoodEntity neighbordhood);
}
