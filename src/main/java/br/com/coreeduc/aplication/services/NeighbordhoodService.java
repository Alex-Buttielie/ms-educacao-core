package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.records.NeighbordhoodRecord;

import java.util.List;

public interface NeighbordhoodService extends CommomService {
    List<NeighbordhoodRecord> autoComplete(String value, String key);
}
