package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.adapters.outbound.persistence.entities.ChamadaEntity;

import java.util.Date;

public class Frequencia {
    private Long id;
    private Date dataMatricula;
    private Date isPresente;
    private ChamadaEntity chamada;
    private AlunoTurma alunoTurma;

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

    public Date getIsPresente() {
        return isPresente;
    }

    public void setIsPresente(Date isPresente) {
        this.isPresente = isPresente;
    }

    public ChamadaEntity getChamada() {
        return chamada;
    }

    public void setChamada(ChamadaEntity chamada) {
        this.chamada = chamada;
    }

    public AlunoTurma getAlunoTurma() {
        return alunoTurma;
    }

    public void setAlunoTurma(AlunoTurma alunoTurma) {
        this.alunoTurma = alunoTurma;
    }
}
