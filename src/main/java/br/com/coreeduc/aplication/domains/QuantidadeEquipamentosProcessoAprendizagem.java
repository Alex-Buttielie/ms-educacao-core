package br.com.coreeduc.aplication.domains;

public class QuantidadeEquipamentosProcessoAprendizagem {

    private Long id;
    private Integer aparelhoDvdBluray;
    private Integer aparelhoSom;
    private Integer aparelhoTelevisao;
    private Integer lousaDigital;
    private Integer projetorMultimidiaDataShow;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAparelhoDvdBluray() {
        return aparelhoDvdBluray;
    }

    public void setAparelhoDvdBluray(Integer aparelhoDvdBluray) {
        this.aparelhoDvdBluray = aparelhoDvdBluray;
    }

    public Integer getAparelhoSom() {
        return aparelhoSom;
    }

    public void setAparelhoSom(Integer aparelhoSom) {
        this.aparelhoSom = aparelhoSom;
    }

    public Integer getAparelhoTelevisao() {
        return aparelhoTelevisao;
    }

    public void setAparelhoTelevisao(Integer aparelhoTelevisao) {
        this.aparelhoTelevisao = aparelhoTelevisao;
    }

    public Integer getLousaDigital() {
        return lousaDigital;
    }

    public void setLousaDigital(Integer lousaDigital) {
        this.lousaDigital = lousaDigital;
    }

    public Integer getProjetorMultimidiaDataShow() {
        return projetorMultimidiaDataShow;
    }

    public void setProjetorMultimidiaDataShow(Integer projetorMultimidiaDataShow) {
        this.projetorMultimidiaDataShow = projetorMultimidiaDataShow;
    }
}
