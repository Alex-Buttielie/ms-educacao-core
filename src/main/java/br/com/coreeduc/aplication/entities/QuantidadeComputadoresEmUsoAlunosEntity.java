package br.com.coreeduc.aplication.entities;

import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "quantidade_computadores_em_uso_alunos")
@Entity
@Builder
public class QuantidadeComputadoresEmUsoAlunosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "computadores_mesa_desktop")
    private Long computadoresMesaDesktop;
    @Basic
    @Column(name = "computadores_portateis")
    private Long computadoresPortateis;
    @Basic
    @Column(name = "tablets")
    private Long tablets;

    public QuantidadeComputadoresEmUsoAlunosEntity() {
    }

    public QuantidadeComputadoresEmUsoAlunosEntity(Long id, Long computadoresMesaDesktop, Long computadoresPortateis, Long tablets) {
        this.id = id;
        this.computadoresMesaDesktop = computadoresMesaDesktop;
        this.computadoresPortateis = computadoresPortateis;
        this.tablets = tablets;
    }

    public QuantidadeComputadoresEmUsoAlunosEntity(Long computadoresMesaDesktop, Long computadoresPortateis, Long tablets) {
        this.computadoresMesaDesktop = computadoresMesaDesktop;
        this.computadoresPortateis = computadoresPortateis;
        this.tablets = tablets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getComputadoresMesaDesktop() {
        return computadoresMesaDesktop;
    }

    public void setComputadoresMesaDesktop(Long computadoresMesaDesktop) {
        this.computadoresMesaDesktop = computadoresMesaDesktop;
    }

    public Long getComputadoresPortateis() {
        return computadoresPortateis;
    }

    public void setComputadoresPortateis(Long computadoresPortateis) {
        this.computadoresPortateis = computadoresPortateis;
    }

    public Long getTablets() {
        return tablets;
    }

    public void setTablets(Long tablets) {
        this.tablets = tablets;
    }
}
