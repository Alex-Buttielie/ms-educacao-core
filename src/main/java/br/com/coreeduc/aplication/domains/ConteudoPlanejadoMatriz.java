package br.com.coreeduc.aplication.domains;

public class ConteudoPlanejadoMatriz  {

    private Long id;
    private ConteudoPlanejado conteudoPlanejado;
    private DisciplinasMatriz disciplinasMatriz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ConteudoPlanejado getConteudoPlanejado() {
        return conteudoPlanejado;
    }

    public void setConteudoPlanejado(ConteudoPlanejado conteudoPlanejado) {
        this.conteudoPlanejado = conteudoPlanejado;
    }

    public DisciplinasMatriz getDisciplinasMatriz() {
        return disciplinasMatriz;
    }

    public void setDisciplinasMatriz(DisciplinasMatriz disciplinasMatriz) {
        this.disciplinasMatriz = disciplinasMatriz;
    }
}
