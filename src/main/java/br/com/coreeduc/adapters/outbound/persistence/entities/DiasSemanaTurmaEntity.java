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

@Table(name = "dias_semana_turma")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiasSemanaTurmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "domingo")
    private Boolean domingo;
    @Basic
    @Column(name = "segunda")
    private Boolean segunda;
    @Basic
    @Column(name = "terca")
    private Boolean terca;
    @Basic
    @Column(name = "quarta")
    private Boolean quarta;
    @Basic
    @Column(name = "quinta")
    private Boolean quinta;
    @Basic
    @Column(name = "sexta")
    private Boolean sexta;
    @Basic
    @Column(name = "sabado")
    private Boolean sabado;

}
