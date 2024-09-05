package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.components.CompanyAutoCompleteComponent;
import br.com.coreeduc.aplication.contraints.StatesBrazil;
import br.com.coreeduc.aplication.entities.CompanyEntity;
import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import br.com.coreeduc.aplication.repositories.CompanyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class CompanyServiceImplTest {

    private CompanyRepository companyRepository;
    private CompanyServiceImpl companyService;

    @BeforeEach
    void setUp() {
        companyRepository = Mockito.mock(CompanyRepository.class);
        companyService = new CompanyServiceImpl(companyRepository);
    }

    @Test
    void testFindPropertiesView() {
        PropertiesViewRecord result = companyService.findPropertiesView();

        assertNotNull(result);
        assertNotNull(result.propertiesSelected());
        assertTrue(result.propertiesSelected().containsKey("states"));
        assertEquals(StatesBrazil.values().length, (result.propertiesSelected().get("states")).options().size());
    }

    @Test
    void testFindPropertiesFromSeleted() {
        Map<String, OptionSelectedViewRecord> result = companyService.findPropertiesFromSeleted();

        assertNotNull(result);
        assertTrue(result.containsKey("states"));
        OptionSelectedViewRecord statesRecord = result.get("states");
        assertNotNull(statesRecord);
        assertEquals(StatesBrazil.values().length, statesRecord.options().size());
    }

    @Test
    void testAutoComplete() {
        String value = "TestCompany";
        String key = "fantasyName";
        CompanyEntity company = new CompanyEntity();
        company.setFantasyName(value);
        List<CompanyEntity> companyList = Arrays.asList(company);

        CompanyAutoCompleteComponent component = CompanyAutoCompleteComponent.COMPANYS_BY_FANTASY_NAME;
        component.setCompanyRepository(companyRepository);
        when(companyRepository.findAllByFantasyName(value)).thenReturn(companyList);

        List<CompanyEntity> result = companyService.autoComplete(value, key);

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(value, result.get(0).getFantasyName());
    }

    @Test
    void testAutoCompleteNoResults() {
        String value = "NonExistentCompany";
        String key = "fantasyName";
        List<CompanyEntity> emptyList = Arrays.asList();

        CompanyAutoCompleteComponent component = CompanyAutoCompleteComponent.COMPANYS_BY_FANTASY_NAME;
        component.setCompanyRepository(companyRepository);
        when(companyRepository.findAllByFantasyName(value)).thenReturn(emptyList);

        List<CompanyEntity> result = companyService.autoComplete(value, key);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetStates() {
        OptionSelectedViewRecord result = companyService.getStates();

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
