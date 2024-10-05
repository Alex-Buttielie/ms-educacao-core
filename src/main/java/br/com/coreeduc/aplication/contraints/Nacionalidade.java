package br.com.coreeduc.aplication.contraints;

public enum Nacionalidade {
    BRASILEIRA(1),
    BRASILEIRA_NASCIDO_EXTERIOR_OU_NATURALIZADO(2),
    EXTRANGEIIRO(3);

    private Integer codigoEducacenso;

    Nacionalidade(Integer codigoEducacenso) {
        this.codigoEducacenso = codigoEducacenso;
    }

    public static Nacionalidade getNacionalityByCode(Integer nationality) {
        for (Nacionalidade nacionalidade : Nacionalidade.values()) {
            if (nacionalidade.getCodigoEducacenso().equals(nationality)) {
                return nacionalidade;
            }
        }
        return null;
    }

    public Integer getCodigoEducacenso() {
        return codigoEducacenso;
    }

}
