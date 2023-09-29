package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "endereco_unidade")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoUnidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="cep")
    private Integer cep;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private MunicipioEntity fkMun;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private DistritoEntity distrito;
    @Basic
    @Column(name="endereco")
    private String  endereco;
    @Basic
    @Column(name="numero")
    private String  numero;
    @Basic
    @Column(name="complemento")
    private String  complemento;
    @Basic
    @Column(name="bairro")
    private String  bairro;
    @Basic
    @Column(name="ddd")
    private Integer ddd;

}
