package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.aplication.domains.contraints.TipoReprovacao;

import java.io.Serializable;

public class Serie implements Serializable {

    private Long id;
    private String nome;
    private TipoReprovacao tipoReprovacao;
    private ComposicaoEnsino composicaoEnsino;

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

    public TipoReprovacao getTipoReprovacao() {
        return tipoReprovacao;
    }

    public void setTipoReprovacao(TipoReprovacao tipoReprovacao) {
        this.tipoReprovacao = tipoReprovacao;
    }

}
