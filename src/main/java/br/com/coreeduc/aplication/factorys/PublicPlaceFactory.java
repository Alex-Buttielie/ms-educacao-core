package br.com.coreeduc.aplication.factorys;

import br.com.coreeduc.aplication.entities.PublicPlaceEntity;

import java.util.Optional;
import java.util.Properties;

public class PublicPlaceFactory {

    private PublicPlaceEntity publicPlaceEntity;

    public PublicPlaceFactory(Properties properties) {
        var builder = new Builder();

        setPublicPlaceEntity(
                builder.id(Optional.ofNullable(properties.getProperty("id")).map(Long::valueOf).orElse(null))
                        .description(properties.getProperty("description"))
                        .postalCode(properties.getProperty("postalCode"))
                        .build()
                        .getPublicPlaceEntity()
        );

    }

    private PublicPlaceFactory(Builder builder) {
        setPublicPlaceEntity(builder.publicPlaceEntity);
    }

    public PublicPlaceEntity getPublicPlaceEntity() {
        return publicPlaceEntity;
    }

    public void setPublicPlaceEntity(PublicPlaceEntity publicPlaceEntity) {
        this.publicPlaceEntity = publicPlaceEntity;
    }

    public static final class Builder {

        private PublicPlaceEntity publicPlaceEntity;

        public Builder() {
            publicPlaceEntity = new PublicPlaceEntity();
        }

        public Builder id(Long id) {
            publicPlaceEntity.setId(id);
            return this;
        }
        public Builder description(String name) {
            publicPlaceEntity.setDescription(name);
            return this;
        }

        public Builder postalCode(String postalCode) {
            publicPlaceEntity.setPostalCode(postalCode);
            return this;
        }

        public PublicPlaceFactory build() {
            return new PublicPlaceFactory(this);
        }
    }

}
