package br.com.coreeduc.aplication.domains.contraints;

public enum MaiorNivelEscolaridadeConcluido {
    NAO_CONCLUIU_ENSINO_FUNDAMENTAL("1"),
    ENSINO_FUNDAMENTAL("2"),
    ENSINO_MEDIO("7"),
    EDUCACAO_SUPERIOR("6");


    private final String descricao;

    MaiorNivelEscolaridadeConcluido(String descricao) {
        this.descricao = descricao;
    }

    public static MaiorNivelEscolaridadeConcluido getTipoPorDescricao(String descricao) {
        for (MaiorNivelEscolaridadeConcluido status : values())
            if (status.getDescricao().equals(descricao))
                return status;

        return null;
    }

    public String getDescricao() {
        return descricao;
    }

}
