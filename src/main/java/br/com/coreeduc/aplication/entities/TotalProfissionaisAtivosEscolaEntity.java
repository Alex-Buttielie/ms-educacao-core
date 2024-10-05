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

@Table(name = "total_profissionais_ativos_escola")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TotalProfissionaisAtivosEscolaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "auxiliares_secretaria")
    private Integer auxiliaresSecretaria;
    @Basic
    @Column(name = "auxilia_servicos_gerais")
    private Integer auxiliarServicosGerais;
    @Basic
    @Column(name = "bibliotecario_auxiliar_monitor")
    private Integer bibliotecarioAuxiliarMonitor;
    @Basic
    @Column(name = "bombeiro_brigadista")
    private Integer bombeiroBrigadista;
    @Basic
    @Column(name = "coordenador_turno_displinar")
    private Integer coordenadorTurnoDisciplinar;
    @Basic
    @Column(name = "fonoaudiologo")
    private Integer fonoaudiologo;
    @Basic
    @Column(name = "nutricionisa")
    private Integer nutricionista;
    @Basic
    @Column(name = "psicologo_escolar")
    private Integer psicologoEscolar;
    @Basic
    @Column(name = "profissionais_preparacao")
    private Integer profissionaisPreparacao;
    @Basic
    @Column(name = "profissionais_apoio_supervisao")
    private Integer profissionaisApoioSupervisao;
    @Basic
    @Column(name = "secretario_escolar")
    private Integer secretarioEscolar;
    @Basic
    @Column(name = "seguranca_guarda_seguranca")
    private Integer segurancaGuardaOuSegurancaPatrimonial;
    @Basic
    @Column(name = "auxiliares_laboratorio")
    private Integer auxiliaresLaboratorio;
    @Basic
    @Column(name = "vice_diretor")
    private Integer viceDiretor;
    @Basic
    @Column(name = "orientador_comunitario")
    private Integer orientadorComunitario;
    @Basic
    @Column(name = "is_profissionais_funcoes_listadas")
    private Boolean isProfissioaisParaFuncoesListadas;
    @Basic
    @Column(name = "alimentacao_escolar_para_aluno")
    private Boolean alimentacaoEscolarParaAluno;

}
