package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.entities.CompanyEntity;

import java.util.List;

public interface CompanyService extends CommomService {
    List<CompanyEntity> autoComplete(String value, String key);
}
