package br.com.coreeduc.aplication.contraints;

public enum Regulamentacao {
    NAO(1),
    SIM(2),
    EM_TRAMITACAO(3);

    private Integer code;

    Regulamentacao(Integer code) {
        this.code = code;
    }

    public static Regulamentacao getFromCode(Integer integer) {
        for (Regulamentacao regulamentacao : Regulamentacao.values()) {
            if (regulamentacao.code.equals(integer)) {
                return regulamentacao;
            }
        }
        return null;
    }
}
