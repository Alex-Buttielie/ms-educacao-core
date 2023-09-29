package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

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
