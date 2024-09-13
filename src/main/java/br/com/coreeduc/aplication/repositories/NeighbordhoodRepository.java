package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.CityEntity;
import br.com.coreeduc.aplication.entities.NeighbordhoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NeighbordhoodRepository extends JpaRepository<NeighbordhoodEntity, Long> {
    List<NeighbordhoodEntity> findNeighbordhoodEntitiesByCity(CityEntity city);
    List<NeighbordhoodEntity> findNeighbordhoodEntitiesByDescriptionIgnoreCase(String description);
}
