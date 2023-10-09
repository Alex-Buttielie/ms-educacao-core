package br.com.coreeduc.aplication.domains;

public class EquipamentosExistentesUnidade {

    private Long id;
    private Boolean antenaParabolica;
    private Boolean computadores;
    private Boolean copiadora;
    private Boolean impressora;
    private Boolean impressoraMultifuncional;
    private Boolean scanner;
    private Boolean nenhumDosEquipamentosListados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAntenaParabolica() {
        return antenaParabolica;
    }

    public void setAntenaParabolica(Boolean antenaParabolica) {
        this.antenaParabolica = antenaParabolica;
    }

    public Boolean getComputadores() {
        return computadores;
    }

    public void setComputadores(Boolean computadores) {
        this.computadores = computadores;
    }

    public Boolean getCopiadora() {
        return copiadora;
    }

    public void setCopiadora(Boolean copiadora) {
        this.copiadora = copiadora;
    }

    public Boolean getImpressora() {
        return impressora;
    }

    public void setImpressora(Boolean impressora) {
        this.impressora = impressora;
    }

    public Boolean getImpressoraMultifuncional() {
        return impressoraMultifuncional;
    }

    public void setImpressoraMultifuncional(Boolean impressoraMultifuncional) {
        this.impressoraMultifuncional = impressoraMultifuncional;
    }

    public Boolean getScanner() {
        return scanner;
    }

    public void setScanner(Boolean scanner) {
        this.scanner = scanner;
    }

    public Boolean getNenhumDosEquipamentosListados() {
        return nenhumDosEquipamentosListados;
    }

    public void setNenhumDosEquipamentosListados(Boolean nenhumDosEquipamentosListados) {
        this.nenhumDosEquipamentosListados = nenhumDosEquipamentosListados;
    }
}
