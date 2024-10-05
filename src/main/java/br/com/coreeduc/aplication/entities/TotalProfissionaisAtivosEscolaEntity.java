package br.com.coreeduc.aplication.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "total_profissionais_ativos_escola")
@Entity
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

    public TotalProfissionaisAtivosEscolaEntity() {
    }

    public TotalProfissionaisAtivosEscolaEntity(Long id, Integer auxiliaresSecretaria, Integer auxiliarServicosGerais, Integer bibliotecarioAuxiliarMonitor, Integer bombeiroBrigadista, Integer coordenadorTurnoDisciplinar, Integer fonoaudiologo, Integer nutricionista, Integer psicologoEscolar, Integer profissionaisPreparacao, Integer profissionaisApoioSupervisao, Integer secretarioEscolar, Integer segurancaGuardaOuSegurancaPatrimonial, Integer auxiliaresLaboratorio, Integer viceDiretor, Integer orientadorComunitario, Boolean isProfissioaisParaFuncoesListadas, Boolean alimentacaoEscolarParaAluno) {
        this.id = id;
        this.auxiliaresSecretaria = auxiliaresSecretaria;
        this.auxiliarServicosGerais = auxiliarServicosGerais;
        this.bibliotecarioAuxiliarMonitor = bibliotecarioAuxiliarMonitor;
        this.bombeiroBrigadista = bombeiroBrigadista;
        this.coordenadorTurnoDisciplinar = coordenadorTurnoDisciplinar;
        this.fonoaudiologo = fonoaudiologo;
        this.nutricionista = nutricionista;
        this.psicologoEscolar = psicologoEscolar;
        this.profissionaisPreparacao = profissionaisPreparacao;
        this.profissionaisApoioSupervisao = profissionaisApoioSupervisao;
        this.secretarioEscolar = secretarioEscolar;
        this.segurancaGuardaOuSegurancaPatrimonial = segurancaGuardaOuSegurancaPatrimonial;
        this.auxiliaresLaboratorio = auxiliaresLaboratorio;
        this.viceDiretor = viceDiretor;
        this.orientadorComunitario = orientadorComunitario;
        this.isProfissioaisParaFuncoesListadas = isProfissioaisParaFuncoesListadas;
        this.alimentacaoEscolarParaAluno = alimentacaoEscolarParaAluno;
    }

    public TotalProfissionaisAtivosEscolaEntity(Integer auxiliaresSecretaria, Integer auxiliarServicosGerais, Integer bibliotecarioAuxiliarMonitor, Integer bombeiroBrigadista, Integer coordenadorTurnoDisciplinar, Integer fonoaudiologo, Integer nutricionista, Integer psicologoEscolar, Integer profissionaisPreparacao, Integer profissionaisApoioSupervisao, Integer secretarioEscolar, Integer segurancaGuardaOuSegurancaPatrimonial, Integer auxiliaresLaboratorio, Integer viceDiretor, Integer orientadorComunitario, Boolean isProfissioaisParaFuncoesListadas, Boolean alimentacaoEscolarParaAluno) {
        this.auxiliaresSecretaria = auxiliaresSecretaria;
        this.auxiliarServicosGerais = auxiliarServicosGerais;
        this.bibliotecarioAuxiliarMonitor = bibliotecarioAuxiliarMonitor;
        this.bombeiroBrigadista = bombeiroBrigadista;
        this.coordenadorTurnoDisciplinar = coordenadorTurnoDisciplinar;
        this.fonoaudiologo = fonoaudiologo;
        this.nutricionista = nutricionista;
        this.psicologoEscolar = psicologoEscolar;
        this.profissionaisPreparacao = profissionaisPreparacao;
        this.profissionaisApoioSupervisao = profissionaisApoioSupervisao;
        this.secretarioEscolar = secretarioEscolar;
        this.segurancaGuardaOuSegurancaPatrimonial = segurancaGuardaOuSegurancaPatrimonial;
        this.auxiliaresLaboratorio = auxiliaresLaboratorio;
        this.viceDiretor = viceDiretor;
        this.orientadorComunitario = orientadorComunitario;
        this.isProfissioaisParaFuncoesListadas = isProfissioaisParaFuncoesListadas;
        this.alimentacaoEscolarParaAluno = alimentacaoEscolarParaAluno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAuxiliaresSecretaria() {
        return auxiliaresSecretaria;
    }

    public void setAuxiliaresSecretaria(Integer auxiliaresSecretaria) {
        this.auxiliaresSecretaria = auxiliaresSecretaria;
    }

    public Integer getAuxiliarServicosGerais() {
        return auxiliarServicosGerais;
    }

    public void setAuxiliarServicosGerais(Integer auxiliarServicosGerais) {
        this.auxiliarServicosGerais = auxiliarServicosGerais;
    }

    public Integer getBibliotecarioAuxiliarMonitor() {
        return bibliotecarioAuxiliarMonitor;
    }

    public void setBibliotecarioAuxiliarMonitor(Integer bibliotecarioAuxiliarMonitor) {
        this.bibliotecarioAuxiliarMonitor = bibliotecarioAuxiliarMonitor;
    }

    public Integer getBombeiroBrigadista() {
        return bombeiroBrigadista;
    }

    public void setBombeiroBrigadista(Integer bombeiroBrigadista) {
        this.bombeiroBrigadista = bombeiroBrigadista;
    }

    public Integer getCoordenadorTurnoDisciplinar() {
        return coordenadorTurnoDisciplinar;
    }

    public void setCoordenadorTurnoDisciplinar(Integer coordenadorTurnoDisciplinar) {
        this.coordenadorTurnoDisciplinar = coordenadorTurnoDisciplinar;
    }

    public Integer getFonoaudiologo() {
        return fonoaudiologo;
    }

    public void setFonoaudiologo(Integer fonoaudiologo) {
        this.fonoaudiologo = fonoaudiologo;
    }

    public Integer getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Integer nutricionista) {
        this.nutricionista = nutricionista;
    }

    public Integer getPsicologoEscolar() {
        return psicologoEscolar;
    }

    public void setPsicologoEscolar(Integer psicologoEscolar) {
        this.psicologoEscolar = psicologoEscolar;
    }

    public Integer getProfissionaisPreparacao() {
        return profissionaisPreparacao;
    }

    public void setProfissionaisPreparacao(Integer profissionaisPreparacao) {
        this.profissionaisPreparacao = profissionaisPreparacao;
    }

    public Integer getProfissionaisApoioSupervisao() {
        return profissionaisApoioSupervisao;
    }

    public void setProfissionaisApoioSupervisao(Integer profissionaisApoioSupervisao) {
        this.profissionaisApoioSupervisao = profissionaisApoioSupervisao;
    }

    public Integer getSecretarioEscolar() {
        return secretarioEscolar;
    }

    public void setSecretarioEscolar(Integer secretarioEscolar) {
        this.secretarioEscolar = secretarioEscolar;
    }

    public Integer getSegurancaGuardaOuSegurancaPatrimonial() {
        return segurancaGuardaOuSegurancaPatrimonial;
    }

    public void setSegurancaGuardaOuSegurancaPatrimonial(Integer segurancaGuardaOuSegurancaPatrimonial) {
        this.segurancaGuardaOuSegurancaPatrimonial = segurancaGuardaOuSegurancaPatrimonial;
    }

    public Integer getAuxiliaresLaboratorio() {
        return auxiliaresLaboratorio;
    }

    public void setAuxiliaresLaboratorio(Integer auxiliaresLaboratorio) {
        this.auxiliaresLaboratorio = auxiliaresLaboratorio;
    }

    public Integer getViceDiretor() {
        return viceDiretor;
    }

    public void setViceDiretor(Integer viceDiretor) {
        this.viceDiretor = viceDiretor;
    }

    public Integer getOrientadorComunitario() {
        return orientadorComunitario;
    }

    public void setOrientadorComunitario(Integer orientadorComunitario) {
        this.orientadorComunitario = orientadorComunitario;
    }

    public Boolean getProfissioaisParaFuncoesListadas() {
        return isProfissioaisParaFuncoesListadas;
    }

    public void setProfissioaisParaFuncoesListadas(Boolean profissioaisParaFuncoesListadas) {
        isProfissioaisParaFuncoesListadas = profissioaisParaFuncoesListadas;
    }

    public Boolean getAlimentacaoEscolarParaAluno() {
        return alimentacaoEscolarParaAluno;
    }

    public void setAlimentacaoEscolarParaAluno(Boolean alimentacaoEscolarParaAluno) {
        this.alimentacaoEscolarParaAluno = alimentacaoEscolarParaAluno;
    }
}
