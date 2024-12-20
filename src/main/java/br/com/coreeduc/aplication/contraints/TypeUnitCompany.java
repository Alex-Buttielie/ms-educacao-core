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

    public static TypeUnitCompany findByTypeUnitCompanyFromCode(String code) {
        for (TypeUnitCompany typeUnitCompany : TypeUnitCompany.values()) {
            if (typeUnitCompany.code.equals(code)) {
                return typeUnitCompany;
            }
        }

        return null;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

}
