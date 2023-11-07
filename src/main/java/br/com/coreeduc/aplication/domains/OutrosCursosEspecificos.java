package br.com.coreeduc.aplication.domains;

import java.io.Serializable;

public class OutrosCursosEspecificos implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Boolean creche;
    private Boolean preEscola;
    private Boolean anosIniciaisEnsinoFundamental;
    private Boolean anosFinaisEnsinoFundamental;
    private Boolean ensinoMedio;
    private Boolean educacaoJovensAdultos;
    private Boolean educacaoEspecial;
    private Boolean educacaoIndigena;
    private Boolean educacaoCampo;
    private Boolean educacaoAmbiental;
    private Boolean educacaoDireitosHumanos;
    private Boolean generoDiversidadeSexual;
    private Boolean direitoCriacaoAdolescente;
    private Boolean educacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira;
    private Boolean gestaoEscolar;
    private Boolean outros;
    private Boolean naoTemOutrosCursosEspecificos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCreche() {
        return creche;
    }

    public void setCreche(Boolean creche) {
        this.creche = creche;
    }

    public Boolean getPreEscola() {
        return preEscola;
    }

    public void setPreEscola(Boolean preEscola) {
        this.preEscola = preEscola;
    }

    public Boolean getAnosIniciaisEnsinoFundamental() {
        return anosIniciaisEnsinoFundamental;
    }

    public void setAnosIniciaisEnsinoFundamental(Boolean anosIniciaisEnsinoFundamental) {
        this.anosIniciaisEnsinoFundamental = anosIniciaisEnsinoFundamental;
    }

    public Boolean getAnosFinaisEnsinoFundamental() {
        return anosFinaisEnsinoFundamental;
    }

    public void setAnosFinaisEnsinoFundamental(Boolean anosFinaisEnsinoFundamental) {
        this.anosFinaisEnsinoFundamental = anosFinaisEnsinoFundamental;
    }

    public Boolean getEnsinoMedio() {
        return ensinoMedio;
    }

    public void setEnsinoMedio(Boolean ensinoMedio) {
        this.ensinoMedio = ensinoMedio;
    }

    public Boolean getEducacaoJovensAdultos() {
        return educacaoJovensAdultos;
    }

    public void setEducacaoJovensAdultos(Boolean educacaoJovensAdultos) {
        this.educacaoJovensAdultos = educacaoJovensAdultos;
    }

    public Boolean getEducacaoEspecial() {
        return educacaoEspecial;
    }

    public void setEducacaoEspecial(Boolean educacaoEspecial) {
        this.educacaoEspecial = educacaoEspecial;
    }

    public Boolean getEducacaoIndigena() {
        return educacaoIndigena;
    }

    public void setEducacaoIndigena(Boolean educacaoIndigena) {
        this.educacaoIndigena = educacaoIndigena;
    }

    public Boolean getEducacaoCampo() {
        return educacaoCampo;
    }

    public void setEducacaoCampo(Boolean educacaoCampo) {
        this.educacaoCampo = educacaoCampo;
    }

    public Boolean getEducacaoAmbiental() {
        return educacaoAmbiental;
    }

    public void setEducacaoAmbiental(Boolean educacaoAmbiental) {
        this.educacaoAmbiental = educacaoAmbiental;
    }

    public Boolean getEducacaoDireitosHumanos() {
        return educacaoDireitosHumanos;
    }

    public void setEducacaoDireitosHumanos(Boolean educacaoDireitosHumanos) {
        this.educacaoDireitosHumanos = educacaoDireitosHumanos;
    }

    public Boolean getGeneroDiversidadeSexual() {
        return generoDiversidadeSexual;
    }

    public void setGeneroDiversidadeSexual(Boolean generoDiversidadeSexual) {
        this.generoDiversidadeSexual = generoDiversidadeSexual;
    }

    public Boolean getDireitoCriacaoAdolescente() {
        return direitoCriacaoAdolescente;
    }

    public void setDireitoCriacaoAdolescente(Boolean direitoCriacaoAdolescente) {
        this.direitoCriacaoAdolescente = direitoCriacaoAdolescente;
    }

    public Boolean getEducacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira() {
        return educacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira;
    }

    public void setEducacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira(Boolean educacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira) {
        this.educacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira = educacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira;
    }

    public Boolean getGestaoEscolar() {
        return gestaoEscolar;
    }

    public void setGestaoEscolar(Boolean gestaoEscolar) {
        this.gestaoEscolar = gestaoEscolar;
    }

    public Boolean getOutros() {
        return outros;
    }

    public void setOutros(Boolean outros) {
        this.outros = outros;
    }

    public Boolean getNaoTemOutrosCursosEspecificos() {
        return naoTemOutrosCursosEspecificos;
    }

    public void setNaoTemOutrosCursosEspecificos(Boolean naoTemOutrosCursosEspecificos) {
        this.naoTemOutrosCursosEspecificos = naoTemOutrosCursosEspecificos;
    }
}
