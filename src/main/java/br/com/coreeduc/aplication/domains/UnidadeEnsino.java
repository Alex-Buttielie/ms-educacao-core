package br.com.coreeduc.aplication.domains;


import br.com.coreeduc.aplication.domains.contraints.DependenciaAdministrativa;
import br.com.coreeduc.aplication.domains.contraints.LocalizacaoDiferenciadaResidencia;
import br.com.coreeduc.aplication.domains.contraints.LocalizacaoZonaResidencia;
import br.com.coreeduc.aplication.domains.contraints.SituacaoFuncionamento;
import br.com.coreeduc.aplication.domains.contraints.TipoRegistro;

import java.util.Date;

public class UnidadeEnsino {

    private Long codigoInep;
    private String nome;
    private TipoRegistro tipoDeRegistro;
    private SituacaoFuncionamento situacaoFuncionamento;
    private Date dataInicioAnoLetivo;
    private Date dataDeTerminoDoAnoLetivo;
    private Integer telefone;
    private Integer outroTelefoneContato;
    private String enderecoEletronicoEmailEscola;
    private String codigoDoOrgaoRegionalDeEnsino;
    private LocalizacaoZonaResidencia localizacaoZonaEscola;
    private LocalizacaoDiferenciadaResidencia localizacaoDiferenciadaEscola;
    private DependenciaAdministrativa dependenciaAdministrativa;
    private Boolean secretariaEducacao;
    private Boolean secretariaSegurancaPublica;
    private Boolean secretariaSaude;
    private Boolean outroOrgaoAdministracaoPublica;
    private Boolean secretariaEstadual;
    private Boolean secretariaMunicipal;
    private Boolean naoPossuiParceriaConvenio;
    private EsferaAdministrativa esferaAdministrativa;
    private EnderecoUnidade enderecoUnidade;
    private MantenedoraEscolaPrivada mantenedoraEscolaPrivada;
    private FormasContratacao formasContratacao;
    private NumeroMatriculasAtendidasParceriaConvenio numeroMatriculasAtendidasParceriaConvenio;
    private LocalFuncionamentoEscola localFuncionamentoEscola;
    private EscolasComQualCompartilha escolasComQualCompartilha;
    private AbastecimentoAgua abastecimentoAgua;
    private FonteEnergiaEletrica fonteEnergiaEletrica;
    private EsgotamentoSanitario esgotamentoSanitario;
    private DestinacaoLixo destinacaoLixo;
    private TratamentoLixo tratamentoLixo;
    private DependenciasFisicas dependenciasFisicas;
    private RecursoPessoasDeficientes recursoPessoasDeficientes;
    private EquipamentosExistentesUnidade equipamentosExistentesUnidade;
    private QuantidadeEquipamentosProcessoAprendizagem quantidadeEquipamentosProcessoAprendizagem;
    private QuantidadeComputadoresEmUsoAlunos quantidadeComputadoresEmUsoAlunos;
    private AcessoInternet acessoInternet;
    private EquipamentosUsadosAlunosAcessoInternet equipamentosUsadosAlunosAcessoInternet;
    private RedeLocalInterligacaoComputadores redeLocalInterligacaoComputadores;
    private TotalProfissionaisAtivosEscola totalProfissionaisAtivosEscola;
    private InstrumentosMateriaisSocioCulturais instrumentosMateriaisSocioCulturais;
    private IdiomaEnsino idiomaEnsino;
    private ReservaVagasSistemaCotas reservaVagasSistemaCotas;
    private OrgaosColegiadosFuncionamentoEscola orgaosColegiadosFuncionamentoEscola;

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

    public EsferaAdministrativa getEsferaAdministrativa() {
        return esferaAdministrativa;
    }

    public void setEsferaAdministrativa(EsferaAdministrativa esferaAdministrativa) {
        this.esferaAdministrativa = esferaAdministrativa;
    }

    public EnderecoUnidade getEnderecoUnidade() {
        return enderecoUnidade;
    }

