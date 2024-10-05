package br.com.coreeduc.aplication.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "idioma_ensino")
@Entity
public class IdiomaEnsinoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "lingua_indigena")
    private Boolean linguaIndigena;
    @Basic
    @Column(name = "lingua_portuguesa")
    private Boolean linguaPortuguesa;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private LinguaIndigenaEntity codigoLinguaIndigena1;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private LinguaIndigenaEntity codigoLinguaIndigena2;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private LinguaIndigenaEntity codigoLinguaIndigena3;
    @Basic
    @Column(name = "realiza_exames_avaliacao_alunos")
    private Boolean realizaExamesAvaliacaoAlunos;

    public IdiomaEnsinoEntity() {
    }

    public IdiomaEnsinoEntity(Long id, Boolean linguaIndigena, Boolean linguaPortuguesa, LinguaIndigenaEntity codigoLinguaIndigena1, LinguaIndigenaEntity codigoLinguaIndigena2, LinguaIndigenaEntity codigoLinguaIndigena3, Boolean realizaExamesAvaliacaoAlunos) {
        this.id = id;
        this.linguaIndigena = linguaIndigena;
        this.linguaPortuguesa = linguaPortuguesa;
        this.codigoLinguaIndigena1 = codigoLinguaIndigena1;
        this.codigoLinguaIndigena2 = codigoLinguaIndigena2;
        this.codigoLinguaIndigena3 = codigoLinguaIndigena3;
        this.realizaExamesAvaliacaoAlunos = realizaExamesAvaliacaoAlunos;
    }

    public IdiomaEnsinoEntity(Boolean linguaIndigena, Boolean linguaPortuguesa, LinguaIndigenaEntity codigoLinguaIndigena1, LinguaIndigenaEntity codigoLinguaIndigena2, LinguaIndigenaEntity codigoLinguaIndigena3, Boolean realizaExamesAvaliacaoAlunos) {
        this.linguaIndigena = linguaIndigena;
        this.linguaPortuguesa = linguaPortuguesa;
        this.codigoLinguaIndigena1 = codigoLinguaIndigena1;
        this.codigoLinguaIndigena2 = codigoLinguaIndigena2;
        this.codigoLinguaIndigena3 = codigoLinguaIndigena3;
        this.realizaExamesAvaliacaoAlunos = realizaExamesAvaliacaoAlunos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getLinguaIndigena() {
        return linguaIndigena;
    }

    public void setLinguaIndigena(Boolean linguaIndigena) {
        this.linguaIndigena = linguaIndigena;
    }

    public Boolean getLinguaPortuguesa() {
        return linguaPortuguesa;
    }

    public void setLinguaPortuguesa(Boolean linguaPortuguesa) {
        this.linguaPortuguesa = linguaPortuguesa;
    }

    public LinguaIndigenaEntity getCodigoLinguaIndigena1() {
        return codigoLinguaIndigena1;
    }

    public void setCodigoLinguaIndigena1(LinguaIndigenaEntity codigoLinguaIndigena1) {
        this.codigoLinguaIndigena1 = codigoLinguaIndigena1;
    }

    public LinguaIndigenaEntity getCodigoLinguaIndigena2() {
        return codigoLinguaIndigena2;
    }

    public void setCodigoLinguaIndigena2(LinguaIndigenaEntity codigoLinguaIndigena2) {
        this.codigoLinguaIndigena2 = codigoLinguaIndigena2;
    }

    public LinguaIndigenaEntity getCodigoLinguaIndigena3() {
        return codigoLinguaIndigena3;
    }

    public void setCodigoLinguaIndigena3(LinguaIndigenaEntity codigoLinguaIndigena3) {
        this.codigoLinguaIndigena3 = codigoLinguaIndigena3;
    }

    public Boolean getRealizaExamesAvaliacaoAlunos() {
        return realizaExamesAvaliacaoAlunos;
    }

    public void setRealizaExamesAvaliacaoAlunos(Boolean realizaExamesAvaliacaoAlunos) {
        this.realizaExamesAvaliacaoAlunos = realizaExamesAvaliacaoAlunos;
    }
}
