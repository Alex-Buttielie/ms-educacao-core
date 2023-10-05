package br.com.coreeduc.coreeduc.aplication.domains;

public class AcessoInternet {

    private Long id;
    private Boolean paraUsoAdministrativo;
    private Boolean paraUsoProcessoApredizagem;
    private Boolean paraUsoAlunos;
    private Boolean paraUsoComunidade;
    private Boolean naoPossuiAcessoInternet;

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
