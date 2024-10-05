package br.com.coreeduc.aplication.entities;

import br.com.coreeduc.aplication.contraints.ProjetoPoliticoLeiLdb12;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "orgaos_colegiados_funcionamento_escola")
@Entity
public class OrgaosColegiadosFuncionamentoEscolaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "associacao_pais")
    private Boolean associacaoPais;
    @Basic
    @Column(name = "associacao_pais_mestres")
    private Boolean associacaoDePaisEMestres;
    @Basic
    @Column(name = "conselho_escolar")
    private Boolean conselhoEscolar;
    @Basic
    @Column(name = "gremio_estudantil")
    private Boolean gremioEstudantil;
    @Basic
    @Column(name = "outros")
    private Boolean outros;
    @Basic
    @Column(name = "is_orgaos_colegiados_em_funcionamento")
    private Boolean isOrgaosColegiadosEmFuncionamento;
    @Basic
    @Column(name = "projeto_politico_lei_ldb_12")
    private ProjetoPoliticoLeiLdb12 projetoPoliticoLeiLdb12;

    public OrgaosColegiadosFuncionamentoEscolaEntity() {
    }

    public OrgaosColegiadosFuncionamentoEscolaEntity(Long id, Boolean associacaoPais, Boolean associacaoDePaisEMestres, Boolean conselhoEscolar, Boolean gremioEstudantil, Boolean outros, Boolean isOrgaosColegiadosEmFuncionamento, ProjetoPoliticoLeiLdb12 projetoPoliticoLeiLdb12) {
        this.id = id;
        this.associacaoPais = associacaoPais;
        this.associacaoDePaisEMestres = associacaoDePaisEMestres;
        this.conselhoEscolar = conselhoEscolar;
        this.gremioEstudantil = gremioEstudantil;
        this.outros = outros;
        this.isOrgaosColegiadosEmFuncionamento = isOrgaosColegiadosEmFuncionamento;
        this.projetoPoliticoLeiLdb12 = projetoPoliticoLeiLdb12;
    }

    public OrgaosColegiadosFuncionamentoEscolaEntity(Boolean associacaoPais, Boolean associacaoDePaisEMestres, Boolean conselhoEscolar, Boolean gremioEstudantil, Boolean outros, Boolean isOrgaosColegiadosEmFuncionamento, ProjetoPoliticoLeiLdb12 projetoPoliticoLeiLdb12) {
        this.associacaoPais = associacaoPais;
        this.associacaoDePaisEMestres = associacaoDePaisEMestres;
        this.conselhoEscolar = conselhoEscolar;
        this.gremioEstudantil = gremioEstudantil;
        this.outros = outros;
        this.isOrgaosColegiadosEmFuncionamento = isOrgaosColegiadosEmFuncionamento;
        this.projetoPoliticoLeiLdb12 = projetoPoliticoLeiLdb12;
    }

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
