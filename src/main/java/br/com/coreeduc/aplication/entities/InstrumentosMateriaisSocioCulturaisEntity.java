package br.com.coreeduc.aplication.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "instrumentos_materiais_socio_culturais")
@Entity
public class InstrumentosMateriaisSocioCulturaisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "acervo_multimidia")
    private Boolean acervoMultimidia;
    @Basic
    @Column(name = "brinquedos_educacao_infantil")
    private Boolean brinquedosEducacaoInfantil;
    @Basic
    @Column(name = "conjunto_materiais_cientificos")
    private Boolean conjuntoMateriaisCientificos;
    @Basic
    @Column(name = "equipamento_aplificacao")
    private Boolean equipamentoAmplificacao;
    @Basic
    @Column(name = "instrumentos_musicais")
    private Boolean instrumentosMusicais;
    @Basic
    @Column(name = "jogos_educativos")
    private Boolean jogosEducativos;
    @Basic
    @Column(name = "materiais_atividades_culturais")
    private Boolean materiaisAtividadesCulturais;
    @Basic
    @Column(name = "materiais_educacao_profissional")
    private Boolean materiaisEducacaoProfissional;
    @Basic
    @Column(name = "materiais_patrica_desportiva")
    private Boolean materiaisPraticaDesportivaRecreacao;
    @Basic
    @Column(name = "materiais_pedagogicos_educacao_indigena")
    private Boolean materiaisPedagogicosEducacaoIndigena;
    @Basic
    @Column(name = "materiais_pedagogicos_educacao_etnicos_raciais")
    private Boolean materiaisPedagogicosEducacaoEtnicosRaciais;
    @Basic
    @Column(name = "materiais_pedagogicos_educacao_campo")
    private Boolean materiaisPedagogicosEducacaoCampo;
    @Basic
    @Column(name = "nenhum_instrumetos_listados")
    private Boolean nenhumInstrumentosListados;
    @Basic
    @Column(name = "educacao_escolar_indigena")
    private Boolean educacaoEscolarIndigena;

    public InstrumentosMateriaisSocioCulturaisEntity() {
    }

    public InstrumentosMateriaisSocioCulturaisEntity(Long id, Boolean acervoMultimidia, Boolean brinquedosEducacaoInfantil, Boolean conjuntoMateriaisCientificos, Boolean equipamentoAmplificacao, Boolean instrumentosMusicais, Boolean jogosEducativos, Boolean materiaisAtividadesCulturais, Boolean materiaisEducacaoProfissional, Boolean materiaisPraticaDesportivaRecreacao, Boolean materiaisPedagogicosEducacaoIndigena, Boolean materiaisPedagogicosEducacaoEtnicosRaciais, Boolean materiaisPedagogicosEducacaoCampo, Boolean nenhumInstrumentosListados, Boolean educacaoEscolarIndigena) {
        this.id = id;
        this.acervoMultimidia = acervoMultimidia;
        this.brinquedosEducacaoInfantil = brinquedosEducacaoInfantil;
        this.conjuntoMateriaisCientificos = conjuntoMateriaisCientificos;
        this.equipamentoAmplificacao = equipamentoAmplificacao;
        this.instrumentosMusicais = instrumentosMusicais;
        this.jogosEducativos = jogosEducativos;
        this.materiaisAtividadesCulturais = materiaisAtividadesCulturais;
        this.materiaisEducacaoProfissional = materiaisEducacaoProfissional;
        this.materiaisPraticaDesportivaRecreacao = materiaisPraticaDesportivaRecreacao;
        this.materiaisPedagogicosEducacaoIndigena = materiaisPedagogicosEducacaoIndigena;
        this.materiaisPedagogicosEducacaoEtnicosRaciais = materiaisPedagogicosEducacaoEtnicosRaciais;
        this.materiaisPedagogicosEducacaoCampo = materiaisPedagogicosEducacaoCampo;
        this.nenhumInstrumentosListados = nenhumInstrumentosListados;
        this.educacaoEscolarIndigena = educacaoEscolarIndigena;
    }

    public InstrumentosMateriaisSocioCulturaisEntity(Boolean acervoMultimidia, Boolean brinquedosEducacaoInfantil, Boolean conjuntoMateriaisCientificos, Boolean equipamentoAmplificacao, Boolean instrumentosMusicais, Boolean jogosEducativos, Boolean materiaisAtividadesCulturais, Boolean materiaisEducacaoProfissional, Boolean materiaisPraticaDesportivaRecreacao, Boolean materiaisPedagogicosEducacaoIndigena, Boolean materiaisPedagogicosEducacaoEtnicosRaciais, Boolean materiaisPedagogicosEducacaoCampo, Boolean nenhumInstrumentosListados, Boolean educacaoEscolarIndigena) {
        this.acervoMultimidia = acervoMultimidia;
        this.brinquedosEducacaoInfantil = brinquedosEducacaoInfantil;
        this.conjuntoMateriaisCientificos = conjuntoMateriaisCientificos;
        this.equipamentoAmplificacao = equipamentoAmplificacao;
        this.instrumentosMusicais = instrumentosMusicais;
        this.jogosEducativos = jogosEducativos;
        this.materiaisAtividadesCulturais = materiaisAtividadesCulturais;
        this.materiaisEducacaoProfissional = materiaisEducacaoProfissional;
        this.materiaisPraticaDesportivaRecreacao = materiaisPraticaDesportivaRecreacao;
        this.materiaisPedagogicosEducacaoIndigena = materiaisPedagogicosEducacaoIndigena;
        this.materiaisPedagogicosEducacaoEtnicosRaciais = materiaisPedagogicosEducacaoEtnicosRaciais;
        this.materiaisPedagogicosEducacaoCampo = materiaisPedagogicosEducacaoCampo;
        this.nenhumInstrumentosListados = nenhumInstrumentosListados;
        this.educacaoEscolarIndigena = educacaoEscolarIndigena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAcervoMultimidia() {
        return acervoMultimidia;
    }

    public void setAcervoMultimidia(Boolean acervoMultimidia) {
        this.acervoMultimidia = acervoMultimidia;
    }

    public Boolean getBrinquedosEducacaoInfantil() {
        return brinquedosEducacaoInfantil;
    }

    public void setBrinquedosEducacaoInfantil(Boolean brinquedosEducacaoInfantil) {
        this.brinquedosEducacaoInfantil = brinquedosEducacaoInfantil;
    }

    public Boolean getConjuntoMateriaisCientificos() {
        return conjuntoMateriaisCientificos;
    }

    public void setConjuntoMateriaisCientificos(Boolean conjuntoMateriaisCientificos) {
        this.conjuntoMateriaisCientificos = conjuntoMateriaisCientificos;
    }

    public Boolean getEquipamentoAmplificacao() {
        return equipamentoAmplificacao;
    }

    public void setEquipamentoAmplificacao(Boolean equipamentoAmplificacao) {
        this.equipamentoAmplificacao = equipamentoAmplificacao;
    }

    public Boolean getInstrumentosMusicais() {
        return instrumentosMusicais;
    }

    public void setInstrumentosMusicais(Boolean instrumentosMusicais) {
        this.instrumentosMusicais = instrumentosMusicais;
    }

    public Boolean getJogosEducativos() {
        return jogosEducativos;
    }

    public void setJogosEducativos(Boolean jogosEducativos) {
        this.jogosEducativos = jogosEducativos;
    }

    public Boolean getMateriaisAtividadesCulturais() {
        return materiaisAtividadesCulturais;
    }

    public void setMateriaisAtividadesCulturais(Boolean materiaisAtividadesCulturais) {
        this.materiaisAtividadesCulturais = materiaisAtividadesCulturais;
    }

    public Boolean getMateriaisEducacaoProfissional() {
        return materiaisEducacaoProfissional;
    }

    public void setMateriaisEducacaoProfissional(Boolean materiaisEducacaoProfissional) {
        this.materiaisEducacaoProfissional = materiaisEducacaoProfissional;
    }

    public Boolean getMateriaisPraticaDesportivaRecreacao() {
        return materiaisPraticaDesportivaRecreacao;
    }

    public void setMateriaisPraticaDesportivaRecreacao(Boolean materiaisPraticaDesportivaRecreacao) {
        this.materiaisPraticaDesportivaRecreacao = materiaisPraticaDesportivaRecreacao;
    }

    public Boolean getMateriaisPedagogicosEducacaoIndigena() {
        return materiaisPedagogicosEducacaoIndigena;
    }

    public void setMateriaisPedagogicosEducacaoIndigena(Boolean materiaisPedagogicosEducacaoIndigena) {
        this.materiaisPedagogicosEducacaoIndigena = materiaisPedagogicosEducacaoIndigena;
    }

    public Boolean getMateriaisPedagogicosEducacaoEtnicosRaciais() {
        return materiaisPedagogicosEducacaoEtnicosRaciais;
    }

    public void setMateriaisPedagogicosEducacaoEtnicosRaciais(Boolean materiaisPedagogicosEducacaoEtnicosRaciais) {
        this.materiaisPedagogicosEducacaoEtnicosRaciais = materiaisPedagogicosEducacaoEtnicosRaciais;
    }

    public Boolean getMateriaisPedagogicosEducacaoCampo() {
        return materiaisPedagogicosEducacaoCampo;
    }

    public void setMateriaisPedagogicosEducacaoCampo(Boolean materiaisPedagogicosEducacaoCampo) {
        this.materiaisPedagogicosEducacaoCampo = materiaisPedagogicosEducacaoCampo;
    }

    public Boolean getNenhumInstrumentosListados() {
        return nenhumInstrumentosListados;
    }

    public void setNenhumInstrumentosListados(Boolean nenhumInstrumentosListados) {
        this.nenhumInstrumentosListados = nenhumInstrumentosListados;
    }

    public Boolean getEducacaoEscolarIndigena() {
        return educacaoEscolarIndigena;
    }

    public void setEducacaoEscolarIndigena(Boolean educacaoEscolarIndigena) {
        this.educacaoEscolarIndigena = educacaoEscolarIndigena;
    }
}
