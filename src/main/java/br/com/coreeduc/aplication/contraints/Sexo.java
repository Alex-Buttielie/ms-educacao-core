package br.com.coreeduc.aplication.contraints;

public enum Sexo {
    MASCULINO(1, "Masculino"),
    FEMININO(2, "Feminino");

    private Integer code;
    private String description;

    Sexo(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static Sexo getSexByCode(Integer code) {
        for (Sexo sexo : Sexo.values()) {
            if (code.equals(sexo.code)) {
                return sexo;
            }
        }
        return null;
    }
}
