package br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities;

import br.com.coreeduc.coreeduc.aplication.domains.contraints.Regulamentacao;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "numero_matriculas_atendidas_parceria_convenio")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
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
    private String eduProfQualProfintegEduJovAdultNoEnsinoFundamentalParc;
    @Basic
    @Column(name="edu_prof_qual_integ_jov_adult_ens_fund_integ")
    private String eduProfQualProfintegEduJovAdultEnsFundInteg;
    @Basic
    @Column(name="edu_prof_qual_tec_integ_jov_adult_niv_medio_parc")
    private String eduProfQualTecintegJovAdultNivMedioParc;
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
    private Integer EduProfTecNivMedIntegEduJovAdultNivMedParc;
    @Basic
    @Column(name="edu_prof_edu_prof_tec_niv_med_integ_edu_jov_adult_niv_med_integ")
    private Integer EduProfTecNivMedIntegEduJovAdultNivMedInteg;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_edu_jov_adult_niv_med_parc")
    private Integer eduProfTecNivMedConcomitEduJovAdultNivMedParc;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_edu_jov_adult_niv_med_integ")
    private Integer eduProfTecNivMedConcomitEduJovAdultNivMedInteg;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_int_edu_jov_adult_niv_med_parc")
    private Integer EduProfTecNivMedConcomitIntEduJovAdultNivMedParc;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_int_edu_jov_adult_niv_med_integ")
    private Integer EduProfTecNivMedConcomitIntEduJovAdultNivMedInteg;
    @Basic
    @Column(name="edu_prof_tec_niv_med_integ_ens_med_parc")
    private Integer EduProfTecNivMedintegEnsMedParc;
    @Basic
    @Column(name="edu_prof_tec_niv_med_integ_ens_med_integ")
    private Integer EduProfTecNivMedintegEnsMedInteg;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_ens_med_parc")
    private Integer EduProfTecNivMedConcomitEnsMedParc;
    @Basic
    @Column(name="edu_prof_tec_niv_med_subsequente_ens_med")
    private Integer EduProfTecNivMedSubsequenteEnsMed;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_ens_med_integ")
    private Integer EduProfTecNivMedConcomitEnsMedInteg;
    @Basic
    @Column(name="edu_prof_tec_niv_med_concomit_inter_compl_ens_medio_parc")
    private Integer EduProfTecNivMedConcomitInterComplEnsMedioParc;
    @Basic
    @Column(name="edu_prof_tec_niv_medio_concomit_inter_comple_ens_medio_integ")
    private Integer EduProfTecNivMedioConcomitInterCompleEnsMedioInteg;
    @Basic
    @Column(name="cnpj_mantenedora_princ_escola_privada")
    private String cnpjMantenedoraPrincEscolaPrivada;
    @Basic
    @Column(name="reg_autor_conselho_orgao_mun_est_fed_edu")
    private Regulamentacao regAutorConselhoOrgaoMunEstFedEdu;

}
