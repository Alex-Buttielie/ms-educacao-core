package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

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
