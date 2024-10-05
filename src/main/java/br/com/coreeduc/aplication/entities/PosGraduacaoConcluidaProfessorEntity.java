package br.com.coreeduc.aplication.entities;

import br.com.coreeduc.aplication.contraints.TipoPosGraduacao;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "pos_graduacao_concluida_professor")
@Entity
public class PosGraduacaoConcluidaProfessorEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "tipo_pos_graduacao1")
    private TipoPosGraduacao tipoPosGraducacao1;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaPosGraduacaoEntity areaPosGraduacao1;
    @Basic
    @Column(name = "ano_conclusao1")
    private Long anoConclusao1;
    @Basic
    @Column(name = "tipo_pos_graduacao2")
    private TipoPosGraduacao tipoPosGraducacao2;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaPosGraduacaoEntity areaPosGraduacao2;
    @Basic
    @Column(name = "ano_conclusao2")
    private Long anoConclusao2;
    @Basic
    @Column(name = "tipo_pos_graduacao3")
    private TipoPosGraduacao tipoPosGraducacao3;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaPosGraduacaoEntity areaPosGraduacao3;
    @Basic
    @Column(name = "ano_conclusao3")
    private Long anoConclusao3;
    @Basic
    @Column(name = "tipo_pos_graduacao4")
    private TipoPosGraduacao tipoPosGraducacao4;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaPosGraduacaoEntity areaPosGraduacao4;
    @Basic
    @Column(name = "ano_conclusao4")
    private Long anoConclusao4;
    @Basic
    @Column(name = "tipo_pos_graduacao5")
    private TipoPosGraduacao tipoPosGraducacao5;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaPosGraduacaoEntity areaPosGraduacao5;
    @Basic
    @Column(name = "ano_conclusao5")
    private Long anoConclusao5;
    @Basic
    @Column(name = "tipo_pos_graduacao6")
    private TipoPosGraduacao tipoPosGraducacao6;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaPosGraduacaoEntity areaPosGraduacao6;
    @Basic
    @Column(name = "ano_conclusao6")
    private Long anoConclusao6;

    public PosGraduacaoConcluidaProfessorEntity() {
    }

    public PosGraduacaoConcluidaProfessorEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoPosGraduacao getTipoPosGraducacao1() {
        return tipoPosGraducacao1;
    }

    public void setTipoPosGraducacao1(TipoPosGraduacao tipoPosGraducacao1) {
        this.tipoPosGraducacao1 = tipoPosGraducacao1;
    }

    public AreaPosGraduacaoEntity getAreaPosGraduacao1() {
        return areaPosGraduacao1;
    }

    public void setAreaPosGraduacao1(AreaPosGraduacaoEntity areaPosGraduacaoEntity1) {
        this.areaPosGraduacao1 = areaPosGraduacaoEntity1;
    }

    public Long getAnoConclusao1() {
        return anoConclusao1;
    }

    public void setAnoConclusao1(Long anoConclusao1) {
        this.anoConclusao1 = anoConclusao1;
    }

    public TipoPosGraduacao getTipoPosGraducacao2() {
        return tipoPosGraducacao2;
    }

    public void setTipoPosGraducacao2(TipoPosGraduacao tipoPosGraducacao2) {
        this.tipoPosGraducacao2 = tipoPosGraducacao2;
    }

    public AreaPosGraduacaoEntity getAreaPosGraduacao2() {
        return areaPosGraduacao2;
    }

    public void setAreaPosGraduacao2(AreaPosGraduacaoEntity areaPosGraduacaoEntity2) {
        this.areaPosGraduacao2 = areaPosGraduacaoEntity2;
    }

    public Long getAnoConclusao2() {
        return anoConclusao2;
    }

    public void setAnoConclusao2(Long anoConclusao2) {
        this.anoConclusao2 = anoConclusao2;
    }

    public TipoPosGraduacao getTipoPosGraducacao3() {
        return tipoPosGraducacao3;
    }

    public void setTipoPosGraducacao3(TipoPosGraduacao tipoPosGraducacao3) {
        this.tipoPosGraducacao3 = tipoPosGraducacao3;
    }

    public AreaPosGraduacaoEntity getAreaPosGraduacao3() {
        return areaPosGraduacao3;
    }

    public void setAreaPosGraduacao3(AreaPosGraduacaoEntity areaPosGraduacaoEntity3) {
        this.areaPosGraduacao3 = areaPosGraduacaoEntity3;
    }

    public Long getAnoConclusao3() {
        return anoConclusao3;
    }

    public void setAnoConclusao3(Long anoConclusao3) {
        this.anoConclusao3 = anoConclusao3;
    }

    public TipoPosGraduacao getTipoPosGraducacao4() {
        return tipoPosGraducacao4;
    }

    public void setTipoPosGraducacao4(TipoPosGraduacao tipoPosGraducacao4) {
        this.tipoPosGraducacao4 = tipoPosGraducacao4;
    }

    public AreaPosGraduacaoEntity getAreaPosGraduacao4() {
        return areaPosGraduacao4;
    }

    public void setAreaPosGraduacao4(AreaPosGraduacaoEntity areaPosGraduacaoEntity4) {
        this.areaPosGraduacao4 = areaPosGraduacaoEntity4;
    }

    public Long getAnoConclusao4() {
        return anoConclusao4;
    }

    public void setAnoConclusao4(Long anoConclusao4) {
        this.anoConclusao4 = anoConclusao4;
    }

    public TipoPosGraduacao getTipoPosGraducacao5() {
        return tipoPosGraducacao5;
    }

    public void setTipoPosGraducacao5(TipoPosGraduacao tipoPosGraducacao5) {
        this.tipoPosGraducacao5 = tipoPosGraducacao5;
    }

    public AreaPosGraduacaoEntity getAreaPosGraduacao5() {
        return areaPosGraduacao5;
    }

    public void setAreaPosGraduacao5(AreaPosGraduacaoEntity areaPosGraduacaoEntity5) {
        this.areaPosGraduacao5 = areaPosGraduacaoEntity5;
    }

    public Long getAnoConclusao5() {
        return anoConclusao5;
    }

    public void setAnoConclusao5(Long anoConclusao5) {
        this.anoConclusao5 = anoConclusao5;
    }

    public TipoPosGraduacao getTipoPosGraducacao6() {
        return tipoPosGraducacao6;
    }

    public void setTipoPosGraducacao6(TipoPosGraduacao tipoPosGraducacao6) {
        this.tipoPosGraducacao6 = tipoPosGraducacao6;
    }

    public AreaPosGraduacaoEntity getAreaPosGraduacao6() {
        return areaPosGraduacao6;
    }

    public void setAreaPosGraduacao6(AreaPosGraduacaoEntity areaPosGraduacaoEntity6) {
        this.areaPosGraduacao6 = areaPosGraduacaoEntity6;
    }

    public Long getAnoConclusao6() {
        return anoConclusao6;
    }

    public void setAnoConclusao6(Long anoConclusao6) {
        this.anoConclusao6 = anoConclusao6;
    }
}
