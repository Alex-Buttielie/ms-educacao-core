package br.com.coreeduc.adapters.outbound.persistence.entities;

import br.com.coreeduc.aplication.domains.contraints.ProjetoPoliticoLeiLdb12;
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
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
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

}
