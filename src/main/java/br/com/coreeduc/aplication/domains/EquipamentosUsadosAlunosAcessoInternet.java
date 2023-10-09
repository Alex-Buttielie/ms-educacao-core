package br.com.coreeduc.aplication.domains;

public class EquipamentosUsadosAlunosAcessoInternet {

    private Long id;
    private Boolean computadoresTabletsBibliotecaUnidade;
    private Boolean dispositivosPessoaisComputadoresPortateis;
    private Boolean internetBandaLarga;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getComputadoresTabletsBibliotecaUnidade() {
        return computadoresTabletsBibliotecaUnidade;
    }

    public void setComputadoresTabletsBibliotecaUnidade(Boolean computadoresTabletsBibliotecaUnidade) {
        this.computadoresTabletsBibliotecaUnidade = computadoresTabletsBibliotecaUnidade;
    }

    public Boolean getDispositivosPessoaisComputadoresPortateis() {
        return dispositivosPessoaisComputadoresPortateis;
    }

    public void setDispositivosPessoaisComputadoresPortateis(Boolean dispositivosPessoaisComputadoresPortateis) {
        this.dispositivosPessoaisComputadoresPortateis = dispositivosPessoaisComputadoresPortateis;
    }

    public Boolean getInternetBandaLarga() {
        return internetBandaLarga;
    }

    public void setInternetBandaLarga(Boolean internetBandaLarga) {
        this.internetBandaLarga = internetBandaLarga;
    }
}
