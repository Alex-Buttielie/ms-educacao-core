package br.com.coreeduc.aplication.entities;

import br.com.coreeduc.aplication.contraints.CategoriaEscola;
import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "mantenedora_escola_privada")
@Entity
@Builder
public class MantenedoraEscolaPrivadaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="empresa_grupos_empresariais_setor_privado_pessoa_fisica")
    private Boolean empresaGruposEmpresariaisSetorPrivadoPessoaFisica;
    @Basic
    @Column(name="sindicatos_trabalhadores_patronais_associacoes_cooperativas")
    private Boolean sindicatosTrabalhadoresPatronaisAssociacoesCooperativas;
    @Basic
    @Column(name="organizacao_nao_governamental")
    private Boolean organizacaoNaoGovernamenta;
    @Basic
    @Column(name="institucao_sem_fins_lucrativos")
    private Boolean instituicaoSemFinsLucrativos;
    @Basic
    @Column(name="sistemas_sesi_senai_sesc_outros")
    private Boolean sistemasSesiSenaiSescOutros;
    @Basic
    @Column(name="organizacao_sociedade_civil_interesse_publico")
    private Boolean organizacaoDaSociedadeCivilDeInteressePublico;
    @Basic
    @Column(name="categoria_escola_privada")
    private CategoriaEscola categoriaEscola;

    public MantenedoraEscolaPrivadaEntity(Long id, Boolean empresaGruposEmpresariaisSetorPrivadoPessoaFisica, Boolean sindicatosTrabalhadoresPatronaisAssociacoesCooperativas, Boolean organizacaoNaoGovernamenta, Boolean instituicaoSemFinsLucrativos, Boolean sistemasSesiSenaiSescOutros, Boolean organizacaoDaSociedadeCivilDeInteressePublico, CategoriaEscola categoriaEscola) {
        this.id = id;
        this.empresaGruposEmpresariaisSetorPrivadoPessoaFisica = empresaGruposEmpresariaisSetorPrivadoPessoaFisica;
        this.sindicatosTrabalhadoresPatronaisAssociacoesCooperativas = sindicatosTrabalhadoresPatronaisAssociacoesCooperativas;
        this.organizacaoNaoGovernamenta = organizacaoNaoGovernamenta;
        this.instituicaoSemFinsLucrativos = instituicaoSemFinsLucrativos;
        this.sistemasSesiSenaiSescOutros = sistemasSesiSenaiSescOutros;
        this.organizacaoDaSociedadeCivilDeInteressePublico = organizacaoDaSociedadeCivilDeInteressePublico;
        this.categoriaEscola = categoriaEscola;
    }

    public MantenedoraEscolaPrivadaEntity(Boolean empresaGruposEmpresariaisSetorPrivadoPessoaFisica, Boolean sindicatosTrabalhadoresPatronaisAssociacoesCooperativas, Boolean organizacaoNaoGovernamenta, Boolean instituicaoSemFinsLucrativos, Boolean sistemasSesiSenaiSescOutros, Boolean organizacaoDaSociedadeCivilDeInteressePublico, CategoriaEscola categoriaEscola) {
        this.empresaGruposEmpresariaisSetorPrivadoPessoaFisica = empresaGruposEmpresariaisSetorPrivadoPessoaFisica;
        this.sindicatosTrabalhadoresPatronaisAssociacoesCooperativas = sindicatosTrabalhadoresPatronaisAssociacoesCooperativas;
        this.organizacaoNaoGovernamenta = organizacaoNaoGovernamenta;
        this.instituicaoSemFinsLucrativos = instituicaoSemFinsLucrativos;
        this.sistemasSesiSenaiSescOutros = sistemasSesiSenaiSescOutros;
        this.organizacaoDaSociedadeCivilDeInteressePublico = organizacaoDaSociedadeCivilDeInteressePublico;
        this.categoriaEscola = categoriaEscola;
    }

    public MantenedoraEscolaPrivadaEntity() {
    }

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

    public CategoriaEscola getCategoriaEscola() {
        return categoriaEscola;
    }

    public void setCategoriaEscola(CategoriaEscola categoriaEscola) {
        this.categoriaEscola = categoriaEscola;
    }
}
