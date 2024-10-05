package br.com.coreeduc.aplication.entities;

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


@Table(name = "endereco_unidade")
@Entity
@Builder
public class EnderecoUnidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="cep")
    private String cep;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private CityEntity fkCity;
    @Basic
    @Column(name="endereco")
    private String  endereco;
    @Basic
    @Column(name="numero")
    private String  numero;
    @Basic
    @Column(name="complemento")
    private String  complemento;
    @Basic
    @Column(name="bairro")
    private String  bairro;
    @Basic
    @Column(name="ddd")
    private Integer ddd;

    public EnderecoUnidadeEntity(Long id, String cep, CityEntity fkCity, String endereco, String numero, String complemento, String bairro, Integer ddd) {
        this.id = id;
        this.cep = cep;
        this.fkCity = fkCity;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.ddd = ddd;
    }

    public EnderecoUnidadeEntity(String cep, CityEntity fkCity, String endereco, String numero, String complemento, String bairro, Integer ddd) {
        this.cep = cep;
        this.fkCity = fkCity;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.ddd = ddd;
    }

    public EnderecoUnidadeEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public CityEntity getFkCity() {
        return fkCity;
    }

    public void setFkCity(CityEntity fkCity) {
        this.fkCity = fkCity;
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
