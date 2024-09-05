package br.com.coreeduc.aplication.records;

import java.io.Serializable;

public record GroupBranchActingRecord(String id, String descricao, DivisionBranchActingRecord divisao) implements Serializable {
}
