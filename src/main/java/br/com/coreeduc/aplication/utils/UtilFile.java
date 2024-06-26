package br.com.coreeduc.aplication.utils;

import br.com.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

@Log4j2
public class UtilFile {

    public static BufferedReader converterFileToBufferedReader(MultipartFile file) throws IOException {
        return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(file.getBytes())));
    }

    public UnidadeEnsino convertsUnidadeFromSpringToUnidadeEntity(UnidadeEnsinoEntity unidadeEnsinoEntity) {
        return Optional.ofNullable(unidadeEnsinoEntity).map(converts()).orElse(new UnidadeEnsino());
    }

    private Function<UnidadeEnsinoEntity, UnidadeEnsino> converts() {
        return entity -> {
            var unidadeEnsino = new UnidadeEnsino();
            BeanUtils.copyProperties(entity, unidadeEnsino);
            return unidadeEnsino;
        };
    }

}
