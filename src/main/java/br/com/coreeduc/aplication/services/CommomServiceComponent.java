package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.dto.OptionSelectedView;
import br.com.coreeduc.aplication.dto.PropertiesView;

import java.util.Map;

public interface CommomServiceComponent {
    PropertiesView findPropertiesView();
    Map<String, OptionSelectedView> findPropertiesFromSeleted();
}
