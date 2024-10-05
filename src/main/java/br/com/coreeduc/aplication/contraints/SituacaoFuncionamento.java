package br.com.coreeduc.aplication.contraints;

public enum SituacaoFuncionamento {
    EM_ATIVIDADE(1),
    PARALISADA(2),
    EXTINTA(3);

    private Integer code;

    SituacaoFuncionamento(Integer code) {
        this.code = code;
    }

    public static SituacaoFuncionamento getFromCode(Integer integer) {
        for (SituacaoFuncionamento situacaoFuncionamento : values()) {
            if (situacaoFuncionamento.code.equals(integer)) {
                return situacaoFuncionamento;
            }
        }

        return null;
    }
}
