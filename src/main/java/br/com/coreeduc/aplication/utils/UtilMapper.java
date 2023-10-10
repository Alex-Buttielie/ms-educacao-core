package br.com.coreeduc.aplication.utils;

import org.modelmapper.ModelMapper;

import java.util.function.Function;

public final class UtilMapper {

    private static ModelMapper modelMapper = new ModelMapper();

    public static Function<Object, Object> converts(Class destino) {
        return object -> converts(object, destino);
    }

    public static Object converts(Object object, Class destino) {
        return modelMapper.map(object, destino);
    }

}
