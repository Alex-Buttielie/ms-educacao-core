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

}
