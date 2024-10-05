package br.com.coreeduc.aplication.entities;

import br.com.coreeduc.aplication.contraints.DependenciaAdministrativa;
import br.com.coreeduc.aplication.contraints.LocalizacaoDiferenciadaResidencia;
import br.com.coreeduc.aplication.contraints.LocalizacaoZonaResidencia;
import br.com.coreeduc.aplication.contraints.SituacaoFuncionamento;
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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "unidade_ensino")
@Entity
public class UnidadeEnsinoEntity {

    @Id
    @Basic
    @Column(name="codigo_inep")
    private Long codigoInep;
    @Basic
    @Column(name="nome")
    private String nome;
    @Basic
    @Column(name="tipo_registro")
    private TipoRegistro tipoDeRegistro;
    @Basic
    @Column(name="situacao_funcionamento")
    private SituacaoFuncionamento situacaoFuncionamento;
    @Basic
    @Column(name="data_incio_ano_letivo")
    private Date dataInicioAnoLetivo;
    @Basic
    @Column(name="data_termino_ano_letivo")
    private Date dataDeTerminoDoAnoLetivo;
    @Basic
    @Column(name="telefone")
    private Integer telefone;
    @Basic
    @Column(name="outro_telefone_contato")
    private Integer outroTelefoneContato;
    @Basic
    @Column(name="endereco_eletronico_email_escola")
    private String enderecoEletronicoEmailEscola;
    @Basic
    @Column(name="codigo_orgao_regional_ensino")
    private String codigoDoOrgaoRegionalDeEnsino;
    @Basic
    @Column(name="localizacao_zona_escola")
    private LocalizacaoZonaResidencia localizacaoZonaEscola;
    @Basic
    @Column(name="localizacao_diferenciada_escola")
    private LocalizacaoDiferenciadaResidencia localizacaoDiferenciadaEscola;
    @Basic
    @Column(name="dependencia_administrativa")
    private DependenciaAdministrativa dependenciaAdministrativa;
    @Basic
    @Column(name="secretaria_educacao")
    private Boolean secretariaEducacao;
    @Basic
    @Column(name="ssecretaria_seguranca_publica")
    private Boolean secretariaSegurancaPublica;
    @Basic
    @Column(name="secretaria_saude")
    private Boolean secretariaSaude;
    @Basic
    @Column(name="outro_orgao_administracao_publica")
    private Boolean outroOrgaoAdministracaoPublica;
    @Basic
    @Column(name="secretaria_estadual")
    private Boolean secretariaEstadual;
    @Basic
    @Column(name="secretaria_municipal")
    private Boolean secretariaMunicipal;
    @Basic
    @Column(name="nao_possui_parceria_convenio")
    private Boolean naoPossuiParceriaConvenio;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private EsferaAdministrativaEntity esferaAdministrativa;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private EnderecoUnidadeEntity enderecoUnidade;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private MantenedoraEscolaPrivadaEntity mantenedoraEscolaPrivada;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private FormasContratacaoEntity formasContratacao;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private NumeroMatriculasAtendidasParceriaConvenioEntity numeroMatriculasAtendidasParceriaConvenio;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private LocalFuncionamentoEscolaEntity localFuncionamentoEscola;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private EscolasComQualCompartilhaEntity escolasComQualCompartilha;
    @OneToOne
    @JoinColumn(name = "abastecimento_agua_id", referencedColumnName = "id",  nullable = false, unique = false)
    @JsonFormat
    private AbastecimentoAguaEntity abastecimentoAgua;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private FonteEnergiaEletricaEntity fonteEnergiaEletrica;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private EsgotamentoSanitarioEntity esgotamentoSanitario;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private DestinacaoLixoEntity destinacaoLixo;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private TratamentoLixoEntity tratamentoLixo;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private DependenciasFisicasEntity dependenciasFisicas;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private RecursoPessoasDeficientesEntity recursoPessoasDeficientes;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private EquipamentosExistentesUnidadeEntity equipamentosExistentesUnidade;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private QuantidadeEquipamentosProcessoAprendizagemEntity quantidadeEquipamentosProcessoAprendizagem;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private QuantidadeComputadoresEmUsoAlunosEntity quantidadeComputadoresEmUsoAlunos;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private AcessoInternetEntity acessoInternet;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private EquipamentosUsadosAlunosAcessoInternetEntity equipamentosUsadosAlunosAcessoInternet;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private RedeLocalInterligacaoComputadoresEntity redeLocalInterligacaoComputadores;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private TotalProfissionaisAtivosEscolaEntity totalProfissionaisAtivosEscola;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private InstrumentosMateriaisSocioCulturaisEntity instrumentosMateriaisSocioCulturais;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private IdiomaEnsinoEntity idiomaEnsino;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private ReservaVagasSistemaCotasEntity reservaVagasSistemaCotas;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private OrgaosColegiadosFuncionamentoEscolaEntity orgaosColegiadosFuncionamentoEscola;

