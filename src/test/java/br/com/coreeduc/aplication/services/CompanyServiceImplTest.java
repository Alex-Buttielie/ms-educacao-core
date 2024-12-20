package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.CompanyAutoCompleteComponent;
import br.com.coreeduc.aplication.contraints.SizesCompany;
import br.com.coreeduc.aplication.contraints.StatesBrazil;
import br.com.coreeduc.aplication.contraints.TypeLegalNature;
import br.com.coreeduc.aplication.contraints.TypeUnitCompany;
import br.com.coreeduc.aplication.entities.CompanyEntity;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesOptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.repositories.CompanyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class CompanyServiceImplTest {

    private CompanyRepository companyRepository;
    private CityService cityService;
    private CompanyServiceImpl companyService;
    private BranchActingService branchActingService;
    private NeighbordhoodService neighbordhoodService;
    private PublicPlaceService publicPlaceService;

    @BeforeEach
    void setUp() {
        companyRepository = Mockito.mock(CompanyRepository.class);
        cityService = Mockito.mock(CityService.class);
        branchActingService = Mockito.mock(BranchActingService.class);
        neighbordhoodService = Mockito.mock(NeighbordhoodService.class);
        publicPlaceService = Mockito.mock(PublicPlaceService.class);
        companyService = new CompanyServiceImpl(companyRepository, cityService, branchActingService,
                neighbordhoodService,
                publicPlaceService);
    }

    @Test
    void testFindPropertiesView() {
        var expectedMap = new HashMap<String, OptionSelectedViewRecord>();
        expectedMap.put("states", companyService.getStates());
        expectedMap.put("sizesCompany", companyService.getCompanysSiza());
        expectedMap.put("legalsNature", companyService.getLegalsNature());
        expectedMap.put("typeUnitCompany", companyService.getTypeUnitCompany());
        expectedMap.put("statusRegistry", companyService.getStatusRegistry());
        PropertiesViewRecord expected = new PropertiesViewRecord(expectedMap);
        PropertiesViewRecord actual = companyService.findPropertiesView();
        assertEquals(expected, actual, "Expected PropertiesViewRecord does not match actual");
    }

    @Test
    void testFindPropertiesFromSeleted() {
        var actual = companyService.findPropertiesFromSeleted();
        var expected = new HashMap<>();
        expected.put("states", companyService.getStates());
        expected.put("sizesCompany", companyService.getCompanysSiza());
        expected.put("legalsNature", companyService.getLegalsNature());
        expected.put("typeUnitCompany", companyService.getTypeUnitCompany());
        expected.put("statusRegistry", companyService.getStatusRegistry());
        assertEquals(expected, actual, "Expected properties from findPropertiesFromSeleted do not match actual");
    }

    @Test
    void testAutoCompleteFindByFantasyNameNotResultIfNameCompanyEmpity() {
        var value = "Teste Company";
        var key = "fantasyName";
        var company = new CompanyEntity();
        company.setFantasyName(value);
        var companyList = Arrays.asList(company);
        var component = CompanyAutoCompleteComponent.COMPANYS_BY_FANTASY_NAME;
        component.setCompanyRepository(companyRepository);
        when(companyRepository.findAllByFantasyNameIgnoreCase(value))
                .thenReturn(companyList);
        var result = companyService.autoComplete(value, key);
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    void testAutoCompleteFindByFantasyNameResultSucessIfNameCompanyEmpity() {
        var value = "Teste Company";
        var key = "fantasyName";
        var company = new CompanyEntity();
        company.setFantasyName(value);
        company.setNameCompany(value);
        var companyList = Arrays.asList(company);
        var component = CompanyAutoCompleteComponent.COMPANYS_BY_FANTASY_NAME;
        component.setCompanyRepository(companyRepository);
        when(companyRepository.findAllByFantasyNameIgnoreCase(value))
                .thenReturn(companyList);
        var result = companyService.autoComplete(value, key);
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    void testAutoCompleteNoResults() {
        var value = "NonExistentCompany";
        var key = "fantasyName";
        var component = CompanyAutoCompleteComponent.COMPANYS_BY_FANTASY_NAME;
        component.setCompanyRepository(companyRepository);
        when(companyRepository.findAllByFantasyNameIgnoreCase(value)).thenReturn(Collections.emptyList());
        var result = companyService.autoComplete(value, key);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetStates() {
        var result = companyService.getStates();
        assertNotNull(result);
        assertEquals(StatesBrazil.values().length, result.options().size());
        for (StatesBrazil state : StatesBrazil.values()) {
            assertTrue(result
                    .options()
                    .stream()
                    .anyMatch(option -> option.value().equals(state.getCodigo())));
        }
    }


}
