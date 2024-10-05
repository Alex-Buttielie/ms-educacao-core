package br.com.coreeduc.aplication.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "formacao_complementar_pedagogica_professor")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FormacaoComplementarPedagogicaProfessorEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaConhecimentoEntity areaConhecimentoEntityComponentesCurriculares1;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaConhecimentoEntity areaConhecimentoEntityComponentesCurriculares2;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private AreaConhecimentoEntity areaConhecimentoEntityComponentesCurriculares3;

}
