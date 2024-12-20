package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.BranchActignAutoCompleteComponent;
import br.com.coreeduc.aplication.entities.BranchActing;
import br.com.coreeduc.aplication.entities.DivisionGroupBranchActing;
import br.com.coreeduc.aplication.entities.GroupBranchActing;
import br.com.coreeduc.aplication.entities.SessionBranchActing;
import br.com.coreeduc.aplication.factorys.BranchActingFactory;
import br.com.coreeduc.aplication.records.BranchActingRecord;
import br.com.coreeduc.aplication.records.DivisionBranchActingRecord;
import br.com.coreeduc.aplication.records.GroupBranchActingRecord;
import br.com.coreeduc.aplication.records.SessionBranchActingRecord;
import br.com.coreeduc.aplication.repositories.BranchActingRepository;
import br.com.coreeduc.aplication.repositories.DivisionGroupBranchActingRepository;
import br.com.coreeduc.aplication.repositories.GroupBranchActingRepository;
import br.com.coreeduc.aplication.repositories.SessionBranchActingRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BranchActingServiceImplTest {

    @Mock
    private BranchActingRepository branchActingRepository;

    @Mock
    private SessionBranchActingRepository sessionBranchActingRepository;

    @Mock
    private DivisionGroupBranchActingRepository divisionGroupBranchActingRepository;

    @Mock
    private GroupBranchActingRepository groupBranchActingRepository;

    @InjectMocks
    private BranchActingServiceImpl branchActingService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        for (BranchActignAutoCompleteComponent component : BranchActignAutoCompleteComponent.values()) {
            component.setBranchActingRepository(branchActingRepository);
        }
    }

    @Test
    void testFindPropertiesView() {
        assertNull(branchActingService.findPropertiesView(), "Expected findPropertiesView to return null");
    }

    @Test
    void testFindPropertiesFromSelected() {
        assertEquals(Map.of(), branchActingService.findPropertiesFromSeleted(), "Expected findPropertiesFromSeleted to return an empty map");
    }

    @Test
    void testAutoComplete() {
        String value = "descricao";
        String key = "descricao";
        var branchActing = new BranchActing("id", "descricao", "observacoes", null);

        when(branchActingRepository.findBranchActingByDescriptionIgnoreCase(any()))
                .thenReturn(List.of(branchActing));

        var result = branchActingService.autoComplete(value, key);

        var expected = List.of(new BranchActingFactory(branchActing).getBranchActingRecord());
        assertEquals(expected, result, "Expected autoComplete to return the correct list of BranchActingRecord");
    }

    @Test
    void testImportBranchActings() {
        var record = new BranchActingRecord(
                "id", "description", List.of("obs"),
                new GroupBranchActingRecord(
                        "groupId", "groupDesc",
                        new DivisionBranchActingRecord(
                                "divId", "divDesc",
                                new SessionBranchActingRecord("secaoId", "secaoDesc")
                        )
                )
        );
        var records = List.of(record);

        branchActingService.importBranchActings(records);

        verify(branchActingRepository, times(1)).save(any(BranchActing.class));
    }

    @Test
    void testProcessBranchActing_whenBranchActingDoesNotExist() {
        var record = new BranchActingRecord(
                "branchId", "branchDesc", List.of("obs"),
                new GroupBranchActingRecord(
                        "groupId", "groupDesc",
                        new DivisionBranchActingRecord(
                                "divId", "divDesc",
                                new SessionBranchActingRecord("secaoId", "secaoDesc")
                        )
                )
        );
        var groupBranchActing = new GroupBranchActing(
                "groupId", "groupDesc",
                new DivisionGroupBranchActing("divId", "divDesc", new SessionBranchActing("secaoId", "secaoDesc"))
        );
        var branchActing = new BranchActing("branchId", "branchDesc", "obs", groupBranchActing);

        when(branchActingRepository.findBranchActingByCodeAndDescriptionIgnoreCaseAndObservationIgnoreCaseAndGroupBranchActing(
                any(), any(), any(), any()
        )).thenReturn(Optional.empty());
        when(branchActingRepository.save(any(BranchActing.class))).thenReturn(branchActing);

        branchActingService.processBranchActing(record);

        verify(branchActingRepository, times(1)).save(any(BranchActing.class));
    }

    @Test
    void testProcessBranchActing_whenBranchActingExists() {
        var record = new BranchActingRecord(
                "branchId", "branchDesc", List.of("obs"),
                new GroupBranchActingRecord(
                        "groupId", "groupDesc",
                        new DivisionBranchActingRecord(
                                "divId", "divDesc",
                                new SessionBranchActingRecord("secaoId", "secaoDesc")
                        )
                )
        );
        var existingBranchActing = new BranchActing("branchId", "branchDesc", "obs", null);

        when(branchActingRepository.findBranchActingByCodeAndDescriptionIgnoreCaseAndObservationIgnoreCaseAndGroupBranchActing(
                any(), any(), any(), any()
        )).thenReturn(Optional.of(existingBranchActing));

        branchActingService.processBranchActing(record);

        verify(branchActingRepository, never()).save(any(BranchActing.class));
    }

    @Test
    void testProcessBranchActing_withException() {
        var record = new BranchActingRecord(
                "branchId", "branchDesc", List.of("obs"),
                new GroupBranchActingRecord(
                        "groupId", "groupDesc",
                        new DivisionBranchActingRecord(
                                "divId", "divDesc",
                                new SessionBranchActingRecord("secaoId", "secaoDesc")
                        )
                )
        );

        when(branchActingRepository.findBranchActingByCodeAndDescriptionIgnoreCaseAndObservationIgnoreCaseAndGroupBranchActing(
                any(), any(), any(), any()
        )).thenThrow(new RuntimeException("Database error"));

        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () -> branchActingService.processBranchActing(record),
                "Expected processBranchActing to throw RuntimeException"
        );

        assertEquals("Database error", thrown.getMessage());
    }
}
