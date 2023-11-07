package br.com.coreeduc.adapters.outbound.persistence.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "matricula")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "data_matricula")
    private Date dataMatricula;
    @Basic
    @Column(name = "data_saida")
    private Date dataSaida;
    @Basic
    @Column(name = "situacao")
    private Integer situacao;
    @Basic
    @Column(name = "matricula")
    private String matricula;
    @Basic
    @Column(name = "is_ativa")
    private String isAtiva;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity unidadeEnsino;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private AlunoEntity aluno;
}
