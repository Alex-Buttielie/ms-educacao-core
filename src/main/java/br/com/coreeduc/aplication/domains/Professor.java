package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.aplication.domains.contraints.MaiorNivelEscolaridadeConcluido;
import br.com.coreeduc.aplication.domains.contraints.TipoEnsinoMedioCursado;

public class Professor {
    private Long id;
    private Pessoa pessoa;
    private OutrosCursosEspecificos outrosCursosEspecificos;
    private FormacaoComplementarPedagogicaProfessor formacaoComplementarPedagogicaProfessor;
    private PosGraduacaoConcluidaProfessor posGraduacaoConcluidaProfessor;
    private Boolean naoTemPosGraduacaoConcluida;
    private TipoEnsinoMedioCursado tipoEnsinoMedioCursado;
    private MaiorNivelEscolaridadeConcluido maiorNivelEscolaridadeConcluido;
    private TipoDeficienciaEspectroAltasHabilidades tipoDeficienciaEspectroAltasHabilidades;
    private RecursoAlunoParaAvaliacaoInep recursoAlunoParaAvaliacaoInep;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public OutrosCursosEspecificos getOutrosCursosEspecificos() {
        return outrosCursosEspecificos;
    }

    public void setOutrosCursosEspecificos(OutrosCursosEspecificos outrosCursosEspecificos) {
        this.outrosCursosEspecificos = outrosCursosEspecificos;
    }

    public FormacaoComplementarPedagogicaProfessor getFormacaoComplementarPedagogicaProfessor() {
        return formacaoComplementarPedagogicaProfessor;
    }

    public void setFormacaoComplementarPedagogicaProfessor(FormacaoComplementarPedagogicaProfessor formacaoComplementarPedagogicaProfessor) {
        this.formacaoComplementarPedagogicaProfessor = formacaoComplementarPedagogicaProfessor;
    }

    public PosGraduacaoConcluidaProfessor getPosGraduacaoConcluidaProfessor() {
        return posGraduacaoConcluidaProfessor;
    }

    public void setPosGraduacaoConcluidaProfessor(PosGraduacaoConcluidaProfessor posGraduacaoConcluidaProfessor) {
        this.posGraduacaoConcluidaProfessor = posGraduacaoConcluidaProfessor;
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

    public TipoDeficienciaEspectroAltasHabilidades getTipoDeficienciaEspectroAltasHabilidades() {
        return tipoDeficienciaEspectroAltasHabilidades;
    }

    public void setTipoDeficienciaEspectroAltasHabilidades(TipoDeficienciaEspectroAltasHabilidades tipoDeficienciaEspectroAltasHabilidades) {
        this.tipoDeficienciaEspectroAltasHabilidades = tipoDeficienciaEspectroAltasHabilidades;
    }

    public RecursoAlunoParaAvaliacaoInep getRecursoAlunoParaAvaliacaoInep() {
        return recursoAlunoParaAvaliacaoInep;
    }

    public void setRecursoAlunoParaAvaliacaoInep(RecursoAlunoParaAvaliacaoInep recursoAlunoParaAvaliacaoInep) {
        this.recursoAlunoParaAvaliacaoInep = recursoAlunoParaAvaliacaoInep;
    }

}
