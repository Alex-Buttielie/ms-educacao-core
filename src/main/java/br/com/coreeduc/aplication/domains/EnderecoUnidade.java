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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public MunicipioEntity getFkMun() {
        return fkMun;
    }

    public void setFkMun(MunicipioEntity fkMun) {
        this.fkMun = fkMun;
    }

    public DistritoEntity getDistrito() {
        return distrito;
    }

    public void setDistrito(DistritoEntity distrito) {
        this.distrito = distrito;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }
}
