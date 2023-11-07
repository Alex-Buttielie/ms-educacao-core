package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.adapters.outbound.persistence.entities.TurmaEntity;

import java.util.Date;

public class AlunoTurma {
    private Long id;
    private Integer situacao;
    private Date dataAlocacao;
    private Date dataSaida;
    private Matricula matricula;
    private TurmaEntity turma;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public Date getDataAlocacao() {
        return dataAlocacao;
    }

    public void setDataAlocacao(Date dataAlocacao) {
        this.dataAlocacao = dataAlocacao;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public TurmaEntity getTurma() {
        return turma;
    }

    public void setTurma(TurmaEntity turma) {
        this.turma = turma;
    }
}
