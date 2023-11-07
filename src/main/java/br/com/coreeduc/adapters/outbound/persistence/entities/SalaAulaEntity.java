package br.com.coreeduc.adapters.outbound.persistence.entities;

import lombok.AllArgsConstructor;
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

@Table(name = "sala_aula")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SalaAulaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="quantidade_vagas")
    private Integer quantidadeVagas;
    @Basic
    @Column(name="nome")
    private String nome;
}
