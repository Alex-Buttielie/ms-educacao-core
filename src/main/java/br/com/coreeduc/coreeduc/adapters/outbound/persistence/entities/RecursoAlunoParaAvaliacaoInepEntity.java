package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

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


@Table(name = "recurso_aluno_para_avaliacao_inep")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecursoAlunoParaAvaliacaoInepEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "auxilio_ledor")
    private Boolean auxilioLedor;
    @Basic
    @Column(name = "auxilio_transcricao")
    private Boolean auxilioTranscricao;
    @Basic
    @Column(name = "guia_interprete")
    private Boolean guiaInterprete;
    @Basic
    @Column(name = "tradutor_interprete_libras")
    private Boolean tradutorInterpreteLibras;
    @Basic
    @Column(name = "leitura_labial")
    private Boolean leituraLabial;
    @Basic
    @Column(name = "prova_ampliada_fonte_18")
    private Boolean provaAmpliadaFonte18;
    @Basic
    @Column(name = "prova_superampliada_fonte_24")
    private Boolean provaSuperAmpliadaFonte24;
    @Basic
    @Column(name = "codigo_audio_deficiente_visual")
    private Boolean codigoAudioDeficienteVisual;
    @Basic
    @Column(name = "prova_lingua_portuguesa_segunda_linha_surdos_deficiente_auditiv")
    private Boolean provaLinguaPortuguesaSegundaLinguaSurdosDeficientesAuditivos;
    @Basic
    @Column(name = "prova_videos_libras")
    private Boolean provaVideosLibras;
    @Basic
    @Column(name = "materia_didatico_prova_braille")
    private Boolean materiaDidaticoProvaBraille;
    @Basic
    @Column(name = "nenhum")
    private Boolean nenhum;

}
