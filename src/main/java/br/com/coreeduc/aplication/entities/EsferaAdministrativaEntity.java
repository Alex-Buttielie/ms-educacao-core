package br.com.coreeduc.aplication.entities;

import br.com.coreeduc.aplication.contraints.EducacaoBasica;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "esfera_administrativa")
@Entity
@Builder
public class EsferaAdministrativaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="federal")
    private Boolean federal;
    @Basic
    @Column(name="estadual")
    private Boolean estadual;
    @Basic
    @Column(name="municipal")
    private Boolean municipal;
    @Basic
    @Column(name="uni_vin_escola_edu_basica_uni_ofertante_edu_sup")
    private EducacaoBasica uniVinEscolaEduBasicaUniOfertanteEduSup;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity fkUniEscolaSede;
    @Basic
    @Column(name="codigo_ies")
    private Integer codigoIes;

    public EsferaAdministrativaEntity() {
    }

    public EsferaAdministrativaEntity(Long id, Boolean federal, Boolean estadual, Boolean municipal, EducacaoBasica uniVinEscolaEduBasicaUniOfertanteEduSup, UnidadeEnsinoEntity fkUniEscolaSede, Integer codigoIes) {
        this.id = id;
        this.federal = federal;
        this.estadual = estadual;
        this.municipal = municipal;
        this.uniVinEscolaEduBasicaUniOfertanteEduSup = uniVinEscolaEduBasicaUniOfertanteEduSup;
        this.fkUniEscolaSede = fkUniEscolaSede;
        this.codigoIes = codigoIes;
    }

    public EsferaAdministrativaEntity(Boolean federal, Boolean estadual, Boolean municipal, EducacaoBasica uniVinEscolaEduBasicaUniOfertanteEduSup, UnidadeEnsinoEntity fkUniEscolaSede, Integer codigoIes) {
        this.federal = federal;
        this.estadual = estadual;
        this.municipal = municipal;
        this.uniVinEscolaEduBasicaUniOfertanteEduSup = uniVinEscolaEduBasicaUniOfertanteEduSup;
        this.fkUniEscolaSede = fkUniEscolaSede;
        this.codigoIes = codigoIes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getFederal() {
        return federal;
    }

    public void setFederal(Boolean federal) {
        this.federal = federal;
    }

    public Boolean getEstadual() {
        return estadual;
    }

    public void setEstadual(Boolean estadual) {
        this.estadual = estadual;
    }

    public Boolean getMunicipal() {
        return municipal;
    }

    public void setMunicipal(Boolean municipal) {
        this.municipal = municipal;
    }

    public EducacaoBasica getUniVinEscolaEduBasicaUniOfertanteEduSup() {
        return uniVinEscolaEduBasicaUniOfertanteEduSup;
    }

    public void setUniVinEscolaEduBasicaUniOfertanteEduSup(EducacaoBasica uniVinEscolaEduBasicaUniOfertanteEduSup) {
        this.uniVinEscolaEduBasicaUniOfertanteEduSup = uniVinEscolaEduBasicaUniOfertanteEduSup;
    }

    public UnidadeEnsinoEntity getFkUniEscolaSede() {
        return fkUniEscolaSede;
    }

    public void setFkUniEscolaSede(UnidadeEnsinoEntity fkUniEscolaSedeCodigoInep) {
        this.fkUniEscolaSede = fkUniEscolaSedeCodigoInep;
    }

    public Integer getCodigoIes() {
        return codigoIes;
    }

    public void setCodigoIes(Integer codigoIes) {
        this.codigoIes = codigoIes;
    }
}
