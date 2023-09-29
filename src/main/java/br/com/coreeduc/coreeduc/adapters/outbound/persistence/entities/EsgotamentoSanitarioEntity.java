package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "esgotamento_sanitario")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EsgotamentoSanitarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "rede_publica")
    private Boolean redePublica;
    @Basic
    @Column(name = "fossa_septica")
    private Boolean fossaSeptica;
    @Basic
    @Column(name = "fossa_rudimentar_comum")
    private Boolean fossaRudimentarComum;
    @Basic
    @Column(name = "nao_ha_esgostamento_sanitario")
    private Boolean naoHaEsgotamentoSanitario;

}
