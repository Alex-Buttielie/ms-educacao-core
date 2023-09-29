package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "tratamento_lixo")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TratamentoLixoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "separacao_lixo_residuos")
    private Boolean separacaoDoLixoResiduos;
    @Basic
    @Column(name = "reaproveitamento_reutilizacao")
    private Boolean reaproveitamentoReutilizacao;
    @Basic
    @Column(name = "recliclagem")
    private Boolean reciclagem;
    @Basic
    @Column(name = "nao_faz_tratamento")
    private Boolean naoFazTratamento;

}
