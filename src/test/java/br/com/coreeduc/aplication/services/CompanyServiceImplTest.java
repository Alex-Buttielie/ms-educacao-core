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
        var expectedMap = new HashMap<String, OptionSelectedViewRecord>();
        expectedMap.put("states", getStates());
        expectedMap.put("sizesCompany", getCompanysSiza());
        expectedMap.put("legalsNature", getLegalsNature());
        expectedMap.put("typeUnitCompany", getTypeUnitCompany());
        PropertiesViewRecord expected = new PropertiesViewRecord(expectedMap);
        PropertiesViewRecord actual = companyService.findPropertiesView();
        assertEquals(expected, actual, "Expected PropertiesViewRecord does not match actual");
    }

    @Test
    void testFindPropertiesFromSeleted() {
        var actual = companyService.findPropertiesFromSeleted();
        var expected = new HashMap<>();
        expected.put("states", getStates());
        expected.put("sizesCompany", getCompanysSiza());
        expected.put("legalsNature", getLegalsNature());
        expected.put("typeUnitCompany", getTypeUnitCompany());
        assertEquals(expected, actual, "Expected properties from findPropertiesFromSeleted do not match actual");
    }

    @Test
    void testAutoComplete() {
        var value = "TestCompany";
        var key = "fantasyName";
        var company = new CompanyEntity();
        company.setFantasyName(value);
        var companyList = Arrays.asList(company);
        var component = CompanyAutoCompleteComponent.COMPANYS_BY_FANTASY_NAME;
        component.setCompanyRepository(companyRepository);
        when(companyRepository.findAllByFantasyNameIgnoreCase(value)).thenReturn(companyList);
        var result = companyService.autoComplete(value, key);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(value, result.get(0).getFantasyName());
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


    private OptionSelectedViewRecord getTypeUnitCompany() {
        return new OptionSelectedViewRecord(
                Arrays.stream(TypeUnitCompany.values())
                        .map(type -> new PropertiesOptionSelectedViewRecord(type.getCode(), type.getDescription()))
                        .toList()
        );
    }

    private OptionSelectedViewRecord getLegalsNature() {
        return new OptionSelectedViewRecord(
                Arrays.stream(TypeLegalNature.values())
                        .map(nature -> new PropertiesOptionSelectedViewRecord(nature.getCode(), nature.getDescription()))
                        .toList()
        );
    }

    private OptionSelectedViewRecord getStates() {
        return new OptionSelectedViewRecord(
                Arrays.stream(StatesBrazil.values())
                        .map(state -> new PropertiesOptionSelectedViewRecord(state.getCodigo(), state.getNome()))
                        .toList()
        );
    }

    private OptionSelectedViewRecord getCompanysSiza() {
        return new OptionSelectedViewRecord(
                Arrays.stream(SizesCompany.values())
                        .map(size -> new PropertiesOptionSelectedViewRecord(size.getCodigo(), size.getNome()))
                        .toList()
        );
    }

}
