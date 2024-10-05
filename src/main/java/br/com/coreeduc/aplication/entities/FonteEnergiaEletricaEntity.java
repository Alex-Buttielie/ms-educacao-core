package br.com.coreeduc.aplication.entities;

import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "fonte_energia_eletrica")
@Entity
@Builder
public class FonteEnergiaEletricaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "rede_publica")
    private Boolean redePublica;
    @Basic
    @Column(name = "gerador_movido_combustivel_fossil")
    private Boolean geradorMovidoACombustivelFossil;
    @Basic
    @Column(name = "fontes_energias_renovaveis_alternativas")
    private Boolean fontesEnergiaRenovaveisAlternativas;
    @Basic
    @Column(name = "nao_ha_energia_eletrica")
    private Boolean naoHaEnergiaEletrica;

    public FonteEnergiaEletricaEntity() {
    }

    public FonteEnergiaEletricaEntity(Long id, Boolean redePublica, Boolean geradorMovidoACombustivelFossil, Boolean fontesEnergiaRenovaveisAlternativas, Boolean naoHaEnergiaEletrica) {
        this.id = id;
        this.redePublica = redePublica;
        this.geradorMovidoACombustivelFossil = geradorMovidoACombustivelFossil;
        this.fontesEnergiaRenovaveisAlternativas = fontesEnergiaRenovaveisAlternativas;
        this.naoHaEnergiaEletrica = naoHaEnergiaEletrica;
    }

    public FonteEnergiaEletricaEntity(Boolean redePublica, Boolean geradorMovidoACombustivelFossil, Boolean fontesEnergiaRenovaveisAlternativas, Boolean naoHaEnergiaEletrica) {
        this.redePublica = redePublica;
        this.geradorMovidoACombustivelFossil = geradorMovidoACombustivelFossil;
        this.fontesEnergiaRenovaveisAlternativas = fontesEnergiaRenovaveisAlternativas;
        this.naoHaEnergiaEletrica = naoHaEnergiaEletrica;
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

    public Boolean getGeradorMovidoACombustivelFossil() {
        return geradorMovidoACombustivelFossil;
    }

    public void setGeradorMovidoACombustivelFossil(Boolean geradorMovidoACombustivelFossil) {
        this.geradorMovidoACombustivelFossil = geradorMovidoACombustivelFossil;
    }

    public Boolean getFontesEnergiaRenovaveisAlternativas() {
        return fontesEnergiaRenovaveisAlternativas;
    }

    public void setFontesEnergiaRenovaveisAlternativas(Boolean fontesEnergiaRenovaveisAlternativas) {
        this.fontesEnergiaRenovaveisAlternativas = fontesEnergiaRenovaveisAlternativas;
    }

    public Boolean getNaoHaEnergiaEletrica() {
        return naoHaEnergiaEletrica;
    }

    public void setNaoHaEnergiaEletrica(Boolean naoHaEnergiaEletrica) {
        this.naoHaEnergiaEletrica = naoHaEnergiaEletrica;
    }
}
