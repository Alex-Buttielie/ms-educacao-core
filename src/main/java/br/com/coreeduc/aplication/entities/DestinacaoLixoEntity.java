package br.com.coreeduc.aplication.entities;

import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "destinacao_lixo")
@Entity
@Builder
public class DestinacaoLixoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "servico_coleta")
    private Boolean servicoColeta;
    @Basic
    @Column(name = "queima")
    private Boolean queima;
    @Basic
    @Column(name = "enterra")
    private Boolean enterra;
    @Basic
    @Column(name = "leva_destinacao_licenciada_poder_publico")
    private Boolean levaDestinacaoLicenciadaPoderPublico;
    @Basic
    @Column(name = "descarta_em_outra_area")
    private Boolean descartaEmOutraArea;

    public DestinacaoLixoEntity() {
    }

    public DestinacaoLixoEntity(Long id, Boolean servicoColeta, Boolean queima, Boolean enterra, Boolean levaDestinacaoLicenciadaPoderPublico, Boolean descartaEmOutraArea) {
        this.id = id;
        this.servicoColeta = servicoColeta;
        this.queima = queima;
        this.enterra = enterra;
        this.levaDestinacaoLicenciadaPoderPublico = levaDestinacaoLicenciadaPoderPublico;
        this.descartaEmOutraArea = descartaEmOutraArea;
    }

    public DestinacaoLixoEntity(Boolean servicoColeta, Boolean queima, Boolean enterra, Boolean levaDestinacaoLicenciadaPoderPublico, Boolean descartaEmOutraArea) {
        this.servicoColeta = servicoColeta;
        this.queima = queima;
        this.enterra = enterra;
        this.levaDestinacaoLicenciadaPoderPublico = levaDestinacaoLicenciadaPoderPublico;
        this.descartaEmOutraArea = descartaEmOutraArea;
    }

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
