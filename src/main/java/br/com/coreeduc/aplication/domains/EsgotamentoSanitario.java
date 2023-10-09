package br.com.coreeduc.aplication.domains;

public class EsgotamentoSanitario {

    private Long id;
    private Boolean redePublica;
    private Boolean fossaSeptica;
    private Boolean fossaRudimentarComum;
    private Boolean naoHaEsgotamentoSanitario;

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
