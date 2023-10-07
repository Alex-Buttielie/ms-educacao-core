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
@Table(name = "acesso_internet")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AcessoInternetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "para_uso_administrativo")
    private Boolean paraUsoAdministrativo;
    @Basic
    @Column(name = "para_uso_processo_aprendizagem")
    private Boolean paraUsoProcessoApredizagem;
    @Basic
    @Column(name = "para_uso_alunos")
    private Boolean paraUsoAlunos;
    @Basic
    @Column(name = "para_uso_comunidade")
    private Boolean paraUsoComunidade;
    @Basic
    @Column(name = "nao_possui_acesso_internet")
    private Boolean naoPossuiAcessoInternet;

}
