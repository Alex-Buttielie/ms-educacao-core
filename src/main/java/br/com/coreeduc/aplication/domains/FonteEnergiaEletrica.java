package br.com.coreeduc.aplication.domains;

public class FonteEnergiaEletrica {

    private Long id;
    private Boolean redePublica;
    private Boolean geradorMovidoACombustivelFossil;
    private Boolean fontesEnergiaRenovaveisAlternativas;
    private Boolean naoHaEnergiaEletrica;

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
