package br.com.coreeduc.aplication.contraints;

public enum SizesCompany {

    PEQUENA("Pequena", "PQ"),
    MEDIA("Média", "ME"),
    GRANDE("Grande", "GR");

    private final String nome;
    private final String codigo;

    SizesCompany(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public static SizesCompany fromCodigo(String codigo) {
        for (SizesCompany sizeCompany : values()) {
            if (sizeCompany.codigo.equalsIgnoreCase(codigo)) {
                return sizeCompany;
            }
        }
        throw new IllegalArgumentException("Código do tamanho da empresa inválido: " + codigo);
    }
}
