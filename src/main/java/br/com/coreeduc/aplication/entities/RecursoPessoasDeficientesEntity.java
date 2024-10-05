package br.com.coreeduc.aplication.entities;

import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "recurso_pessoas_deficientes")
@Entity
@Builder
public class RecursoPessoasDeficientesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "corrimao_guarda_copos")
    private Boolean corrimaoGuardaCorpos;
    @Basic
    @Column(name = "elevador")
    private Boolean elevador;
    @Basic
    @Column(name = "pisos_tateis")
    private Boolean pisosTateis;
    @Basic
    @Column(name = "portas_vao_livre")
    private Boolean portasVaoLivre;
    @Basic
    @Column(name = "rampas")
    private Boolean rampas;
    @Basic
    @Column(name = "sinalizacao_sonora")
    private Boolean sinalizacaoSonora;
    @Basic
    @Column(name = "sinalizacao_tatil")
    private Boolean sinalizacaoTatil;
    @Basic
    @Column(name = "sinalizacao_visual")
    private Boolean sinalizacaoVisual;
    @Basic
    @Column(name = "nenhum_recusos_acessibilidade")
    private Boolean nenhumRecursosAcessibilidade;
    @Basic
    @Column(name = "numero_salas_utilizadas_predio")
    private Integer numeroSalasUtilizadasPredio;
    @Basic
    @Column(name = "numero_salas_utilizadas_escola_fora_predio")
    private Integer numeroSalasAulaUtilizadasEscolaForaPredio;
    @Basic
    @Column(name = "numero_salas_climatizadas")
    private Integer numeroSalasClimatizadas;
    @Basic
    @Column(name = "numero_salas_acessivel_pessoas_deficientes")
    private Integer numeroSalasAcessivelPessoasDeficientes;

    public RecursoPessoasDeficientesEntity() {
    }

    public RecursoPessoasDeficientesEntity(Boolean corrimaoGuardaCorpos, Boolean elevador, Boolean pisosTateis, Boolean portasVaoLivre, Boolean rampas, Boolean sinalizacaoSonora, Boolean sinalizacaoTatil, Boolean sinalizacaoVisual, Boolean nenhumRecursosAcessibilidade, Integer numeroSalasUtilizadasPredio, Integer numeroSalasAulaUtilizadasEscolaForaPredio, Integer numeroSalasClimatizadas, Integer numeroSalasAcessivelPessoasDeficientes) {
        this.corrimaoGuardaCorpos = corrimaoGuardaCorpos;
        this.elevador = elevador;
        this.pisosTateis = pisosTateis;
        this.portasVaoLivre = portasVaoLivre;
        this.rampas = rampas;
        this.sinalizacaoSonora = sinalizacaoSonora;
        this.sinalizacaoTatil = sinalizacaoTatil;
        this.sinalizacaoVisual = sinalizacaoVisual;
        this.nenhumRecursosAcessibilidade = nenhumRecursosAcessibilidade;
        this.numeroSalasUtilizadasPredio = numeroSalasUtilizadasPredio;
        this.numeroSalasAulaUtilizadasEscolaForaPredio = numeroSalasAulaUtilizadasEscolaForaPredio;
        this.numeroSalasClimatizadas = numeroSalasClimatizadas;
        this.numeroSalasAcessivelPessoasDeficientes = numeroSalasAcessivelPessoasDeficientes;
    }

    public RecursoPessoasDeficientesEntity(Long id, Boolean corrimaoGuardaCorpos, Boolean elevador, Boolean pisosTateis, Boolean portasVaoLivre, Boolean rampas, Boolean sinalizacaoSonora, Boolean sinalizacaoTatil, Boolean sinalizacaoVisual, Boolean nenhumRecursosAcessibilidade, Integer numeroSalasUtilizadasPredio, Integer numeroSalasAulaUtilizadasEscolaForaPredio, Integer numeroSalasClimatizadas, Integer numeroSalasAcessivelPessoasDeficientes) {
        this.id = id;
        this.corrimaoGuardaCorpos = corrimaoGuardaCorpos;
        this.elevador = elevador;
        this.pisosTateis = pisosTateis;
        this.portasVaoLivre = portasVaoLivre;
        this.rampas = rampas;
        this.sinalizacaoSonora = sinalizacaoSonora;
        this.sinalizacaoTatil = sinalizacaoTatil;
        this.sinalizacaoVisual = sinalizacaoVisual;
        this.nenhumRecursosAcessibilidade = nenhumRecursosAcessibilidade;
        this.numeroSalasUtilizadasPredio = numeroSalasUtilizadasPredio;
        this.numeroSalasAulaUtilizadasEscolaForaPredio = numeroSalasAulaUtilizadasEscolaForaPredio;
        this.numeroSalasClimatizadas = numeroSalasClimatizadas;
        this.numeroSalasAcessivelPessoasDeficientes = numeroSalasAcessivelPessoasDeficientes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCorrimaoGuardaCorpos() {
        return corrimaoGuardaCorpos;
    }

    public void setCorrimaoGuardaCorpos(Boolean corrimaoGuardaCorpos) {
        this.corrimaoGuardaCorpos = corrimaoGuardaCorpos;
    }

    public Boolean getElevador() {
        return elevador;
    }

    public void setElevador(Boolean elevador) {
        this.elevador = elevador;
    }

    public Boolean getPisosTateis() {
        return pisosTateis;
    }

    public void setPisosTateis(Boolean pisosTateis) {
        this.pisosTateis = pisosTateis;
    }

    public Boolean getPortasVaoLivre() {
        return portasVaoLivre;
    }

    public void setPortasVaoLivre(Boolean portasVaoLivre) {
        this.portasVaoLivre = portasVaoLivre;
    }

    public Boolean getRampas() {
        return rampas;
    }

    public void setRampas(Boolean rampas) {
        this.rampas = rampas;
    }

    public Boolean getSinalizacaoSonora() {
        return sinalizacaoSonora;
    }

    public void setSinalizacaoSonora(Boolean sinalizacaoSonora) {
        this.sinalizacaoSonora = sinalizacaoSonora;
    }

    public Boolean getSinalizacaoTatil() {
        return sinalizacaoTatil;
    }

    public void setSinalizacaoTatil(Boolean sinalizacaoTatil) {
        this.sinalizacaoTatil = sinalizacaoTatil;
    }

    public Boolean getSinalizacaoVisual() {
        return sinalizacaoVisual;
    }

    public void setSinalizacaoVisual(Boolean sinalizacaoVisual) {
        this.sinalizacaoVisual = sinalizacaoVisual;
    }

    public Boolean getNenhumRecursosAcessibilidade() {
        return nenhumRecursosAcessibilidade;
    }

    public void setNenhumRecursosAcessibilidade(Boolean nenhumRecursosAcessibilidade) {
        this.nenhumRecursosAcessibilidade = nenhumRecursosAcessibilidade;
    }

    public Integer getNumeroSalasUtilizadasPredio() {
        return numeroSalasUtilizadasPredio;
    }

    public void setNumeroSalasUtilizadasPredio(Integer numeroSalasUtilizadasPredio) {
        this.numeroSalasUtilizadasPredio = numeroSalasUtilizadasPredio;
    }

    public Integer getNumeroSalasAulaUtilizadasEscolaForaPredio() {
        return numeroSalasAulaUtilizadasEscolaForaPredio;
    }

    public void setNumeroSalasAulaUtilizadasEscolaForaPredio(Integer numeroSalasAulaUtilizadasEscolaForaPredio) {
        this.numeroSalasAulaUtilizadasEscolaForaPredio = numeroSalasAulaUtilizadasEscolaForaPredio;
    }

    public Integer getNumeroSalasClimatizadas() {
        return numeroSalasClimatizadas;
    }

    public void setNumeroSalasClimatizadas(Integer numeroSalasClimatizadas) {
        this.numeroSalasClimatizadas = numeroSalasClimatizadas;
    }

    public Integer getNumeroSalasAcessivelPessoasDeficientes() {
        return numeroSalasAcessivelPessoasDeficientes;
    }

    public void setNumeroSalasAcessivelPessoasDeficientes(Integer numeroSalasAcessivelPessoasDeficientes) {
        this.numeroSalasAcessivelPessoasDeficientes = numeroSalasAcessivelPessoasDeficientes;
    }
}
