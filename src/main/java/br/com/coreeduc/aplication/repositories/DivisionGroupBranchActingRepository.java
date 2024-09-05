package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.DivisionGroupBranchActing;
import br.com.coreeduc.aplication.entities.SessionBranchActing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DivisionGroupBranchActingRepository extends JpaRepository<DivisionGroupBranchActing, Long> {
    Optional<DivisionGroupBranchActing> findDivisionGroupBranchActingByCodeAndAndDescriptionAndSessionBranchActing(
            String code, String description, SessionBranchActing sessionBranchActing
    );

}
