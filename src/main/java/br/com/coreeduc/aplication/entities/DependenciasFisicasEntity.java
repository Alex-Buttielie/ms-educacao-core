package br.com.coreeduc.aplication.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "dependencias_fisicas")
@Entity
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

    public DependenciasFisicasEntity() {
    }

    public DependenciasFisicasEntity(Long id,
                                     Boolean almoxarifado,
                                     Boolean areaVerde,
                                     Boolean auditorio,
                                     Boolean banheiro,
                                     Boolean banheiroAcessivelPessoasDeficiencia,
                                     Boolean banheiroAdequadoEducacaoInfantil,
                                     Boolean banheiroExclusivoParaFuncionarios,
                                     Boolean banheiroOuVestiarioComChuveiro,
                                     Boolean biblioteca,
                                     Boolean cozinha,
                                     Boolean despensa,
                                     Boolean dormitorioAluno,
                                     Boolean dormitorioProfessora,
                                     Boolean laboratorioCiencias,
                                     Boolean laboratorioInformatica,
                                     Boolean laboratorioEspecificoEducacaoProfissional,
                                     Boolean parqueInfantil,
                                     Boolean patioCoberto,
                                     Boolean patioDescoberto,
                                     Boolean piscina,
                                     Boolean quadraEsportesCoberta,
                                     Boolean quadraEsportesDescoberta,
                                     Boolean refeitorio,
                                     Boolean salaRepousoParaAluno,
                                     Boolean salaAtelieArtes,
                                     Boolean salaMusicaCoral,
                                     Boolean salaEstudioDanca,
                                     Boolean salaMultiusoMusicaDancaArtes,
                                     Boolean terreiroParaRecreacao,
                                     Boolean viveiroCriacaoAnimais,
                                     Boolean salaDiretoria,
                                     Boolean salaLeitura,
                                     Boolean salaProfessores,
                                     Boolean salaRecursosMultifuncionais,
                                     Boolean salaSecretaria,
                                     Boolean salasOficinasEducacaoProfissional,
                                     Boolean nenhumaDasDependenciasRelacionadas) {
        this.id = id;
        this.almoxarifado = almoxarifado;
        this.areaVerde = areaVerde;
        this.auditorio = auditorio;
        this.banheiro = banheiro;
        this.banheiroAcessivelPessoasDeficiencia = banheiroAcessivelPessoasDeficiencia;
        this.banheiroAdequadoEducacaoInfantil = banheiroAdequadoEducacaoInfantil;
        this.banheiroExclusivoParaFuncionarios = banheiroExclusivoParaFuncionarios;
        this.banheiroOuVestiarioComChuveiro = banheiroOuVestiarioComChuveiro;
        this.biblioteca = biblioteca;
        this.cozinha = cozinha;
        this.despensa = despensa;
        this.dormitorioAluno = dormitorioAluno;
        this.dormitorioProfessora = dormitorioProfessora;
        this.laboratorioCiencias = laboratorioCiencias;
        this.laboratorioInformatica = laboratorioInformatica;
        this.laboratorioEspecificoEducacaoProfissional = laboratorioEspecificoEducacaoProfissional;
        this.parqueInfantil = parqueInfantil;
        this.patioCoberto = patioCoberto;
        this.patioDescoberto = patioDescoberto;
        this.piscina = piscina;
        this.quadraEsportesCoberta = quadraEsportesCoberta;
        this.quadraEsportesDescoberta = quadraEsportesDescoberta;
        this.refeitorio = refeitorio;
        this.salaRepousoParaAluno = salaRepousoParaAluno;
        this.salaAtelieArtes = salaAtelieArtes;
        this.salaMusicaCoral = salaMusicaCoral;
        this.salaEstudioDanca = salaEstudioDanca;
        this.salaMultiusoMusicaDancaArtes = salaMultiusoMusicaDancaArtes;
        this.terreiroParaRecreacao = terreiroParaRecreacao;
        this.viveiroCriacaoAnimais = viveiroCriacaoAnimais;
        this.salaDiretoria = salaDiretoria;
        this.salaLeitura = salaLeitura;
        this.salaProfessores = salaProfessores;
        this.salaRecursosMultifuncionais = salaRecursosMultifuncionais;
        this.salaSecretaria = salaSecretaria;
        this.salasOficinasEducacaoProfissional = salasOficinasEducacaoProfissional;
        this.nenhumaDasDependenciasRelacionadas = nenhumaDasDependenciasRelacionadas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAlmoxarifado() {
        return almoxarifado;
    }

    public void setAlmoxarifado(Boolean almoxarifado) {
        this.almoxarifado = almoxarifado;
    }

    public Boolean getAreaVerde() {
        return areaVerde;
    }

    public void setAreaVerde(Boolean areaVerde) {
        this.areaVerde = areaVerde;
    }

    public Boolean getAuditorio() {
        return auditorio;
    }

    public void setAuditorio(Boolean auditorio) {
        this.auditorio = auditorio;
    }

    public Boolean getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(Boolean banheiro) {
        this.banheiro = banheiro;
    }

    public Boolean getBanheiroAcessivelPessoasDeficiencia() {
        return banheiroAcessivelPessoasDeficiencia;
    }

    public void setBanheiroAcessivelPessoasDeficiencia(Boolean banheiroAcessivelPessoasDeficiencia) {
        this.banheiroAcessivelPessoasDeficiencia = banheiroAcessivelPessoasDeficiencia;
    }

    public Boolean getBanheiroAdequadoEducacaoInfantil() {
        return banheiroAdequadoEducacaoInfantil;
    }

    public void setBanheiroAdequadoEducacaoInfantil(Boolean banheiroAdequadoEducacaoInfantil) {
        this.banheiroAdequadoEducacaoInfantil = banheiroAdequadoEducacaoInfantil;
    }

    public Boolean getBanheiroExclusivoParaFuncionarios() {
        return banheiroExclusivoParaFuncionarios;
    }

    public void setBanheiroExclusivoParaFuncionarios(Boolean banheiroExclusivoParaFuncionarios) {
        this.banheiroExclusivoParaFuncionarios = banheiroExclusivoParaFuncionarios;
    }

    public Boolean getBanheiroOuVestiarioComChuveiro() {
        return banheiroOuVestiarioComChuveiro;
    }

    public void setBanheiroOuVestiarioComChuveiro(Boolean banheiroOuVestiarioComChuveiro) {
        this.banheiroOuVestiarioComChuveiro = banheiroOuVestiarioComChuveiro;
    }

    public Boolean getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Boolean biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Boolean getCozinha() {
        return cozinha;
    }

    public void setCozinha(Boolean cozinha) {
        this.cozinha = cozinha;
    }

    public Boolean getDespensa() {
        return despensa;
    }

    public void setDespensa(Boolean despensa) {
        this.despensa = despensa;
    }

    public Boolean getDormitorioAluno() {
        return dormitorioAluno;
    }

    public void setDormitorioAluno(Boolean dormitorioAluno) {
        this.dormitorioAluno = dormitorioAluno;
    }

    public Boolean getDormitorioProfessora() {
        return dormitorioProfessora;
    }

    public void setDormitorioProfessora(Boolean dormitorioProfessora) {
        this.dormitorioProfessora = dormitorioProfessora;
    }

    public Boolean getLaboratorioCiencias() {
        return laboratorioCiencias;
    }

    public void setLaboratorioCiencias(Boolean laboratorioCiencias) {
        this.laboratorioCiencias = laboratorioCiencias;
    }

    public Boolean getLaboratorioInformatica() {
        return laboratorioInformatica;
    }

    public void setLaboratorioInformatica(Boolean laboratorioInformatica) {
        this.laboratorioInformatica = laboratorioInformatica;
    }

    public Boolean getLaboratorioEspecificoEducacaoProfissional() {
        return laboratorioEspecificoEducacaoProfissional;
    }

    public void setLaboratorioEspecificoEducacaoProfissional(Boolean laboratorioEspecificoEducacaoProfissional) {
        this.laboratorioEspecificoEducacaoProfissional = laboratorioEspecificoEducacaoProfissional;
    }

    public Boolean getParqueInfantil() {
        return parqueInfantil;
    }

    public void setParqueInfantil(Boolean parqueInfantil) {
        this.parqueInfantil = parqueInfantil;
    }

    public Boolean getPatioCoberto() {
        return patioCoberto;
    }

    public void setPatioCoberto(Boolean patioCoberto) {
        this.patioCoberto = patioCoberto;
    }

    public Boolean getPatioDescoberto() {
        return patioDescoberto;
    }

    public void setPatioDescoberto(Boolean patioDescoberto) {
        this.patioDescoberto = patioDescoberto;
    }

    public Boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(Boolean piscina) {
        this.piscina = piscina;
    }

    public Boolean getQuadraEsportesCoberta() {
        return quadraEsportesCoberta;
    }

    public void setQuadraEsportesCoberta(Boolean quadraEsportesCoberta) {
        this.quadraEsportesCoberta = quadraEsportesCoberta;
    }

    public Boolean getQuadraEsportesDescoberta() {
        return quadraEsportesDescoberta;
    }

    public void setQuadraEsportesDescoberta(Boolean quadraEsportesDescoberta) {
        this.quadraEsportesDescoberta = quadraEsportesDescoberta;
    }

    public Boolean getRefeitorio() {
        return refeitorio;
    }

    public void setRefeitorio(Boolean refeitorio) {
        this.refeitorio = refeitorio;
    }

    public Boolean getSalaRepousoParaAluno() {
        return salaRepousoParaAluno;
    }

    public void setSalaRepousoParaAluno(Boolean salaRepousoParaAluno) {
        this.salaRepousoParaAluno = salaRepousoParaAluno;
    }

    public Boolean getSalaAtelieArtes() {
        return salaAtelieArtes;
    }

    public void setSalaAtelieArtes(Boolean salaAtelieArtes) {
        this.salaAtelieArtes = salaAtelieArtes;
    }

    public Boolean getSalaMusicaCoral() {
        return salaMusicaCoral;
    }

    public void setSalaMusicaCoral(Boolean salaMusicaCoral) {
        this.salaMusicaCoral = salaMusicaCoral;
    }

    public Boolean getSalaEstudioDanca() {
        return salaEstudioDanca;
    }

    public void setSalaEstudioDanca(Boolean salaEstudioDanca) {
        this.salaEstudioDanca = salaEstudioDanca;
    }

    public Boolean getSalaMultiusoMusicaDancaArtes() {
        return salaMultiusoMusicaDancaArtes;
    }

    public void setSalaMultiusoMusicaDancaArtes(Boolean salaMultiusoMusicaDancaArtes) {
        this.salaMultiusoMusicaDancaArtes = salaMultiusoMusicaDancaArtes;
    }

    public Boolean getTerreiroParaRecreacao() {
        return terreiroParaRecreacao;
    }

    public void setTerreiroParaRecreacao(Boolean terreiroParaRecreacao) {
        this.terreiroParaRecreacao = terreiroParaRecreacao;
    }

    public Boolean getViveiroCriacaoAnimais() {
        return viveiroCriacaoAnimais;
    }

    public void setViveiroCriacaoAnimais(Boolean viveiroCriacaoAnimais) {
        this.viveiroCriacaoAnimais = viveiroCriacaoAnimais;
    }

    public Boolean getSalaDiretoria() {
        return salaDiretoria;
    }

    public void setSalaDiretoria(Boolean salaDiretoria) {
        this.salaDiretoria = salaDiretoria;
    }

    public Boolean getSalaLeitura() {
        return salaLeitura;
    }

    public void setSalaLeitura(Boolean salaLeitura) {
        this.salaLeitura = salaLeitura;
    }

    public Boolean getSalaProfessores() {
        return salaProfessores;
    }

    public void setSalaProfessores(Boolean salaProfessores) {
        this.salaProfessores = salaProfessores;
    }

    public Boolean getSalaRecursosMultifuncionais() {
        return salaRecursosMultifuncionais;
    }

    public void setSalaRecursosMultifuncionais(Boolean salaRecursosMultifuncionais) {
        this.salaRecursosMultifuncionais = salaRecursosMultifuncionais;
    }

    public Boolean getSalaSecretaria() {
        return salaSecretaria;
    }

    public void setSalaSecretaria(Boolean salaSecretaria) {
        this.salaSecretaria = salaSecretaria;
    }

    public Boolean getSalasOficinasEducacaoProfissional() {
        return salasOficinasEducacaoProfissional;
    }

    public void setSalasOficinasEducacaoProfissional(Boolean salasOficinasEducacaoProfissional) {
        this.salasOficinasEducacaoProfissional = salasOficinasEducacaoProfissional;
    }

    public Boolean getNenhumaDasDependenciasRelacionadas() {
        return nenhumaDasDependenciasRelacionadas;
    }

    public void setNenhumaDasDependenciasRelacionadas(Boolean nenhumaDasDependenciasRelacionadas) {
        this.nenhumaDasDependenciasRelacionadas = nenhumaDasDependenciasRelacionadas;
    }
}
