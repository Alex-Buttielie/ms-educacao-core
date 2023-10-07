package br.com.coreeduc.adapters.outbound.persistence.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
    private LinguaIndigenaEntity codigoLinguaIndigena1;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private LinguaIndigenaEntity codigoLinguaIndigena2;
    @OneToOne
    @JoinColumn()
    @JsonFormat
    private LinguaIndigenaEntity codigoLinguaIndigena3;
    @Basic
    @Column(name = "realiza_exames_avaliacao_alunos")
    private Boolean realizaExamesAvaliacaoAlunos;

}
