package br.com.coreeduc.aplication.records;

import java.io.Serializable;
import java.util.List;

public record BranchActingRecord(String id, String descricao, List<String> observacoes, GroupBranchActingRecord grupo) implements Serializable {
}
