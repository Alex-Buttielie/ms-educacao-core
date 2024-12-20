package br.com.coreeduc.aplication.contraints;

public enum TipoMediacao {
    PRESENCIAL("1"),
    SEMI_PRESENCIAL("2"),
    EDUCACAO_DISTANCIA("3");

    private String valor;

    TipoMediacao(String valor) {
        this.valor  = valor;
    }

    public String getValor() {
        return valor;
    }

    public static TipoMediacao getOrdinalPeloCodigo (String value) {
        for (TipoMediacao status : values())
            if (status.getValor().equals(value))
                return status;

        return null;
    }


}
