package br.com.coreeduc.aplication.entities;

import br.com.coreeduc.aplication.contraints.CorRaca;
import br.com.coreeduc.aplication.contraints.LocalizacaoDiferenciadaResidencia;
import br.com.coreeduc.aplication.contraints.LocalizacaoZonaResidencia;
import br.com.coreeduc.aplication.contraints.Nacionalidade;
import br.com.coreeduc.aplication.contraints.Paises;
import br.com.coreeduc.aplication.contraints.Sexo;
import br.com.coreeduc.aplication.contraints.TipoFiliacao;
import br.com.coreeduc.aplication.contraints.TipoRegistro;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "pessoa")
@Entity
public class PessoaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "identificacao_unica")
    private Long identificacaoUnica;
    @Basic
    @Column(name = "tipo_registro")
    private TipoRegistro tipoRegistro;
    @Basic
    @Column(name = "cpf")
    private String cpf;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    @Basic
    @Column(name = "tipo_filiacao")
    private TipoFiliacao tipoFiliacao;
    @Basic
    @Column(name = "nome_mae")
    private String nomeMae;
    @Basic
    @Column(name = "nome_pai")
    private String nomePai;
    @Basic
    @Column(name = "sexo")
    private Sexo sexo;
    @Basic
    @Column(name = "cor_raca")
    private CorRaca corRaca;
    @Basic
    @Column(name = "nacionalidade")
    private Nacionalidade nacionalidade;
    @Basic
    @Column(name = "pais_nacionalidade")
    private Paises paisNacionalidade;
    @Basic
    @Column(name = "numero_matricula_certidao_nascimento")
    private String numeroMatriculaCertidaoNascimento;
    @Basic
    @Column(name = "pais_residencia")
    private Paises paisResidencia;
    @Basic
    @Column(name = "cep")
    private String cep;
    @Basic
    @Column(name = "localizacao_zona_residencia")
    private LocalizacaoZonaResidencia localizacaoZonaResidencia;
    @Basic
    @Column(name = "localizacao_diferenciada_residencia")
    private LocalizacaoDiferenciadaResidencia localizacaoDiferenciadaResidencia;
    @Basic
    @Column(name = "endereco_eletronico_email")
    private String enderecoEletronicoEmail;
    @OneToOne()
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity fkUni;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private MunicipioEntity fkMunNasc;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private MunicipioEntity fkMunResid;

    public PessoaEntity() {
    }

    public PessoaEntity(Long id,
                        Long identificacaoUnica,
                        TipoRegistro tipoRegistro,
                        String cpf,
                        String nome,
                        Date dataNascimento,
                        TipoFiliacao tipoFiliacao,
                        String nomeMae,
                        String nomePai,
                        Sexo sexo,
                        CorRaca corRaca,
                        Nacionalidade nacionalidade,
                        Paises paisNacionalidade,
                        String numeroMatriculaCertidaoNascimento,
                        Paises paisResidencia,
                        String cep,
                        LocalizacaoZonaResidencia localizacaoZonaResidencia,
                        LocalizacaoDiferenciadaResidencia localizacaoDiferenciadaResidencia,
                        String enderecoEletronicoEmail,
                        UnidadeEnsinoEntity fkUni,
                        MunicipioEntity fkMunNasc,
                        MunicipioEntity fkMunResid) {
        this.id = id;
        this.identificacaoUnica = identificacaoUnica;
        this.tipoRegistro = tipoRegistro;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipoFiliacao = tipoFiliacao;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.sexo = sexo;
        this.corRaca = corRaca;
        this.nacionalidade = nacionalidade;
        this.paisNacionalidade = paisNacionalidade;
        this.numeroMatriculaCertidaoNascimento = numeroMatriculaCertidaoNascimento;
        this.paisResidencia = paisResidencia;
        this.cep = cep;
        this.localizacaoZonaResidencia = localizacaoZonaResidencia;
        this.localizacaoDiferenciadaResidencia = localizacaoDiferenciadaResidencia;
        this.enderecoEletronicoEmail = enderecoEletronicoEmail;
        this.fkUni = fkUni;
        this.fkMunNasc = fkMunNasc;
        this.fkMunResid = fkMunResid;
    }

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

    public UnidadeEnsinoEntity getFkUni() {
        return fkUni;
    }

    public void setFkUni(UnidadeEnsinoEntity fkUni) {
        this.fkUni = fkUni;
    }

    public MunicipioEntity getFkMunNasc() {
        return fkMunNasc;
    }

    public void setFkMunNasc(MunicipioEntity fkMunNasc) {
        this.fkMunNasc = fkMunNasc;
    }

    public MunicipioEntity getFkMunResid() {
        return fkMunResid;
    }

    public void setFkMunResid(MunicipioEntity fkMunResid) {
        this.fkMunResid = fkMunResid;
    }

}
