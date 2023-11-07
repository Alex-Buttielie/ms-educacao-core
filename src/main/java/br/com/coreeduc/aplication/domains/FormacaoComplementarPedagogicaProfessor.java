package br.com.coreeduc.aplication.domains;

public class FormacaoComplementarPedagogicaProfessor {
    private Long id;
    private AreaConhecimento areaConhecimentoComponentesCurriculares1;
    private AreaConhecimento areaConhecimentoComponentesCurriculares2;
    private AreaConhecimento areaConhecimentoComponentesCurriculares3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AreaConhecimento getAreaConhecimentoComponentesCurriculares1() {
        return areaConhecimentoComponentesCurriculares1;
    }

    public void setAreaConhecimentoComponentesCurriculares1(AreaConhecimento areaConhecimentoComponentesCurriculares1) {
        this.areaConhecimentoComponentesCurriculares1 = areaConhecimentoComponentesCurriculares1;
    }

    public AreaConhecimento getAreaConhecimentoComponentesCurriculares2() {
        return areaConhecimentoComponentesCurriculares2;
    }

    public void setAreaConhecimentoComponentesCurriculares2(AreaConhecimento areaConhecimentoComponentesCurriculares2) {
        this.areaConhecimentoComponentesCurriculares2 = areaConhecimentoComponentesCurriculares2;
    }

    public AreaConhecimento getAreaConhecimentoComponentesCurriculares3() {
        return areaConhecimentoComponentesCurriculares3;
    }

    public void setAreaConhecimentoComponentesCurriculares3(AreaConhecimento areaConhecimentoComponentesCurriculares3) {
        this.areaConhecimentoComponentesCurriculares3 = areaConhecimentoComponentesCurriculares3;
    }
}
