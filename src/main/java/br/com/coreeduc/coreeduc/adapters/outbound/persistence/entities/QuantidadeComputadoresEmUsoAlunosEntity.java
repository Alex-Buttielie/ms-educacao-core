package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "quantidade_computadores_em_uso_alunos")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuantidadeComputadoresEmUsoAlunosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "computadores_mesa_desktop")
    private Long computadoresMesaDesktop;
    @Basic
    @Column(name = "computadores_portateis")
    private Long computadoresPortateis;
    @Basic
    @Column(name = "tablets")
    private Long tablets;

}
