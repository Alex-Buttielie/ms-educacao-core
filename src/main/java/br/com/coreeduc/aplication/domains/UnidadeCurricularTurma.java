package br.com.coreeduc.aplication.domains;

public class UnidadeCurricularTurma {
    private Long id;
    private Boolean eletivas;
    private Boolean libras;
    private Boolean lingua_indigena;
    private Boolean linguaLitEspanhol;
    private Boolean linguaLitFrances;
    private Boolean linguaLitOutras;
    private Boolean projetoVida;
    private Boolean trilhaAprofAprendizagem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEletivas() {
        return eletivas;
    }

    public void setEletivas(Boolean eletivas) {
        this.eletivas = eletivas;
    }

    public Boolean getLibras() {
        return libras;
    }

    public void setLibras(Boolean libras) {
        this.libras = libras;
    }

    public Boolean getLingua_indigena() {
        return lingua_indigena;
    }

    public void setLingua_indigena(Boolean lingua_indigena) {
        this.lingua_indigena = lingua_indigena;
    }

    public Boolean getLinguaLitEspanhol() {
        return linguaLitEspanhol;
    }

    public void setLinguaLitEspanhol(Boolean linguaLitEspanhol) {
        this.linguaLitEspanhol = linguaLitEspanhol;
    }

    public Boolean getLinguaLitFrances() {
        return linguaLitFrances;
    }

    public void setLinguaLitFrances(Boolean linguaLitFrances) {
        this.linguaLitFrances = linguaLitFrances;
    }

    public Boolean getLinguaLitOutras() {
        return linguaLitOutras;
    }

    public void setLinguaLitOutras(Boolean linguaLitOutras) {
        this.linguaLitOutras = linguaLitOutras;
    }

    public Boolean getProjetoVida() {
        return projetoVida;
    }

    public void setProjetoVida(Boolean projetoVida) {
        this.projetoVida = projetoVida;
    }

    public Boolean getTrilhaAprofAprendizagem() {
        return trilhaAprofAprendizagem;
    }

    public void setTrilhaAprofAprendizagem(Boolean trilhaAprofAprendizagem) {
        this.trilhaAprofAprendizagem = trilhaAprofAprendizagem;
    }

}
