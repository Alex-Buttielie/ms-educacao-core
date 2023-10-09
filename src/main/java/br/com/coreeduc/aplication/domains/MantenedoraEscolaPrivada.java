package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.aplication.domains.contraints.CategoriaEscolaPrivada;

public class MantenedoraEscolaPrivada {

    private Long id;
    private Boolean empresaGruposEmpresariaisSetorPrivadoPessoaFisica;
    private Boolean sindicatosTrabalhadoresPatronaisAssociacoesCooperativas;
    private Boolean organizacaoNaoGovernamenta;
    private Boolean instituicaoSemFinsLucrativos;
    private Boolean sistemasSesiSenaiSescOutros;
    private Boolean organizacaoDaSociedadeCivilDeInteressePublico;
    private CategoriaEscolaPrivada categoriaEscolaPrivada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEmpresaGruposEmpresariaisSetorPrivadoPessoaFisica() {
        return empresaGruposEmpresariaisSetorPrivadoPessoaFisica;
    }

    public void setEmpresaGruposEmpresariaisSetorPrivadoPessoaFisica(Boolean empresaGruposEmpresariaisSetorPrivadoPessoaFisica) {
        this.empresaGruposEmpresariaisSetorPrivadoPessoaFisica = empresaGruposEmpresariaisSetorPrivadoPessoaFisica;
    }

    public Boolean getSindicatosTrabalhadoresPatronaisAssociacoesCooperativas() {
        return sindicatosTrabalhadoresPatronaisAssociacoesCooperativas;
    }

    public void setSindicatosTrabalhadoresPatronaisAssociacoesCooperativas(Boolean sindicatosTrabalhadoresPatronaisAssociacoesCooperativas) {
        this.sindicatosTrabalhadoresPatronaisAssociacoesCooperativas = sindicatosTrabalhadoresPatronaisAssociacoesCooperativas;
    }

    public Boolean getOrganizacaoNaoGovernamenta() {
        return organizacaoNaoGovernamenta;
    }

    public void setOrganizacaoNaoGovernamenta(Boolean organizacaoNaoGovernamenta) {
        this.organizacaoNaoGovernamenta = organizacaoNaoGovernamenta;
    }

    public Boolean getInstituicaoSemFinsLucrativos() {
        return instituicaoSemFinsLucrativos;
    }

    public void setInstituicaoSemFinsLucrativos(Boolean instituicaoSemFinsLucrativos) {
        this.instituicaoSemFinsLucrativos = instituicaoSemFinsLucrativos;
    }

    public Boolean getSistemasSesiSenaiSescOutros() {
        return sistemasSesiSenaiSescOutros;
    }

    public void setSistemasSesiSenaiSescOutros(Boolean sistemasSesiSenaiSescOutros) {
        this.sistemasSesiSenaiSescOutros = sistemasSesiSenaiSescOutros;
    }

    public Boolean getOrganizacaoDaSociedadeCivilDeInteressePublico() {
        return organizacaoDaSociedadeCivilDeInteressePublico;
    }

    public void setOrganizacaoDaSociedadeCivilDeInteressePublico(Boolean organizacaoDaSociedadeCivilDeInteressePublico) {
        this.organizacaoDaSociedadeCivilDeInteressePublico = organizacaoDaSociedadeCivilDeInteressePublico;
    }

    public CategoriaEscolaPrivada getCategoriaEscolaPrivada() {
        return categoriaEscolaPrivada;
    }

    public void setCategoriaEscolaPrivada(CategoriaEscolaPrivada categoriaEscolaPrivada) {
        this.categoriaEscolaPrivada = categoriaEscolaPrivada;
    }
}
