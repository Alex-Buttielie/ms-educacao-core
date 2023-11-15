package br.com.coreeduc.adapters.outbound.persistence.entities;

import br.com.coreeduc.aplication.domains.contraints.MaiorNivelEscolaridadeConcluido;
import br.com.coreeduc.aplication.domains.contraints.TipoEnsinoMedioCursado;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "professor")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private PessoaEntity pessoa;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private OutrosCursosEspecificosEntity outrosCursosEspecificos;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private FormacaoComplementarPedagogicaProfessorEntity formacaoComplementarPedagogicaProfessor;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private PosGraduacaoConcluidaProfessorEntity posGraduacaoConcluidaProfessor;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private TipoDeficienciaEspectroAltasHabilidadesEntity tipoDeficienciaEspectroAltasHabilidades;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private RecursoAlunoParaAvaliacaoInepEntity recursoAlunoParaAvaliacaoInep;
    @Basic
    @Column(name = "nao_tem_pos_graduacao_concluida")
    private Boolean naoTemPosGraduacaoConcluida;
    @Basic
    @Column(name = "tipo_ensino_medio_cursado")
    private TipoEnsinoMedioCursado tipoEnsinoMedioCursado;
    @Basic
    @Column(name = "maior_nivel_escolaridade_concluido")
    private MaiorNivelEscolaridadeConcluido maiorNivelEscolaridadeConcluido;

}
