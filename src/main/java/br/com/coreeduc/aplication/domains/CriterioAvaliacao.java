package br.com.coreeduc.aplication.domains;

import java.io.Serializable;

public class CriterioAvaliacao implements Serializable {

    private Long id;
    private String nome;
    private Boolean isAvaliadoSemestral;

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

    public Boolean getAvaliadoSemestral() {
        return isAvaliadoSemestral;
    }

    public void setAvaliadoSemestral(Boolean avaliadoSemestral) {
        isAvaliadoSemestral = avaliadoSemestral;
    }
}
