package br.com.coreeduc.aplication.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "formacao_complementar_pedagogica_professor")
@Entity
public class FormacaoComplementarPedagogicaProfessorEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaConhecimentoEntity areaConhecimentoComponentesCurriculares1;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaConhecimentoEntity areaConhecimentoComponentesCurriculares2;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaConhecimentoEntity areaConhecimentoComponentesCurriculares3;

    public FormacaoComplementarPedagogicaProfessorEntity() {
    }

    public FormacaoComplementarPedagogicaProfessorEntity(Long id, AreaConhecimentoEntity areaConhecimentoComponentesCurriculares1, AreaConhecimentoEntity areaConhecimentoComponentesCurriculares2, AreaConhecimentoEntity areaConhecimentoComponentesCurriculares3) {
        this.id = id;
        this.areaConhecimentoComponentesCurriculares1 = areaConhecimentoComponentesCurriculares1;
        this.areaConhecimentoComponentesCurriculares2 = areaConhecimentoComponentesCurriculares2;
        this.areaConhecimentoComponentesCurriculares3 = areaConhecimentoComponentesCurriculares3;
    }

    public FormacaoComplementarPedagogicaProfessorEntity(AreaConhecimentoEntity areaConhecimentoComponentesCurriculares1, AreaConhecimentoEntity areaConhecimentoComponentesCurriculares2, AreaConhecimentoEntity areaConhecimentoComponentesCurriculares3) {
        this.areaConhecimentoComponentesCurriculares1 = areaConhecimentoComponentesCurriculares1;
        this.areaConhecimentoComponentesCurriculares2 = areaConhecimentoComponentesCurriculares2;
        this.areaConhecimentoComponentesCurriculares3 = areaConhecimentoComponentesCurriculares3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AreaConhecimentoEntity getAreaConhecimentoComponentesCurriculares1() {
        return areaConhecimentoComponentesCurriculares1;
    }

    public void setAreaConhecimentoComponentesCurriculares1(AreaConhecimentoEntity areaConhecimentoEntityComponentesCurriculares1) {
        this.areaConhecimentoComponentesCurriculares1 = areaConhecimentoEntityComponentesCurriculares1;
    }

    public AreaConhecimentoEntity getAreaConhecimentoComponentesCurriculares2() {
        return areaConhecimentoComponentesCurriculares2;
    }

    public void setAreaConhecimentoComponentesCurriculares2(AreaConhecimentoEntity areaConhecimentoEntityComponentesCurriculares2) {
        this.areaConhecimentoComponentesCurriculares2 = areaConhecimentoEntityComponentesCurriculares2;
    }

    public AreaConhecimentoEntity getAreaConhecimentoComponentesCurriculares3() {
        return areaConhecimentoComponentesCurriculares3;
    }

    public void setAreaConhecimentoComponentesCurriculares3(AreaConhecimentoEntity areaConhecimentoEntityComponentesCurriculares3) {
        this.areaConhecimentoComponentesCurriculares3 = areaConhecimentoEntityComponentesCurriculares3;
    }
}
