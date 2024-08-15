package br.com.coreeduc.aplication.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "abastecimento_agua")
@Entity
public class AbastecimentoAguaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "rede_publica")
    private Boolean redePublica;
    @Basic
    @Column(name = "poco_artesiano")
    private Boolean pocoArtesiano;
    @Basic
    @Column(name = "cacimba_cisterna_poco")
    private Boolean cacimbaCisternaPoco;
    @Basic
    @Column(name = "fonte_rio_igarape_riacho_corrego")
    private Boolean fonteRioIgarapeRiachoCorrego;
    @Basic
    @Column(name = "nao_ha_abastecimento_agua")
    private Boolean naoHaAbastecimentoAgua;

    public AbastecimentoAguaEntity() {
    }

    public AbastecimentoAguaEntity(Long id,
                                   Boolean redePublica,
                                   Boolean pocoArtesiano,
                                   Boolean cacimbaCisternaPoco,
                                   Boolean fonteRioIgarapeRiachoCorrego,
                                   Boolean naoHaAbastecimentoAgua) {
        this.id = id;
        this.redePublica = redePublica;
        this.pocoArtesiano = pocoArtesiano;
        this.cacimbaCisternaPoco = cacimbaCisternaPoco;
        this.fonteRioIgarapeRiachoCorrego = fonteRioIgarapeRiachoCorrego;
        this.naoHaAbastecimentoAgua = naoHaAbastecimentoAgua;
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

    public Boolean getPocoArtesiano() {
        return pocoArtesiano;
    }

    public void setPocoArtesiano(Boolean pocoArtesiano) {
        this.pocoArtesiano = pocoArtesiano;
    }

    public Boolean getCacimbaCisternaPoco() {
        return cacimbaCisternaPoco;
    }

    public void setCacimbaCisternaPoco(Boolean cacimbaCisternaPoco) {
        this.cacimbaCisternaPoco = cacimbaCisternaPoco;
    }

    public Boolean getFonteRioIgarapeRiachoCorrego() {
        return fonteRioIgarapeRiachoCorrego;
    }

    public void setFonteRioIgarapeRiachoCorrego(Boolean fonteRioIgarapeRiachoCorrego) {
        this.fonteRioIgarapeRiachoCorrego = fonteRioIgarapeRiachoCorrego;
    }

    public Boolean getNaoHaAbastecimentoAgua() {
        return naoHaAbastecimentoAgua;
    }

    public void setNaoHaAbastecimentoAgua(Boolean naoHaAbastecimentoAgua) {
        this.naoHaAbastecimentoAgua = naoHaAbastecimentoAgua;
    }

}
