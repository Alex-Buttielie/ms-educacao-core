package br.com.coreeduc.aplication.contraints;

public enum DependenciaAdministrativa {
    FEDERAL(1),
    ESTADUAL(2),
    MUNICIPAL(3),
    PRIVADA(4);

    private Integer code;

    DependenciaAdministrativa(Integer code) {
        this.code = code;
    }

    public static DependenciaAdministrativa getFromCode(Number code) {
        for (DependenciaAdministrativa e : DependenciaAdministrativa.values()) {
            if (e.code.equals(code)) {
                return e;
            }
        }

        return null;
    }
}
