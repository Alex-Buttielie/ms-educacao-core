package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.SessionBranchActing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionBranchActingRepository extends JpaRepository<SessionBranchActing, Long> {
    Optional<SessionBranchActing> findSessionBranchActingByCodeAndDescription(String code, String description);
}
