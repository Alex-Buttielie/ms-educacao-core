package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "municipio")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MunicipioEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Id
    @Basic
    @Column(name="codigo_mec")
    private Long codigoMec;
    @Basic
    @Column(name="nome")
    private String nome;
}
