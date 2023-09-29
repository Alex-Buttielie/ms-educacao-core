package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "escolas_com_qual_compartilha")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EscolasComQualCompartilhaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha1;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha2;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha3;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha4;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha5;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha6;
    @Basic
    @Column(name = "fornece_agua_potavel_para_consumo")
    private Boolean forneceAguaPotavelParaConsumo;

}
