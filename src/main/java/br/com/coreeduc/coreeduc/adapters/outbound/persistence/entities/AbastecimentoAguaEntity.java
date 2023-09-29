package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

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
