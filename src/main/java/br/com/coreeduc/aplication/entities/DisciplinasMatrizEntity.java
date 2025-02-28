package br.com.coreeduc.aplication.entities;

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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "disciplinas_matriz")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DisciplinasMatrizEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "carga_horaria_disciplina")
    private Integer cargaHorariaDisciplina;
    @ManyToOne
    @JoinColumn(name = "disciplina_id", referencedColumnName = "id", nullable = false)
    private DisciplinaEntity disciplina;
    @ManyToOne
    @JoinColumn(name = "matriz_curricular_id", referencedColumnName = "id", nullable = false)
    private MatrizCurricularEntity matrizCurricularEntities;

}
