package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "recurso_pessoas_deficientes")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecursoPessoasDeficientesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "corrimao_guarda_copos")
    private Boolean corrimaoGuardaCorpos;
    @Basic
    @Column(name = "elevador")
    private Boolean elevador;
    @Basic
    @Column(name = "pisos_tateis")
    private Boolean pisosTateis;
    @Basic
    @Column(name = "portas_vao_livre")
    private Boolean portasVaoLivre;
    @Basic
    @Column(name = "rampas")
    private Boolean rampas;
    @Basic
    @Column(name = "sinalizacao_sonora")
    private Boolean sinalizacaoSonora;
    @Basic
    @Column(name = "sinalizacao_tatil")
    private Boolean sinalizacaoTatil;
    @Basic
    @Column(name = "sinalizacao_visual")
    private Boolean sinalizacaoVisual;
    @Basic
    @Column(name = "nenhum_recusos_acessibilidade")
    private Boolean nenhumRecursosAcessibilidade;
    @Basic
    @Column(name = "numero_salas_utilizadas_predio")
    private Integer numeroSalasUtilizadasPredio;
    @Basic
    @Column(name = "numero_salas_utilizadas_escola_fora_predio")
    private Integer numeroSalasAulaUtilizadasEscolaForaPredio;
    @Basic
    @Column(name = "numero_salas_climatizadas")
    private Integer numeroSalasClimatizadas;
    @Basic
    @Column(name = "numero_salas_acessivel_pessoas_deficientes")
    private Integer numeroSalasAcessivelPessoasDeficientes;

}
