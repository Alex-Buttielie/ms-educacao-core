package br.com.coreeduc.coreeduc.aplication.ports;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImportacaoEducacensoPort {
    void importarEducacenso(MultipartFile file) throws IOException;
}
