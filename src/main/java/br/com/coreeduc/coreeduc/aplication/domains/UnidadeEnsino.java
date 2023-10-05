package br.com.coreeduc.coreeduc.aplication.domains;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.*;
import br.com.coreeduc.coreeduc.aplication.domains.contraints.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

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
    private EsferaAdministrativaEntity esferaAdministrativaEntity;
    private EnderecoUnidadeEntity enderecoUnidadeEntity;
    private MantenedoraEscolaPrivadaEntity MantenedoraEscolaPrivada;
    private FormasContratacaoEntity formasContratacaoEntity;
    private NumeroMatriculasAtendidasParceriaConvenioEntity numeroMatriculasAtendidasParceriaConvenioEntity;
    private LocalFuncionamentoEscolaEntity localFuncionamentoEscolaEntity;
    private EscolasComQualCompartilhaEntity escolasComQualCompartilhaEntity;
    private AbastecimentoAguaEntity abastecimentoAguaEntity;
    private FonteEnergiaEletricaEntity fonteEnergiaEletricaEntity;
    private EsgotamentoSanitarioEntity esgotamentoSanitario;
    private DestinacaoLixoEntity destinacaoLixoEntity;
    private TratamentoLixoEntity tratamentoLixoEntity;
    private DependenciasFisicasEntity dependenciasFisicasEntity;
    private RecursoPessoasDeficientesEntity recursoPessoasDeficientesEntity;
    private EquipamentosExistentesUnidadeEntity equipamentosExistentesUnidadeEntity;
    private QuantidadeEquipamentosProcessoAprendizagemEntity quantidadeEquipamentosProcessoAprendizagemEntity;
    private QuantidadeComputadoresEmUsoAlunosEntity quantidadeComputadoresEmUsoAlunosEntity;
    private AcessoInternetEntity acessoInternetEntity;
    private EquipamentosUsadosAlunosAcessoInternetEntity equipamentosUsadosAlunosAcessoInternetEntity;
    private RedeLocalInterligacaoComputadoresEntity redeLocalInterligacaoComputadoresEntity;
    private TotalProfissionaisAtivosEscolaEntity totalProfissionaisAtivosEscolaEntity;
    private InstrumentosMateriaisSocioCulturaisEntity instrumentosMateriaisSocioCulturaisEntity;
    private IdiomaEnsinoEntity idiomaEnsinoEntity;
    private ReservaVagasSistemaCotasEntity reservaVagasSistemaCotasEntity;
    private OrgaosColegiadosFuncionamentoEscolaEntity orgaosColegiadosFuncionamentoEscolaEntity;

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

    public EsferaAdministrativaEntity getEsferaAdministrativaEntity() {
        return esferaAdministrativaEntity;
    }

    public void setEsferaAdministrativaEntity(EsferaAdministrativaEntity esferaAdministrativaEntity) {
        this.esferaAdministrativaEntity = esferaAdministrativaEntity;
    }

    public EnderecoUnidadeEntity getEnderecoUnidadeEntity() {
        return enderecoUnidadeEntity;
    }

    public void setEnderecoUnidadeEntity(EnderecoUnidadeEntity enderecoUnidadeEntity) {
        this.enderecoUnidadeEntity = enderecoUnidadeEntity;
    }

    public MantenedoraEscolaPrivadaEntity getMantenedoraEscolaPrivada() {
        return MantenedoraEscolaPrivada;
    }

    public void setMantenedoraEscolaPrivada(MantenedoraEscolaPrivadaEntity mantenedoraEscolaPrivada) {
        MantenedoraEscolaPrivada = mantenedoraEscolaPrivada;
    }

    public FormasContratacaoEntity getFormasContratacaoEntity() {
        return formasContratacaoEntity;
    }

    public void setFormasContratacaoEntity(FormasContratacaoEntity formasContratacaoEntity) {
        this.formasContratacaoEntity = formasContratacaoEntity;
    }

    public NumeroMatriculasAtendidasParceriaConvenioEntity getNumeroMatriculasAtendidasParceriaConvenioEntity() {
        return numeroMatriculasAtendidasParceriaConvenioEntity;
    }

    public void setNumeroMatriculasAtendidasParceriaConvenioEntity(NumeroMatriculasAtendidasParceriaConvenioEntity numeroMatriculasAtendidasParceriaConvenioEntity) {
        this.numeroMatriculasAtendidasParceriaConvenioEntity = numeroMatriculasAtendidasParceriaConvenioEntity;
    }

    public LocalFuncionamentoEscolaEntity getLocalFuncionamentoEscolaEntity() {
        return localFuncionamentoEscolaEntity;
    }

    public void setLocalFuncionamentoEscolaEntity(LocalFuncionamentoEscolaEntity localFuncionamentoEscolaEntity) {
        this.localFuncionamentoEscolaEntity = localFuncionamentoEscolaEntity;
    }

    public EscolasComQualCompartilhaEntity getEscolasComQualCompartilhaEntity() {
        return escolasComQualCompartilhaEntity;
    }

    public void setEscolasComQualCompartilhaEntity(EscolasComQualCompartilhaEntity escolasComQualCompartilhaEntity) {
        this.escolasComQualCompartilhaEntity = escolasComQualCompartilhaEntity;
    }

    public AbastecimentoAguaEntity getAbastecimentoAguaEntity() {
        return abastecimentoAguaEntity;
    }

    public void setAbastecimentoAguaEntity(AbastecimentoAguaEntity abastecimentoAguaEntity) {
        this.abastecimentoAguaEntity = abastecimentoAguaEntity;
    }

    public FonteEnergiaEletricaEntity getFonteEnergiaEletricaEntity() {
        return fonteEnergiaEletricaEntity;
    }

    public void setFonteEnergiaEletricaEntity(FonteEnergiaEletricaEntity fonteEnergiaEletricaEntity) {
        this.fonteEnergiaEletricaEntity = fonteEnergiaEletricaEntity;
    }

    public EsgotamentoSanitarioEntity getEsgotamentoSanitario() {
        return esgotamentoSanitario;
    }

    public void setEsgotamentoSanitario(EsgotamentoSanitarioEntity esgotamentoSanitario) {
        this.esgotamentoSanitario = esgotamentoSanitario;
    }

    public DestinacaoLixoEntity getDestinacaoLixoEntity() {
        return destinacaoLixoEntity;
    }

    public void setDestinacaoLixoEntity(DestinacaoLixoEntity destinacaoLixoEntity) {
        this.destinacaoLixoEntity = destinacaoLixoEntity;
    }

    public TratamentoLixoEntity getTratamentoLixoEntity() {
        return tratamentoLixoEntity;
    }

    public void setTratamentoLixoEntity(TratamentoLixoEntity tratamentoLixoEntity) {
        this.tratamentoLixoEntity = tratamentoLixoEntity;
    }

    public DependenciasFisicasEntity getDependenciasFisicasEntity() {
        return dependenciasFisicasEntity;
    }

    public void setDependenciasFisicasEntity(DependenciasFisicasEntity dependenciasFisicasEntity) {
        this.dependenciasFisicasEntity = dependenciasFisicasEntity;
    }

    public RecursoPessoasDeficientesEntity getRecursoPessoasDeficientesEntity() {
        return recursoPessoasDeficientesEntity;
    }

    public void setRecursoPessoasDeficientesEntity(RecursoPessoasDeficientesEntity recursoPessoasDeficientesEntity) {
        this.recursoPessoasDeficientesEntity = recursoPessoasDeficientesEntity;
    }

    public EquipamentosExistentesUnidadeEntity getEquipamentosExistentesUnidadeEntity() {
        return equipamentosExistentesUnidadeEntity;
    }

    public void setEquipamentosExistentesUnidadeEntity(EquipamentosExistentesUnidadeEntity equipamentosExistentesUnidadeEntity) {
        this.equipamentosExistentesUnidadeEntity = equipamentosExistentesUnidadeEntity;
    }

    public QuantidadeEquipamentosProcessoAprendizagemEntity getQuantidadeEquipamentosProcessoAprendizagemEntity() {
        return quantidadeEquipamentosProcessoAprendizagemEntity;
    }

    public void setQuantidadeEquipamentosProcessoAprendizagemEntity(QuantidadeEquipamentosProcessoAprendizagemEntity quantidadeEquipamentosProcessoAprendizagemEntity) {
        this.quantidadeEquipamentosProcessoAprendizagemEntity = quantidadeEquipamentosProcessoAprendizagemEntity;
    }

    public QuantidadeComputadoresEmUsoAlunosEntity getQuantidadeComputadoresEmUsoAlunosEntity() {
        return quantidadeComputadoresEmUsoAlunosEntity;
    }

    public void setQuantidadeComputadoresEmUsoAlunosEntity(QuantidadeComputadoresEmUsoAlunosEntity quantidadeComputadoresEmUsoAlunosEntity) {
        this.quantidadeComputadoresEmUsoAlunosEntity = quantidadeComputadoresEmUsoAlunosEntity;
    }

    public AcessoInternetEntity getAcessoInternetEntity() {
        return acessoInternetEntity;
    }

    public void setAcessoInternetEntity(AcessoInternetEntity acessoInternetEntity) {
        this.acessoInternetEntity = acessoInternetEntity;
    }

    public EquipamentosUsadosAlunosAcessoInternetEntity getEquipamentosUsadosAlunosAcessoInternetEntity() {
        return equipamentosUsadosAlunosAcessoInternetEntity;
    }

    public void setEquipamentosUsadosAlunosAcessoInternetEntity(EquipamentosUsadosAlunosAcessoInternetEntity equipamentosUsadosAlunosAcessoInternetEntity) {
        this.equipamentosUsadosAlunosAcessoInternetEntity = equipamentosUsadosAlunosAcessoInternetEntity;
    }

    public RedeLocalInterligacaoComputadoresEntity getRedeLocalInterligacaoComputadoresEntity() {
        return redeLocalInterligacaoComputadoresEntity;
    }

    public void setRedeLocalInterligacaoComputadoresEntity(RedeLocalInterligacaoComputadoresEntity redeLocalInterligacaoComputadoresEntity) {
        this.redeLocalInterligacaoComputadoresEntity = redeLocalInterligacaoComputadoresEntity;
    }

    public TotalProfissionaisAtivosEscolaEntity getTotalProfissionaisAtivosEscolaEntity() {
        return totalProfissionaisAtivosEscolaEntity;
    }

    public void setTotalProfissionaisAtivosEscolaEntity(TotalProfissionaisAtivosEscolaEntity totalProfissionaisAtivosEscolaEntity) {
        this.totalProfissionaisAtivosEscolaEntity = totalProfissionaisAtivosEscolaEntity;
    }

    public InstrumentosMateriaisSocioCulturaisEntity getInstrumentosMateriaisSocioCulturaisEntity() {
        return instrumentosMateriaisSocioCulturaisEntity;
    }

    public void setInstrumentosMateriaisSocioCulturaisEntity(InstrumentosMateriaisSocioCulturaisEntity instrumentosMateriaisSocioCulturaisEntity) {
        this.instrumentosMateriaisSocioCulturaisEntity = instrumentosMateriaisSocioCulturaisEntity;
    }

    public IdiomaEnsinoEntity getIdiomaEnsinoEntity() {
        return idiomaEnsinoEntity;
    }

    public void setIdiomaEnsinoEntity(IdiomaEnsinoEntity idiomaEnsinoEntity) {
        this.idiomaEnsinoEntity = idiomaEnsinoEntity;
    }

    public ReservaVagasSistemaCotasEntity getReservaVagasSistemaCotasEntity() {
        return reservaVagasSistemaCotasEntity;
    }

    public void setReservaVagasSistemaCotasEntity(ReservaVagasSistemaCotasEntity reservaVagasSistemaCotasEntity) {
        this.reservaVagasSistemaCotasEntity = reservaVagasSistemaCotasEntity;
    }

    public OrgaosColegiadosFuncionamentoEscolaEntity getOrgaosColegiadosFuncionamentoEscolaEntity() {
        return orgaosColegiadosFuncionamentoEscolaEntity;
    }

    public void setOrgaosColegiadosFuncionamentoEscolaEntity(OrgaosColegiadosFuncionamentoEscolaEntity orgaosColegiadosFuncionamentoEscolaEntity) {
        this.orgaosColegiadosFuncionamentoEscolaEntity = orgaosColegiadosFuncionamentoEscolaEntity;
    }
}
