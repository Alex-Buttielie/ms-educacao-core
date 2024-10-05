package br.com.coreeduc.aplication.contraints;

public enum TipoFiliacao {
    NAO_DECLARADO_IGNORADO(1),
    FILIACAO_1_OU_2(2);

    private Integer code;

    TipoFiliacao(Integer code) {
        this.code = code;
    }

    public static TipoFiliacao getAffiliationTypeByCode(Integer integer) {
        for (TipoFiliacao tipoFiliacao : TipoFiliacao.values()) {
            if (tipoFiliacao.code.equals(integer)) {
                return tipoFiliacao;
            }
        }
        return null;
    }
}
