package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import org.springframework.http.ResponseEntity;

public interface ComumResource {
    ResponseEntity<PropertiesViewRecord>  findPropertiesView();
    ResponseEntity autoComplete(String value, String key);
}

