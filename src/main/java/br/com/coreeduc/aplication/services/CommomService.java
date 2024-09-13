package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.records.OptionSelectedViewRecord;
import br.com.coreeduc.aplication.records.PropertiesViewRecord;

import java.util.List;
import java.util.Map;

public interface CommomService {
    PropertiesViewRecord findPropertiesView() ;
    Map<String, OptionSelectedViewRecord> findPropertiesFromSeleted();
    List autoComplete(String value, String key);
}
