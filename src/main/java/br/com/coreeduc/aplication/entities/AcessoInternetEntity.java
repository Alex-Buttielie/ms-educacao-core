package br.com.coreeduc.aplication.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "acesso_internet")
@Entity
public class AcessoInternetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "para_uso_administrativo")
    private Boolean paraUsoAdministrativo;
    @Basic
    @Column(name = "para_uso_processo_aprendizagem")
    private Boolean paraUsoProcessoApredizagem;
    @Basic
    @Column(name = "para_uso_alunos")
    private Boolean paraUsoAlunos;
    @Basic
    @Column(name = "para_uso_comunidade")
    private Boolean paraUsoComunidade;
    @Basic
    @Column(name = "nao_possui_acesso_internet")
    private Boolean naoPossuiAcessoInternet;

    public AcessoInternetEntity() {
    }

    public AcessoInternetEntity(Long id,
                                Boolean paraUsoAdministrativo,
                                Boolean paraUsoProcessoApredizagem,
                                Boolean paraUsoAlunos,
                                Boolean paraUsoComunidade,
                                Boolean naoPossuiAcessoInternet) {
        this.id = id;
        this.paraUsoAdministrativo = paraUsoAdministrativo;
        this.paraUsoProcessoApredizagem = paraUsoProcessoApredizagem;
        this.paraUsoAlunos = paraUsoAlunos;
        this.paraUsoComunidade = paraUsoComunidade;
        this.naoPossuiAcessoInternet = naoPossuiAcessoInternet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getParaUsoAdministrativo() {
        return paraUsoAdministrativo;
    }

    public void setParaUsoAdministrativo(Boolean paraUsoAdministrativo) {
        this.paraUsoAdministrativo = paraUsoAdministrativo;
    }

    public Boolean getParaUsoProcessoApredizagem() {
        return paraUsoProcessoApredizagem;
    }

    public void setParaUsoProcessoApredizagem(Boolean paraUsoProcessoApredizagem) {
        this.paraUsoProcessoApredizagem = paraUsoProcessoApredizagem;
    }

    public Boolean getParaUsoAlunos() {
        return paraUsoAlunos;
    }

    public void setParaUsoAlunos(Boolean paraUsoAlunos) {
        this.paraUsoAlunos = paraUsoAlunos;
    }

    public Boolean getParaUsoComunidade() {
        return paraUsoComunidade;
    }

    public void setParaUsoComunidade(Boolean paraUsoComunidade) {
        this.paraUsoComunidade = paraUsoComunidade;
    }

    public Boolean getNaoPossuiAcessoInternet() {
        return naoPossuiAcessoInternet;
    }

    public void setNaoPossuiAcessoInternet(Boolean naoPossuiAcessoInternet) {
        this.naoPossuiAcessoInternet = naoPossuiAcessoInternet;
    }

}
