package br.com.coreeduc.aplication.domains;

public class FormasContratacao {

    private Long id;
    private Boolean termoDeColaboracao;
    private Boolean termoFomento;
    private Boolean acordoCooperacao;
    private Boolean contratoDePrestacaoDeServico;
    private Boolean termoCooperacaoTecnicaFinanceira;
    private Boolean contratoConsorcioPublicoConvenioCooperacao;

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
