package br.com.coreeduc.aplication.domains;

import java.util.Date;

public class Chamada {

    private Long id;
    private ConteudoPlanejado conteudoPlanejado;
    private String nome;
    private Date dataChamada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ConteudoPlanejado getConteudoPlanejado() {
        return conteudoPlanejado;
    }

    public void setConteudoPlanejado(ConteudoPlanejado conteudoPlanejado) {
        this.conteudoPlanejado = conteudoPlanejado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataChamada() {
        return dataChamada;
    }

    public void setDataChamada(Date dataChamada) {
        this.dataChamada = dataChamada;
    }
}
