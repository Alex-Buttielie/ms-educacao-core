package br.com.coreeduc.aplication.domains;

public class RecursoAlunoParaAvaliacaoInep {
    private Long id;
    private Boolean auxilioLedor;
    private Boolean auxilioTranscricao;
    private Boolean guiaInterprete;
    private Boolean tradutorInterpreteLibras;
    private Boolean leituraLabial;
    private Boolean provaAmpliadaFonte18;
    private Boolean provaSuperAmpliadaFonte24;
    private Boolean codigoAudioDeficienteVisual;
    private Boolean provaLinguaPortuguesaSegundaLinguaSurdosDeficientesAuditivos;
    private Boolean provaVideosLibras;
    private Boolean materiaDidaticoProvaBraille;
    private Boolean nenhum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAuxilioLedor() {
        return auxilioLedor;
    }

    public void setAuxilioLedor(Boolean auxilioLedor) {
        this.auxilioLedor = auxilioLedor;
    }

    public Boolean getAuxilioTranscricao() {
        return auxilioTranscricao;
    }

    public void setAuxilioTranscricao(Boolean auxilioTranscricao) {
        this.auxilioTranscricao = auxilioTranscricao;
    }

    public Boolean getGuiaInterprete() {
        return guiaInterprete;
    }

    public void setGuiaInterprete(Boolean guiaInterprete) {
        this.guiaInterprete = guiaInterprete;
    }

    public Boolean getTradutorInterpreteLibras() {
        return tradutorInterpreteLibras;
    }

    public void setTradutorInterpreteLibras(Boolean tradutorInterpreteLibras) {
        this.tradutorInterpreteLibras = tradutorInterpreteLibras;
    }

    public Boolean getLeituraLabial() {
        return leituraLabial;
    }

    public void setLeituraLabial(Boolean leituraLabial) {
        this.leituraLabial = leituraLabial;
    }

    public Boolean getProvaAmpliadaFonte18() {
        return provaAmpliadaFonte18;
    }

    public void setProvaAmpliadaFonte18(Boolean provaAmpliadaFonte18) {
        this.provaAmpliadaFonte18 = provaAmpliadaFonte18;
    }

    public Boolean getProvaSuperAmpliadaFonte24() {
        return provaSuperAmpliadaFonte24;
    }

    public void setProvaSuperAmpliadaFonte24(Boolean provaSuperAmpliadaFonte24) {
        this.provaSuperAmpliadaFonte24 = provaSuperAmpliadaFonte24;
    }

    public Boolean getCodigoAudioDeficienteVisual() {
        return codigoAudioDeficienteVisual;
    }

    public void setCodigoAudioDeficienteVisual(Boolean codigoAudioDeficienteVisual) {
        this.codigoAudioDeficienteVisual = codigoAudioDeficienteVisual;
    }

    public Boolean getProvaLinguaPortuguesaSegundaLinguaSurdosDeficientesAuditivos() {
        return provaLinguaPortuguesaSegundaLinguaSurdosDeficientesAuditivos;
    }

    public void setProvaLinguaPortuguesaSegundaLinguaSurdosDeficientesAuditivos(Boolean provaLinguaPortuguesaSegundaLinguaSurdosDeficientesAuditivos) {
        this.provaLinguaPortuguesaSegundaLinguaSurdosDeficientesAuditivos = provaLinguaPortuguesaSegundaLinguaSurdosDeficientesAuditivos;
    }

    public Boolean getProvaVideosLibras() {
        return provaVideosLibras;
    }

    public void setProvaVideosLibras(Boolean provaVideosLibras) {
        this.provaVideosLibras = provaVideosLibras;
    }

    public Boolean getMateriaDidaticoProvaBraille() {
        return materiaDidaticoProvaBraille;
    }

    public void setMateriaDidaticoProvaBraille(Boolean materiaDidaticoProvaBraille) {
        this.materiaDidaticoProvaBraille = materiaDidaticoProvaBraille;
    }

    public Boolean getNenhum() {
        return nenhum;
    }

    public void setNenhum(Boolean nenhum) {
        this.nenhum = nenhum;
    }
}
