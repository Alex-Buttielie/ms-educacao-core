package br.com.coreeduc.aplication.domains.contraints;

public enum UserType {

    ADMINISTRADOR(1, "Administrador"),
    FUNCIONARIO(2, "Funcionario");

    private String description;
    private Number code;

    UserType(Number code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Number getCode() {
        return code;
    }
}
