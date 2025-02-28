package br.com.coreeduc.aplication.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Collection;

@Table(name = "disciplinas")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class DisciplinaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="codigo_mec")
    private Long codigoMec;
    @Basic
    @Column(name="nome")
    private String nome;
    @Basic
    @Column(name="abreviacao")
    private String abreviacao;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private AreaConhecimentoEntity areaConhecimento;
    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Collection<DisciplinasMatrizEntity> disciplinasMatrizEntities;

}
