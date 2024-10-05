package br.com.coreeduc.aplication.entities;

import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "quantidade_equipamentos_processo_aprendizagem")
@Entity
@Builder
public class QuantidadeEquipamentosProcessoAprendizagemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "aparelho_dev_bluray")
    private Integer aparelhoDvdBluray;
    @Basic
    @Column(name = "aparelho_som")
    private Integer aparelhoSom;
    @Basic
    @Column(name = "aparelho_televisao")
    private Integer aparelhoTelevisao;
    @Basic
    @Column(name = "lousa_digital")
    private Integer lousaDigital;
    @Basic
    @Column(name = "projetor_multimidia_data_show")
    private Integer projetorMultimidiaDataShow;

    public QuantidadeEquipamentosProcessoAprendizagemEntity() {
    }

    public QuantidadeEquipamentosProcessoAprendizagemEntity(Long id, Integer aparelhoDvdBluray, Integer aparelhoSom, Integer aparelhoTelevisao, Integer lousaDigital, Integer projetorMultimidiaDataShow) {
        this.id = id;
        this.aparelhoDvdBluray = aparelhoDvdBluray;
        this.aparelhoSom = aparelhoSom;
        this.aparelhoTelevisao = aparelhoTelevisao;
        this.lousaDigital = lousaDigital;
        this.projetorMultimidiaDataShow = projetorMultimidiaDataShow;
    }

    public QuantidadeEquipamentosProcessoAprendizagemEntity(Integer aparelhoDvdBluray, Integer aparelhoSom, Integer aparelhoTelevisao, Integer lousaDigital, Integer projetorMultimidiaDataShow) {
        this.aparelhoDvdBluray = aparelhoDvdBluray;
        this.aparelhoSom = aparelhoSom;
        this.aparelhoTelevisao = aparelhoTelevisao;
        this.lousaDigital = lousaDigital;
        this.projetorMultimidiaDataShow = projetorMultimidiaDataShow;
    }

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
