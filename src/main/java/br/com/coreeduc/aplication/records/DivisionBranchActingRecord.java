package br.com.coreeduc.aplication.records;

import java.io.Serializable;

public record DivisionBranchActingRecord(String id, String descricao, SessionBranchActingRecord secao) implements Serializable {
}
