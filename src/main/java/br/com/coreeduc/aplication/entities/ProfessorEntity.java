package br.com.coreeduc.aplication.entities;

import br.com.coreeduc.aplication.contraints.MaiorNivelEscolaridadeConcluido;
import br.com.coreeduc.aplication.contraints.TipoEnsinoMedioCursado;
import com.fasterxml.jackson.annotation.JsonFormat;

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
@Entity
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

    public ProfessorEntity() {
    }

    public ProfessorEntity(Long id, PessoaEntity pessoa, OutrosCursosEspecificosEntity outrosCursosEspecificos, FormacaoComplementarPedagogicaProfessorEntity formacaoComplementarPedagogicaProfessor, PosGraduacaoConcluidaProfessorEntity posGraduacaoConcluidaProfessor, TipoDeficienciaEspectroAltasHabilidadesEntity tipoDeficienciaEspectroAltasHabilidades, RecursoAlunoParaAvaliacaoInepEntity recursoAlunoParaAvaliacaoInep, Boolean naoTemPosGraduacaoConcluida, TipoEnsinoMedioCursado tipoEnsinoMedioCursado, MaiorNivelEscolaridadeConcluido maiorNivelEscolaridadeConcluido) {
        this.id = id;
        this.pessoa = pessoa;
        this.outrosCursosEspecificos = outrosCursosEspecificos;
        this.formacaoComplementarPedagogicaProfessor = formacaoComplementarPedagogicaProfessor;
        this.posGraduacaoConcluidaProfessor = posGraduacaoConcluidaProfessor;
        this.tipoDeficienciaEspectroAltasHabilidades = tipoDeficienciaEspectroAltasHabilidades;
        this.recursoAlunoParaAvaliacaoInep = recursoAlunoParaAvaliacaoInep;
        this.naoTemPosGraduacaoConcluida = naoTemPosGraduacaoConcluida;
        this.tipoEnsinoMedioCursado = tipoEnsinoMedioCursado;
        this.maiorNivelEscolaridadeConcluido = maiorNivelEscolaridadeConcluido;
    }

    public ProfessorEntity(PessoaEntity pessoa, OutrosCursosEspecificosEntity outrosCursosEspecificos, FormacaoComplementarPedagogicaProfessorEntity formacaoComplementarPedagogicaProfessor, PosGraduacaoConcluidaProfessorEntity posGraduacaoConcluidaProfessor, TipoDeficienciaEspectroAltasHabilidadesEntity tipoDeficienciaEspectroAltasHabilidades, RecursoAlunoParaAvaliacaoInepEntity recursoAlunoParaAvaliacaoInep, Boolean naoTemPosGraduacaoConcluida, TipoEnsinoMedioCursado tipoEnsinoMedioCursado, MaiorNivelEscolaridadeConcluido maiorNivelEscolaridadeConcluido) {
        this.pessoa = pessoa;
        this.outrosCursosEspecificos = outrosCursosEspecificos;
        this.formacaoComplementarPedagogicaProfessor = formacaoComplementarPedagogicaProfessor;
        this.posGraduacaoConcluidaProfessor = posGraduacaoConcluidaProfessor;
        this.tipoDeficienciaEspectroAltasHabilidades = tipoDeficienciaEspectroAltasHabilidades;
        this.recursoAlunoParaAvaliacaoInep = recursoAlunoParaAvaliacaoInep;
        this.naoTemPosGraduacaoConcluida = naoTemPosGraduacaoConcluida;
        this.tipoEnsinoMedioCursado = tipoEnsinoMedioCursado;
        this.maiorNivelEscolaridadeConcluido = maiorNivelEscolaridadeConcluido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public OutrosCursosEspecificosEntity getOutrosCursosEspecificos() {
        return outrosCursosEspecificos;
    }

    public void setOutrosCursosEspecificos(OutrosCursosEspecificosEntity outrosCursosEspecificos) {
        this.outrosCursosEspecificos = outrosCursosEspecificos;
    }

    public FormacaoComplementarPedagogicaProfessorEntity getFormacaoComplementarPedagogicaProfessor() {
        return formacaoComplementarPedagogicaProfessor;
    }

    public void setFormacaoComplementarPedagogicaProfessor(FormacaoComplementarPedagogicaProfessorEntity formacaoComplementarPedagogicaProfessor) {
        this.formacaoComplementarPedagogicaProfessor = formacaoComplementarPedagogicaProfessor;
    }

    public PosGraduacaoConcluidaProfessorEntity getPosGraduacaoConcluidaProfessor() {
        return posGraduacaoConcluidaProfessor;
    }

    public void setPosGraduacaoConcluidaProfessor(PosGraduacaoConcluidaProfessorEntity posGraduacaoConcluidaProfessor) {
        this.posGraduacaoConcluidaProfessor = posGraduacaoConcluidaProfessor;
    }

    public TipoDeficienciaEspectroAltasHabilidadesEntity getTipoDeficienciaEspectroAltasHabilidades() {
        return tipoDeficienciaEspectroAltasHabilidades;
    }

    public void setTipoDeficienciaEspectroAltasHabilidades(TipoDeficienciaEspectroAltasHabilidadesEntity tipoDeficienciaEspectroAltasHabilidades) {
        this.tipoDeficienciaEspectroAltasHabilidades = tipoDeficienciaEspectroAltasHabilidades;
    }

    public RecursoAlunoParaAvaliacaoInepEntity getRecursoAlunoParaAvaliacaoInep() {
        return recursoAlunoParaAvaliacaoInep;
    }

    public void setRecursoAlunoParaAvaliacaoInep(RecursoAlunoParaAvaliacaoInepEntity recursoAlunoParaAvaliacaoInep) {
        this.recursoAlunoParaAvaliacaoInep = recursoAlunoParaAvaliacaoInep;
    }

    public Boolean getNaoTemPosGraduacaoConcluida() {
        return naoTemPosGraduacaoConcluida;
    }

    public void setNaoTemPosGraduacaoConcluida(Boolean naoTemPosGraduacaoConcluida) {
        this.naoTemPosGraduacaoConcluida = naoTemPosGraduacaoConcluida;
    }

    public TipoEnsinoMedioCursado getTipoEnsinoMedioCursado() {
        return tipoEnsinoMedioCursado;
    }

    public void setTipoEnsinoMedioCursado(TipoEnsinoMedioCursado tipoEnsinoMedioCursado) {
        this.tipoEnsinoMedioCursado = tipoEnsinoMedioCursado;
    }

    public MaiorNivelEscolaridadeConcluido getMaiorNivelEscolaridadeConcluido() {
        return maiorNivelEscolaridadeConcluido;
    }

    public void setMaiorNivelEscolaridadeConcluido(MaiorNivelEscolaridadeConcluido maiorNivelEscolaridadeConcluido) {
        this.maiorNivelEscolaridadeConcluido = maiorNivelEscolaridadeConcluido;
    }
}
