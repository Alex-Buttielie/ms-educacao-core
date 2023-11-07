package br.com.coreeduc.adapters.outbound.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "ano")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "dt_fechamento_ano ")
    private Date dtFechamentoAno;
    @Basic
    @Column(name = "dt_fechamento_1_semestre  ")
    private Date dtFechamento1Semestre;
    @Basic
    @Column(name = "dtFechamento2Semestre  ")
    private Date dtFechamento2Semestre;

}
