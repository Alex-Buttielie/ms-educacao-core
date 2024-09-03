package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeEnsinoRepository extends JpaRepository<UnidadeEnsinoEntity, Long> {
}
