package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import br.com.coreeduc.coreeduc.aplication.domains.contraints.EducacaoBasica;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "esfera_administrativa")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EsferaAdministrativaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="federal")
    private Boolean federal;
    @Basic
    @Column(name="estadual")
    private Boolean estadual;
    @Basic
    @Column(name="municipal")
    private Boolean municipal;
    @Basic
    @Column(name="uni_vin_escola_edu_basica_uni_ofertante_edu_sup")
    private EducacaoBasica uniVinEscolaEduBasicaUniOfertanteEduSup;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity fkUniEscolaSede;
    @Basic
    @Column(name="codigo_ies")
    private Integer codigoIes;

}
