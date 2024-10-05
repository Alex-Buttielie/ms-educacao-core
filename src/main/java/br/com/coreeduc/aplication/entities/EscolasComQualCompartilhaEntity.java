package br.com.coreeduc.aplication.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "escolas_com_qual_compartilha")
@Entity
@Builder
public class EscolasComQualCompartilhaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha1;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha2;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha3;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha4;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha5;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonFormat
    private UnidadeEnsinoEntity codigoEscolaComQualCompartilha6;
    @Basic
    @Column(name = "fornece_agua_potavel_para_consumo")
    private Boolean forneceAguaPotavelParaConsumo;

    public EscolasComQualCompartilhaEntity(Long id, UnidadeEnsinoEntity codigoEscolaComQualCompartilha1, UnidadeEnsinoEntity codigoEscolaComQualCompartilha2, UnidadeEnsinoEntity codigoEscolaComQualCompartilha3, UnidadeEnsinoEntity codigoEscolaComQualCompartilha4, UnidadeEnsinoEntity codigoEscolaComQualCompartilha5, UnidadeEnsinoEntity codigoEscolaComQualCompartilha6, Boolean forneceAguaPotavelParaConsumo) {
        this.id = id;
        this.codigoEscolaComQualCompartilha1 = codigoEscolaComQualCompartilha1;
        this.codigoEscolaComQualCompartilha2 = codigoEscolaComQualCompartilha2;
        this.codigoEscolaComQualCompartilha3 = codigoEscolaComQualCompartilha3;
        this.codigoEscolaComQualCompartilha4 = codigoEscolaComQualCompartilha4;
        this.codigoEscolaComQualCompartilha5 = codigoEscolaComQualCompartilha5;
        this.codigoEscolaComQualCompartilha6 = codigoEscolaComQualCompartilha6;
        this.forneceAguaPotavelParaConsumo = forneceAguaPotavelParaConsumo;
    }

    public EscolasComQualCompartilhaEntity(UnidadeEnsinoEntity codigoEscolaComQualCompartilha1, UnidadeEnsinoEntity codigoEscolaComQualCompartilha2, UnidadeEnsinoEntity codigoEscolaComQualCompartilha3, UnidadeEnsinoEntity codigoEscolaComQualCompartilha4, UnidadeEnsinoEntity codigoEscolaComQualCompartilha5, UnidadeEnsinoEntity codigoEscolaComQualCompartilha6, Boolean forneceAguaPotavelParaConsumo) {
        this.codigoEscolaComQualCompartilha1 = codigoEscolaComQualCompartilha1;
        this.codigoEscolaComQualCompartilha2 = codigoEscolaComQualCompartilha2;
        this.codigoEscolaComQualCompartilha3 = codigoEscolaComQualCompartilha3;
        this.codigoEscolaComQualCompartilha4 = codigoEscolaComQualCompartilha4;
        this.codigoEscolaComQualCompartilha5 = codigoEscolaComQualCompartilha5;
        this.codigoEscolaComQualCompartilha6 = codigoEscolaComQualCompartilha6;
        this.forneceAguaPotavelParaConsumo = forneceAguaPotavelParaConsumo;
    }

    public EscolasComQualCompartilhaEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UnidadeEnsinoEntity getCodigoEscolaComQualCompartilha1() {
        return codigoEscolaComQualCompartilha1;
    }

    public void setCodigoEscolaComQualCompartilha1(UnidadeEnsinoEntity codigoEscolaComQualCompartilha1) {
        this.codigoEscolaComQualCompartilha1 = codigoEscolaComQualCompartilha1;
    }

    public UnidadeEnsinoEntity getCodigoEscolaComQualCompartilha2() {
        return codigoEscolaComQualCompartilha2;
    }

    public void setCodigoEscolaComQualCompartilha2(UnidadeEnsinoEntity codigoEscolaComQualCompartilha2) {
        this.codigoEscolaComQualCompartilha2 = codigoEscolaComQualCompartilha2;
    }

    public UnidadeEnsinoEntity getCodigoEscolaComQualCompartilha3() {
        return codigoEscolaComQualCompartilha3;
    }

    public void setCodigoEscolaComQualCompartilha3(UnidadeEnsinoEntity codigoEscolaComQualCompartilha3) {
        this.codigoEscolaComQualCompartilha3 = codigoEscolaComQualCompartilha3;
    }

    public UnidadeEnsinoEntity getCodigoEscolaComQualCompartilha4() {
        return codigoEscolaComQualCompartilha4;
    }

    public void setCodigoEscolaComQualCompartilha4(UnidadeEnsinoEntity codigoEscolaComQualCompartilha4) {
        this.codigoEscolaComQualCompartilha4 = codigoEscolaComQualCompartilha4;
    }

    public UnidadeEnsinoEntity getCodigoEscolaComQualCompartilha5() {
        return codigoEscolaComQualCompartilha5;
    }

    public void setCodigoEscolaComQualCompartilha5(UnidadeEnsinoEntity codigoEscolaComQualCompartilha5) {
        this.codigoEscolaComQualCompartilha5 = codigoEscolaComQualCompartilha5;
    }

    public UnidadeEnsinoEntity getCodigoEscolaComQualCompartilha6() {
        return codigoEscolaComQualCompartilha6;
    }

    public void setCodigoEscolaComQualCompartilha6(UnidadeEnsinoEntity codigoEscolaComQualCompartilha6) {
        this.codigoEscolaComQualCompartilha6 = codigoEscolaComQualCompartilha6;
    }

    public Boolean getForneceAguaPotavelParaConsumo() {
        return forneceAguaPotavelParaConsumo;
    }

    public void setForneceAguaPotavelParaConsumo(Boolean forneceAguaPotavelParaConsumo) {
        this.forneceAguaPotavelParaConsumo = forneceAguaPotavelParaConsumo;
    }
}
