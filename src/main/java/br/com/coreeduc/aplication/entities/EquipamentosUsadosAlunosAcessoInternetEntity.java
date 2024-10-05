package br.com.coreeduc.aplication.entities;

import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "equipamentos_usados_alunos_acesso_internet")
@Entity
@Builder
public class EquipamentosUsadosAlunosAcessoInternetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "computadores_tablets_biblioteca_unidade")
    private Boolean computadoresTabletsBibliotecaUnidade;
    @Basic
    @Column(name = "dispositivos_pessoais_computadores_portateis")
    private Boolean dispositivosPessoaisComputadoresPortateis;
    @Basic
    @Column(name = "internet_banda_larga")
    private Boolean internetBandaLarga;

    public EquipamentosUsadosAlunosAcessoInternetEntity() {
    }

    public EquipamentosUsadosAlunosAcessoInternetEntity(Long id, Boolean computadoresTabletsBibliotecaUnidade, Boolean dispositivosPessoaisComputadoresPortateis, Boolean internetBandaLarga) {
        this.id = id;
        this.computadoresTabletsBibliotecaUnidade = computadoresTabletsBibliotecaUnidade;
        this.dispositivosPessoaisComputadoresPortateis = dispositivosPessoaisComputadoresPortateis;
        this.internetBandaLarga = internetBandaLarga;
    }

    public EquipamentosUsadosAlunosAcessoInternetEntity(Boolean computadoresTabletsBibliotecaUnidade, Boolean dispositivosPessoaisComputadoresPortateis, Boolean internetBandaLarga) {
        this.computadoresTabletsBibliotecaUnidade = computadoresTabletsBibliotecaUnidade;
        this.dispositivosPessoaisComputadoresPortateis = dispositivosPessoaisComputadoresPortateis;
        this.internetBandaLarga = internetBandaLarga;
    }

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
