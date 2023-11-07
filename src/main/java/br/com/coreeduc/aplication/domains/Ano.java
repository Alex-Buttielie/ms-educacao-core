package br.com.coreeduc.aplication.domains;

import java.io.Serializable;
import java.util.Date;

public class Ano implements Serializable {
    private Long id;
    private Date dtFechamentoAno;
    private Date dtFechamento1Semestre;
    private Date dtFechamento2Semestre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDtFechamentoAno() {
        return dtFechamentoAno;
    }

    public void setDtFechamentoAno(Date dtFechamentoAno) {
        this.dtFechamentoAno = dtFechamentoAno;
    }

    public Date getDtFechamento1Semestre() {
        return dtFechamento1Semestre;
    }

    public void setDtFechamento1Semestre(Date dtFechamento1Semestre) {
        this.dtFechamento1Semestre = dtFechamento1Semestre;
    }

    public Date getDtFechamento2Semestre() {
        return dtFechamento2Semestre;
    }

    public void setDtFechamento2Semestre(Date dtFechamento2Semestre) {
        this.dtFechamento2Semestre = dtFechamento2Semestre;
    }
}
