package br.com.coreeduc.aplication.entities;

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
