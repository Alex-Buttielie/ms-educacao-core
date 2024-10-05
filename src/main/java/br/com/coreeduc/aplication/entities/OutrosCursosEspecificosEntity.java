package br.com.coreeduc.aplication.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "outros_cursos_especificos")
@Entity
public class OutrosCursosEspecificosEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "creche")
    private Boolean creche;
    @Basic
    @Column(name = "pre_escola")
    private Boolean preEscola;
    @Basic
    @Column(name = "anos_iniciais_ensino_fundamental")
    private Boolean anosIniciaisEnsinoFundamental;
    @Basic
    @Column(name = "anos_finais_ensino_fundamental")
    private Boolean anosFinaisEnsinoFundamental;
    @Basic
    @Column(name = "ensino_medio")
    private Boolean ensinoMedio;
    @Basic
    @Column(name = "educacao_jovens_adultos")
    private Boolean educacaoJovensAdultos;
    @Basic
    @Column(name = "educacao_especial")
    private Boolean educacaoEspecial;
    @Basic
    @Column(name = "educacao_indigena")
    private Boolean educacaoIndigena;
    @Basic
    @Column(name = "educacao_campo")
    private Boolean educacaoCampo;
    @Basic
    @Column(name = "educacao_ambiental")
    private Boolean educacaoAmbiental;
    @Basic
    @Column(name = "educacao_direitos_humanos")
    private Boolean educacaoDireitosHumanos;
    @Basic
    @Column(name = "gerero_diversidade_sexual")
    private Boolean generoDiversidadeSexual;
    @Basic
    @Column(name = "direitos_criacao_adolescente")
    private Boolean direitoCriacaoAdolescente;
    @Basic
    @Column(name = "educacao_relacoes_etnico_raciais_cultura_afro_brasileira")
    private Boolean educacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira;
    @Basic
    @Column(name = "gestao_escolar")
    private Boolean gestaoEscolar;
    @Basic
    @Column(name = "outros")
    private Boolean outros;

    public OutrosCursosEspecificosEntity() {
    }

    public OutrosCursosEspecificosEntity(Long id) {}

    public OutrosCursosEspecificosEntity(Boolean creche, Boolean preEscola, Boolean anosIniciaisEnsinoFundamental, Boolean anosFinaisEnsinoFundamental, Boolean ensinoMedio, Boolean educacaoJovensAdultos, Boolean educacaoEspecial, Boolean educacaoIndigena, Boolean educacaoCampo, Boolean educacaoAmbiental, Boolean educacaoDireitosHumanos, Boolean generoDiversidadeSexual, Boolean direitoCriacaoAdolescente, Boolean educacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira, Boolean gestaoEscolar, Boolean outros) {
        this.creche = creche;
        this.preEscola = preEscola;
        this.anosIniciaisEnsinoFundamental = anosIniciaisEnsinoFundamental;
        this.anosFinaisEnsinoFundamental = anosFinaisEnsinoFundamental;
        this.ensinoMedio = ensinoMedio;
        this.educacaoJovensAdultos = educacaoJovensAdultos;
        this.educacaoEspecial = educacaoEspecial;
        this.educacaoIndigena = educacaoIndigena;
        this.educacaoCampo = educacaoCampo;
        this.educacaoAmbiental = educacaoAmbiental;
        this.educacaoDireitosHumanos = educacaoDireitosHumanos;
        this.generoDiversidadeSexual = generoDiversidadeSexual;
        this.direitoCriacaoAdolescente = direitoCriacaoAdolescente;
        this.educacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira = educacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira;
        this.gestaoEscolar = gestaoEscolar;
        this.outros = outros;
    }

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
}
