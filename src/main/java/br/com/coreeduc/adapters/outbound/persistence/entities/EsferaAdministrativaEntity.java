package br.com.coreeduc.adapters.outbound.persistence.entities;

import br.com.coreeduc.aplication.domains.contraints.EducacaoBasica;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
