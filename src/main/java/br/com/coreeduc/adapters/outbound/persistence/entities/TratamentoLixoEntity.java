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
