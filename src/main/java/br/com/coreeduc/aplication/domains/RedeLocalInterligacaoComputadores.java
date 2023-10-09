package br.com.coreeduc.aplication.domains;

public class RedeLocalInterligacaoComputadores {

    private Long id;
    private Boolean cabo;
    private Boolean wireless;
    private Boolean naoHaRedeLocalInterligacap;

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
