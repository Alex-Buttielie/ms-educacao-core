package br.com.coreeduc.aplication.domains;

import br.com.coreeduc.adapters.outbound.persistence.entities.DisciplinaEntity;

public class DisciplinasMatriz {
    private Long id;
    private Integer cargaHorariaDisciplina;
    private DisciplinaEntity disciplina;
    private MatrizCurricular matrizCurricular;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCargaHorariaDisciplina() {
        return cargaHorariaDisciplina;
    }

    public void setCargaHorariaDisciplina(Integer cargaHorariaDisciplina) {
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;
    }

    public DisciplinaEntity getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(DisciplinaEntity disciplina) {
        this.disciplina = disciplina;
    }

    public MatrizCurricular getMatrizCurricular() {
        return matrizCurricular;
    }

    public void setMatrizCurricular(MatrizCurricular matrizCurricular) {
        this.matrizCurricular = matrizCurricular;
    }
}
