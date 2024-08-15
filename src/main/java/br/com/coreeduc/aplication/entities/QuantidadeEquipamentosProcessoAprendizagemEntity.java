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
@Table(name = "quantidade_equipamentos_processo_aprendizagem")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuantidadeEquipamentosProcessoAprendizagemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "aparelho_dev_bluray")
    private Integer aparelhoDvdBluray;
    @Basic
    @Column(name = "aparelho_som")
    private Integer aparelhoSom;
    @Basic
    @Column(name = "aparelho_televisao")
    private Integer aparelhoTelevisao;
    @Basic
    @Column(name = "lousa_digital")
    private Integer lousaDigital;
    @Basic
    @Column(name = "projetor_multimidia_data_show")
    private Integer projetorMultimidiaDataShow;

}
