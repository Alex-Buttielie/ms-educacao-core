package br.com.coreeduc.aplication.entities;

import br.com.coreeduc.aplication.contraints.Regulamentacao;
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
@Table(name = "numero_matriculas_atendidas_parceria_convenio")
@Entity
@Builder
public class NumeroMatriculasAtendidasParceriaConvenioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name="atividade_complementar")
    private Integer atividadeComplementar;
    @Basic
    @Column(name="atendimento_educacional_especializado")
    private Integer atendimentoEducacionalEspecializado;
    @Basic
    @Column(name="ensino_regular_creche_parc")
    private Integer ensinoRegularCrecheParc;
    @Basic
    @Column(name="ensino_regular_creche_integ")
    private Integer ensinoRegularCrecheInteg;
    @Basic
    @Column(name="ensino_regular_pre_escola_parc")
    private Integer ensinoRegularPreEscolaParc;
    @Basic
    @Column(name="ensino_regular_pre_escola_integ")
    private Integer ensinoRegularPreEscolaInteg;
    @Basic
    @Column(name="ensino_regular_ensino_fundamental_anos_iniciais_parc")
    private Integer ensinoRegularEnsinoFundamentalAnosIniciaisParc;
    @Basic
    @Column(name="ensino_regular_ensino_fundamental_anos_iniciais_integ")
    private Integer ensinoRegularEnsinoFundamentalAnosIniciaisInteg;
    @Basic
    @Column(name="ensino_regular_ensino_fundamental_anos_finais_parc")
    private Integer ensinoRegularEnsinoFundamentalAnosFinaisParc;
    @Basic
    @Column(name="ensino_regular_ensino_fundamental_anos_finais_integ")
    private Integer ensinoRegularensinoFundamentalAnosFinaisInteg;
    @Basic
    @Column(name="ensino_regular_ensino_medio_parc")
    private Integer ensinoRegularensinoMedioParc;
    @Basic
    @Column(name="ensino_regular_ensino_medio_integ")
    private Integer ensinoRegularEnsinoMedioInteg;
    @Basic
    @Column(name="edu_especial_classe_especial_parc")
    private Integer eduEspecialClasseEspecialParc;
    @Basic
    @Column(name="edu_especial_classe_especial_integ")
    private Integer eduEspecialClasseEspecialinteg;
    @Basic
    @Column(name="edu_jov_adult_ensino_fundamental_medio_parc")
    private Integer eduJovAdultoEnsinoFundamentalMedioParc;
    @Basic
    @Column(name="edu_jov_adult_ensino_fundamental_medio_integ")
    private Integer eduDeJovEAdultejaensinoFundamentalEMedioInteg;
    @Basic
    @Column(name="edu_prof_qual_integ_jov_adult_ensino_fundamental_parc")
    private Integer eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc;
    @Basic
    @Column(name="edu_prof_qual_integ_jov_adult_ens_fund_integ")
    private Integer eduProfQualProfintegEduJovAdultEnsFundInteg;
    @Basic
    @Column(name="edu_prof_qual_tec_integ_jov_adult_niv_medio_parc")
    private Integer eduProfQualTecintegJovAdultNivMedioParc;
    @Basic
    @Column(name="edu_prof_qual_tec_integ_jov_adult_niv_medio_integ")
    private Integer eduProfQualProfTecintegJovAdultNivMedioInteg;
    @Basic
    @Column(name="edu_prof_qual_prof_tec_concomit_edu_jov_adult_niv_med_parc")
    private Integer eduProfQualProfTecConcomitEduJovAdultNivMedParc;
    @Basic
    @Column(name="edu_prof_qual_prof_tec_concomit_edu_jov_adult_niv_med_integ")
    private Integer eduProfQualProfTecConcomitEduJovAdultNivMedInteg;
    @Basic
    @Column(name="edu_qual_prof_tec_concom_inter_compl_edu_jov_adu_niv_medio_parc")
    private Integer eduQualProfTecConcomInterComplEduJovAduNivMedioParc;
    @Basic
    @Column(name="edu_qual_prof_tec_concom_inter_compl_edu_jov_adu_niv_med_integ")
    private Integer eduQualProfTecConcomInterComplEduJovAduNivMedInteg;
    @Basic
    @Column(name="edu_prof_qual_prof_tec_integ_ens_med_parc")
    private Integer eduProfQualProfTecintegEnsMedParc;
    @Basic
    @Column(name="edu_prof_qual_prof_tec_integ_ens_med_integ")
    private Integer eduProfQualProfTecintegEnsMedInteg;
    @Basic
    @Column(name="edu_pro_qual_prof_tec_concomit_ens_med_parc")
    private Integer eduProQualProfTecConcomitEnsMedParc;
    @Basic
    @Column(name="edu_pro_qual_prof_tec_concomit_ens_med_integ")
    private Integer eduProQualProfTecConcomitEnsMedInteg;
    @Basic
    @Column(name="edu_pro_qual_prof_tec_concomit_inter_compl_ens_med_parc")
    private Integer eduProQualProfTecConcomitInterComplEnsMedParc;
    @Basic
    @Column(name="edu_pro_qual_prof_tec_concomit_inter_compl_ens_med_integ")
    private Integer eduProQualProfTecConcomitInterComplEnsMedInteg;
    @Basic
    @Column(name="edu_prof_edu_prof_tec_niv_med_integ_edu_jov_adult_niv_med_parc")
    private Integer eduProfTecNivMedIntegEduJovAdultNivMedParc;
    @Basic
    @Column(name="edu_prof_edu_prof_tec_niv_med_integ_edu_jov_adult_niv_med_integ")
    private Integer eduProfTecNivMedIntegEduJovAdultNivMedInteg;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_edu_jov_adult_niv_med_parc")
    private Integer eduProfTecNivMedConcomitEduJovAdultNivMedParc;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_edu_jov_adult_niv_med_integ")
    private Integer eduProfTecNivMedConcomitEduJovAdultNivMedInteg;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_int_edu_jov_adult_niv_med_parc")
    private Integer eduProfTecNivMedConcomitIntEduJovAdultNivMedParc;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_int_edu_jov_adult_niv_med_integ")
    private Integer eduProfTecNivMedConcomitIntEduJovAdultNivMedInteg;
    @Basic
    @Column(name="edu_prof_tec_niv_med_integ_ens_med_parc")
    private Integer eduProfTecNivMedintegEnsMedParc;
    @Basic
    @Column(name="edu_prof_tec_niv_med_integ_ens_med_integ")
    private Integer eduProfTecNivMedintegEnsMedInteg;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_ens_med_parc")
    private Integer eduProfTecNivMedConcomitEnsMedParc;
    @Basic
    @Column(name="edu_prof_tec_niv_med_subsequente_ens_med")
    private Integer eduProfTecNivMedSubsequenteEnsMed;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_ens_med_integ")
    private Integer eduProfTecNivMedConcomitEnsMedInteg;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_inter_compl_ens_medio_parc")
    private Integer eduProfTecNivMedConcomitInterComplEnsMedioParc;
    @Basic
    @Column(name="edu_prof_tec_niv_medio_concomit_inter_comple_ens_medio_integ")
    private Integer eduProfTecNivMedioConcomitInterCompleEnsMedioInteg;
    @Basic
    @Column(name="cnpj_mantenedora_princ_escola_privada")
    private String cnpjMantenedoraPrincEscolaPrivada;
    @Basic
    @Column(name="reg_autor_conselho_orgao_mun_est_fed_edu")
    private Regulamentacao regAutorConselhoOrgaoMunEstFedEdu;

    public NumeroMatriculasAtendidasParceriaConvenioEntity(Long id, Integer atividadeComplementar, Integer atendimentoEducacionalEspecializado, Integer ensinoRegularCrecheParc, Integer ensinoRegularCrecheInteg, Integer ensinoRegularPreEscolaParc, Integer ensinoRegularPreEscolaInteg, Integer ensinoRegularEnsinoFundamentalAnosIniciaisParc, Integer ensinoRegularEnsinoFundamentalAnosIniciaisInteg, Integer ensinoRegularEnsinoFundamentalAnosFinaisParc, Integer ensinoRegularensinoFundamentalAnosFinaisInteg, Integer ensinoRegularensinoMedioParc, Integer ensinoRegularEnsinoMedioInteg, Integer eduEspecialClasseEspecialParc, Integer eduEspecialClasseEspecialinteg, Integer eduJovAdultoEnsinoFundamentalMedioParc, Integer eduDeJovEAdultejaensinoFundamentalEMedioInteg, Integer eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc, Integer eduProfQualProfintegEduJovAdultEnsFundInteg, Integer eduProfQualTecintegJovAdultNivMedioParc, Integer eduProfQualProfTecintegJovAdultNivMedioInteg, Integer eduProfQualProfTecConcomitEduJovAdultNivMedParc, Integer eduProfQualProfTecConcomitEduJovAdultNivMedInteg, Integer eduQualProfTecConcomInterComplEduJovAduNivMedioParc, Integer eduQualProfTecConcomInterComplEduJovAduNivMedInteg, Integer eduProfQualProfTecintegEnsMedParc, Integer eduProfQualProfTecintegEnsMedInteg, Integer eduProQualProfTecConcomitEnsMedParc, Integer eduProQualProfTecConcomitEnsMedInteg, Integer eduProQualProfTecConcomitInterComplEnsMedParc, Integer eduProQualProfTecConcomitInterComplEnsMedInteg, Integer eduProfTecNivMedIntegEduJovAdultNivMedParc, Integer eduProfTecNivMedIntegEduJovAdultNivMedInteg, Integer eduProfTecNivMedConcomitEduJovAdultNivMedParc, Integer eduProfTecNivMedConcomitEduJovAdultNivMedInteg, Integer eduProfTecNivMedConcomitIntEduJovAdultNivMedParc, Integer eduProfTecNivMedConcomitIntEduJovAdultNivMedInteg, Integer eduProfTecNivMedintegEnsMedParc, Integer eduProfTecNivMedintegEnsMedInteg, Integer eduProfTecNivMedConcomitEnsMedParc, Integer eduProfTecNivMedSubsequenteEnsMed, Integer eduProfTecNivMedConcomitEnsMedInteg, Integer eduProfTecNivMedConcomitInterComplEnsMedioParc, Integer eduProfTecNivMedioConcomitInterCompleEnsMedioInteg, String cnpjMantenedoraPrincEscolaPrivada, Regulamentacao regAutorConselhoOrgaoMunEstFedEdu) {
        this.id = id;
        this.atividadeComplementar = atividadeComplementar;
        this.atendimentoEducacionalEspecializado = atendimentoEducacionalEspecializado;
        this.ensinoRegularCrecheParc = ensinoRegularCrecheParc;
        this.ensinoRegularCrecheInteg = ensinoRegularCrecheInteg;
        this.ensinoRegularPreEscolaParc = ensinoRegularPreEscolaParc;
        this.ensinoRegularPreEscolaInteg = ensinoRegularPreEscolaInteg;
        this.ensinoRegularEnsinoFundamentalAnosIniciaisParc = ensinoRegularEnsinoFundamentalAnosIniciaisParc;
        this.ensinoRegularEnsinoFundamentalAnosIniciaisInteg = ensinoRegularEnsinoFundamentalAnosIniciaisInteg;
        this.ensinoRegularEnsinoFundamentalAnosFinaisParc = ensinoRegularEnsinoFundamentalAnosFinaisParc;
        this.ensinoRegularensinoFundamentalAnosFinaisInteg = ensinoRegularensinoFundamentalAnosFinaisInteg;
        this.ensinoRegularensinoMedioParc = ensinoRegularensinoMedioParc;
        this.ensinoRegularEnsinoMedioInteg = ensinoRegularEnsinoMedioInteg;
        this.eduEspecialClasseEspecialParc = eduEspecialClasseEspecialParc;
        this.eduEspecialClasseEspecialinteg = eduEspecialClasseEspecialinteg;
        this.eduJovAdultoEnsinoFundamentalMedioParc = eduJovAdultoEnsinoFundamentalMedioParc;
        this.eduDeJovEAdultejaensinoFundamentalEMedioInteg = eduDeJovEAdultejaensinoFundamentalEMedioInteg;
        this.eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc = eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc;
        this.eduProfQualProfintegEduJovAdultEnsFundInteg = eduProfQualProfintegEduJovAdultEnsFundInteg;
        this.eduProfQualTecintegJovAdultNivMedioParc = eduProfQualTecintegJovAdultNivMedioParc;
        this.eduProfQualProfTecintegJovAdultNivMedioInteg = eduProfQualProfTecintegJovAdultNivMedioInteg;
        this.eduProfQualProfTecConcomitEduJovAdultNivMedParc = eduProfQualProfTecConcomitEduJovAdultNivMedParc;
        this.eduProfQualProfTecConcomitEduJovAdultNivMedInteg = eduProfQualProfTecConcomitEduJovAdultNivMedInteg;
        this.eduQualProfTecConcomInterComplEduJovAduNivMedioParc = eduQualProfTecConcomInterComplEduJovAduNivMedioParc;
        this.eduQualProfTecConcomInterComplEduJovAduNivMedInteg = eduQualProfTecConcomInterComplEduJovAduNivMedInteg;
        this.eduProfQualProfTecintegEnsMedParc = eduProfQualProfTecintegEnsMedParc;
        this.eduProfQualProfTecintegEnsMedInteg = eduProfQualProfTecintegEnsMedInteg;
        this.eduProQualProfTecConcomitEnsMedParc = eduProQualProfTecConcomitEnsMedParc;
        this.eduProQualProfTecConcomitEnsMedInteg = eduProQualProfTecConcomitEnsMedInteg;
        this.eduProQualProfTecConcomitInterComplEnsMedParc = eduProQualProfTecConcomitInterComplEnsMedParc;
        this.eduProQualProfTecConcomitInterComplEnsMedInteg = eduProQualProfTecConcomitInterComplEnsMedInteg;
        this.eduProfTecNivMedIntegEduJovAdultNivMedParc = eduProfTecNivMedIntegEduJovAdultNivMedParc;
        this.eduProfTecNivMedIntegEduJovAdultNivMedInteg = eduProfTecNivMedIntegEduJovAdultNivMedInteg;
        this.eduProfTecNivMedConcomitEduJovAdultNivMedParc = eduProfTecNivMedConcomitEduJovAdultNivMedParc;
        this.eduProfTecNivMedConcomitEduJovAdultNivMedInteg = eduProfTecNivMedConcomitEduJovAdultNivMedInteg;
        this.eduProfTecNivMedConcomitIntEduJovAdultNivMedParc = eduProfTecNivMedConcomitIntEduJovAdultNivMedParc;
        this.eduProfTecNivMedConcomitIntEduJovAdultNivMedInteg = eduProfTecNivMedConcomitIntEduJovAdultNivMedInteg;
        this.eduProfTecNivMedintegEnsMedParc = eduProfTecNivMedintegEnsMedParc;
        this.eduProfTecNivMedintegEnsMedInteg = eduProfTecNivMedintegEnsMedInteg;
        this.eduProfTecNivMedConcomitEnsMedParc = eduProfTecNivMedConcomitEnsMedParc;
        this.eduProfTecNivMedSubsequenteEnsMed = eduProfTecNivMedSubsequenteEnsMed;
        this.eduProfTecNivMedConcomitEnsMedInteg = eduProfTecNivMedConcomitEnsMedInteg;
        this.eduProfTecNivMedConcomitInterComplEnsMedioParc = eduProfTecNivMedConcomitInterComplEnsMedioParc;
        this.eduProfTecNivMedioConcomitInterCompleEnsMedioInteg = eduProfTecNivMedioConcomitInterCompleEnsMedioInteg;
        this.cnpjMantenedoraPrincEscolaPrivada = cnpjMantenedoraPrincEscolaPrivada;
        this.regAutorConselhoOrgaoMunEstFedEdu = regAutorConselhoOrgaoMunEstFedEdu;
    }

    public NumeroMatriculasAtendidasParceriaConvenioEntity(Integer atividadeComplementar, Integer atendimentoEducacionalEspecializado, Integer ensinoRegularCrecheParc, Integer ensinoRegularCrecheInteg, Integer ensinoRegularPreEscolaParc, Integer ensinoRegularPreEscolaInteg, Integer ensinoRegularEnsinoFundamentalAnosIniciaisParc, Integer ensinoRegularEnsinoFundamentalAnosIniciaisInteg, Integer ensinoRegularEnsinoFundamentalAnosFinaisParc, Integer ensinoRegularensinoFundamentalAnosFinaisInteg, Integer ensinoRegularensinoMedioParc, Integer ensinoRegularEnsinoMedioInteg, Integer eduEspecialClasseEspecialParc, Integer eduEspecialClasseEspecialinteg, Integer eduJovAdultoEnsinoFundamentalMedioParc, Integer eduDeJovEAdultejaensinoFundamentalEMedioInteg, Integer eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc, Integer eduProfQualProfintegEduJovAdultEnsFundInteg, Integer eduProfQualTecintegJovAdultNivMedioParc, Integer eduProfQualProfTecintegJovAdultNivMedioInteg, Integer eduProfQualProfTecConcomitEduJovAdultNivMedParc, Integer eduProfQualProfTecConcomitEduJovAdultNivMedInteg, Integer eduQualProfTecConcomInterComplEduJovAduNivMedioParc, Integer eduQualProfTecConcomInterComplEduJovAduNivMedInteg, Integer eduProfQualProfTecintegEnsMedParc, Integer eduProfQualProfTecintegEnsMedInteg, Integer eduProQualProfTecConcomitEnsMedParc, Integer eduProQualProfTecConcomitEnsMedInteg, Integer eduProQualProfTecConcomitInterComplEnsMedParc, Integer eduProQualProfTecConcomitInterComplEnsMedInteg, Integer eduProfTecNivMedIntegEduJovAdultNivMedParc, Integer eduProfTecNivMedIntegEduJovAdultNivMedInteg, Integer eduProfTecNivMedConcomitEduJovAdultNivMedParc, Integer eduProfTecNivMedConcomitEduJovAdultNivMedInteg, Integer eduProfTecNivMedConcomitIntEduJovAdultNivMedParc, Integer eduProfTecNivMedConcomitIntEduJovAdultNivMedInteg, Integer eduProfTecNivMedintegEnsMedParc, Integer eduProfTecNivMedintegEnsMedInteg, Integer eduProfTecNivMedConcomitEnsMedParc, Integer eduProfTecNivMedSubsequenteEnsMed, Integer eduProfTecNivMedConcomitEnsMedInteg, Integer eduProfTecNivMedConcomitInterComplEnsMedioParc, Integer eduProfTecNivMedioConcomitInterCompleEnsMedioInteg, String cnpjMantenedoraPrincEscolaPrivada, Regulamentacao regAutorConselhoOrgaoMunEstFedEdu) {
        this.atividadeComplementar = atividadeComplementar;
        this.atendimentoEducacionalEspecializado = atendimentoEducacionalEspecializado;
        this.ensinoRegularCrecheParc = ensinoRegularCrecheParc;
        this.ensinoRegularCrecheInteg = ensinoRegularCrecheInteg;
        this.ensinoRegularPreEscolaParc = ensinoRegularPreEscolaParc;
        this.ensinoRegularPreEscolaInteg = ensinoRegularPreEscolaInteg;
        this.ensinoRegularEnsinoFundamentalAnosIniciaisParc = ensinoRegularEnsinoFundamentalAnosIniciaisParc;
        this.ensinoRegularEnsinoFundamentalAnosIniciaisInteg = ensinoRegularEnsinoFundamentalAnosIniciaisInteg;
        this.ensinoRegularEnsinoFundamentalAnosFinaisParc = ensinoRegularEnsinoFundamentalAnosFinaisParc;
        this.ensinoRegularensinoFundamentalAnosFinaisInteg = ensinoRegularensinoFundamentalAnosFinaisInteg;
        this.ensinoRegularensinoMedioParc = ensinoRegularensinoMedioParc;
        this.ensinoRegularEnsinoMedioInteg = ensinoRegularEnsinoMedioInteg;
        this.eduEspecialClasseEspecialParc = eduEspecialClasseEspecialParc;
        this.eduEspecialClasseEspecialinteg = eduEspecialClasseEspecialinteg;
        this.eduJovAdultoEnsinoFundamentalMedioParc = eduJovAdultoEnsinoFundamentalMedioParc;
        this.eduDeJovEAdultejaensinoFundamentalEMedioInteg = eduDeJovEAdultejaensinoFundamentalEMedioInteg;
        this.eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc = eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc;
        this.eduProfQualProfintegEduJovAdultEnsFundInteg = eduProfQualProfintegEduJovAdultEnsFundInteg;
        this.eduProfQualTecintegJovAdultNivMedioParc = eduProfQualTecintegJovAdultNivMedioParc;
        this.eduProfQualProfTecintegJovAdultNivMedioInteg = eduProfQualProfTecintegJovAdultNivMedioInteg;
        this.eduProfQualProfTecConcomitEduJovAdultNivMedParc = eduProfQualProfTecConcomitEduJovAdultNivMedParc;
        this.eduProfQualProfTecConcomitEduJovAdultNivMedInteg = eduProfQualProfTecConcomitEduJovAdultNivMedInteg;
        this.eduQualProfTecConcomInterComplEduJovAduNivMedioParc = eduQualProfTecConcomInterComplEduJovAduNivMedioParc;
        this.eduQualProfTecConcomInterComplEduJovAduNivMedInteg = eduQualProfTecConcomInterComplEduJovAduNivMedInteg;
        this.eduProfQualProfTecintegEnsMedParc = eduProfQualProfTecintegEnsMedParc;
        this.eduProfQualProfTecintegEnsMedInteg = eduProfQualProfTecintegEnsMedInteg;
        this.eduProQualProfTecConcomitEnsMedParc = eduProQualProfTecConcomitEnsMedParc;
        this.eduProQualProfTecConcomitEnsMedInteg = eduProQualProfTecConcomitEnsMedInteg;
        this.eduProQualProfTecConcomitInterComplEnsMedParc = eduProQualProfTecConcomitInterComplEnsMedParc;
        this.eduProQualProfTecConcomitInterComplEnsMedInteg = eduProQualProfTecConcomitInterComplEnsMedInteg;
        this.eduProfTecNivMedIntegEduJovAdultNivMedParc = eduProfTecNivMedIntegEduJovAdultNivMedParc;
        this.eduProfTecNivMedIntegEduJovAdultNivMedInteg = eduProfTecNivMedIntegEduJovAdultNivMedInteg;
        this.eduProfTecNivMedConcomitEduJovAdultNivMedParc = eduProfTecNivMedConcomitEduJovAdultNivMedParc;
        this.eduProfTecNivMedConcomitEduJovAdultNivMedInteg = eduProfTecNivMedConcomitEduJovAdultNivMedInteg;
        this.eduProfTecNivMedConcomitIntEduJovAdultNivMedParc = eduProfTecNivMedConcomitIntEduJovAdultNivMedParc;
        this.eduProfTecNivMedConcomitIntEduJovAdultNivMedInteg = eduProfTecNivMedConcomitIntEduJovAdultNivMedInteg;
        this.eduProfTecNivMedintegEnsMedParc = eduProfTecNivMedintegEnsMedParc;
        this.eduProfTecNivMedintegEnsMedInteg = eduProfTecNivMedintegEnsMedInteg;
        this.eduProfTecNivMedConcomitEnsMedParc = eduProfTecNivMedConcomitEnsMedParc;
        this.eduProfTecNivMedSubsequenteEnsMed = eduProfTecNivMedSubsequenteEnsMed;
        this.eduProfTecNivMedConcomitEnsMedInteg = eduProfTecNivMedConcomitEnsMedInteg;
        this.eduProfTecNivMedConcomitInterComplEnsMedioParc = eduProfTecNivMedConcomitInterComplEnsMedioParc;
        this.eduProfTecNivMedioConcomitInterCompleEnsMedioInteg = eduProfTecNivMedioConcomitInterCompleEnsMedioInteg;
        this.cnpjMantenedoraPrincEscolaPrivada = cnpjMantenedoraPrincEscolaPrivada;
        this.regAutorConselhoOrgaoMunEstFedEdu = regAutorConselhoOrgaoMunEstFedEdu;
    }

    public NumeroMatriculasAtendidasParceriaConvenioEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAtividadeComplementar() {
        return atividadeComplementar;
    }

    public void setAtividadeComplementar(Integer atividadeComplementar) {
        this.atividadeComplementar = atividadeComplementar;
    }

    public Integer getAtendimentoEducacionalEspecializado() {
        return atendimentoEducacionalEspecializado;
    }

    public void setAtendimentoEducacionalEspecializado(Integer atendimentoEducacionalEspecializado) {
        this.atendimentoEducacionalEspecializado = atendimentoEducacionalEspecializado;
    }

    public Integer getEnsinoRegularCrecheParc() {
        return ensinoRegularCrecheParc;
    }

    public void setEnsinoRegularCrecheParc(Integer ensinoRegularCrecheParc) {
        this.ensinoRegularCrecheParc = ensinoRegularCrecheParc;
    }

    public Integer getEnsinoRegularCrecheInteg() {
        return ensinoRegularCrecheInteg;
    }

    public void setEnsinoRegularCrecheInteg(Integer ensinoRegularCrecheInteg) {
        this.ensinoRegularCrecheInteg = ensinoRegularCrecheInteg;
    }

    public Integer getEnsinoRegularPreEscolaParc() {
        return ensinoRegularPreEscolaParc;
    }

    public void setEnsinoRegularPreEscolaParc(Integer ensinoRegularPreEscolaParc) {
        this.ensinoRegularPreEscolaParc = ensinoRegularPreEscolaParc;
    }

    public Integer getEnsinoRegularPreEscolaInteg() {
        return ensinoRegularPreEscolaInteg;
    }

    public void setEnsinoRegularPreEscolaInteg(Integer ensinoRegularPreEscolaInteg) {
        this.ensinoRegularPreEscolaInteg = ensinoRegularPreEscolaInteg;
    }

    public Integer getEnsinoRegularEnsinoFundamentalAnosIniciaisParc() {
        return ensinoRegularEnsinoFundamentalAnosIniciaisParc;
    }

    public void setEnsinoRegularEnsinoFundamentalAnosIniciaisParc(Integer ensinoRegularEnsinoFundamentalAnosIniciaisParc) {
        this.ensinoRegularEnsinoFundamentalAnosIniciaisParc = ensinoRegularEnsinoFundamentalAnosIniciaisParc;
    }

    public Integer getEnsinoRegularEnsinoFundamentalAnosIniciaisInteg() {
        return ensinoRegularEnsinoFundamentalAnosIniciaisInteg;
    }

    public void setEnsinoRegularEnsinoFundamentalAnosIniciaisInteg(Integer ensinoRegularEnsinoFundamentalAnosIniciaisInteg) {
        this.ensinoRegularEnsinoFundamentalAnosIniciaisInteg = ensinoRegularEnsinoFundamentalAnosIniciaisInteg;
    }

    public Integer getEnsinoRegularEnsinoFundamentalAnosFinaisParc() {
        return ensinoRegularEnsinoFundamentalAnosFinaisParc;
    }

    public void setEnsinoRegularEnsinoFundamentalAnosFinaisParc(Integer ensinoRegularEnsinoFundamentalAnosFinaisParc) {
        this.ensinoRegularEnsinoFundamentalAnosFinaisParc = ensinoRegularEnsinoFundamentalAnosFinaisParc;
    }

    public Integer getEnsinoRegularensinoFundamentalAnosFinaisInteg() {
        return ensinoRegularensinoFundamentalAnosFinaisInteg;
    }

    public void setEnsinoRegularensinoFundamentalAnosFinaisInteg(Integer ensinoRegularensinoFundamentalAnosFinaisInteg) {
        this.ensinoRegularensinoFundamentalAnosFinaisInteg = ensinoRegularensinoFundamentalAnosFinaisInteg;
    }

    public Integer getEnsinoRegularensinoMedioParc() {
        return ensinoRegularensinoMedioParc;
    }

    public void setEnsinoRegularensinoMedioParc(Integer ensinoRegularensinoMedioParc) {
        this.ensinoRegularensinoMedioParc = ensinoRegularensinoMedioParc;
    }

    public Integer getEnsinoRegularEnsinoMedioInteg() {
        return ensinoRegularEnsinoMedioInteg;
    }

    public void setEnsinoRegularEnsinoMedioInteg(Integer ensinoRegularEnsinoMedioInteg) {
        this.ensinoRegularEnsinoMedioInteg = ensinoRegularEnsinoMedioInteg;
    }

    public Integer getEduEspecialClasseEspecialParc() {
        return eduEspecialClasseEspecialParc;
    }

    public void setEduEspecialClasseEspecialParc(Integer eduEspecialClasseEspecialParc) {
        this.eduEspecialClasseEspecialParc = eduEspecialClasseEspecialParc;
    }

    public Integer getEduEspecialClasseEspecialinteg() {
        return eduEspecialClasseEspecialinteg;
    }

    public void setEduEspecialClasseEspecialinteg(Integer eduEspecialClasseEspecialinteg) {
        this.eduEspecialClasseEspecialinteg = eduEspecialClasseEspecialinteg;
    }

    public Integer getEduJovAdultoEnsinoFundamentalMedioParc() {
        return eduJovAdultoEnsinoFundamentalMedioParc;
    }

    public void setEduJovAdultoEnsinoFundamentalMedioParc(Integer eduJovAdultoEnsinoFundamentalMedioParc) {
        this.eduJovAdultoEnsinoFundamentalMedioParc = eduJovAdultoEnsinoFundamentalMedioParc;
    }

    public Integer getEduDeJovEAdultejaensinoFundamentalEMedioInteg() {
        return eduDeJovEAdultejaensinoFundamentalEMedioInteg;
    }

    public void setEduDeJovEAdultejaensinoFundamentalEMedioInteg(Integer eduDeJovEAdultejaensinoFundamentalEMedioInteg) {
        this.eduDeJovEAdultejaensinoFundamentalEMedioInteg = eduDeJovEAdultejaensinoFundamentalEMedioInteg;
    }

    public Integer getEduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc() {
        return eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc;
    }

    public void setEduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc(Integer eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc) {
        this.eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc = eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc;
    }

    public Integer getEduProfQualProfintegEduJovAdultEnsFundInteg() {
        return eduProfQualProfintegEduJovAdultEnsFundInteg;
    }

    public void setEduProfQualProfintegEduJovAdultEnsFundInteg(Integer eduProfQualProfintegEduJovAdultEnsFundInteg) {
        this.eduProfQualProfintegEduJovAdultEnsFundInteg = eduProfQualProfintegEduJovAdultEnsFundInteg;
    }

    public Integer getEduProfQualTecintegJovAdultNivMedioParc() {
        return eduProfQualTecintegJovAdultNivMedioParc;
    }

    public void setEduProfQualTecintegJovAdultNivMedioParc(Integer eduProfQualTecintegJovAdultNivMedioParc) {
        this.eduProfQualTecintegJovAdultNivMedioParc = eduProfQualTecintegJovAdultNivMedioParc;
    }

    public Integer getEduProfQualProfTecintegJovAdultNivMedioInteg() {
        return eduProfQualProfTecintegJovAdultNivMedioInteg;
    }

    public void setEduProfQualProfTecintegJovAdultNivMedioInteg(Integer eduProfQualProfTecintegJovAdultNivMedioInteg) {
        this.eduProfQualProfTecintegJovAdultNivMedioInteg = eduProfQualProfTecintegJovAdultNivMedioInteg;
    }

    public Integer getEduProfQualProfTecConcomitEduJovAdultNivMedParc() {
        return eduProfQualProfTecConcomitEduJovAdultNivMedParc;
    }

    public void setEduProfQualProfTecConcomitEduJovAdultNivMedParc(Integer eduProfQualProfTecConcomitEduJovAdultNivMedParc) {
        this.eduProfQualProfTecConcomitEduJovAdultNivMedParc = eduProfQualProfTecConcomitEduJovAdultNivMedParc;
    }

    public Integer getEduProfQualProfTecConcomitEduJovAdultNivMedInteg() {
        return eduProfQualProfTecConcomitEduJovAdultNivMedInteg;
    }

    public void setEduProfQualProfTecConcomitEduJovAdultNivMedInteg(Integer eduProfQualProfTecConcomitEduJovAdultNivMedInteg) {
        this.eduProfQualProfTecConcomitEduJovAdultNivMedInteg = eduProfQualProfTecConcomitEduJovAdultNivMedInteg;
    }

    public Integer getEduQualProfTecConcomInterComplEduJovAduNivMedioParc() {
        return eduQualProfTecConcomInterComplEduJovAduNivMedioParc;
    }

    public void setEduQualProfTecConcomInterComplEduJovAduNivMedioParc(Integer eduQualProfTecConcomInterComplEduJovAduNivMedioParc) {
        this.eduQualProfTecConcomInterComplEduJovAduNivMedioParc = eduQualProfTecConcomInterComplEduJovAduNivMedioParc;
    }

    public Integer getEduQualProfTecConcomInterComplEduJovAduNivMedInteg() {
        return eduQualProfTecConcomInterComplEduJovAduNivMedInteg;
    }

    public void setEduQualProfTecConcomInterComplEduJovAduNivMedInteg(Integer eduQualProfTecConcomInterComplEduJovAduNivMedInteg) {
        this.eduQualProfTecConcomInterComplEduJovAduNivMedInteg = eduQualProfTecConcomInterComplEduJovAduNivMedInteg;
    }

    public Integer getEduProfQualProfTecintegEnsMedParc() {
        return eduProfQualProfTecintegEnsMedParc;
    }

    public void setEduProfQualProfTecintegEnsMedParc(Integer eduProfQualProfTecintegEnsMedParc) {
        this.eduProfQualProfTecintegEnsMedParc = eduProfQualProfTecintegEnsMedParc;
    }

    public Integer getEduProfQualProfTecintegEnsMedInteg() {
        return eduProfQualProfTecintegEnsMedInteg;
    }

    public void setEduProfQualProfTecintegEnsMedInteg(Integer eduProfQualProfTecintegEnsMedInteg) {
        this.eduProfQualProfTecintegEnsMedInteg = eduProfQualProfTecintegEnsMedInteg;
    }

    public Integer getEduProQualProfTecConcomitEnsMedParc() {
        return eduProQualProfTecConcomitEnsMedParc;
    }

    public void setEduProQualProfTecConcomitEnsMedParc(Integer eduProQualProfTecConcomitEnsMedParc) {
        this.eduProQualProfTecConcomitEnsMedParc = eduProQualProfTecConcomitEnsMedParc;
    }

    public Integer getEduProQualProfTecConcomitEnsMedInteg() {
        return eduProQualProfTecConcomitEnsMedInteg;
    }

    public void setEduProQualProfTecConcomitEnsMedInteg(Integer eduProQualProfTecConcomitEnsMedInteg) {
        this.eduProQualProfTecConcomitEnsMedInteg = eduProQualProfTecConcomitEnsMedInteg;
    }

    public Integer getEduProQualProfTecConcomitInterComplEnsMedParc() {
        return eduProQualProfTecConcomitInterComplEnsMedParc;
    }

    public void setEduProQualProfTecConcomitInterComplEnsMedParc(Integer eduProQualProfTecConcomitInterComplEnsMedParc) {
        this.eduProQualProfTecConcomitInterComplEnsMedParc = eduProQualProfTecConcomitInterComplEnsMedParc;
    }

    public Integer getEduProQualProfTecConcomitInterComplEnsMedInteg() {
        return eduProQualProfTecConcomitInterComplEnsMedInteg;
    }

    public void setEduProQualProfTecConcomitInterComplEnsMedInteg(Integer eduProQualProfTecConcomitInterComplEnsMedInteg) {
        this.eduProQualProfTecConcomitInterComplEnsMedInteg = eduProQualProfTecConcomitInterComplEnsMedInteg;
    }

    public Integer getEduProfTecNivMedIntegEduJovAdultNivMedParc() {
        return eduProfTecNivMedIntegEduJovAdultNivMedParc;
    }

    public void setEduProfTecNivMedIntegEduJovAdultNivMedParc(Integer eduProfTecNivMedIntegEduJovAdultNivMedParc) {
        this.eduProfTecNivMedIntegEduJovAdultNivMedParc = eduProfTecNivMedIntegEduJovAdultNivMedParc;
    }

    public Integer getEduProfTecNivMedIntegEduJovAdultNivMedInteg() {
        return eduProfTecNivMedIntegEduJovAdultNivMedInteg;
    }

    public void setEduProfTecNivMedIntegEduJovAdultNivMedInteg(Integer eduProfTecNivMedIntegEduJovAdultNivMedInteg) {
        this.eduProfTecNivMedIntegEduJovAdultNivMedInteg = eduProfTecNivMedIntegEduJovAdultNivMedInteg;
    }

    public Integer getEduProfTecNivMedConcomitEduJovAdultNivMedParc() {
        return eduProfTecNivMedConcomitEduJovAdultNivMedParc;
    }

    public void setEduProfTecNivMedConcomitEduJovAdultNivMedParc(Integer eduProfTecNivMedConcomitEduJovAdultNivMedParc) {
        this.eduProfTecNivMedConcomitEduJovAdultNivMedParc = eduProfTecNivMedConcomitEduJovAdultNivMedParc;
    }

    public Integer getEduProfTecNivMedConcomitEduJovAdultNivMedInteg() {
        return eduProfTecNivMedConcomitEduJovAdultNivMedInteg;
    }

    public void setEduProfTecNivMedConcomitEduJovAdultNivMedInteg(Integer eduProfTecNivMedConcomitEduJovAdultNivMedInteg) {
        this.eduProfTecNivMedConcomitEduJovAdultNivMedInteg = eduProfTecNivMedConcomitEduJovAdultNivMedInteg;
    }

    public Integer getEduProfTecNivMedConcomitIntEduJovAdultNivMedParc() {
        return eduProfTecNivMedConcomitIntEduJovAdultNivMedParc;
    }

    public void setEduProfTecNivMedConcomitIntEduJovAdultNivMedParc(Integer eduProfTecNivMedConcomitIntEduJovAdultNivMedParc) {
        this.eduProfTecNivMedConcomitIntEduJovAdultNivMedParc = eduProfTecNivMedConcomitIntEduJovAdultNivMedParc;
    }

    public Integer getEduProfTecNivMedConcomitIntEduJovAdultNivMedInteg() {
        return eduProfTecNivMedConcomitIntEduJovAdultNivMedInteg;
    }

    public void setEduProfTecNivMedConcomitIntEduJovAdultNivMedInteg(Integer eduProfTecNivMedConcomitIntEduJovAdultNivMedInteg) {
        this.eduProfTecNivMedConcomitIntEduJovAdultNivMedInteg = eduProfTecNivMedConcomitIntEduJovAdultNivMedInteg;
    }

    public Integer getEduProfTecNivMedintegEnsMedParc() {
        return eduProfTecNivMedintegEnsMedParc;
    }

    public void setEduProfTecNivMedintegEnsMedParc(Integer eduProfTecNivMedintegEnsMedParc) {
        this.eduProfTecNivMedintegEnsMedParc = eduProfTecNivMedintegEnsMedParc;
    }

    public Integer getEduProfTecNivMedintegEnsMedInteg() {
        return eduProfTecNivMedintegEnsMedInteg;
    }

    public void setEduProfTecNivMedintegEnsMedInteg(Integer eduProfTecNivMedintegEnsMedInteg) {
        this.eduProfTecNivMedintegEnsMedInteg = eduProfTecNivMedintegEnsMedInteg;
    }

    public Integer getEduProfTecNivMedConcomitEnsMedParc() {
        return eduProfTecNivMedConcomitEnsMedParc;
    }

    public void setEduProfTecNivMedConcomitEnsMedParc(Integer eduProfTecNivMedConcomitEnsMedParc) {
        this.eduProfTecNivMedConcomitEnsMedParc = eduProfTecNivMedConcomitEnsMedParc;
    }

    public Integer getEduProfTecNivMedSubsequenteEnsMed() {
        return eduProfTecNivMedSubsequenteEnsMed;
    }

    public void setEduProfTecNivMedSubsequenteEnsMed(Integer eduProfTecNivMedSubsequenteEnsMed) {
        this.eduProfTecNivMedSubsequenteEnsMed = eduProfTecNivMedSubsequenteEnsMed;
    }

    public Integer getEduProfTecNivMedConcomitEnsMedInteg() {
        return eduProfTecNivMedConcomitEnsMedInteg;
    }

    public void setEduProfTecNivMedConcomitEnsMedInteg(Integer eduProfTecNivMedConcomitEnsMedInteg) {
        this.eduProfTecNivMedConcomitEnsMedInteg = eduProfTecNivMedConcomitEnsMedInteg;
    }

    public Integer getEduProfTecNivMedConcomitInterComplEnsMedioParc() {
        return eduProfTecNivMedConcomitInterComplEnsMedioParc;
    }

    public void setEduProfTecNivMedConcomitInterComplEnsMedioParc(Integer eduProfTecNivMedConcomitInterComplEnsMedioParc) {
        this.eduProfTecNivMedConcomitInterComplEnsMedioParc = eduProfTecNivMedConcomitInterComplEnsMedioParc;
    }

    public Integer getEduProfTecNivMedioConcomitInterCompleEnsMedioInteg() {
        return eduProfTecNivMedioConcomitInterCompleEnsMedioInteg;
    }

    public void setEduProfTecNivMedioConcomitInterCompleEnsMedioInteg(Integer eduProfTecNivMedioConcomitInterCompleEnsMedioInteg) {
        this.eduProfTecNivMedioConcomitInterCompleEnsMedioInteg = eduProfTecNivMedioConcomitInterCompleEnsMedioInteg;
    }

    public String getCnpjMantenedoraPrincEscolaPrivada() {
        return cnpjMantenedoraPrincEscolaPrivada;
    }

    public void setCnpjMantenedoraPrincEscolaPrivada(String cnpjMantenedoraPrincEscolaPrivada) {
        this.cnpjMantenedoraPrincEscolaPrivada = cnpjMantenedoraPrincEscolaPrivada;
    }

    public Regulamentacao getRegAutorConselhoOrgaoMunEstFedEdu() {
        return regAutorConselhoOrgaoMunEstFedEdu;
    }

    public void setRegAutorConselhoOrgaoMunEstFedEdu(Regulamentacao regAutorConselhoOrgaoMunEstFedEdu) {
        this.regAutorConselhoOrgaoMunEstFedEdu = regAutorConselhoOrgaoMunEstFedEdu;
    }
}
