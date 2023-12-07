package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.adapters.outbound.persistence.entities.TurnoEntity;

import java.util.Date;

public class Turma {
    private Long id;
    private Long codigoInep;
    private String nome;
    private Diretriz diretriz;
    private TurnoEntity turnoEntity;
    private Date dataCriacao;
    private SalaAula salaAula;
    private UnidadeEnsino unidadeEnsino;
    private HorarioFuncionamentoTurma horarioFuncionamentoTurma;
    private DiasSemanaTurma diasSemanaTurma;
    private Boolean escolarizacao;
    private Boolean atividadeComplementar;
    private Boolean atendimentoEspecializado;
    private Boolean formacaoGeralBasica;
    private Boolean itinerarioInformativo;
    private Boolean naoSeAplica;
    private TipoAtividadeComplementar tipoAtividadeComplementar;
    private FormaOrganizacaoTurma formaOrganizacaoTurma;
    private UnidadeCurricularTurma unidadeCurricularTurma;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Diretriz getDiretriz() {
        return diretriz;
    }

    public void setDiretriz(Diretriz diretriz) {
        this.diretriz = diretriz;
    }

    public TurnoEntity getTurnoEntity() {
        return turnoEntity;
    }

    public void setTurnoEntity(TurnoEntity turnoEntity) {
        this.turnoEntity = turnoEntity;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public SalaAula getSalaAula() {
        return salaAula;
    }

    public void setSalaAula(SalaAula salaAula) {
        this.salaAula = salaAula;
    }

    public UnidadeEnsino getUnidadeEnsino() {
        return unidadeEnsino;
    }

    public void setUnidadeEnsino(UnidadeEnsino unidadeEnsino) {
        this.unidadeEnsino = unidadeEnsino;
    }

    public HorarioFuncionamentoTurma getHorarioFuncionamentoTurma() {
        return horarioFuncionamentoTurma;
    }

    public void setHorarioFuncionamentoTurma(HorarioFuncionamentoTurma horarioFuncionamentoTurma) {
        this.horarioFuncionamentoTurma = horarioFuncionamentoTurma;
    }

    public DiasSemanaTurma getDiasSemanaTurma() {
        return diasSemanaTurma;
    }

    public void setDiasSemanaTurma(DiasSemanaTurma diasSemanaTurma) {
        this.diasSemanaTurma = diasSemanaTurma;
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

    public TipoAtividadeComplementar getTipoAtividadeComplementar() {
        return tipoAtividadeComplementar;
    }

    public void setTipoAtividadeComplementar(TipoAtividadeComplementar tipoAtividadeComplementar) {
        this.tipoAtividadeComplementar = tipoAtividadeComplementar;
    }

    public FormaOrganizacaoTurma getFormaOrganizacaoTurma() {
        return formaOrganizacaoTurma;
    }

    public void setFormaOrganizacaoTurma(FormaOrganizacaoTurma formaOrganizacaoTurma) {
        this.formaOrganizacaoTurma = formaOrganizacaoTurma;
    }

    public UnidadeCurricularTurma getUnidadeCurricularTurma() {
        return unidadeCurricularTurma;
    }

    public void setUnidadeCurricularTurma(UnidadeCurricularTurma unidadeCurricularTurma) {
        this.unidadeCurricularTurma = unidadeCurricularTurma;
    }

}
