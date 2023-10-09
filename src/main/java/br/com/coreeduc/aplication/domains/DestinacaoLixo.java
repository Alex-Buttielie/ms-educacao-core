package br.com.coreeduc.aplication.domains;

public class DestinacaoLixo {

    private Long id;
    private Boolean servicoColeta;
    private Boolean queima;
    private Boolean enterra;
    private Boolean levaDestinacaoLicenciadaPoderPublico;
    private Boolean descartaEmOutraArea;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getServicoColeta() {
        return servicoColeta;
    }

    public void setServicoColeta(Boolean servicoColeta) {
        this.servicoColeta = servicoColeta;
    }

    public Boolean getQueima() {
        return queima;
    }

    public void setQueima(Boolean queima) {
        this.queima = queima;
    }

    public Boolean getEnterra() {
        return enterra;
    }

    public void setEnterra(Boolean enterra) {
        this.enterra = enterra;
    }

    public Boolean getLevaDestinacaoLicenciadaPoderPublico() {
        return levaDestinacaoLicenciadaPoderPublico;
    }

    public void setLevaDestinacaoLicenciadaPoderPublico(Boolean levaDestinacaoLicenciadaPoderPublico) {
        this.levaDestinacaoLicenciadaPoderPublico = levaDestinacaoLicenciadaPoderPublico;
    }

    public Boolean getDescartaEmOutraArea() {
        return descartaEmOutraArea;
    }

    public void setDescartaEmOutraArea(Boolean descartaEmOutraArea) {
        this.descartaEmOutraArea = descartaEmOutraArea;
    }
}
