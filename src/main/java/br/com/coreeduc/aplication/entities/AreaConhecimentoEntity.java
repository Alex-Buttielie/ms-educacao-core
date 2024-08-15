package br.com.coreeduc.aplication.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "area_conhecimento")
@Entity
public class AreaConhecimentoEntity {
    @Id
    @Basic
    @Column(name="codigo")
    private Long codigo;
    @Basic
    @Column(name="nome")
    private String nome;

    public AreaConhecimentoEntity() {
    }

    public AreaConhecimentoEntity(Long codigo, String nome) {}

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
