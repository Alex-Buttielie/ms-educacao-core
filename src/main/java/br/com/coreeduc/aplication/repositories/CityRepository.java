package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {
    List<CityEntity> findByNameIgnoreCase(String name);
    List<CityEntity> findByStateIgnoreCase(String state);
    Optional<CityEntity> findById(String id);
}
