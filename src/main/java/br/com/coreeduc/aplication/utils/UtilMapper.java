package br.com.coreeduc.aplication.utils;

import br.com.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import org.modelmapper.ModelMapper;

public class UtilMapper {

    private static ModelMapper modelMapper = new ModelMapper();
    public static UnidadeEnsino convertsUnidadeEntityToUnidade(UnidadeEnsinoEntity entity) {
        return modelMapper.map(entity, UnidadeEnsino.class);
    }

}
