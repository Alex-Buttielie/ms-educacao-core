package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "fonte_energia_eletrica")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FonteEnergiaEletricaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "rede_publica")
    private Boolean redePublica;
    @Basic
    @Column(name = "gerador_movido_combustivel_fossil")
    private Boolean geradorMovidoACombustivelFossil;
    @Basic
    @Column(name = "fontes_energias_renovaveis_alternativas")
    private Boolean fontesEnergiaRenovaveisAlternativas;
    @Basic
    @Column(name = "nao_ha_energia_eletrica")
    private Boolean naoHaEnergiaEletrica;

}
