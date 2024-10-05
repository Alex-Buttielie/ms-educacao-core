package br.com.coreeduc.aplication.entities;

import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "esgotamento_sanitario")
@Entity
@Builder
public class EsgotamentoSanitarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "rede_publica")
    private Boolean redePublica;
    @Basic
    @Column(name = "fossa_septica")
    private Boolean fossaSeptica;
    @Basic
    @Column(name = "fossa_rudimentar_comum")
    private Boolean fossaRudimentarComum;
    @Basic
    @Column(name = "nao_ha_esgostamento_sanitario")
    private Boolean naoHaEsgotamentoSanitario;

    public EsgotamentoSanitarioEntity() {
    }

    public EsgotamentoSanitarioEntity(Long id, Boolean redePublica, Boolean fossaSeptica, Boolean fossaRudimentarComum, Boolean naoHaEsgotamentoSanitario) {
        this.id = id;
        this.redePublica = redePublica;
        this.fossaSeptica = fossaSeptica;
        this.fossaRudimentarComum = fossaRudimentarComum;
        this.naoHaEsgotamentoSanitario = naoHaEsgotamentoSanitario;
    }

    public EsgotamentoSanitarioEntity(Boolean redePublica, Boolean fossaSeptica, Boolean fossaRudimentarComum, Boolean naoHaEsgotamentoSanitario) {
        this.redePublica = redePublica;
        this.fossaSeptica = fossaSeptica;
        this.fossaRudimentarComum = fossaRudimentarComum;
        this.naoHaEsgotamentoSanitario = naoHaEsgotamentoSanitario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getRedePublica() {
        return redePublica;
    }

    public void setRedePublica(Boolean redePublica) {
        this.redePublica = redePublica;
    }

    public Boolean getFossaSeptica() {
        return fossaSeptica;
    }

    public void setFossaSeptica(Boolean fossaSeptica) {
        this.fossaSeptica = fossaSeptica;
    }

    public Boolean getFossaRudimentarComum() {
        return fossaRudimentarComum;
    }

    public void setFossaRudimentarComum(Boolean fossaRudimentarComum) {
        this.fossaRudimentarComum = fossaRudimentarComum;
    }

    public Boolean getNaoHaEsgotamentoSanitario() {
        return naoHaEsgotamentoSanitario;
    }

    public void setNaoHaEsgotamentoSanitario(Boolean naoHaEsgotamentoSanitario) {
        this.naoHaEsgotamentoSanitario = naoHaEsgotamentoSanitario;
    }
}
