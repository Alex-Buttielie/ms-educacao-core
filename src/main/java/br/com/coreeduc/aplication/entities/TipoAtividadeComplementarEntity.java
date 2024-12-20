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

@Table(name = "tipo_atividade_complementar")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoAtividadeComplementarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "codigo1")
    private Long codigo1;
    @Basic
    @Column(name = "codigo2")
    private Long codigo2;
    @Basic
    @Column(name = "codigo3")
    private Long codigo3;
    @Basic
    @Column(name = "codigo4")
    private Long codigo4;
    @Basic
    @Column(name = "codigo5")
    private Long codigo5;
    @Basic
    @Column(name = "codigo6")
    private Long codigo6;
    @Basic
    @Column(name = "local_func_diferenciado")
    private Long localFuncDiferenciado;
    @Basic
    @Column(name = "modalidade")
    private Long modalidade;
    @Basic
    @Column(name = "etapa")
    private Long etapa;
    @Basic
    @Column(name = "codigo_curso")
    private Long codigoCurso;

}
