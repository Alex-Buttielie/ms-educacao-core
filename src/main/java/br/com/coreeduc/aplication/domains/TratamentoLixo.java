package br.com.coreeduc.aplication.domains;

public class TratamentoLixo {

    private Long id;
    private Boolean separacaoDoLixoResiduos;
    private Boolean reaproveitamentoReutilizacao;
    private Boolean reciclagem;
    private Boolean naoFazTratamento;

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
