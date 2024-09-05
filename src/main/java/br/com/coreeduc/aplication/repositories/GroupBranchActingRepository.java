package br.com.coreeduc.aplication.repositories;

import br.com.coreeduc.aplication.entities.DivisionGroupBranchActing;
import br.com.coreeduc.aplication.entities.GroupBranchActing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupBranchActingRepository extends JpaRepository<GroupBranchActing, Long> {

    Optional<GroupBranchActing> findGroupBranchActingByCodeAndDescriptionAndDivisionGroupBranchActing(
            String code, String description, DivisionGroupBranchActing divisionGroupBranchActing);
}
