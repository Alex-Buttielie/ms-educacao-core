package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Table(name = "tipo_deficiencia_espectro_altas_habilidades")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoDeficienciaEspectroAltasHabilidadesEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "pessoa_com_deficiencia_espectro_autistia_superdotacao")
    private Boolean pessoaComDeficienciaEspectroAutistaSuperdotacao;
    @Basic
    @Column(name = "cegueira")
    private Boolean cegueira;
    @Basic
    @Column(name = "baixa_visao")
    private Boolean baixaVisao;
    @Basic
    @Column(name = "surdez")
    private Boolean surdez;
    @Basic
    @Column(name = "dificiencia_auditiva")
    private Boolean deficienciaAuditiva;
    @Basic
    @Column(name = "surdo_cegueira")
    private Boolean surdoCegueira;
    @Basic
    @Column(name = "deficiencia_fisica")
    private Boolean deficienciaFisica;
    @Basic
    @Column(name = "deficiencia_intelectual")
    private Boolean deficienciaIntectual;
    @Basic
    @Column(name = "deficiencia_multipla")
    private Boolean deficienciaMultipla;
    @Basic
    @Column(name = "transtorno_espectro_autista")
    private Boolean transtornoEspectroAutista;
    @Basic
    @Column(name = "altas_habilidades_superdotacao")
    private Boolean altasHabilidadesSuperdotacao;

}
