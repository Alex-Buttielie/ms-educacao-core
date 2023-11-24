package br.com.coreeduc.adapters.outbound.persistence.entities;

import br.com.coreeduc.aplication.domains.contraints.DependenciaAdministrativa;
import br.com.coreeduc.aplication.domains.contraints.LocalizacaoDiferenciadaResidencia;
import br.com.coreeduc.aplication.domains.contraints.LocalizacaoZonaResidencia;
import br.com.coreeduc.aplication.domains.contraints.SituacaoFuncionamento;
import br.com.coreeduc.aplication.domains.contraints.TipoRegistro;
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
@Getter
@Setter
@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor
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
    private MantenedoraEscolaPrivadaEntity MantenedoraEscolaPrivada;
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

}
