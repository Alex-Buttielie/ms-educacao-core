package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "curso_superior")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CursoSuperiorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="codigo")
    private String codigo;
    @Basic
    @Column(name="nome")
    private String nome;
}
