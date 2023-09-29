package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import br.com.coreeduc.coreeduc.aplication.domains.contraints.CategoriaEscolaPrivada;
import jakarta.persistence.*;
import lombok.*;

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
