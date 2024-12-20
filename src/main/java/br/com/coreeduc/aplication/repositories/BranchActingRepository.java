package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.BranchActing;
import br.com.coreeduc.aplication.entities.GroupBranchActing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BranchActingRepository extends JpaRepository<BranchActing, Long> {

    Optional<BranchActing> findBranchActingByCodeAndDescriptionIgnoreCaseAndObservationIgnoreCaseAndGroupBranchActing(
            String code, String description, String observacao, GroupBranchActing groupBranchActing
    );
    Optional<BranchActing> findBranchActingByCode(String code);
    List<BranchActing> findBranchActingByDescriptionIgnoreCase(String description);
    Optional<BranchActing> findBranchActingByDescription(String description);
}
