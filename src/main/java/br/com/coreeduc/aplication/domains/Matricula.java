package br.com.coreeduc.aplication.domains;

import java.util.Date;

public class Matricula {
    private Long id;
    private Date dataMatricula;
    private Date dataSaida;
    private Integer situacao;
    private String matricula;
    private String isAtiva;
    private UnidadeEnsino unidadeEnsino;
    private Aluno aluno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIsAtiva() {
        return isAtiva;
    }

    public void setIsAtiva(String isAtiva) {
        this.isAtiva = isAtiva;
    }

    public UnidadeEnsino getUnidadeEnsino() {
        return unidadeEnsino;
    }

    public void setUnidadeEnsino(UnidadeEnsino unidadeEnsino) {
        this.unidadeEnsino = unidadeEnsino;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