    public UnidadeEnsinoEntity() {
    }

    public UnidadeEnsinoEntity(Long codigoInep,
                               String nome,
                               TipoRegistro tipoDeRegistro,
                               SituacaoFuncionamento situacaoFuncionamento,
                               Date dataInicioAnoLetivo,
                               Date dataDeTerminoDoAnoLetivo,
                               Integer telefone,
                               Integer outroTelefoneContato,
                               String enderecoEletronicoEmailEscola,
                               String codigoDoOrgaoRegionalDeEnsino,
                               LocalizacaoZonaResidencia localizacaoZonaEscola,
                               LocalizacaoDiferenciadaResidencia localizacaoDiferenciadaEscola,
                               DependenciaAdministrativa dependenciaAdministrativa,
                               Boolean secretariaEducacao,
                               Boolean secretariaSegurancaPublica,
                               Boolean secretariaSaude,
                               Boolean outroOrgaoAdministracaoPublica,
                               Boolean secretariaEstadual,
                               Boolean secretariaMunicipal,
                               Boolean naoPossuiParceriaConvenio,
                               EsferaAdministrativaEntity esferaAdministrativa,
                               EnderecoUnidadeEntity enderecoUnidade,
                               MantenedoraEscolaPrivadaEntity mantenedoraEscolaPrivada,
                               FormasContratacaoEntity formasContratacao,
                               NumeroMatriculasAtendidasParceriaConvenioEntity numeroMatriculasAtendidasParceriaConvenio,
                               LocalFuncionamentoEscolaEntity localFuncionamentoEscola,
                               EscolasComQualCompartilhaEntity escolasComQualCompartilha,
                               AbastecimentoAguaEntity abastecimentoAgua,
                               FonteEnergiaEletricaEntity fonteEnergiaEletrica,
                               EsgotamentoSanitarioEntity esgotamentoSanitario,
                               DestinacaoLixoEntity destinacaoLixo,
                               TratamentoLixoEntity tratamentoLixo,
                               DependenciasFisicasEntity dependenciasFisicas,
                               RecursoPessoasDeficientesEntity recursoPessoasDeficientes,
                               EquipamentosExistentesUnidadeEntity equipamentosExistentesUnidade,
                               QuantidadeEquipamentosProcessoAprendizagemEntity quantidadeEquipamentosProcessoAprendizagem,
                               QuantidadeComputadoresEmUsoAlunosEntity quantidadeComputadoresEmUsoAlunos,
                               AcessoInternetEntity acessoInternet,
                               EquipamentosUsadosAlunosAcessoInternetEntity equipamentosUsadosAlunosAcessoInternet,
                               RedeLocalInterligacaoComputadoresEntity redeLocalInterligacaoComputadores,
                               TotalProfissionaisAtivosEscolaEntity totalProfissionaisAtivosEscola,
                               InstrumentosMateriaisSocioCulturaisEntity instrumentosMateriaisSocioCulturais,
                               IdiomaEnsinoEntity idiomaEnsino,
                               ReservaVagasSistemaCotasEntity reservaVagasSistemaCotas,
                               OrgaosColegiadosFuncionamentoEscolaEntity orgaosColegiadosFuncionamentoEscola) {
        this.codigoInep = codigoInep;
        this.nome = nome;
        this.tipoDeRegistro = tipoDeRegistro;
        this.situacaoFuncionamento = situacaoFuncionamento;
        this.dataInicioAnoLetivo = dataInicioAnoLetivo;
        this.dataDeTerminoDoAnoLetivo = dataDeTerminoDoAnoLetivo;
        this.telefone = telefone;
        this.outroTelefoneContato = outroTelefoneContato;
        this.enderecoEletronicoEmailEscola = enderecoEletronicoEmailEscola;
        this.codigoDoOrgaoRegionalDeEnsino = codigoDoOrgaoRegionalDeEnsino;
        this.localizacaoZonaEscola = localizacaoZonaEscola;
        this.localizacaoDiferenciadaEscola = localizacaoDiferenciadaEscola;
        this.dependenciaAdministrativa = dependenciaAdministrativa;
        this.secretariaEducacao = secretariaEducacao;
        this.secretariaSegurancaPublica = secretariaSegurancaPublica;
        this.secretariaSaude = secretariaSaude;
        this.outroOrgaoAdministracaoPublica = outroOrgaoAdministracaoPublica;
        this.secretariaEstadual = secretariaEstadual;
        this.secretariaMunicipal = secretariaMunicipal;
        this.naoPossuiParceriaConvenio = naoPossuiParceriaConvenio;
        this.esferaAdministrativa = esferaAdministrativa;
        this.enderecoUnidade = enderecoUnidade;
        this.mantenedoraEscolaPrivada = mantenedoraEscolaPrivada;
        this.formasContratacao = formasContratacao;
        this.numeroMatriculasAtendidasParceriaConvenio = numeroMatriculasAtendidasParceriaConvenio;
        this.localFuncionamentoEscola = localFuncionamentoEscola;
        this.escolasComQualCompartilha = escolasComQualCompartilha;
        this.abastecimentoAgua = abastecimentoAgua;
        this.fonteEnergiaEletrica = fonteEnergiaEletrica;
        this.esgotamentoSanitario = esgotamentoSanitario;
        this.destinacaoLixo = destinacaoLixo;
        this.tratamentoLixo = tratamentoLixo;
        this.dependenciasFisicas = dependenciasFisicas;
        this.recursoPessoasDeficientes = recursoPessoasDeficientes;
        this.equipamentosExistentesUnidade = equipamentosExistentesUnidade;
        this.quantidadeEquipamentosProcessoAprendizagem = quantidadeEquipamentosProcessoAprendizagem;
        this.quantidadeComputadoresEmUsoAlunos = quantidadeComputadoresEmUsoAlunos;
        this.acessoInternet = acessoInternet;
        this.equipamentosUsadosAlunosAcessoInternet = equipamentosUsadosAlunosAcessoInternet;
        this.redeLocalInterligacaoComputadores = redeLocalInterligacaoComputadores;
        this.totalProfissionaisAtivosEscola = totalProfissionaisAtivosEscola;
        this.instrumentosMateriaisSocioCulturais = instrumentosMateriaisSocioCulturais;
        this.idiomaEnsino = idiomaEnsino;
        this.reservaVagasSistemaCotas = reservaVagasSistemaCotas;
        this.orgaosColegiadosFuncionamentoEscola = orgaosColegiadosFuncionamentoEscola;
    }

