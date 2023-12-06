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
}
