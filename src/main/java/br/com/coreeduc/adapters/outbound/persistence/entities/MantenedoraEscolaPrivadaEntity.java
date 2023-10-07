package br.com.coreeduc.adapters.outbound.persistence.entities;

import br.com.coreeduc.aplication.domains.contraints.CategoriaEscolaPrivada;
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

@Table(name = "mantenedora_escola_privada")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MantenedoraEscolaPrivadaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="empresa_grupos_empresariais_setor_privado_pessoa_fisica")
    private Boolean empresaGruposEmpresariaisSetorPrivadoPessoaFisica;
    @Basic
    @Column(name="sindicatos_trabalhadores_patronais_associacoes_cooperativas")
    private Boolean sindicatosTrabalhadoresPatronaisAssociacoesCooperativas;
    @Basic
    @Column(name="organizacao_nao_governamental")
    private Boolean organizacaoNaoGovernamenta;
    @Basic
    @Column(name="institucao_sem_fins_lucrativos")
    private Boolean instituicaoSemFinsLucrativos;
    @Basic
    @Column(name="sistemas_sesi_senai_sesc_outros")
    private Boolean sistemasSesiSenaiSescOutros;
    @Basic
    @Column(name="organizacao_sociedade_civil_interesse_publico")
    private Boolean organizacaoDaSociedadeCivilDeInteressePublico;
    @Basic
    @Column(name="categoria_escola_privada")
    private CategoriaEscolaPrivada categoriaEscolaPrivada;

}
