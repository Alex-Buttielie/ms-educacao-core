package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "rede_local_interligacao_computadores")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RedeLocalInterligacaoComputadoresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "cabo")
    private Boolean cabo;
    @Basic
    @Column(name = "wireless")
    private Boolean wireless;
    @Basic
    @Column(name = "nao_ha_rede_local_interligacao")
    private Boolean naoHaRedeLocalInterligacap;

}
