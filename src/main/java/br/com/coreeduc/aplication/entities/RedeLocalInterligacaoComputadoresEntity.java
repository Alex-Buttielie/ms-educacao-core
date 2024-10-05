package br.com.coreeduc.aplication.entities;

import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "rede_local_interligacao_computadores")
@Entity
@Builder
public class RedeLocalInterligacaoComputadoresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "cabo")
    private Boolean cabo;
    @Basic
    @Column(name = "wireless")
    private Boolean wireless;
    @Basic
    @Column(name = "nao_ha_rede_local_interligacao")
    private Boolean naoHaRedeLocalInterligacap;

    public RedeLocalInterligacaoComputadoresEntity() {
    }

    public RedeLocalInterligacaoComputadoresEntity(Long id, Boolean cabo, Boolean wireless, Boolean naoHaRedeLocalInterligacap) {
        this.id = id;
        this.cabo = cabo;
        this.wireless = wireless;
        this.naoHaRedeLocalInterligacap = naoHaRedeLocalInterligacap;
    }

    public RedeLocalInterligacaoComputadoresEntity(Boolean cabo, Boolean wireless, Boolean naoHaRedeLocalInterligacap) {
        this.cabo = cabo;
        this.wireless = wireless;
        this.naoHaRedeLocalInterligacap = naoHaRedeLocalInterligacap;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCabo() {
        return cabo;
    }

    public void setCabo(Boolean cabo) {
        this.cabo = cabo;
    }

    public Boolean getWireless() {
        return wireless;
    }

    public void setWireless(Boolean wireless) {
        this.wireless = wireless;
    }

    public Boolean getNaoHaRedeLocalInterligacap() {
        return naoHaRedeLocalInterligacap;
    }

    public void setNaoHaRedeLocalInterligacap(Boolean naoHaRedeLocalInterligacap) {
        this.naoHaRedeLocalInterligacap = naoHaRedeLocalInterligacap;
    }
}
