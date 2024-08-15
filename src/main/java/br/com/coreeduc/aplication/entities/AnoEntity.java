package br.com.coreeduc.aplication.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "ano")
@Entity
public class AnoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "dt_fechamento_ano ")
    private Date dtFechamentoAno;
    @Basic
    @Column(name = "dt_fechamento_1_semestre  ")
    private Date dtFechamento1Semestre;
    @Basic
    @Column(name = "dtFechamento2Semestre  ")
    private Date dtFechamento2Semestre;

    public AnoEntity() {
    }

    public AnoEntity(Long id,
                     Date dtFechamentoAno,
                     Date dtFechamento1Semestre,
                     Date dtFechamento2Semestre) {
        this.id = id;
        this.dtFechamentoAno = dtFechamentoAno;
        this.dtFechamento1Semestre = dtFechamento1Semestre;
        this.dtFechamento2Semestre = dtFechamento2Semestre;
    }

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
