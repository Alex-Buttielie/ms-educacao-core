package br.com.coreeduc.aplication.components;

import br.com.coreeduc.aplication.entities.CompanyEntity;
import br.com.coreeduc.aplication.factorys.CompanyFactory;
import br.com.coreeduc.aplication.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.EnumSet;
import java.util.List;
import java.util.Properties;

public enum CompanyAutoCompleteComponent {

    COMPANYS_FROM_FANTASY_NAME ("fantasyName"){
        @Override
        public List<CompanyEntity> findCompanys(String value, String key) {
            var company = new CompanyFactory(getProperties(value, key)).getCompany();
            return findd(companyRepository.findAllByFantasyName(company.getFantasyName()));
        }
    },
    COMPANYS_FROM_NAME_COMPANY ("nameCompany"){
        @Override
        public List<CompanyEntity> findCompanys(String value, String key) {
            var company = new CompanyFactory(getProperties(value, key)).getCompany();
            return findd(companyRepository.findAllByNameCompany(company.getFantasyName()));
        }
    };

    public List<CompanyEntity> findd(List<CompanyEntity> all) {
        return all.isEmpty() ? companyRepository.findAll() : all;
    }

    public abstract List<CompanyEntity> findCompanys(String value, String key);


    public Properties getProperties(String value, String key) {
        var prop = new Properties();
        prop.put(key, value);
        return prop;
    }

    protected CompanyRepository companyRepository;

    private String key;

    CompanyAutoCompleteComponent(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static CompanyAutoCompleteComponent getTipoBuscaAutoComplete(String valor) {
        for (CompanyAutoCompleteComponent value : values()) {
            if (value.getKey().equals(valor)) {
                return value;
            }
        }

        throw new RuntimeException("Programador problema ao idenficar o tipo de busca da compania.");

    }

    public void setCompanyRepository(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Component
    final static class ServiceInjector {
        @Autowired
        protected CompanyRepository companyRepository;

        @PostConstruct
        private void postConstruct() {
            for (var item : EnumSet.allOf(CompanyAutoCompleteComponent.class)) {
                item.setCompanyRepository(companyRepository);
            }
        }
    }

}
