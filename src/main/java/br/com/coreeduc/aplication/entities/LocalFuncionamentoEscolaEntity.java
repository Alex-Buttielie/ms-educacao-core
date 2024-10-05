package br.com.coreeduc.aplication.entities;

import br.com.coreeduc.aplication.contraints.FormaOcupacaoPredio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "local_funcionamento_escola")
@Entity
@Builder
public class LocalFuncionamentoEscolaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "predio_escolar")
    private Boolean predioEscolar;
    @Basic
    @Column(name = "salas_em_outra_escola")
    private Boolean salasEmOutraEscola;
    @Basic
    @Column(name = "galpao_racho_paiol_barracao")
    private Boolean galpaoRanchoPaiolBarracao;
    @Basic
    @Column(name = "unidade_atendimento_socioeducativa")
    private Boolean unidadeAtendimentoSocioeducativa;
    @Basic
    @Column(name = "unidade_prisional")
    private Boolean unidadePrisional;
    @Basic
    @Column(name = "outros")
    private Boolean outros;
    @Basic
    @Column(name = "formas_ocupacao_predio")
    private FormaOcupacaoPredio formaOcupacaoPredio;
    @Basic
    @Column(name = "predio_escolar_compartilhado_com_outra_escola")
    private Boolean predioEscolarCompartilhadoComOutraEscola;

    public LocalFuncionamentoEscolaEntity(Long id, Boolean predioEscolar, Boolean salasEmOutraEscola, Boolean galpaoRanchoPaiolBarracao, Boolean unidadeAtendimentoSocioeducativa, Boolean unidadePrisional, Boolean outros, FormaOcupacaoPredio formaOcupacaoPredio, Boolean predioEscolarCompartilhadoComOutraEscola) {
        this.id = id;
        this.predioEscolar = predioEscolar;
        this.salasEmOutraEscola = salasEmOutraEscola;
        this.galpaoRanchoPaiolBarracao = galpaoRanchoPaiolBarracao;
        this.unidadeAtendimentoSocioeducativa = unidadeAtendimentoSocioeducativa;
        this.unidadePrisional = unidadePrisional;
        this.outros = outros;
        this.formaOcupacaoPredio = formaOcupacaoPredio;
        this.predioEscolarCompartilhadoComOutraEscola = predioEscolarCompartilhadoComOutraEscola;
    }

    public LocalFuncionamentoEscolaEntity(Boolean predioEscolar, Boolean salasEmOutraEscola, Boolean galpaoRanchoPaiolBarracao, Boolean unidadeAtendimentoSocioeducativa, Boolean unidadePrisional, Boolean outros, FormaOcupacaoPredio formaOcupacaoPredio, Boolean predioEscolarCompartilhadoComOutraEscola) {
        this.predioEscolar = predioEscolar;
        this.salasEmOutraEscola = salasEmOutraEscola;
        this.galpaoRanchoPaiolBarracao = galpaoRanchoPaiolBarracao;
        this.unidadeAtendimentoSocioeducativa = unidadeAtendimentoSocioeducativa;
        this.unidadePrisional = unidadePrisional;
        this.outros = outros;
        this.formaOcupacaoPredio = formaOcupacaoPredio;
        this.predioEscolarCompartilhadoComOutraEscola = predioEscolarCompartilhadoComOutraEscola;
    }

    public LocalFuncionamentoEscolaEntity() {
    }

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
