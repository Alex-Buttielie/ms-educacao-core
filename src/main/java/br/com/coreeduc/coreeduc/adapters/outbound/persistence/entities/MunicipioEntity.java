package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;

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
