package br.com.coreeduc.aplication.domains;


public class Municipio {
    private Long id;
    private Long codigoMec;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigoMec() {
        return codigoMec;
    }

    public void setCodigoMec(Long codigoMec) {
        this.codigoMec = codigoMec;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
