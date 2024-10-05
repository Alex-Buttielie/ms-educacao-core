package br.com.coreeduc.aplication.contraints;

public enum FormaOcupacaoPredio {
    PROPRIO(1),
    ALUGADO(2),
    CEDIDO(3);

    private Integer code;

    FormaOcupacaoPredio(Integer code) {
        this.code = code;
    }

    public static FormaOcupacaoPredio getForCode(Integer integer) {
        for (FormaOcupacaoPredio formaOcupacaoPredio : values()) {
            if (formaOcupacaoPredio.code.equals(integer)) {
                return formaOcupacaoPredio;
            }
        }
        return null;
    }
}
