package br.com.coreeduc.aplication.entities;

import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tratamento_lixo")
@Entity
@Builder
public class TratamentoLixoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "separacao_lixo_residuos")
    private Boolean separacaoDoLixoResiduos;
    @Basic
    @Column(name = "reaproveitamento_reutilizacao")
    private Boolean reaproveitamentoReutilizacao;
    @Basic
    @Column(name = "recliclagem")
    private Boolean reciclagem;
    @Basic
    @Column(name = "nao_faz_tratamento")
    private Boolean naoFazTratamento;

    public TratamentoLixoEntity() {
    }

    public TratamentoLixoEntity(Long id, Boolean separacaoDoLixoResiduos, Boolean reaproveitamentoReutilizacao, Boolean reciclagem, Boolean naoFazTratamento) {
        this.id = id;
        this.separacaoDoLixoResiduos = separacaoDoLixoResiduos;
        this.reaproveitamentoReutilizacao = reaproveitamentoReutilizacao;
        this.reciclagem = reciclagem;
        this.naoFazTratamento = naoFazTratamento;
    }

    public TratamentoLixoEntity(Boolean separacaoDoLixoResiduos, Boolean reaproveitamentoReutilizacao, Boolean reciclagem, Boolean naoFazTratamento) {
        this.separacaoDoLixoResiduos = separacaoDoLixoResiduos;
        this.reaproveitamentoReutilizacao = reaproveitamentoReutilizacao;
        this.reciclagem = reciclagem;
        this.naoFazTratamento = naoFazTratamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getSeparacaoDoLixoResiduos() {
        return separacaoDoLixoResiduos;
    }

    public void setSeparacaoDoLixoResiduos(Boolean separacaoDoLixoResiduos) {
        this.separacaoDoLixoResiduos = separacaoDoLixoResiduos;
    }

    public Boolean getReaproveitamentoReutilizacao() {
        return reaproveitamentoReutilizacao;
    }

    public void setReaproveitamentoReutilizacao(Boolean reaproveitamentoReutilizacao) {
        this.reaproveitamentoReutilizacao = reaproveitamentoReutilizacao;
    }

    public Boolean getReciclagem() {
        return reciclagem;
    }

    public void setReciclagem(Boolean reciclagem) {
        this.reciclagem = reciclagem;
    }

    public Boolean getNaoFazTratamento() {
        return naoFazTratamento;
    }

    public void setNaoFazTratamento(Boolean naoFazTratamento) {
        this.naoFazTratamento = naoFazTratamento;
    }
}
