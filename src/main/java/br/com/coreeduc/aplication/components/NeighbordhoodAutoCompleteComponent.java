package br.com.coreeduc.aplication.components;

import br.com.coreeduc.aplication.entities.CityEntity;
import br.com.coreeduc.aplication.entities.NeighbordhoodEntity;
import br.com.coreeduc.aplication.factorys.NeighbordhoodFactory;
import br.com.coreeduc.aplication.records.NeighbordhoodRecord;
import br.com.coreeduc.aplication.repositories.CityRepository;
import br.com.coreeduc.aplication.repositories.NeighbordhoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Collectors;

public enum NeighbordhoodAutoCompleteComponent {

    NEIGHBORDHOOD_BY_ID ("id"){
        @Override
        public List<NeighbordhoodRecord> findNeighbordhoods(String value, String key) {
            var neighbordhood = new NeighbordhoodFactory(getProperties(value, key)).getNeighbordhoodEntity();
            var neighbordhoods = Objects.nonNull(neighbordhood.getId()) ?
                    List.of(neighbordhoodRepository.findById(neighbordhood.getId()).get()) :
                    neighbordhoodRepository.findAll();
            return super.convertsListNeighbordhoodInRecord(neighbordhoods);
        }
    },
    NEIGHBORDHOOD_BY_CITY ("city"){
        @Override
        public List<NeighbordhoodRecord> findNeighbordhoods(String value, String key) {
            var city = cityRepository.findById(value !=null && value != "" ? value : "").orElse(null);
            var neighbordhood = new NeighbordhoodFactory(city).getNeighbordhoodEntity();
            var neighbordhoods = Objects.nonNull(neighbordhood.getCity()) ?
                    neighbordhoodRepository.findNeighbordhoodEntitiesByCity(neighbordhood.getCity()) :
                    neighbordhoodRepository.findAll();

            return super.convertsListNeighbordhoodInRecord(neighbordhoods);
        }
    },
    NEIGHBORDHOOD_BY_DESCRIPTION ("description"){
        @Override
        public List<NeighbordhoodRecord> findNeighbordhoods(String value, String key) {
            var neighbordhood = new NeighbordhoodFactory(getProperties(value, key)).getNeighbordhoodEntity();
            var neighbordhoods = neighbordhoodRepository.findNeighbordhoodEntitiesByDescriptionIgnoreCase(neighbordhood.getDescription());
            return !neighbordhoods.isEmpty() ? super.convertsListNeighbordhoodInRecord(neighbordhoods) :
                    super.convertsListNeighbordhoodInRecord(neighbordhoodRepository.findAll());
        }
    };

    private List<NeighbordhoodRecord> convertsListNeighbordhoodInRecord(List<NeighbordhoodEntity> neighbordhoods) {
        return neighbordhoods
                .stream()
                .map(this::convertsNeighbordhoodInRecord)
                .collect(Collectors.toList());
    }

    private NeighbordhoodRecord convertsNeighbordhoodInRecord(NeighbordhoodEntity neighbordhood) {
        String cityCode = Optional.ofNullable(neighbordhood)
                .map(NeighbordhoodEntity::getCity)
                .map(CityEntity::getCodigoMec)
                .map(String::valueOf)
                .orElse(null);

        var code = neighbordhood.getId().toString();
        var description = neighbordhood.getDescription();

        var neighbordhoodRecord = new NeighbordhoodRecord(
                code,
                description,
                cityCode
        );

        return neighbordhoodRecord;
    }

    public abstract List<NeighbordhoodRecord> findNeighbordhoods(String value, String key);


    protected Properties getProperties(String value, String key) {
        var prop = new Properties();
        prop.put(key, value);
        return prop;
    }

    protected NeighbordhoodRepository neighbordhoodRepository;
    protected CityRepository cityRepository;

    private String key;

    NeighbordhoodAutoCompleteComponent(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static NeighbordhoodAutoCompleteComponent getTipoBuscaAutoComplete(String key) {
        for (NeighbordhoodAutoCompleteComponent value : values()) {
            if (value.getKey().equals(key)) {
                return value;
            }
        }

        throw new RuntimeException("Programador problema ao idenficar o tipo do Bairro do autocomplete.");

    }

    public void setNeighbordhoodRepository(NeighbordhoodRepository neighbordhoodRepository) {
        this.neighbordhoodRepository = neighbordhoodRepository;
    }

    public void setCityRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Component
    private static class ServiceInjector {
        @Autowired
        protected NeighbordhoodRepository neighbordhoodRepository;
        @Autowired
        protected CityRepository cityRepository;

        @PostConstruct
        private void postConstruct() {
            for (var item : EnumSet.allOf(NeighbordhoodAutoCompleteComponent.class)) {
                item.setNeighbordhoodRepository(neighbordhoodRepository);
                item.setCityRepository(cityRepository);
            }
        }
    }

}
