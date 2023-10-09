package br.com.coreeduc.aplication.domains;

public class IdiomaEnsino {

    private Long id;
    private Boolean linguaIndigena;
    private Boolean linguaPortuguesa;
    private LinguaIndigena codigoLinguaIndigena1;
    private LinguaIndigena codigoLinguaIndigena2;
    private LinguaIndigena codigoLinguaIndigena3;
    private Boolean realizaExamesAvaliacaoAlunos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getLinguaIndigena() {
        return linguaIndigena;
    }

    public void setLinguaIndigena(Boolean linguaIndigena) {
        this.linguaIndigena = linguaIndigena;
    }

    public Boolean getLinguaPortuguesa() {
        return linguaPortuguesa;
    }

    public void setLinguaPortuguesa(Boolean linguaPortuguesa) {
        this.linguaPortuguesa = linguaPortuguesa;
    }

    public LinguaIndigena getCodigoLinguaIndigena1() {
        return codigoLinguaIndigena1;
    }

    public void setCodigoLinguaIndigena1(LinguaIndigena codigoLinguaIndigena1) {
        this.codigoLinguaIndigena1 = codigoLinguaIndigena1;
    }

    public LinguaIndigena getCodigoLinguaIndigena2() {
        return codigoLinguaIndigena2;
    }

    public void setCodigoLinguaIndigena2(LinguaIndigena codigoLinguaIndigena2) {
        this.codigoLinguaIndigena2 = codigoLinguaIndigena2;
    }

    public LinguaIndigena getCodigoLinguaIndigena3() {
        return codigoLinguaIndigena3;
    }

    public void setCodigoLinguaIndigena3(LinguaIndigena codigoLinguaIndigena3) {
        this.codigoLinguaIndigena3 = codigoLinguaIndigena3;
    }

    public Boolean getRealizaExamesAvaliacaoAlunos() {
        return realizaExamesAvaliacaoAlunos;
    }

    public void setRealizaExamesAvaliacaoAlunos(Boolean realizaExamesAvaliacaoAlunos) {
        this.realizaExamesAvaliacaoAlunos = realizaExamesAvaliacaoAlunos;
    }
}