    public Long getCodigoInep() {
        return codigoInep;
    }

    public void setCodigoInep(Long codigoInep) {
        this.codigoInep = codigoInep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoRegistro getTipoDeRegistro() {
        return tipoDeRegistro;
    }

    public void setTipoDeRegistro(TipoRegistro tipoDeRegistro) {
        this.tipoDeRegistro = tipoDeRegistro;
    }

    public SituacaoFuncionamento getSituacaoFuncionamento() {
        return situacaoFuncionamento;
    }

    public void setSituacaoFuncionamento(SituacaoFuncionamento situacaoFuncionamento) {
        this.situacaoFuncionamento = situacaoFuncionamento;
    }

    public Date getDataInicioAnoLetivo() {
        return dataInicioAnoLetivo;
    }

    public void setDataInicioAnoLetivo(Date dataInicioAnoLetivo) {
        this.dataInicioAnoLetivo = dataInicioAnoLetivo;
    }

    public Date getDataDeTerminoDoAnoLetivo() {
        return dataDeTerminoDoAnoLetivo;
    }

    public void setDataDeTerminoDoAnoLetivo(Date dataDeTerminoDoAnoLetivo) {
        this.dataDeTerminoDoAnoLetivo = dataDeTerminoDoAnoLetivo;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getOutroTelefoneContato() {
        return outroTelefoneContato;
    }

    public void setOutroTelefoneContato(Integer outroTelefoneContato) {
        this.outroTelefoneContato = outroTelefoneContato;
    }

    public String getEnderecoEletronicoEmailEscola() {
        return enderecoEletronicoEmailEscola;
    }

    public void setEnderecoEletronicoEmailEscola(String enderecoEletronicoEmailEscola) {
        this.enderecoEletronicoEmailEscola = enderecoEletronicoEmailEscola;
    }

    public String getCodigoDoOrgaoRegionalDeEnsino() {
        return codigoDoOrgaoRegionalDeEnsino;
    }

    public void setCodigoDoOrgaoRegionalDeEnsino(String codigoDoOrgaoRegionalDeEnsino) {
        this.codigoDoOrgaoRegionalDeEnsino = codigoDoOrgaoRegionalDeEnsino;
    }

    public LocalizacaoZonaResidencia getLocalizacaoZonaEscola() {
        return localizacaoZonaEscola;
    }

    public void setLocalizacaoZonaEscola(LocalizacaoZonaResidencia localizacaoZonaEscola) {
        this.localizacaoZonaEscola = localizacaoZonaEscola;
    }

    public LocalizacaoDiferenciadaResidencia getLocalizacaoDiferenciadaEscola() {
        return localizacaoDiferenciadaEscola;
    }

    public void setLocalizacaoDiferenciadaEscola(LocalizacaoDiferenciadaResidencia localizacaoDiferenciadaEscola) {
        this.localizacaoDiferenciadaEscola = localizacaoDiferenciadaEscola;
    }

    public DependenciaAdministrativa getDependenciaAdministrativa() {
        return dependenciaAdministrativa;
    }

    public void setDependenciaAdministrativa(DependenciaAdministrativa dependenciaAdministrativa) {
        this.dependenciaAdministrativa = dependenciaAdministrativa;
    }

    public Boolean getSecretariaEducacao() {
        return secretariaEducacao;
    }

    public void setSecretariaEducacao(Boolean secretariaEducacao) {
        this.secretariaEducacao = secretariaEducacao;
    }

    public Boolean getSecretariaSegurancaPublica() {
        return secretariaSegurancaPublica;
    }

    public void setSecretariaSegurancaPublica(Boolean secretariaSegurancaPublica) {
        this.secretariaSegurancaPublica = secretariaSegurancaPublica;
    }

    public Boolean getSecretariaSaude() {
        return secretariaSaude;
    }

    public void setSecretariaSaude(Boolean secretariaSaude) {
        this.secretariaSaude = secretariaSaude;
    }

    public Boolean getOutroOrgaoAdministracaoPublica() {
        return outroOrgaoAdministracaoPublica;
    }

    public void setOutroOrgaoAdministracaoPublica(Boolean outroOrgaoAdministracaoPublica) {
        this.outroOrgaoAdministracaoPublica = outroOrgaoAdministracaoPublica;
    }

    public Boolean getSecretariaEstadual() {
        return secretariaEstadual;
    }

    public void setSecretariaEstadual(Boolean secretariaEstadual) {
        this.secretariaEstadual = secretariaEstadual;
    }

    public Boolean getSecretariaMunicipal() {
        return secretariaMunicipal;
    }

    public void setSecretariaMunicipal(Boolean secretariaMunicipal) {
        this.secretariaMunicipal = secretariaMunicipal;
    }

    public Boolean getNaoPossuiParceriaConvenio() {
        return naoPossuiParceriaConvenio;
    }

    public void setNaoPossuiParceriaConvenio(Boolean naoPossuiParceriaConvenio) {
        this.naoPossuiParceriaConvenio = naoPossuiParceriaConvenio;
    }

    public EsferaAdministrativaEntity getEsferaAdministrativa() {
        return esferaAdministrativa;
    }

    public void setEsferaAdministrativa(EsferaAdministrativaEntity esferaAdministrativa) {
        this.esferaAdministrativa = esferaAdministrativa;
    }

    public EnderecoUnidadeEntity getEnderecoUnidade() {
        return enderecoUnidade;
    }

    public void setEnderecoUnidade(EnderecoUnidadeEntity enderecoUnidade) {
        this.enderecoUnidade = enderecoUnidade;
    }

    public MantenedoraEscolaPrivadaEntity getMantenedoraEscolaPrivada() {
        return mantenedoraEscolaPrivada;
    }

    public void setMantenedoraEscolaPrivada(MantenedoraEscolaPrivadaEntity mantenedoraEscolaPrivada) {
        this.mantenedoraEscolaPrivada = mantenedoraEscolaPrivada;
    }

    public FormasContratacaoEntity getFormasContratacao() {
        return formasContratacao;
    }

    public void setFormasContratacao(FormasContratacaoEntity formasContratacao) {
        this.formasContratacao = formasContratacao;
    }

    public NumeroMatriculasAtendidasParceriaConvenioEntity getNumeroMatriculasAtendidasParceriaConvenio() {
        return numeroMatriculasAtendidasParceriaConvenio;
    }

    public void setNumeroMatriculasAtendidasParceriaConvenio(NumeroMatriculasAtendidasParceriaConvenioEntity numeroMatriculasAtendidasParceriaConvenio) {
        this.numeroMatriculasAtendidasParceriaConvenio = numeroMatriculasAtendidasParceriaConvenio;
    }

    public LocalFuncionamentoEscolaEntity getLocalFuncionamentoEscola() {
        return localFuncionamentoEscola;
    }

    public void setLocalFuncionamentoEscola(LocalFuncionamentoEscolaEntity localFuncionamentoEscola) {
        this.localFuncionamentoEscola = localFuncionamentoEscola;
    }

    public EscolasComQualCompartilhaEntity getEscolasComQualCompartilha() {
        return escolasComQualCompartilha;
    }

    public void setEscolasComQualCompartilha(EscolasComQualCompartilhaEntity escolasComQualCompartilha) {
        this.escolasComQualCompartilha = escolasComQualCompartilha;
    }

    public AbastecimentoAguaEntity getAbastecimentoAgua() {
        return abastecimentoAgua;
    }

    public void setAbastecimentoAgua(AbastecimentoAguaEntity abastecimentoAgua) {
        this.abastecimentoAgua = abastecimentoAgua;
    }

    public FonteEnergiaEletricaEntity getFonteEnergiaEletrica() {
        return fonteEnergiaEletrica;
    }

    public void setFonteEnergiaEletrica(FonteEnergiaEletricaEntity fonteEnergiaEletrica) {
        this.fonteEnergiaEletrica = fonteEnergiaEletrica;
    }

    public EsgotamentoSanitarioEntity getEsgotamentoSanitario() {
        return esgotamentoSanitario;
    }

    public void setEsgotamentoSanitario(EsgotamentoSanitarioEntity esgotamentoSanitario) {
        this.esgotamentoSanitario = esgotamentoSanitario;
    }

    public DestinacaoLixoEntity getDestinacaoLixo() {
        return destinacaoLixo;
    }

    public void setDestinacaoLixo(DestinacaoLixoEntity destinacaoLixo) {
        this.destinacaoLixo = destinacaoLixo;
    }

    public TratamentoLixoEntity getTratamentoLixo() {
        return tratamentoLixo;
    }

    public void setTratamentoLixo(TratamentoLixoEntity tratamentoLixo) {
        this.tratamentoLixo = tratamentoLixo;
    }

    public DependenciasFisicasEntity getDependenciasFisicas() {
        return dependenciasFisicas;
    }

    public void setDependenciasFisicas(DependenciasFisicasEntity dependenciasFisicas) {
        this.dependenciasFisicas = dependenciasFisicas;
    }

    public RecursoPessoasDeficientesEntity getRecursoPessoasDeficientes() {
        return recursoPessoasDeficientes;
    }

    public void setRecursoPessoasDeficientes(RecursoPessoasDeficientesEntity recursoPessoasDeficientes) {
        this.recursoPessoasDeficientes = recursoPessoasDeficientes;
    }

    public EquipamentosExistentesUnidadeEntity getEquipamentosExistentesUnidade() {
        return equipamentosExistentesUnidade;
    }

    public void setEquipamentosExistentesUnidade(EquipamentosExistentesUnidadeEntity equipamentosExistentesUnidade) {
        this.equipamentosExistentesUnidade = equipamentosExistentesUnidade;
    }

    public QuantidadeEquipamentosProcessoAprendizagemEntity getQuantidadeEquipamentosProcessoAprendizagem() {
        return quantidadeEquipamentosProcessoAprendizagem;
    }

    public void setQuantidadeEquipamentosProcessoAprendizagem(QuantidadeEquipamentosProcessoAprendizagemEntity quantidadeEquipamentosProcessoAprendizagem) {
        this.quantidadeEquipamentosProcessoAprendizagem = quantidadeEquipamentosProcessoAprendizagem;
    }

    public QuantidadeComputadoresEmUsoAlunosEntity getQuantidadeComputadoresEmUsoAlunos() {
        return quantidadeComputadoresEmUsoAlunos;
    }

    public void setQuantidadeComputadoresEmUsoAlunos(QuantidadeComputadoresEmUsoAlunosEntity quantidadeComputadoresEmUsoAlunos) {
        this.quantidadeComputadoresEmUsoAlunos = quantidadeComputadoresEmUsoAlunos;
    }

    public AcessoInternetEntity getAcessoInternet() {
        return acessoInternet;
    }

    public void setAcessoInternet(AcessoInternetEntity acessoInternet) {
        this.acessoInternet = acessoInternet;
    }

    public EquipamentosUsadosAlunosAcessoInternetEntity getEquipamentosUsadosAlunosAcessoInternet() {
        return equipamentosUsadosAlunosAcessoInternet;
    }

    public void setEquipamentosUsadosAlunosAcessoInternet(EquipamentosUsadosAlunosAcessoInternetEntity equipamentosUsadosAlunosAcessoInternet) {
        this.equipamentosUsadosAlunosAcessoInternet = equipamentosUsadosAlunosAcessoInternet;
    }

    public RedeLocalInterligacaoComputadoresEntity getRedeLocalInterligacaoComputadores() {
        return redeLocalInterligacaoComputadores;
    }

    public void setRedeLocalInterligacaoComputadores(RedeLocalInterligacaoComputadoresEntity redeLocalInterligacaoComputadores) {
        this.redeLocalInterligacaoComputadores = redeLocalInterligacaoComputadores;
    }

    public TotalProfissionaisAtivosEscolaEntity getTotalProfissionaisAtivosEscola() {
        return totalProfissionaisAtivosEscola;
    }

    public void setTotalProfissionaisAtivosEscola(TotalProfissionaisAtivosEscolaEntity totalProfissionaisAtivosEscola) {
        this.totalProfissionaisAtivosEscola = totalProfissionaisAtivosEscola;
    }

    public InstrumentosMateriaisSocioCulturaisEntity getInstrumentosMateriaisSocioCulturais() {
        return instrumentosMateriaisSocioCulturais;
    }

    public void setInstrumentosMateriaisSocioCulturais(InstrumentosMateriaisSocioCulturaisEntity instrumentosMateriaisSocioCulturais) {
        this.instrumentosMateriaisSocioCulturais = instrumentosMateriaisSocioCulturais;
    }

    public IdiomaEnsinoEntity getIdiomaEnsino() {
        return idiomaEnsino;
    }

    public void setIdiomaEnsino(IdiomaEnsinoEntity idiomaEnsino) {
        this.idiomaEnsino = idiomaEnsino;
    }

    public ReservaVagasSistemaCotasEntity getReservaVagasSistemaCotas() {
        return reservaVagasSistemaCotas;
    }

    public void setReservaVagasSistemaCotas(ReservaVagasSistemaCotasEntity reservaVagasSistemaCotas) {
        this.reservaVagasSistemaCotas = reservaVagasSistemaCotas;
    }

    public OrgaosColegiadosFuncionamentoEscolaEntity getOrgaosColegiadosFuncionamentoEscola() {
        return orgaosColegiadosFuncionamentoEscola;
    }

    public void setOrgaosColegiadosFuncionamentoEscola(OrgaosColegiadosFuncionamentoEscolaEntity orgaosColegiadosFuncionamentoEscola) {
        this.orgaosColegiadosFuncionamentoEscola = orgaosColegiadosFuncionamentoEscola;
    }

}
