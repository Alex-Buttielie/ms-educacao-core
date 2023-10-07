package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import br.com.coreeduc.coreeduc.aplication.domains.contraints.TipoPosGraduacao;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
    private AreaPosGraduacaoEntity areaPosGraduacaoEntity1;
    @Basic
    @Column(name = "ano_conclusao1")
    private Long anoConclusao1;
    @Basic
    @Column(name = "tipo_pos_graduacao2")
    private TipoPosGraduacao tipoPosGraducacao2;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaPosGraduacaoEntity areaPosGraduacaoEntity2;
    @Basic
    @Column(name = "ano_conclusao2")
    private Long anoConclusao2;
    @Basic
    @Column(name = "tipo_pos_graduacao3")
    private TipoPosGraduacao tipoPosGraducacao3;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaPosGraduacaoEntity areaPosGraduacaoEntity3;
    @Basic
    @Column(name = "ano_conclusao3")
    private Long anoConclusao3;
    @Basic
    @Column(name = "tipo_pos_graduacao4")
    private TipoPosGraduacao tipoPosGraducacao4;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaPosGraduacaoEntity areaPosGraduacaoEntity4;
    @Basic
    @Column(name = "ano_conclusao4")
    private Long anoConclusao4;
    @Basic
    @Column(name = "tipo_pos_graduacao5")
    private TipoPosGraduacao tipoPosGraducacao5;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaPosGraduacaoEntity areaPosGraduacaoEntity5;
    @Basic
    @Column(name = "ano_conclusao5")
    private Long anoConclusao5;
    @Basic
    @Column(name = "tipo_pos_graduacao6")
    private TipoPosGraduacao tipoPosGraducacao6;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaPosGraduacaoEntity areaPosGraduacaoEntity6;
    @Basic
    @Column(name = "ano_conclusao6")
    private Long anoConclusao6;

}
