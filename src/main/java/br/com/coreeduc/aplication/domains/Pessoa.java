package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.aplication.domains.contraints.CorRaca;
import br.com.coreeduc.aplication.domains.contraints.LocalizacaoDiferenciadaResidencia;
import br.com.coreeduc.aplication.domains.contraints.LocalizacaoZonaResidencia;
import br.com.coreeduc.aplication.domains.contraints.Nacionalidade;
import br.com.coreeduc.aplication.domains.contraints.Paises;
import br.com.coreeduc.aplication.domains.contraints.Sexo;
import br.com.coreeduc.aplication.domains.contraints.TipoFiliacao;
import br.com.coreeduc.aplication.domains.contraints.TipoRegistro;

import java.util.Date;

public class Pessoa {
    private Long id;
    private Long identificacaoUnica;
    private TipoRegistro tipoRegistro;
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private TipoFiliacao tipoFiliacao;
    private String nomeMae;
    private String nomePai;
    private Sexo sexo;
    private CorRaca corRaca;
    private Nacionalidade nacionalidade;
    private Paises paisNacionalidade;
    private String numeroMatriculaCertidaoNascimento;
    private Paises paisResidencia;
    private String cep;
    private LocalizacaoZonaResidencia localizacaoZonaResidencia;
    private LocalizacaoDiferenciadaResidencia localizacaoDiferenciadaResidencia;
    private String enderecoEletronicoEmail;
    private UnidadeEnsino fkUni;
    private Municipio fkMunNasc;
    private Municipio fkMunResid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdentificacaoUnica() {
        return identificacaoUnica;
    }

    public void setIdentificacaoUnica(Long identificacaoUnica) {
        this.identificacaoUnica = identificacaoUnica;
    }

    public TipoRegistro getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(TipoRegistro tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public TipoFiliacao getTipoFiliacao() {
        return tipoFiliacao;
    }

    public void setTipoFiliacao(TipoFiliacao tipoFiliacao) {
        this.tipoFiliacao = tipoFiliacao;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public CorRaca getCorRaca() {
        return corRaca;
    }

    public void setCorRaca(CorRaca corRaca) {
        this.corRaca = corRaca;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Paises getPaisNacionalidade() {
        return paisNacionalidade;
    }

    public void setPaisNacionalidade(Paises paisNacionalidade) {
        this.paisNacionalidade = paisNacionalidade;
    }

    public String getNumeroMatriculaCertidaoNascimento() {
        return numeroMatriculaCertidaoNascimento;
    }

    public void setNumeroMatriculaCertidaoNascimento(String numeroMatriculaCertidaoNascimento) {
        this.numeroMatriculaCertidaoNascimento = numeroMatriculaCertidaoNascimento;
    }

    public Paises getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(Paises paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public LocalizacaoZonaResidencia getLocalizacaoZonaResidencia() {
        return localizacaoZonaResidencia;
    }

    public void setLocalizacaoZonaResidencia(LocalizacaoZonaResidencia localizacaoZonaResidencia) {
        this.localizacaoZonaResidencia = localizacaoZonaResidencia;
    }

    public LocalizacaoDiferenciadaResidencia getLocalizacaoDiferenciadaResidencia() {
        return localizacaoDiferenciadaResidencia;
    }

    public void setLocalizacaoDiferenciadaResidencia(LocalizacaoDiferenciadaResidencia localizacaoDiferenciadaResidencia) {
        this.localizacaoDiferenciadaResidencia = localizacaoDiferenciadaResidencia;
    }

    public String getEnderecoEletronicoEmail() {
        return enderecoEletronicoEmail;
    }

    public void setEnderecoEletronicoEmail(String enderecoEletronicoEmail) {
        this.enderecoEletronicoEmail = enderecoEletronicoEmail;
    }

    public UnidadeEnsino getFkUni() {
        return fkUni;
    }

    public void setFkUni(UnidadeEnsino fkUni) {
        this.fkUni = fkUni;
    }

    public Municipio getFkMunNasc() {
        return fkMunNasc;
    }

    public void setFkMunNasc(Municipio fkMunNasc) {
        this.fkMunNasc = fkMunNasc;
    }

    public Municipio getFkMunResid() {
        return fkMunResid;
    }

    public void setFkMunResid(Municipio fkMunResid) {
        this.fkMunResid = fkMunResid;
    }
}
