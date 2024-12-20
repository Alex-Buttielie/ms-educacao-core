package br.com.coreeduc.aplication.contraints;

public enum StatusRegistry {
    ACTIVE(1, "active", "Ativo"),
    INACTIVE(2, "inactive", "Inativo");

    private final int codigo;
    private final String description;
    private final String descricao;

    StatusRegistry(int codigo, String description, String descricao) {
        this.codigo = codigo;
        this.description = description;
        this.descricao = descricao;
    }

    public static StatusRegistry getByFromValue(String s) {
        for (StatusRegistry statusRegistry : StatusRegistry.values()) {
          if (statusRegistry.description.equals(s.toLowerCase())) {
              return statusRegistry;
          }
        }

        return null;
    }

    public String getDescription() {
        return description;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
