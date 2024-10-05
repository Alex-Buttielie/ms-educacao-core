package br.com.coreeduc.aplication.contraints;

public enum CategoriaEscola {
    PARTICULAR(1),
    COMUNITARIA(2),
    CONFESSIONAL(3),
    FILANTROPICA(4);

    private Integer code;

    CategoriaEscola(Integer code) {
        this.code = code;
    }

    public static CategoriaEscola getFromCode(Integer integer) {
        for (CategoriaEscola categoriaEscola : values()) {
            if (categoriaEscola.code == integer) {
                return categoriaEscola;

            }
        }
        return null;
    }
}
