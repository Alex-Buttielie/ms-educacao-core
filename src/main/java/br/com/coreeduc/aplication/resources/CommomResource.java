package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.records.PropertiesViewRecord;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CommomResource {
    ResponseEntity<PropertiesViewRecord>  findPropertiesView();
    ResponseEntity<List<?>> autoComplete(String value, String key);
}

