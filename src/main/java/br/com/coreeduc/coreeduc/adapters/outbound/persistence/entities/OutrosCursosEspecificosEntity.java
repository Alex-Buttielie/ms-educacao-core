package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Table(name = "outros_cursos_especificos")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OutrosCursosEspecificosEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "creche")
    private Boolean creche;
    @Basic
    @Column(name = "pre_escola")
    private Boolean preEscola;
    @Basic
    @Column(name = "anos_iniciais_ensino_fundamental")
    private Boolean anosIniciaisEnsinoFundamental;
    @Basic
    @Column(name = "anos_finais_ensino_fundamental")
    private Boolean anosFinaisEnsinoFundamental;
    @Basic
    @Column(name = "ensino_medio")
    private Boolean ensinoMedio;
    @Basic
    @Column(name = "educacao_jovens_adultos")
    private Boolean educacaoJovensAdultos;
    @Basic
    @Column(name = "educacao_especial")
    private Boolean educacaoEspecial;
    @Basic
    @Column(name = "educacao_indigena")
    private Boolean educacaoIndigena;
    @Basic
    @Column(name = "educacao_campo")
    private Boolean educacaoCampo;
    @Basic
    @Column(name = "educacao_ambiental")
    private Boolean educacaoAmbiental;
    @Basic
    @Column(name = "educacao_direitos_humanos")
    private Boolean educacaoDireitosHumanos;
    @Basic
    @Column(name = "gerero_diversidade_sexual")
    private Boolean generoDiversidadeSexual;
    @Basic
    @Column(name = "direitos_criacao_adolescente")
    private Boolean direitoCriacaoAdolescente;
    @Basic
    @Column(name = "educacao_relacoes_etnico_raciais_cultura_afro_brasileira")
    private Boolean educacaoRelacoesEtnicoRaciaisCulturaAfroBrasileira;
    @Basic
    @Column(name = "gestao_escolar")
    private Boolean gestaoEscolar;
    @Basic
    @Column(name = "outros")
    private Boolean outros;
    @Basic
    @Column(name = "nao_tem_outros_cursos_especificos")
    private Boolean naoTemOutrosCursosEspecificos;

}
