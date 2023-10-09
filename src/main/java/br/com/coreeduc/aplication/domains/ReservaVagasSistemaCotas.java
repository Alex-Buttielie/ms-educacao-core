package br.com.coreeduc.aplication.domains;

public class ReservaVagasSistemaCotas {

    private Long id;
    private Boolean autoDeclaradoPretoPardoOuIndigena;
    private Boolean condicaoDeRenda;
    private Boolean oriundoEscolaPublica;
    private Boolean pessoaComDeficiencia;
    private Boolean outrosGruposNaoListados;
    private Boolean isReservaVagasCotas;
    private Boolean escolaPossuiRedesPComunicacaoInstitucional;
    private Boolean escolaCompartilhaEspacosComunidade;
    private Boolean espacoUsadoAtividadeAlunos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAutoDeclaradoPretoPardoOuIndigena() {
        return autoDeclaradoPretoPardoOuIndigena;
    }

    public void setAutoDeclaradoPretoPardoOuIndigena(Boolean autoDeclaradoPretoPardoOuIndigena) {
        this.autoDeclaradoPretoPardoOuIndigena = autoDeclaradoPretoPardoOuIndigena;
    }

    public Boolean getCondicaoDeRenda() {
        return condicaoDeRenda;
    }

    public void setCondicaoDeRenda(Boolean condicaoDeRenda) {
        this.condicaoDeRenda = condicaoDeRenda;
    }

    public Boolean getOriundoEscolaPublica() {
        return oriundoEscolaPublica;
    }

    public void setOriundoEscolaPublica(Boolean oriundoEscolaPublica) {
        this.oriundoEscolaPublica = oriundoEscolaPublica;
    }

    public Boolean getPessoaComDeficiencia() {
        return pessoaComDeficiencia;
    }

    public void setPessoaComDeficiencia(Boolean pessoaComDeficiencia) {
        this.pessoaComDeficiencia = pessoaComDeficiencia;
    }

    public Boolean getOutrosGruposNaoListados() {
        return outrosGruposNaoListados;
    }

    public void setOutrosGruposNaoListados(Boolean outrosGruposNaoListados) {
        this.outrosGruposNaoListados = outrosGruposNaoListados;
    }

    public Boolean getReservaVagasCotas() {
        return isReservaVagasCotas;
    }

    public void setReservaVagasCotas(Boolean reservaVagasCotas) {
        isReservaVagasCotas = reservaVagasCotas;
    }

    public Boolean getEscolaPossuiRedesPComunicacaoInstitucional() {
        return escolaPossuiRedesPComunicacaoInstitucional;
    }

    public void setEscolaPossuiRedesPComunicacaoInstitucional(Boolean escolaPossuiRedesPComunicacaoInstitucional) {
        this.escolaPossuiRedesPComunicacaoInstitucional = escolaPossuiRedesPComunicacaoInstitucional;
    }

    public Boolean getEscolaCompartilhaEspacosComunidade() {
        return escolaCompartilhaEspacosComunidade;
    }

    public void setEscolaCompartilhaEspacosComunidade(Boolean escolaCompartilhaEspacosComunidade) {
        this.escolaCompartilhaEspacosComunidade = escolaCompartilhaEspacosComunidade;
    }

    public Boolean getEspacoUsadoAtividadeAlunos() {
        return espacoUsadoAtividadeAlunos;
    }

    public void setEspacoUsadoAtividadeAlunos(Boolean espacoUsadoAtividadeAlunos) {
        this.espacoUsadoAtividadeAlunos = espacoUsadoAtividadeAlunos;
    }
}
