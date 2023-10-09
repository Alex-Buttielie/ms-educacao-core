package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.aplication.domains.contraints.FormaOcupacaoPredio;

public class LocalFuncionamentoEscola {

    private Long id;
    private Boolean predioEscolar;
    private Boolean salasEmOutraEscola;
    private Boolean galpaoRanchoPaiolBarracao;
    private Boolean unidadeAtendimentoSocioeducativa;
    private Boolean unidadePrisional;
    private Boolean outros;
    private FormaOcupacaoPredio formaOcupacaoPredio;
    private Boolean predioEscolarCompartilhadoComOutraEscola;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getPredioEscolar() {
        return predioEscolar;
    }

    public void setPredioEscolar(Boolean predioEscolar) {
        this.predioEscolar = predioEscolar;
    }

    public Boolean getSalasEmOutraEscola() {
        return salasEmOutraEscola;
    }

    public void setSalasEmOutraEscola(Boolean salasEmOutraEscola) {
        this.salasEmOutraEscola = salasEmOutraEscola;
    }

    public Boolean getGalpaoRanchoPaiolBarracao() {
        return galpaoRanchoPaiolBarracao;
    }

    public void setGalpaoRanchoPaiolBarracao(Boolean galpaoRanchoPaiolBarracao) {
        this.galpaoRanchoPaiolBarracao = galpaoRanchoPaiolBarracao;
    }

    public Boolean getUnidadeAtendimentoSocioeducativa() {
        return unidadeAtendimentoSocioeducativa;
    }

    public void setUnidadeAtendimentoSocioeducativa(Boolean unidadeAtendimentoSocioeducativa) {
        this.unidadeAtendimentoSocioeducativa = unidadeAtendimentoSocioeducativa;
    }

    public Boolean getUnidadePrisional() {
        return unidadePrisional;
    }

    public void setUnidadePrisional(Boolean unidadePrisional) {
        this.unidadePrisional = unidadePrisional;
    }

    public Boolean getOutros() {
        return outros;
    }

    public void setOutros(Boolean outros) {
        this.outros = outros;
    }

    public FormaOcupacaoPredio getFormaOcupacaoPredio() {
        return formaOcupacaoPredio;
    }

    public void setFormaOcupacaoPredio(FormaOcupacaoPredio formaOcupacaoPredio) {
        this.formaOcupacaoPredio = formaOcupacaoPredio;
    }

    public Boolean getPredioEscolarCompartilhadoComOutraEscola() {
        return predioEscolarCompartilhadoComOutraEscola;
    }

    public void setPredioEscolarCompartilhadoComOutraEscola(Boolean predioEscolarCompartilhadoComOutraEscola) {
        this.predioEscolarCompartilhadoComOutraEscola = predioEscolarCompartilhadoComOutraEscola;
    }
}
