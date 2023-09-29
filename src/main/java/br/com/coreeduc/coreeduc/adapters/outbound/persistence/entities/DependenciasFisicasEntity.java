package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "dependencias_fisicas")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DependenciasFisicasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "almoxarifado")
    private Boolean almoxarifado;
    @Basic
    @Column(name = "area_verde")
    private Boolean areaVerde;
    @Basic
    @Column(name = "auditorio")
    private Boolean auditorio;
    @Basic
    @Column(name = "banheiro")
    private Boolean banheiro;
    @Basic
    @Column(name = "banheiro_acessivel_pessoas_deficiencia")
    private Boolean banheiroAcessivelPessoasDeficiencia;
    @Basic
    @Column(name = "banheiro_adequado_educacao_infantil")
    private Boolean banheiroAdequadoEducacaoInfantil;
    @Basic
    @Column(name = "banheiro_exclusivo_para_funcionarios")
    private Boolean banheiroExclusivoParaFuncionarios;
    @Basic
    @Column(name = "banheiro_ou_vestiario_com_chuveiro")
    private Boolean banheiroOuVestiarioComChuveiro;
    @Basic
    @Column(name = "biblioteca")
    private Boolean biblioteca;
    @Basic
    @Column(name = "cozinha")
    private Boolean cozinha;
    @Basic
    @Column(name = "dispensa")
    private Boolean despensa;
    @Basic
    @Column(name = "dormitorio_aluno")
    private Boolean dormitorioAluno;
    @Basic
    @Column(name = "dormitorio_professora")
    private Boolean dormitorioProfessora;
    @Basic
    @Column(name = "laboratorio_ciencias")
    private Boolean laboratorioCiencias;
    @Basic
    @Column(name = "laboratorio_informatica")
    private Boolean laboratorioInformatica;
    @Basic
    @Column(name = "laboratorio_especifico_educacao_profissional")
    private Boolean laboratorioEspecificoEducacaoProfissional;
    @Basic
    @Column(name = "parque_infantil")
    private Boolean parqueInfantil;
    @Basic
    @Column(name = "patio_coberto")
    private Boolean patioCoberto;
    @Basic
    @Column(name = "patio_descoberto")
    private Boolean patioDescoberto;
    @Basic
    @Column(name = "piscina")
    private Boolean piscina;
    @Basic
    @Column(name = "quadra_esportes_coberta")
    private Boolean quadraEsportesCoberta;
    @Basic
    @Column(name = "quadra_esportes_descoberta")
    private Boolean quadraEsportesDescoberta;
    @Basic
    @Column(name = "refeitorio")
    private Boolean refeitorio;
    @Basic
    @Column(name = "sala_repouso_aluno")
    private Boolean salaRepousoParaAluno;
    @Basic
    @Column(name = "sala_atelie_artes")
    private Boolean salaAtelieArtes;
    @Basic
    @Column(name = "sala_musica_coral")
    private Boolean salaMusicaCoral;
    @Basic
    @Column(name = "sala_estudio_danca")
    private Boolean salaEstudioDanca;
    @Basic
    @Column(name = "sala_multiuso_musica_danca_artes")
    private Boolean salaMultiusoMusicaDancaArtes;
    @Basic
    @Column(name = "terreiro_para_recreacao")
    private Boolean terreiroParaRecreacao;
    @Basic
    @Column(name = "viveiro_criacao_animais")
    private Boolean viveiroCriacaoAnimais;
    @Basic
    @Column(name = "servico_diretoria")
    private Boolean salaDiretoria;
    @Basic
    @Column(name = "sala_leituira")
    private Boolean salaLeitura;
    @Basic
    @Column(name = "sala_professores")
    private Boolean salaProfessores;
    @Basic
    @Column(name = "sala_recursos_multifuncionais")
    private Boolean salaRecursosMultifuncionais;
    @Basic
    @Column(name = "sala_secretaria")
    private Boolean salaSecretaria;
    @Basic
    @Column(name = "sala_oficinas_educacao_profissional")
    private Boolean salasOficinasEducacaoProfissional;
    @Basic
    @Column(name = "nenhuma_das_dependencias_relacionadas")
    private Boolean nenhumaDasDependenciasRelacionadas;

}
