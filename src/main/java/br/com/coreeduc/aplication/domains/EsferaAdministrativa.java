package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.domains.contraints.EducacaoBasica;

public class EsferaAdministrativa {

    private Long id;
    private Boolean federal;
    private Boolean estadual;
    private Boolean municipal;
    private EducacaoBasica uniVinEscolaEduBasicaUniOfertanteEduSup;
    private UnidadeEnsinoEntity fkUniEscolaSede;
    private Integer codigoIes;

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

    public void setFkUniEscolaSede(UnidadeEnsinoEntity fkUniEscolaSede) {
        this.fkUniEscolaSede = fkUniEscolaSede;
    }

    public Integer getCodigoIes() {
        return codigoIes;
    }

    public void setCodigoIes(Integer codigoIes) {
        this.codigoIes = codigoIes;
    }
}
