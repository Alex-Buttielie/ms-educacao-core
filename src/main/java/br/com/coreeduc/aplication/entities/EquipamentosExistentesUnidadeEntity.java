package br.com.coreeduc.aplication.entities;

import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "equipamentos_existentes_unidade")
@Entity
@Builder
public class EquipamentosExistentesUnidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "antena_parabolica")
    private Boolean antenaParabolica;
    @Basic
    @Column(name = "computadores")
    private Boolean computadores;
    @Basic
    @Column(name = "copiadora")
    private Boolean copiadora;
    @Basic
    @Column(name = "impressora")
    private Boolean impressora;
    @Basic
    @Column(name = "impressora_multifuncional")
    private Boolean impressoraMultifuncional;
    @Basic
    @Column(name = "scnaner")
    private Boolean scanner;
    @Basic
    @Column(name = "nenhum_dos_equipamentos_listados")
    private Boolean nenhumDosEquipamentosListados;

    public EquipamentosExistentesUnidadeEntity() {
    }

    public EquipamentosExistentesUnidadeEntity(Long id, Boolean antenaParabolica, Boolean computadores, Boolean copiadora, Boolean impressora, Boolean impressoraMultifuncional, Boolean scanner, Boolean nenhumDosEquipamentosListados) {
        this.id = id;
        this.antenaParabolica = antenaParabolica;
        this.computadores = computadores;
        this.copiadora = copiadora;
        this.impressora = impressora;
        this.impressoraMultifuncional = impressoraMultifuncional;
        this.scanner = scanner;
        this.nenhumDosEquipamentosListados = nenhumDosEquipamentosListados;
    }

    public EquipamentosExistentesUnidadeEntity(Boolean antenaParabolica, Boolean computadores, Boolean copiadora, Boolean impressora, Boolean impressoraMultifuncional, Boolean scanner, Boolean nenhumDosEquipamentosListados) {
        this.antenaParabolica = antenaParabolica;
        this.computadores = computadores;
        this.copiadora = copiadora;
        this.impressora = impressora;
        this.impressoraMultifuncional = impressoraMultifuncional;
        this.scanner = scanner;
        this.nenhumDosEquipamentosListados = nenhumDosEquipamentosListados;
    }

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
