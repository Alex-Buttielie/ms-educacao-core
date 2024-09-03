package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {
    List<CityEntity> findByName(String name);
}
