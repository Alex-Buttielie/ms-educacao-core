package br.com.coreeduc.aplication.contraints;

public enum TipoPosGraduacao {
    ESPECIALIZACAO(1),
    MESTRADO(2),
    DOUTORADO(3);

    private Integer code;

    TipoPosGraduacao(Integer code) {
        this.code = code;
    }

    public static TipoPosGraduacao getTipoPosGraduacaoByCode(Integer code) {
        for (TipoPosGraduacao t : TipoPosGraduacao.values()) {
            if (t.code.equals(code)) {
                return t;
            }
        }
        return null;
    }
}
