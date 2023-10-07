package br.com.coreeduc.adapters.outbound.persistence.entities;

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

@Table(name = "instrumentos_materiais_socio_culturais")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
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

}
