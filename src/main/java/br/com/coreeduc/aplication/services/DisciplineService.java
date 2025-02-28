package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.records.DisciplineRecord;

import java.util.List;

public interface DisciplineService extends CommomService {
    List<DisciplineRecord> autoComplete(String value, String key);
}
