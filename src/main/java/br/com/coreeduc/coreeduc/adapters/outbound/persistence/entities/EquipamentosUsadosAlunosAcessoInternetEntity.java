package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

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
@Table(name = "equipamentos_usados_alunos_acesso_internet")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EquipamentosUsadosAlunosAcessoInternetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "computadores_tablets_biblioteca_unidade")
    private Boolean computadoresTabletsBibliotecaUnidade;
    @Basic
    @Column(name = "dispositivos_pessoais_computadores_portateis")
    private Boolean dispositivosPessoaisComputadoresPortateis;
    @Basic
    @Column(name = "internet_banda_larga")
    private Boolean internetBandaLarga;

}
