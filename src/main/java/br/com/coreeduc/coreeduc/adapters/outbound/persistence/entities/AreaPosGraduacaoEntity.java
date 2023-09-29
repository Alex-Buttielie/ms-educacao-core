package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
