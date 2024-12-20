package br.com.coreeduc.aplication.contraints;

public enum TypeLegalNature {

    MICRO("Microempreendedor Individual (MEI)", "MICRO"),
    EI("Empresário Individual (EI)", "EI"),
    EIRELI("Empresa Individual de Responsabilidade Limitada (EIRELI)", "EIRELI"),
    LTDA("Sociedade Limitada (LTDA)", "LTDA"),
    SLU("Sociedade Limitada Unipessoal (SLU)", "SLU"),
    SA("Sociedade Anônima (S/A)", "SA");

    private String description;
    private String code;

    TypeLegalNature(String description, String code) {
        this.description = description;
        this.code = code;
    }

    public static TypeLegalNature findByLegalNatureFromCode(String code) {
        for (TypeLegalNature typeLegalNature : TypeLegalNature.values()) {
            if (typeLegalNature.code.equals(code)) {
                return typeLegalNature;
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
