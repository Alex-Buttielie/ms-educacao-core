package br.com.coreeduc.aplication.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "turma")
@Entity
public class TurmaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "codigo_inep")
    private Long codigoInep;
    @Basic
    @Column(name = "codigo_turma")
    private String codigoTurma;
    @Basic
    @Column(name = "nome")
    private String nome;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn()
    @JsonFormat
    private DiretrizEntity diretriz;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn()
    @JsonFormat
    private TurnoEntity turno;
    @Basic
    @Column(name = "data_criacao")
    private Date dataCriacao;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn()
    @JsonFormat
    private SalaAulaEntity salaAula;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity unidadeEnsino;
    @Basic
    @Column(name = "tipo_mediacao")
    private Integer tipoMediacao;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private HorarioFuncionamentoTurmaEntity horarioFuncionamento;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private DiasSemanaTurmaEntity diasSemana;
    @Basic
    @Column(name = "escolarizacao")
    private Boolean escolarizacao;
    @Basic
    @Column(name = "atividade_complementar")
    private Boolean atividadeComplementar;
    @Basic
    @Column(name = "atendimento_especializado")
    private Boolean atendimentoEspecializado;
    @Basic
    @Column(name = "formacao_geral_basica")
    private Boolean formacaoGeralBasica;
    @Basic
    @Column(name = "itinerario_informativo")
    private Boolean itinerarioInformativo;
    @Basic
    @Column(name = "nao_se_aplica")
    private Boolean naoSeAplica;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private TipoAtividadeComplementarEntity tipoAtividadeComplementar;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private FormaOrganizacaoTurmaEntity formaOrganizacaoTurma;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn()
    @JsonFormat
    private UnidadeCurricularTurmaEntity unidadeCurricularTurma;

    public TurmaEntity() {
    }

    public TurmaEntity(Long id, Long codigoInep, String codigoTurma, String nome, DiretrizEntity diretriz, TurnoEntity turno, Date dataCriacao, SalaAulaEntity salaAula, UnidadeEnsinoEntity unidadeEnsino, Integer tipoMediacao, HorarioFuncionamentoTurmaEntity horarioFuncionamento, DiasSemanaTurmaEntity diasSemana, Boolean escolarizacao, Boolean atividadeComplementar, Boolean atendimentoEspecializado, Boolean formacaoGeralBasica, Boolean itinerarioInformativo, Boolean naoSeAplica, TipoAtividadeComplementarEntity tipoAtividadeComplementar, FormaOrganizacaoTurmaEntity formaOrganizacaoTurma, UnidadeCurricularTurmaEntity unidadeCurricularTurma) {
        this.id = id;
        this.codigoInep = codigoInep;
        this.codigoTurma = codigoTurma;
        this.nome = nome;
        this.diretriz = diretriz;
        this.turno = turno;
        this.dataCriacao = dataCriacao;
        this.salaAula = salaAula;
        this.unidadeEnsino = unidadeEnsino;
        this.tipoMediacao = tipoMediacao;
        this.horarioFuncionamento = horarioFuncionamento;
        this.diasSemana = diasSemana;
        this.escolarizacao = escolarizacao;
        this.atividadeComplementar = atividadeComplementar;
        this.atendimentoEspecializado = atendimentoEspecializado;
        this.formacaoGeralBasica = formacaoGeralBasica;
        this.itinerarioInformativo = itinerarioInformativo;
        this.naoSeAplica = naoSeAplica;
        this.tipoAtividadeComplementar = tipoAtividadeComplementar;
        this.formaOrganizacaoTurma = formaOrganizacaoTurma;
        this.unidadeCurricularTurma = unidadeCurricularTurma;
    }

    public TurmaEntity(Long codigoInep, String codigoTurma, String nome, DiretrizEntity diretriz, TurnoEntity turno, Date dataCriacao, SalaAulaEntity salaAula, UnidadeEnsinoEntity unidadeEnsino, Integer tipoMediacao, HorarioFuncionamentoTurmaEntity horarioFuncionamento, DiasSemanaTurmaEntity diasSemana, Boolean escolarizacao, Boolean atividadeComplementar, Boolean atendimentoEspecializado, Boolean formacaoGeralBasica, Boolean itinerarioInformativo, Boolean naoSeAplica, TipoAtividadeComplementarEntity tipoAtividadeComplementar, FormaOrganizacaoTurmaEntity formaOrganizacaoTurma, UnidadeCurricularTurmaEntity unidadeCurricularTurma) {
        this.codigoInep = codigoInep;
        this.codigoTurma = codigoTurma;
        this.nome = nome;
        this.diretriz = diretriz;
        this.turno = turno;
        this.dataCriacao = dataCriacao;
        this.salaAula = salaAula;
        this.unidadeEnsino = unidadeEnsino;
        this.tipoMediacao = tipoMediacao;
        this.horarioFuncionamento = horarioFuncionamento;
        this.diasSemana = diasSemana;
        this.escolarizacao = escolarizacao;
        this.atividadeComplementar = atividadeComplementar;
        this.atendimentoEspecializado = atendimentoEspecializado;
        this.formacaoGeralBasica = formacaoGeralBasica;
        this.itinerarioInformativo = itinerarioInformativo;
        this.naoSeAplica = naoSeAplica;
        this.tipoAtividadeComplementar = tipoAtividadeComplementar;
        this.formaOrganizacaoTurma = formaOrganizacaoTurma;
        this.unidadeCurricularTurma = unidadeCurricularTurma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigoInep() {
        return codigoInep;
    }

    public void setCodigoInep(Long codigoInep) {
        this.codigoInep = codigoInep;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DiretrizEntity getDiretriz() {
        return diretriz;
    }

    public void setDiretriz(DiretrizEntity diretriz) {
        this.diretriz = diretriz;
    }

    public TurnoEntity getTurno() {
        return turno;
    }

    public void setTurno(TurnoEntity turno) {
        this.turno = turno;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public SalaAulaEntity getSalaAula() {
        return salaAula;
    }

    public void setSalaAula(SalaAulaEntity salaAula) {
        this.salaAula = salaAula;
    }

    public UnidadeEnsinoEntity getUnidadeEnsino() {
        return unidadeEnsino;
    }

    public void setUnidadeEnsino(UnidadeEnsinoEntity unidadeEnsino) {
        this.unidadeEnsino = unidadeEnsino;
    }

    public Integer getTipoMediacao() {
        return tipoMediacao;
    }

    public void setTipoMediacao(Integer tipoMediacao) {
        this.tipoMediacao = tipoMediacao;
    }

    public HorarioFuncionamentoTurmaEntity getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(HorarioFuncionamentoTurmaEntity horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public DiasSemanaTurmaEntity getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(DiasSemanaTurmaEntity diasSemana) {
        this.diasSemana = diasSemana;
    }

    public Boolean getEscolarizacao() {
        return escolarizacao;
    }

    public void setEscolarizacao(Boolean escolarizacao) {
        this.escolarizacao = escolarizacao;
    }

    public Boolean getAtividadeComplementar() {
        return atividadeComplementar;
    }

    public void setAtividadeComplementar(Boolean atividadeComplementar) {
        this.atividadeComplementar = atividadeComplementar;
    }

    public Boolean getAtendimentoEspecializado() {
        return atendimentoEspecializado;
    }

    public void setAtendimentoEspecializado(Boolean atendimentoEspecializado) {
        this.atendimentoEspecializado = atendimentoEspecializado;
    }

    public Boolean getFormacaoGeralBasica() {
        return formacaoGeralBasica;
    }

    public void setFormacaoGeralBasica(Boolean formacaoGeralBasica) {
        this.formacaoGeralBasica = formacaoGeralBasica;
    }

    public Boolean getItinerarioInformativo() {
        return itinerarioInformativo;
    }

    public void setItinerarioInformativo(Boolean itinerarioInformativo) {
        this.itinerarioInformativo = itinerarioInformativo;
    }

    public Boolean getNaoSeAplica() {
        return naoSeAplica;
    }

    public void setNaoSeAplica(Boolean naoSeAplica) {
        this.naoSeAplica = naoSeAplica;
    }

    public TipoAtividadeComplementarEntity getTipoAtividadeComplementar() {
        return tipoAtividadeComplementar;
    }

    public void setTipoAtividadeComplementar(TipoAtividadeComplementarEntity tipoAtividadeComplementar) {
        this.tipoAtividadeComplementar = tipoAtividadeComplementar;
    }

    public FormaOrganizacaoTurmaEntity getFormaOrganizacaoTurma() {
        return formaOrganizacaoTurma;
    }

    public void setFormaOrganizacaoTurma(FormaOrganizacaoTurmaEntity formaOrganizacaoTurma) {
        this.formaOrganizacaoTurma = formaOrganizacaoTurma;
    }

    public UnidadeCurricularTurmaEntity getUnidadeCurricularTurma() {
        return unidadeCurricularTurma;
    }

    public void setUnidadeCurricularTurma(UnidadeCurricularTurmaEntity unidadeCurricularTurma) {
        this.unidadeCurricularTurma = unidadeCurricularTurma;
    }
}
