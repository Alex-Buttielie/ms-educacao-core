package br.com.coreeduc.aplication.entities;

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
import java.util.UUID;

@Table(name = "matricula")
@Entity
public class MatriculaEntity {

    @Id
    @Basic
    @Column(name = "code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    @Basic
    @Column(name = "id")
    private String id = UUID.randomUUID().toString();
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
    @Column(name = "is_ativa")
    private Boolean isAtiva;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity unidadeEnsino;

    public MatriculaEntity() {
    }

    public MatriculaEntity(Long code) {
        this.code = code;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Boolean getAtiva() {
        return isAtiva;
    }

    public void setAtiva(Boolean ativa) {
        isAtiva = ativa;
    }

    public UnidadeEnsinoEntity getUnidadeEnsino() {
        return unidadeEnsino;
    }

    public void setUnidadeEnsino(UnidadeEnsinoEntity unidadeEnsino) {
        this.unidadeEnsino = unidadeEnsino;
    }

}
