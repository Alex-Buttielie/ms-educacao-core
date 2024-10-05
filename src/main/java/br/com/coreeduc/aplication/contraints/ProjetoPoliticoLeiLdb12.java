package br.com.coreeduc.aplication.contraints;

public enum ProjetoPoliticoLeiLdb12 {
    NAO(1),
    SIM(2),
    ESCOLA_NAO_POSSUI_PROJETO_POLITICO_PEDAGOGICO(3);

    private Integer code;

    ProjetoPoliticoLeiLdb12(Integer code) {
        this.code = code;
    }

    public static ProjetoPoliticoLeiLdb12 getForCode(Integer code) {
        for (ProjetoPoliticoLeiLdb12 p : ProjetoPoliticoLeiLdb12.values()) {
            if (p.code.equals(code)) {
                return p;
            }
        }

        return null;
    }
}
