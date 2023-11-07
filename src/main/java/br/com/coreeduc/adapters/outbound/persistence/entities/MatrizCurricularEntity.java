package br.com.coreeduc.adapters.outbound.persistence.entities;

import br.com.coreeduc.aplication.domains.contraints.TipoMatriz;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "matriz_curricular")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MatrizCurricularEntity {

    @Id
    @Basic
    private Long id;
    @Basic
    @Column(name="ch_horaria_total")
    private String chHorariaTotal;
    @Basic
    @Column(name="tipo")
    private TipoMatriz tipo;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private ConfigAtivComplementarEntity configAtivComplementar;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private DiretrizEntity diretriz;

}
