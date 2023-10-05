package br.com.coreeduc.coreeduc.aplication.domains;

public class AbastecimentoAgua {

    private Long id;
    private Boolean redePublica;
    private Boolean pocoArtesiano;
    private Boolean cacimbaCisternaPoco;
    private Boolean fonteRioIgarapeRiachoCorrego;
    private Boolean naoHaAbastecimentoAgua;

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
