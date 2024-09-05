package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.records.BranchActingRecord;

import java.util.List;

public interface BranchActingService extends CommomService {
    void importBranchActings(List<BranchActingRecord> branchActings);
    List<BranchActingRecord> autoComplete(String value, String key);
}
