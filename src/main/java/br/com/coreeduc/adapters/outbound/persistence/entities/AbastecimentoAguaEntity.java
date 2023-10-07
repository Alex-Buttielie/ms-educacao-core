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


@Table(name = "abastecimento_agua")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AbastecimentoAguaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "rede_publica")
    private Boolean redePublica;
    @Basic
    @Column(name = "poco_artesiano")
    private Boolean pocoArtesiano;
    @Basic
    @Column(name = "cacimba_cisterna_poco")
    private Boolean cacimbaCisternaPoco;
    @Basic
    @Column(name = "fonte_rio_igarape_riacho_corrego")
    private Boolean fonteRioIgarapeRiachoCorrego;
    @Basic
    @Column(name = "nao_ha_abastecimento_agua")
    private Boolean naoHaAbastecimentoAgua;

}
