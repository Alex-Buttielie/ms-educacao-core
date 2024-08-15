package br.com.coreeduc.aplication.contraints;

public enum TipoRegistro {
    REGISTRO_CADASTRO_ESCOLA_IDENTIFICACAO(0, "00"),
    REGISTRO_CADASTRO_ESCOLA_CARACTERIZACAO_INFRAESTRUTURA(1, "10"),
    REGISTRO_CADASTRO_TURMA(2, "20"),
    REGISTRO_CADASTRO_DOCENTE_IDENTIFICACAO(3, "30"),
    REGISTRO_CADASTRO_DOCENTE_DOCUMENTOS_ENDERECO(4, "30"),
    REGISTRO_CADASTRO_DOCENTE_DADOS_VARIAVEIS(5, "40"),
    REGISTRO_CADASTRO_DOCENTE_DADOS_DOCENCIA(6, "50"),
    REGISTRO_CADASTRO_ALUNO_IDENTIFICACAO(7, "51"),
    REGISTRO_CADASTRO_ALUNO_DOCUMENTOS_ENDERECO(8, "60"),
    REGISTRO_CADASTRO_ALUNO_VINCULO_MATRICULA(9, "70"),
    REGISTRO_CADASTRO_GESTOR_ESCOLAR(10, "80");

    private final String descricao;
    private final int valorTipoImportacaoLinhaEducacenso;

    TipoRegistro(int valorTipoImportacaoLinhaEducacenso, String descricao) {
        this.valorTipoImportacaoLinhaEducacenso = valorTipoImportacaoLinhaEducacenso;
        this.descricao = descricao;
    }

    public static String getValorPorDescricao(String descricao) {
        for (TipoRegistro status : values())
            if (status.getDescricao().equals(descricao))
                return status.getValorTipoImportacaoLinhaEducacenso();

        return null;
    }

    public static TipoRegistro getTipoPorDescricao(String descricao) {
        for (TipoRegistro tipo : values())
            if (tipo.getDescricao().equals(descricao))
                return tipo;

        return null;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getValorTipoImportacaoLinhaEducacenso() {
        return String.valueOf(valorTipoImportacaoLinhaEducacenso);
    }

}
