package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.adapters.outbound.persistence.entities.DistritoEntity;
import br.com.coreeduc.adapters.outbound.persistence.entities.MunicipioEntity;

public class EnderecoUnidade {

    private Long id;
    private Integer cep;
    private MunicipioEntity fkMun;
    private DistritoEntity distrito;
    private String  endereco;
    private String  numero;
    private String  complemento;
    private String  bairro;
    private Integer ddd;

}
