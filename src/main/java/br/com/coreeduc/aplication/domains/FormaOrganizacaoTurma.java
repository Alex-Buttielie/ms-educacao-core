package br.com.coreeduc.aplication.domains;

public class FormaOrganizacaoTurma {
    private Long id;
    private Boolean seriesAnuais;
    private Boolean periodosSemestrais;
    private Boolean ciclos;
    private Boolean gruposNaoSeriados;
    private Boolean modulos;
    private Boolean alternanciaPeriodos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getSeriesAnuais() {
        return seriesAnuais;
    }

    public void setSeriesAnuais(Boolean seriesAnuais) {
        this.seriesAnuais = seriesAnuais;
    }

    public Boolean getPeriodosSemestrais() {
        return periodosSemestrais;
    }

    public void setPeriodosSemestrais(Boolean periodosSemestrais) {
        this.periodosSemestrais = periodosSemestrais;
    }

    public Boolean getCiclos() {
        return ciclos;
    }

    public void setCiclos(Boolean ciclos) {
        this.ciclos = ciclos;
    }

    public Boolean getGruposNaoSeriados() {
        return gruposNaoSeriados;
    }

    public void setGruposNaoSeriados(Boolean gruposNaoSeriados) {
        this.gruposNaoSeriados = gruposNaoSeriados;
    }

    public Boolean getModulos() {
        return modulos;
    }

    public void setModulos(Boolean modulos) {
        this.modulos = modulos;
    }

    public Boolean getAlternanciaPeriodos() {
        return alternanciaPeriodos;
    }

    public void setAlternanciaPeriodos(Boolean alternanciaPeriodos) {
        this.alternanciaPeriodos = alternanciaPeriodos;
    }
}
