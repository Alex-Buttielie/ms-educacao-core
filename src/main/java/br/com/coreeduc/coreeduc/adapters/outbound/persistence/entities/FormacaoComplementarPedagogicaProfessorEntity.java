package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

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
