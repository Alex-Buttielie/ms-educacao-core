package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "destinacao_lixo")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DestinacaoLixoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "servico_coleta")
    private Boolean servicoColeta;
    @Basic
    @Column(name = "queima")
    private Boolean queima;
    @Basic
    @Column(name = "enterra")
    private Boolean enterra;
    @Basic
    @Column(name = "leva_destinacao_licenciada_poder_publico")
    private Boolean levaDestinacaoLicenciadaPoderPublico;
    @Basic
    @Column(name = "descarta_em_outra_area")
    private Boolean descartaEmOutraArea;

}
