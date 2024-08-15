package br.com.coreeduc.aplication.entities;

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
