package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import br.com.coreeduc.coreeduc.aplication.domains.contraints.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Table(name = "pessoa")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PessoaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "identificacao_unica")
    private Long identificacaoUnica;
    @Basic
    @Column(name = "tipo_registro")
    private TipoRegistro tipoRegistro;
    @Basic
    @Column(name = "cpf")
    private String cpf;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    @Basic
    @Column(name = "tipo_filiacao")
    private TipoFiliacao tipoFiliacao;
    @Basic
    @Column(name = "nome_mae")
    private String nomeMae;
    @Basic
    @Column(name = "nome_pai")
    private String nomePai;
    @Basic
    @Column(name = "sexo")
    private Sexo sexo;
    @Basic
    @Column(name = "cor_raca")
    private CorRaca corRaca;
    @Basic
    @Column(name = "nacionalidade")
    private Nacionalidade nacionalidade;
    @Basic
    @Column(name = "pais_nacionalidade")
    private Paises paisNacionalidade;
    @Basic
    @Column(name = "numero_matricula_certidao_nascimento")
    private String numeroMatriculaCertidaoNascimento;
    @Basic
    @Column(name = "pais_residencia")
    private Paises paisResidencia;
    @Basic
    @Column(name = "cep")
    private String cep;
    @Basic
    @Column(name = "localizacao_zona_residencia")
    private LocalizacaoZonaResidencia localizacaoZonaResidencia;
    @Basic
    @Column(name = "localizacao_diferenciada_residencia")
    private LocalizacaoDiferenciadaResidencia localizacaoDiferenciadaResidencia;
    @Basic
    @Column(name = "maior_nivel_escolaridade_concluido")
    private MaiorNivelEscolaridadeConcluido maiorNivelEscolaridadeConcluido;
    @Basic
    @Column(name = "nao_tem_pos_graduacao_concluida")
    private Boolean naoTemPosGraduacaoConcluida;
    @Basic
    @Column(name = "tipo_ensino_medio_cursado")
    private TipoEnsinoMedioCursado tipoEnsinoMedioCursado;
    @Basic
    @Column(name = "endereco_eletronico_email")
    private String enderecoEletronicoEmail;
    @OneToOne()
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity fkUni;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private MunicipioEntity fkMunNasc;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private FormacaoComplementarPedagogicaProfessorEntity formacaoComplementarPedagogicaProfessor;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private PosGraduacaoConcluidaProfessorEntity posGraduacaoConcluidaProfessor;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private OutrosCursosEspecificosEntity outrosCursosEspecificos;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private TipoDeficienciaEspectroAltasHabilidadesEntity tipoDeficienciaEspectroAltasHabilidades;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private RecursoAlunoParaAvaliacaoInepEntity recursoAlunoParaAvaliacaoInep;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn()
    @JsonFormat
    private MunicipioEntity fkMunResid;

}