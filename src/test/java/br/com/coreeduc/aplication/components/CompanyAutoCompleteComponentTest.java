package br.com.coreeduc.aplication.components;

import br.com.coreeduc.aplication.entities.CompanyEntity;
import br.com.coreeduc.aplication.factorys.CompanyFactory;
import br.com.coreeduc.aplication.repositories.CompanyRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CompanyAutoCompleteComponentTest {
    private CompanyRepository companyRepository;
    private CompanyEntity company;

    @BeforeEach
    public void init() {
        companyRepository = Mockito.mock(CompanyRepository.class);

        for (CompanyAutoCompleteComponent component : CompanyAutoCompleteComponent.values()) {
            component.setCompanyRepository(companyRepository);
        }

        company = new CompanyFactory.Builder()
                .id(1l)
                .fantasyName("fantasyName")
                .nameCompany("nameCompany")
                .build()
                .getCompany();
    }

    @Test
    void mustTestFilledFantasyNameSearch() {
        when(companyRepository.findAllByFantasyName(any())).thenReturn(List.of(company));
        var retorn = CompanyAutoCompleteComponent.COMPANYS_BY_FANTASY_NAME.findCompanys(company.getFantasyName(), "fantasyName");
        Assertions.assertNotNull(retorn);
    }

    @Test
    void mustTestFilledNameCompanySearch() {
        when(companyRepository.findAllByNameCompany(any())).thenReturn(List.of(company));
        var retorn = CompanyAutoCompleteComponent.COMPANYS_BY_NAME_COMPANY.findCompanys(company.getNameCompany(), "nameCompany");
        Assertions.assertNotNull(retorn);
    }

    @Test
    void mustTestNullNameCompanySearch() {
        Assertions.assertThrows(RuntimeException.class,() ->
        CompanyAutoCompleteComponent.COMPANYS_BY_NAME_COMPANY.findCompanys(null, "nameCompany"));
    }

    @Test
    void mustTestNullKeyCompanySearch() {
        Assertions.assertThrows(RuntimeException.class,() ->
        CompanyAutoCompleteComponent.COMPANYS_BY_NAME_COMPANY.findCompanys("valor",  null));
    }


    @Test
    void testGetTipoBuscaAutoComplete() {
        String value = "fantasyName";
        CompanyAutoCompleteComponent result = CompanyAutoCompleteComponent.getTipoBuscaAutoComplete(value);
        assertEquals(CompanyAutoCompleteComponent.COMPANYS_BY_FANTASY_NAME, result);
    }

    @Test
    void testGetProperties() {
        Properties properties = CompanyAutoCompleteComponent.COMPANYS_BY_FANTASY_NAME.getProperties(company.getNameCompany(),"nameCompany");
        assertEquals(company.getNameCompany(), properties.get("nameCompany"));
    }

}
