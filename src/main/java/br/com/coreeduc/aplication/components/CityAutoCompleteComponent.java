package br.com.coreeduc.aplication.components;

import br.com.coreeduc.aplication.entities.CityEntity;
import br.com.coreeduc.aplication.factorys.CityFactory;
import br.com.coreeduc.aplication.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.EnumSet;
import java.util.List;
import java.util.Properties;

public enum CityAutoCompleteComponent {

    CITYS_BY_NAME ("name"){
        @Override
        public List<CityEntity> findCitys(String value, String key) {
            var city = new CityFactory(getProperties(value, key)).getCity();
            return find(cityRepository.findByNameIgnoreCase(city.getName()));
        }
    },
    CITYS_BY_STATE("state"){
        @Override
        public List<CityEntity> findCitys(String value, String key) {
            var city = new CityFactory(getProperties(value, key)).getCity();
            return find(cityRepository.findByStateIgnoreCase(city.getState()));
        }
    },
    CITYS_BY_ID("id"){
        @Override
        public List<CityEntity> findCitys(String value, String key) {
            var city = new CityFactory(getProperties(value, key)).getCity();
            return find(List.of(cityRepository.findById(city.getCodigoMec()).orElse(null)));
        }
    };

    public List<CityEntity> find(List<CityEntity> all) {
        return all.isEmpty() ? cityRepository.findAll() : all;
    }

    public abstract List<CityEntity> findCitys(String value, String key);


    public Properties getProperties(String value, String key) {
        var prop = new Properties();
        prop.put(key, value);
        return prop;
    }

    protected CityRepository cityRepository;

    private String key;

    CityAutoCompleteComponent(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static CityAutoCompleteComponent getTipoBuscaAutoComplete(String valor) {
        for (CityAutoCompleteComponent value : values()) {
            if (value.getKey().equals(valor)) {
                return value;
            }
        }

        throw new RuntimeException("Programador problema ao idenficar o tipo de busca da cidade.");

    }

    public void setCityRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Component
    final static class ServiceInjector {
        @Autowired
        protected CityRepository cityRepository;

        @PostConstruct
        private void postConstruct() {
            for (var item : EnumSet.allOf(CityAutoCompleteComponent.class)) {
                item.setCityRepository(cityRepository);
            }
        }
    }

}
