package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

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
