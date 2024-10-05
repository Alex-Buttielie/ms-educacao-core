package br.com.coreeduc.aplication.contraints;

public enum StatesBrazil {
    AC("Acre", "AC", 12L),
    AL("Alagoas", "AL", 27L),
    AM("Amazonas", "AM", 13L),
    AP("Amapá", "AP", 16L),
    BA("Bahia", "BA", 29L),
    CE("Ceará", "CE", 23L),
    DF("Distrito Federal", "DF", 53L),
    ES("Espírito Santo", "ES", 32L),
    GO("Goiás", "GO", 52L),
    MA("Maranhão", "MA", 21L),
    MG("Minas Gerais", "MG", 31L),
    MS("Mato Grosso do Sul", "MS", 50L),
    MT("Mato Grosso", "MT", 51L),
    PA("Pará", "PA", 15L),
    PB("Paraíba", "PB", 25L),
    PE("Pernambuco", "PE", 26L),
    PI("Piauí", "PI", 22L),
    PR("Paraná", "PR", 41L),
    RJ("Rio de Janeiro", "RJ", 33L),
    RN("Rio Grande do Norte", "RN", 24L),
    RO("Rondônia", "RO", 11L),
    RR("Roraima", "RR", 14L),
    RS("Rio Grande do Sul", "RS", 43L),
    SC("Santa Catarina", "SC", 42L),
    SE("Sergipe", "SE", 28L),
    SP("São Paulo", "SP", 35L),
    TO("Tocantins", "TO", 17L);

    private final String nome;
    private final String codigo;
    private final Long codigoState;

    StatesBrazil(String nome, String codigo, Long codigoState) {
        this.nome = nome;
        this.codigo = codigo;
        this.codigoState = codigoState;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public static StatesBrazil fromCodigo(String codigo) {
        for (StatesBrazil state : values()) {
            if (state.codigo.equalsIgnoreCase(codigo)) {
                return state;
            }
        }
        throw new IllegalArgumentException("Código do estado inválido: " + codigo);
    }

    public static StatesBrazil fromCodigoState(Long codigo) {
        for (StatesBrazil state : values()) {
            if (state.codigoState.equals(codigo)) {
                return state;
            }
        }
        throw new IllegalArgumentException("Código do estado inválido: " + codigo);
    }

}
