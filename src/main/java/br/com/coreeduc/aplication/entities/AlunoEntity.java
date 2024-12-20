package br.com.coreeduc.aplication.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

@Table(name = "aluno")
@Entity
public class AlunoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private PessoaEntity pessoa;
    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Collection<AlunoTurmaEntity> alunoTurma;

    public AlunoEntity() {
    }

    public AlunoEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public Collection<AlunoTurmaEntity> getAlunoTurma() {
        return alunoTurma;
    }

    public void setAlunoTurma(Collection<AlunoTurmaEntity> alunoTurma) {
        this.alunoTurma = alunoTurma;
    }
}
