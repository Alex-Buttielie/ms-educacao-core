package br.com.coreeduc.aplication.factorys;

import br.com.coreeduc.aplication.entities.CityEntity;

import java.util.Optional;
import java.util.Properties;

public class CityFactory {

    private CityEntity city;

    public CityFactory(Properties properties) {
        var builder = new Builder();

        setCity(
                builder.id(Optional.ofNullable(properties.getProperty("id")).orElse(null))
                        .name(properties.getProperty("name"))
                        .state(properties.getProperty("state"))
                        .build().getCity()
        );

    }

    private CityFactory(Builder builder) {
        setCity(builder.city);
    }

    private void setCity(CityEntity city) {
        this.city = city;
    }

    public CityEntity getCity() {
        return city;
    }

    public static final class Builder {

        private CityEntity city;

        public Builder() {
            city = new CityEntity();
        }

        public Builder id(String id) {
            city.setId(id);
            return this;
        }

        public Builder name(String name) {
            city.setName(name);
            return this;
        }

        public Builder state(String state) {
            city.setState(state);
            return this;
        }

        public CityFactory build() {
            return new CityFactory(this);
        }
    }

}
