package br.com.coreeduc.aplication.components;

import br.com.coreeduc.aplication.entities.PublicPlaceEntity;
import br.com.coreeduc.aplication.factorys.PublicPlaceFactory;
import br.com.coreeduc.aplication.repositories.PublicPlaceRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.EnumSet;
import java.util.List;
import java.util.Properties;

public enum PublicPlaceAutoCompleteComponent {

    PUBLIC_PLACE_BY_POSTAL_CODE ("postalCode"){
        @Override
        public List<PublicPlaceEntity> findPublicPlaces(String value, String key) {
            var publicPlace = new PublicPlaceFactory(getProperties(value, key)).getPublicPlaceEntity();
            return find(publicPlaceRespository.findPublicPlaceEntityByPostalCode(publicPlace.getPostalCode()));
        }
    },
    PUBLIC_PLACE_BY_DESCRIPTION ("description"){
        @Override
        public List<PublicPlaceEntity> findPublicPlaces(String value, String key) {
            var publicPlace = new PublicPlaceFactory(getProperties(value, key)).getPublicPlaceEntity();
            return find(publicPlaceRespository.findPublicPlaceEntityByDescriptionIgnoreCase(publicPlace.getDescription()));
        }
    };

    protected List<PublicPlaceEntity> find(List<PublicPlaceEntity> publicPlaceEntityByPostalCode) {
        return publicPlaceEntityByPostalCode.isEmpty() ? publicPlaceRespository.findAll() : publicPlaceEntityByPostalCode;
    }

    public abstract List<PublicPlaceEntity> findPublicPlaces(String value, String key);

    protected Properties getProperties(String value, String key) {
        var prop = new Properties();
        prop.put(key, value);
        return prop;
    }

    protected PublicPlaceRespository publicPlaceRespository;

    private String key;

    PublicPlaceAutoCompleteComponent(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static PublicPlaceAutoCompleteComponent getTipoBuscaAutoComplete(String key) {
        for (PublicPlaceAutoCompleteComponent value : values()) {
            if (value.getKey().equals(key)) {
                return value;
            }
        }

        throw new RuntimeException("Programador problema ao idenficar o tipo do Logradouro do autocomplete.");

    }

    public void setPublicPlaceRespository(PublicPlaceRespository publicPlaceRespository) {
        this.publicPlaceRespository = publicPlaceRespository;
    }


    @Component
    private static class ServiceInjector {
        @Autowired
        protected PublicPlaceRespository publicPlaceRespository;

        @PostConstruct
        private void postConstruct() {
            for (var item : EnumSet.allOf(PublicPlaceAutoCompleteComponent.class)) {
                item.setPublicPlaceRespository(publicPlaceRespository);
            }
        }

    }

}
