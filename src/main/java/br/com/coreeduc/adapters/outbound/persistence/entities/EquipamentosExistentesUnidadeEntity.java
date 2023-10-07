package br.com.coreeduc.adapters.outbound.persistence.entities;

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
@Table(name = "equipamentos_existentes_unidade")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EquipamentosExistentesUnidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "antena_parabolica")
    private Boolean antenaParabolica;
    @Basic
    @Column(name = "computadores")
    private Boolean computadores;
    @Basic
    @Column(name = "copiadora")
    private Boolean copiadora;
    @Basic
    @Column(name = "impressora")
    private Boolean impressora;
    @Basic
    @Column(name = "impressora_multifuncional")
    private Boolean impressoraMultifuncional;
    @Basic
    @Column(name = "scnaner")
    private Boolean scanner;
    @Basic
    @Column(name = "nenhum_dos_equipamentos_listados")
    private Boolean nenhumDosEquipamentosListados;

}
