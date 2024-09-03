package br.com.coreeduc.aplication.factorys;

import br.com.coreeduc.aplication.entities.CompanyEntity;
import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class CompanyFactoryTest {

    @Test
    void testCompanyFactoryWithProperties() {
        Properties properties = new Properties();
        properties.setProperty("id", "123");
        properties.setProperty("fantasyName", "Test Fantasy");
        properties.setProperty("nameCompany", "Test Company");

        CompanyFactory factory = new CompanyFactory(properties);
        CompanyEntity company = factory.getCompany();

        assertNotNull(company);
        assertEquals(Long.valueOf(123), company.getId());
        assertEquals("Test Fantasy", company.getFantasyName());
        assertEquals("Test Company", company.getNameCompany());
    }

    @Test
    void testCompanyFactoryWithMissingProperties() {
        Properties properties = new Properties();

        CompanyFactory factory = new CompanyFactory(properties);
        CompanyEntity company = factory.getCompany();

        assertNotNull(company);
        assertNull(company.getId());
        assertNull(company.getFantasyName());
        assertNull(company.getNameCompany());
    }

    @Test
    void testBuilderPattern() {
        CompanyEntity company = new CompanyEntity();
        company.setId(456L);
        company.setFantasyName("Builder Fantasy");
        company.setNameCompany("Builder Company");

        CompanyFactory.Builder builder = new CompanyFactory.Builder();
        builder.id(456L);
        builder.fantasyName("Builder Fantasy");
        builder.nameCompany("Builder Company");

        CompanyFactory factory = builder.build();
        CompanyEntity builtCompany = factory.getCompany();

        assertNotNull(builtCompany);
        assertEquals(456L, builtCompany.getId());
        assertEquals("Builder Fantasy", builtCompany.getFantasyName());
        assertEquals("Builder Company", builtCompany.getNameCompany());
    }

    @Test
    void testBuilderWithNoValues() {
        CompanyFactory.Builder builder = new CompanyFactory.Builder();
        CompanyFactory factory = builder.build();
        CompanyEntity company = factory.getCompany();

        assertNotNull(company);
        assertNull(company.getId());
        assertNull(company.getFantasyName());
        assertNull(company.getNameCompany());
    }

}
