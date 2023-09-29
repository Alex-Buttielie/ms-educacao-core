package br.com.coreeduc.coreeduc.aplication.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UtilFile {

    public static BufferedReader converterFileToBufferedReader(MultipartFile file) throws IOException {
        return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(file.getBytes())));
    }
}
