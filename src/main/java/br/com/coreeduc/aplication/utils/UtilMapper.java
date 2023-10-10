package br.com.coreeduc.aplication.utils;

import org.modelmapper.ModelMapper;

public final class UtilMapper {

    private static ModelMapper modelMapper = new ModelMapper();
    public static Object converts(Object entity, Class classe) {
        return modelMapper.map(entity, classe);
    }

}
