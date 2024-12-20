package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.records.CompanyRecord;

import java.util.List;

public interface CompanyService extends CommomService {
    List<CompanyRecord> autoComplete(String value, String key);
    CompanyRecord save(CompanyRecord companyDto);
}
