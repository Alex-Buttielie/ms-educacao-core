package br.com.coreeduc.aplication.resources;

import org.springframework.http.ResponseEntity;

public interface ComumResource {
    ResponseEntity findPropertiesView();
    ResponseEntity autoComplete(String properties, String key);
}

