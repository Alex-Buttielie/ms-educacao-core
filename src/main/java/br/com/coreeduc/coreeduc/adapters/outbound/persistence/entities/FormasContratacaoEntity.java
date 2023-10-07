package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

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

@Table(name = "formas_contratacao")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FormasContratacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="termo_colaboracao_lei")
    private Boolean termoDeColaboracao;
    @Basic
    @Column(name="termo_fomento")
    private Boolean termoFomento;
    @Basic
    @Column(name="acordo_cooperacao")
    private Boolean acordoCooperacao;
    @Basic
    @Column(name="contrato_prestacao_servico")
    private Boolean contratoDePrestacaoDeServico;
    @Basic
    @Column(name="termo_cooperacao_tecnica_financeira")
    private Boolean termoCooperacaoTecnicaFinanceira;
    @Basic
    @Column(name="contrato_consorcio_publico_convenio_cooperacao")
    private Boolean contratoConsorcioPublicoConvenioCooperacao;

}
