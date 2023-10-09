package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.aplication.domains.contraints.ProjetoPoliticoLeiLdb12;

public class OrgaosColegiadosFuncionamentoEscola {

    private Long id;
    private Boolean associacaoPais;
    private Boolean associacaoDePaisEMestres;
    private Boolean conselhoEscolar;
    private Boolean gremioEstudantil;
    private Boolean outros;
    private Boolean isOrgaosColegiadosEmFuncionamento;
    private ProjetoPoliticoLeiLdb12 projetoPoliticoLeiLdb12;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAssociacaoPais() {
        return associacaoPais;
    }

    public void setAssociacaoPais(Boolean associacaoPais) {
        this.associacaoPais = associacaoPais;
    }

    public Boolean getAssociacaoDePaisEMestres() {
        return associacaoDePaisEMestres;
    }

    public void setAssociacaoDePaisEMestres(Boolean associacaoDePaisEMestres) {
        this.associacaoDePaisEMestres = associacaoDePaisEMestres;
    }

    public Boolean getConselhoEscolar() {
        return conselhoEscolar;
    }

    public void setConselhoEscolar(Boolean conselhoEscolar) {
        this.conselhoEscolar = conselhoEscolar;
    }

    public Boolean getGremioEstudantil() {
        return gremioEstudantil;
    }

    public void setGremioEstudantil(Boolean gremioEstudantil) {
        this.gremioEstudantil = gremioEstudantil;
    }

    public Boolean getOutros() {
        return outros;
    }

    public void setOutros(Boolean outros) {
        this.outros = outros;
    }

    public Boolean getOrgaosColegiadosEmFuncionamento() {
        return isOrgaosColegiadosEmFuncionamento;
    }

    public void setOrgaosColegiadosEmFuncionamento(Boolean orgaosColegiadosEmFuncionamento) {
        isOrgaosColegiadosEmFuncionamento = orgaosColegiadosEmFuncionamento;
    }

    public ProjetoPoliticoLeiLdb12 getProjetoPoliticoLeiLdb12() {
        return projetoPoliticoLeiLdb12;
    }

    public void setProjetoPoliticoLeiLdb12(ProjetoPoliticoLeiLdb12 projetoPoliticoLeiLdb12) {
        this.projetoPoliticoLeiLdb12 = projetoPoliticoLeiLdb12;
    }
}
