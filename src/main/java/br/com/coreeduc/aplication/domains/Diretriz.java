package br.com.coreeduc.aplication.domains;

import java.io.Serializable;


public class Diretriz implements Serializable {
    private Long id;
    private String nome;
    private Calendario calendario;
    private Serie serie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
