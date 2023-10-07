package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "area_conhecimento")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AreaConhecimentoEntity {
    @Id
    @Basic
    @Column(name="codigo")
    private Long codigo;
    @Basic
    @Column(name="nome")
    private String nome;


}
