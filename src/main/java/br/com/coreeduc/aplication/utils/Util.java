package br.com.coreeduc.aplication.utils;

import br.com.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import org.springframework.beans.BeanUtils;

import java.util.Optional;
import java.util.function.Function;

public  class Util {

    public static UnidadeEnsino convertsUnidadeFromSpringToUnidadeEntity(UnidadeEnsinoEntity unidadeEnsinoEntity) {
        return  Optional.ofNullable(unidadeEnsinoEntity).map(converts()).orElse(new UnidadeEnsino());
    }

    private static Function<UnidadeEnsinoEntity, UnidadeEnsino> converts() {
        return entity -> {
            var unidadeEnsino = new UnidadeEnsino();
            BeanUtils.copyProperties(entity, unidadeEnsino);
            return unidadeEnsino;
        };
    }

}
