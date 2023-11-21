package br.com.coreeduc.aplication.domains.contraints;

public enum Nacionalidade {
    BRASILEIRA("1"),
    BRASILEIRA_NASCIDO_EXTERIOR_OU_NATURALIZADO("2"),
    EXTRANGEIIRO("3");

    private String codigoEducacenso;

    Nacionalidade(String codigoEducacenso) {
        this.codigoEducacenso = codigoEducacenso;
    }

    public static String getValorStrPeloCodigo(String codigoEducacenso) {
        for (Nacionalidade status : values())
            if (status.getCodigoEducacenso().equals(codigoEducacenso))
                return String.valueOf(status.ordinal());

        return null;
    }

    public String getCodigoEducacenso() {
        return codigoEducacenso;
    }

}
