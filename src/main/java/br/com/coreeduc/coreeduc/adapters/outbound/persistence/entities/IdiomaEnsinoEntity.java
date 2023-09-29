package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "idioma_ensino")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IdiomaEnsinoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "lingua_indigena")
    private Boolean linguaIndigena;
    @Basic
    @Column(name = "lingua_portuguesa")
    private Boolean linguaPortuguesa;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private LinguaIndigenaEntity codigoLinguaIndigenaEntity1;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private LinguaIndigenaEntity codigoLinguaIndigenaEntity2;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private LinguaIndigenaEntity codigoLinguaIndigenaEntity3;
    @Basic
    @Column(name = "realiza_exames_avaliacao_alunos")
    private Boolean realizaExamesAvaliacaoAlunos;

}
