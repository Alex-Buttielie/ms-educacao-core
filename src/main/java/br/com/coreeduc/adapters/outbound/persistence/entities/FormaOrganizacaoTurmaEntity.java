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

@Table(name = "forma_organizacao")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FormaOrganizacaoTurmaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="series_anuais")
    private Boolean seriesAnuais;
    @Basic
    @Column(name="periodos_semestrais")
    private Boolean periodosSemestrais;
    @Basic
    @Column(name="ciclos")
    private Boolean ciclos;
    @Basic
    @Column(name="grupos_nao_seriados")
    private Boolean gruposNaoSeriados;
    @Basic
    @Column(name="modulos")
    private Boolean modulos;
    @Basic
    @Column(name="alternancia_periodos")
    private Boolean alternanciaPeriodos;

}
