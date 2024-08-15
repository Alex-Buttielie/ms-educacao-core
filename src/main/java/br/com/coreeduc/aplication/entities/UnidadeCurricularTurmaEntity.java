package br.com.coreeduc.aplication.entities;

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
import javax.persistence.Table;

@Table(name = "unidade_curricular_turma")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnidadeCurricularTurmaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "eletivas")
    private Boolean eletivas;
    @Basic
    @Column(name = "libras")
    private Boolean libras;
    @Basic
    @Column(name = "lingua_indigena")
    private Boolean lingua_indigina;
    @Basic
    @Column(name = "lingua_lit_espanhol")
    private Boolean linguaLitEspanhol;
    @Basic
    @Column(name = "lingua_lit_frances")
    private Boolean linguaLitFrances;
    @Basic
    @Column(name = "lingua_lit_outras")
    private Boolean linguaLitOutras;
    @Basic
    @Column(name = "trilha_aprof_aprendizagem")
    private Boolean trilhaAprofAprendizagem;
    @Basic
    @Column(name = "projeto_vida")
    private Boolean projetoVida;

}
