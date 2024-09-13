package br.com.coreeduc.aplication.contraints;

public enum TypeUnitCompany {

    MATRIZ("Matriz", "MATRIZ"),
    FILIAL("Filial", "FILIAL");

    private String description;
    private String code;

    TypeUnitCompany(String description, String code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

}