    public void setEnderecoUnidade(EnderecoUnidade enderecoUnidade) {
        this.enderecoUnidade = enderecoUnidade;
    }

    public MantenedoraEscolaPrivada getMantenedoraEscolaPrivada() {
        return mantenedoraEscolaPrivada;
    }

    public void setMantenedoraEscolaPrivada(MantenedoraEscolaPrivada mantenedoraEscolaPrivada) {
        this.mantenedoraEscolaPrivada = mantenedoraEscolaPrivada;
    }

    public FormasContratacao getFormasContratacao() {
        return formasContratacao;
    }

    public void setFormasContratacao(FormasContratacao formasContratacao) {
        this.formasContratacao = formasContratacao;
    }

    public NumeroMatriculasAtendidasParceriaConvenio getNumeroMatriculasAtendidasParceriaConvenio() {
        return numeroMatriculasAtendidasParceriaConvenio;
    }

    public void setNumeroMatriculasAtendidasParceriaConvenio(NumeroMatriculasAtendidasParceriaConvenio numeroMatriculasAtendidasParceriaConvenio) {
        this.numeroMatriculasAtendidasParceriaConvenio = numeroMatriculasAtendidasParceriaConvenio;
    }

    public LocalFuncionamentoEscola getLocalFuncionamentoEscola() {
        return localFuncionamentoEscola;
    }

    public void setLocalFuncionamentoEscola(LocalFuncionamentoEscola localFuncionamentoEscola) {
        this.localFuncionamentoEscola = localFuncionamentoEscola;
    }

    public EscolasComQualCompartilha getEscolasComQualCompartilha() {
        return escolasComQualCompartilha;
    }

    public void setEscolasComQualCompartilha(EscolasComQualCompartilha escolasComQualCompartilha) {
        this.escolasComQualCompartilha = escolasComQualCompartilha;
    }

    public AbastecimentoAgua getAbastecimentoAgua() {
        return abastecimentoAgua;
    }

    public void setAbastecimentoAgua(AbastecimentoAgua abastecimentoAgua) {
        this.abastecimentoAgua = abastecimentoAgua;
    }

    public FonteEnergiaEletrica getFonteEnergiaEletrica() {
        return fonteEnergiaEletrica;
    }

    public void setFonteEnergiaEletrica(FonteEnergiaEletrica fonteEnergiaEletrica) {
        this.fonteEnergiaEletrica = fonteEnergiaEletrica;
    }

    public EsgotamentoSanitario getEsgotamentoSanitario() {
        return esgotamentoSanitario;
    }

    public void setEsgotamentoSanitario(EsgotamentoSanitario esgotamentoSanitario) {
        this.esgotamentoSanitario = esgotamentoSanitario;
    }

    public DestinacaoLixo getDestinacaoLixo() {
        return destinacaoLixo;
    }

    public void setDestinacaoLixo(DestinacaoLixo destinacaoLixo) {
        this.destinacaoLixo = destinacaoLixo;
    }

    public TratamentoLixo getTratamentoLixo() {
        return tratamentoLixo;
    }

    public void setTratamentoLixo(TratamentoLixo tratamentoLixo) {
        this.tratamentoLixo = tratamentoLixo;
    }

    public DependenciasFisicas getDependenciasFisicas() {
        return dependenciasFisicas;
    }

    public void setDependenciasFisicas(DependenciasFisicas dependenciasFisicas) {
        this.dependenciasFisicas = dependenciasFisicas;
    }

    public RecursoPessoasDeficientes getRecursoPessoasDeficientes() {
        return recursoPessoasDeficientes;
    }

    public void setRecursoPessoasDeficientes(RecursoPessoasDeficientes recursoPessoasDeficientes) {
        this.recursoPessoasDeficientes = recursoPessoasDeficientes;
    }

    public EquipamentosExistentesUnidade getEquipamentosExistentesUnidade() {
        return equipamentosExistentesUnidade;
    }

    public void setEquipamentosExistentesUnidade(EquipamentosExistentesUnidade equipamentosExistentesUnidade) {
        this.equipamentosExistentesUnidade = equipamentosExistentesUnidade;
    }

