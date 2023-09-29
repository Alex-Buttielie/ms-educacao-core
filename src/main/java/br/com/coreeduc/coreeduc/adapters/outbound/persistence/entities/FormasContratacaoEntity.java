package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

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
