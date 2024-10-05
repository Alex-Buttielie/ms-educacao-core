package br.com.coreeduc.aplication.contraints;

public enum EducacaoBasica {
    SEM_VINCULO_OUTRA_INSTITUICAO(1),
    VINCULA_EDUCACAO_BASICA(2),
    OFERTANTE_EDUCACAO_SUPERIOR(3);

    private Integer code;

    EducacaoBasica(Integer code) {
        this.code = code;
    }

    public static EducacaoBasica getFromCode(Integer integer) {
        for (EducacaoBasica educacaoBasica : EducacaoBasica.values()) {
            if (educacaoBasica.code.equals(integer)) {
                return educacaoBasica;
            }
        }
        return null;
    }
}
