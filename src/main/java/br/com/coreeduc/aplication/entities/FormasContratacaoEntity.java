package br.com.coreeduc.aplication.entities;

import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "formas_contratacao")
@Entity
@Builder
public class FormasContratacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="termo_colaboracao_lei")
    private Boolean termoDeColaboracao;
    @Basic
    @Column(name="termo_fomento")
    private Boolean termoFomento;
    @Basic
    @Column(name="acordo_cooperacao")
    private Boolean acordoCooperacao;
    @Basic
    @Column(name="contrato_prestacao_servico")
    private Boolean contratoDePrestacaoDeServico;
    @Basic
    @Column(name="termo_cooperacao_tecnica_financeira")
    private Boolean termoCooperacaoTecnicaFinanceira;
    @Basic
    @Column(name="contrato_consorcio_publico_convenio_cooperacao")
    private Boolean contratoConsorcioPublicoConvenioCooperacao;

    public FormasContratacaoEntity(Long id, Boolean termoDeColaboracao, Boolean termoFomento, Boolean acordoCooperacao, Boolean contratoDePrestacaoDeServico, Boolean termoCooperacaoTecnicaFinanceira, Boolean contratoConsorcioPublicoConvenioCooperacao) {
        this.id = id;
        this.termoDeColaboracao = termoDeColaboracao;
        this.termoFomento = termoFomento;
        this.acordoCooperacao = acordoCooperacao;
        this.contratoDePrestacaoDeServico = contratoDePrestacaoDeServico;
        this.termoCooperacaoTecnicaFinanceira = termoCooperacaoTecnicaFinanceira;
        this.contratoConsorcioPublicoConvenioCooperacao = contratoConsorcioPublicoConvenioCooperacao;
    }

    public FormasContratacaoEntity(Boolean termoDeColaboracao, Boolean termoFomento, Boolean acordoCooperacao, Boolean contratoDePrestacaoDeServico, Boolean termoCooperacaoTecnicaFinanceira, Boolean contratoConsorcioPublicoConvenioCooperacao) {
        this.termoDeColaboracao = termoDeColaboracao;
        this.termoFomento = termoFomento;
        this.acordoCooperacao = acordoCooperacao;
        this.contratoDePrestacaoDeServico = contratoDePrestacaoDeServico;
        this.termoCooperacaoTecnicaFinanceira = termoCooperacaoTecnicaFinanceira;
        this.contratoConsorcioPublicoConvenioCooperacao = contratoConsorcioPublicoConvenioCooperacao;
    }

    public FormasContratacaoEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getTermoDeColaboracao() {
        return termoDeColaboracao;
    }

    public void setTermoDeColaboracao(Boolean termoDeColaboracao) {
        this.termoDeColaboracao = termoDeColaboracao;
    }

    public Boolean getTermoFomento() {
        return termoFomento;
    }

    public void setTermoFomento(Boolean termoFomento) {
        this.termoFomento = termoFomento;
    }

    public Boolean getAcordoCooperacao() {
        return acordoCooperacao;
    }

    public void setAcordoCooperacao(Boolean acordoCooperacao) {
        this.acordoCooperacao = acordoCooperacao;
    }

    public Boolean getContratoDePrestacaoDeServico() {
        return contratoDePrestacaoDeServico;
    }

    public void setContratoDePrestacaoDeServico(Boolean contratoDePrestacaoDeServico) {
        this.contratoDePrestacaoDeServico = contratoDePrestacaoDeServico;
    }

    public Boolean getTermoCooperacaoTecnicaFinanceira() {
        return termoCooperacaoTecnicaFinanceira;
    }

    public void setTermoCooperacaoTecnicaFinanceira(Boolean termoCooperacaoTecnicaFinanceira) {
        this.termoCooperacaoTecnicaFinanceira = termoCooperacaoTecnicaFinanceira;
    }

    public Boolean getContratoConsorcioPublicoConvenioCooperacao() {
        return contratoConsorcioPublicoConvenioCooperacao;
    }

    public void setContratoConsorcioPublicoConvenioCooperacao(Boolean contratoConsorcioPublicoConvenioCooperacao) {
        this.contratoConsorcioPublicoConvenioCooperacao = contratoConsorcioPublicoConvenioCooperacao;
    }
}
