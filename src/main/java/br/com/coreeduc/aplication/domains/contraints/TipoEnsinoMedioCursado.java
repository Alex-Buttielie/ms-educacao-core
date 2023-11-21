package br.com.coreeduc.aplication.domains.contraints;

public enum TipoEnsinoMedioCursado {
    FORMACAO_GERAL("1"),
    MODALIDADE_NORMAL_MAGISTERIO("2"),
    CURSO_TECNICO("3"),
    MAGISTERIO_INDIGENA_MODALIDADE_NORMAL("4");

    private String codigoEducacenso;

    TipoEnsinoMedioCursado(String codigoEducacenso) {
        this.codigoEducacenso = codigoEducacenso;
    }

    public static String getValorStrPeloCodigo(String codigoEducacenso) {
        for (TipoEnsinoMedioCursado status : values())
            if (status.getCodigoEducacenso().equals(codigoEducacenso))
                return String.valueOf(status.ordinal());

        return null;
    }

    public String getCodigoEducacenso() {
        return codigoEducacenso;
    }

}
