package br.com.coreeduc.aplication.factorys;

import br.com.coreeduc.aplication.entities.CompanyEntity;
import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class CompanyFactoryTest {

    @Test
    void testCompanyFactoryWithProperties() {
        var properties = new Properties();
        properties.setProperty("id", "123");
        properties.setProperty("fantasyName", "Test Fantasy");
        properties.setProperty("nameCompany", "Test Company");
        var factory = new CompanyFactory(properties);
        var company = factory.getCompany();
        assertNotNull(company);
        assertEquals(Long.valueOf(123), company.getId());
        assertEquals("Test Fantasy", company.getFantasyName());
        assertEquals("Test Company", company.getNameCompany());
    }

    @Test
    void testCompanyFactoryWithMissingProperties() {
        var properties = new Properties();
        var factory = new CompanyFactory(properties);
        var company = factory.getCompany();
        assertNotNull(company);
        assertNull(company.getId());
        assertNull(company.getFantasyName());
        assertNull(company.getNameCompany());
    }

    @Test
    void testBuilderPattern() {
        var company = new CompanyEntity();
        company.setId(456L);
        company.setFantasyName("Builder Fantasy");
        company.setNameCompany("Builder Company");
        var builder = new CompanyFactory.Builder();
        builder.id(456L);
        builder.fantasyName("Builder Fantasy");
        builder.nameCompany("Builder Company");
        var factory = builder.build();
        var builtCompany = factory.getCompany();
        assertNotNull(builtCompany);
        assertEquals(456L, builtCompany.getId());
        assertEquals("Builder Fantasy", builtCompany.getFantasyName());
        assertEquals("Builder Company", builtCompany.getNameCompany());
    }

    @Test
    void testBuilderWithNoValues() {
        var builder = new CompanyFactory.Builder();
        var factory = builder.build();
        var company = factory.getCompany();
        assertNotNull(company);
        assertNull(company.getId());
        assertNull(company.getFantasyName());
        assertNull(company.getNameCompany());
    }

}
