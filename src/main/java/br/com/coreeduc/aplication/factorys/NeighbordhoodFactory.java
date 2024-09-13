package br.com.coreeduc.aplication.factorys;

import br.com.coreeduc.aplication.entities.CityEntity;
import br.com.coreeduc.aplication.entities.NeighbordhoodEntity;

import java.util.Optional;
import java.util.Properties;

public class NeighbordhoodFactory {

    private NeighbordhoodEntity neighbordhoodEntity;

    public void setNeighbordhoodEntity(NeighbordhoodEntity neighbordhoodEntity) {
        this.neighbordhoodEntity = neighbordhoodEntity;
    }


    public NeighbordhoodEntity getNeighbordhoodEntity() {
        return neighbordhoodEntity;
    }

    public NeighbordhoodFactory(Properties properties) {
        var builder = new Builder();

        setNeighbordhoodEntity(
                builder.neighbordhoodEntity(properties)
                        .build()
                        .getNeighbordhoodEntity()
        );

    }

    public NeighbordhoodFactory(CityEntity city) {
        var builder = new Builder();
        setNeighbordhoodEntity(
                builder.neighbordhoodEntity(city)
                        .build()
                        .getNeighbordhoodEntity()
        );
    }

    private NeighbordhoodFactory(Builder builder) {
        setNeighbordhoodEntity(builder.neighbordhoodEntity);
    }

    public static final class Builder {

        private NeighbordhoodEntity neighbordhoodEntity;

        public Builder() {
            neighbordhoodEntity = new NeighbordhoodEntity();
        }

        public Builder neighbordhoodEntity(Properties properties) {
            var neighbordhoodEntity = new NeighbordhoodEntity();

            neighbordhoodEntity.setId(
                    Optional.ofNullable(properties.getProperty("id"))
                            .map(id -> !id.isEmpty() ? id : null)
                            .map(Long::valueOf).orElse(null)
            );
            neighbordhoodEntity.setDescription(properties.getProperty("description"));

            this.neighbordhoodEntity = neighbordhoodEntity;
            return this;
        }

        public Builder neighbordhoodEntity(CityEntity city) {
            var neighbordhoodEntity = new NeighbordhoodEntity();
            neighbordhoodEntity.setCity(city);
            this.neighbordhoodEntity = neighbordhoodEntity;
            return this;
        }

        public NeighbordhoodFactory build() {
            return new NeighbordhoodFactory(this);
        }

    }

}
