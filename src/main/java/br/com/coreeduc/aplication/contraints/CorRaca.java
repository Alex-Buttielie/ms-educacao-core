package br.com.coreeduc.aplication.contraints;

public enum CorRaca {
    NAO_DECLARADA(1),
    BRANCA(2),
    PRETA(3),
    PARDA(4),
    AMARELA(5),
    INDIGENA(6);

    private Integer code;

    CorRaca(Integer code) {
        this.code = code;
    }

    public static CorRaca getColorRaceByCode(Integer code) {
        for (CorRaca corRaca : CorRaca.values()) {
            if (corRaca.code.equals(code)) {
                return corRaca;
            }
        }
        return null;
    }

}