    public QuantidadeEquipamentosProcessoAprendizagem getQuantidadeEquipamentosProcessoAprendizagem() {
        return quantidadeEquipamentosProcessoAprendizagem;
    }

    public void setQuantidadeEquipamentosProcessoAprendizagem(QuantidadeEquipamentosProcessoAprendizagem quantidadeEquipamentosProcessoAprendizagem) {
        this.quantidadeEquipamentosProcessoAprendizagem = quantidadeEquipamentosProcessoAprendizagem;
    }

    public QuantidadeComputadoresEmUsoAlunos getQuantidadeComputadoresEmUsoAlunos() {
        return quantidadeComputadoresEmUsoAlunos;
    }

    public void setQuantidadeComputadoresEmUsoAlunos(QuantidadeComputadoresEmUsoAlunos quantidadeComputadoresEmUsoAlunos) {
        this.quantidadeComputadoresEmUsoAlunos = quantidadeComputadoresEmUsoAlunos;
    }

    public AcessoInternet getAcessoInternet() {
        return acessoInternet;
    }

    public void setAcessoInternet(AcessoInternet acessoInternet) {
        this.acessoInternet = acessoInternet;
    }

    public EquipamentosUsadosAlunosAcessoInternet getEquipamentosUsadosAlunosAcessoInternet() {
        return equipamentosUsadosAlunosAcessoInternet;
    }

    public void setEquipamentosUsadosAlunosAcessoInternet(EquipamentosUsadosAlunosAcessoInternet equipamentosUsadosAlunosAcessoInternet) {
        this.equipamentosUsadosAlunosAcessoInternet = equipamentosUsadosAlunosAcessoInternet;
    }

    public RedeLocalInterligacaoComputadores getRedeLocalInterligacaoComputadores() {
        return redeLocalInterligacaoComputadores;
    }

    public void setRedeLocalInterligacaoComputadores(RedeLocalInterligacaoComputadores redeLocalInterligacaoComputadores) {
        this.redeLocalInterligacaoComputadores = redeLocalInterligacaoComputadores;
    }

    public TotalProfissionaisAtivosEscola getTotalProfissionaisAtivosEscola() {
        return totalProfissionaisAtivosEscola;
    }

    public void setTotalProfissionaisAtivosEscola(TotalProfissionaisAtivosEscola totalProfissionaisAtivosEscola) {
        this.totalProfissionaisAtivosEscola = totalProfissionaisAtivosEscola;
    }

    public InstrumentosMateriaisSocioCulturais getInstrumentosMateriaisSocioCulturais() {
        return instrumentosMateriaisSocioCulturais;
    }

    public void setInstrumentosMateriaisSocioCulturais(InstrumentosMateriaisSocioCulturais instrumentosMateriaisSocioCulturais) {
        this.instrumentosMateriaisSocioCulturais = instrumentosMateriaisSocioCulturais;
    }

    public IdiomaEnsino getIdiomaEnsino() {
        return idiomaEnsino;
    }

    public void setIdiomaEnsino(IdiomaEnsino idiomaEnsino) {
        this.idiomaEnsino = idiomaEnsino;
    }

    public ReservaVagasSistemaCotas getReservaVagasSistemaCotas() {
        return reservaVagasSistemaCotas;
    }

    public void setReservaVagasSistemaCotas(ReservaVagasSistemaCotas reservaVagasSistemaCotas) {
        this.reservaVagasSistemaCotas = reservaVagasSistemaCotas;
    }

    public OrgaosColegiadosFuncionamentoEscola getOrgaosColegiadosFuncionamentoEscola() {
        return orgaosColegiadosFuncionamentoEscola;
    }

    public void setOrgaosColegiadosFuncionamentoEscola(OrgaosColegiadosFuncionamentoEscola orgaosColegiadosFuncionamentoEscola) {
        this.orgaosColegiadosFuncionamentoEscola = orgaosColegiadosFuncionamentoEscola;
    }
}
