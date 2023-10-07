package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "area_pos_graduacao")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AreaPosGraduacaoEntity {

    @Id
    @Basic
    @Column(name="codigo")
    private Long codigo;
    @Basic
    @Column(name="nome")
    private String nome;


}
