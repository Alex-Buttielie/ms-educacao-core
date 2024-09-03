package br.com.coreeduc.aplication.factorys;

import br.com.coreeduc.aplication.entities.CompanyEntity;

import java.util.Optional;
import java.util.Properties;

public class CompanyFactory {

    private CompanyEntity company;

    public CompanyFactory(Properties properties) {
        var builder = new Builder();

        setCompany(
                builder.id(Optional.ofNullable(properties.getProperty("id")).map(Long::valueOf).orElse(null))
                        .fantasyName(properties.getProperty("fantasyName"))
                        .nameCompany(properties.getProperty("nameCompany"))
                        .build().getCompany()
        );

    }

    private CompanyFactory(Builder builder) {
        setCompany(builder.company);
    }

    private void setCompany(CompanyEntity company) {
        this.company =  company;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public static final class Builder {

        private CompanyEntity company;

        public Builder() {
            company = new CompanyEntity();
        }

        public Builder id(Long id) {
            company.setId(id);
            return this;
        }
        public Builder fantasyName(String name) {
            company.setFantasyName(name);
            return this;
        }

        public Builder nameCompany(String name) {
            company.setNameCompany(name);
            return this;
        }

        public CompanyFactory build() {
            return new CompanyFactory(this);
        }
    }

}
