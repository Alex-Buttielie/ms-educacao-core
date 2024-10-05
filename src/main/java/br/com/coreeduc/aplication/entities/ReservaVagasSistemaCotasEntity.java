package br.com.coreeduc.aplication.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "reserva_vagas_sistema_cotas")
@Entity
public class ReservaVagasSistemaCotasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "auto_declaradado_negro_indigena")
    private Boolean autoDeclaradoPretoPardoOuIndigena;
    @Basic
    @Column(name = "condicao_renda")
    private Boolean condicaoDeRenda;
    @Basic
    @Column(name = "oriundo_escola_publica")
    private Boolean oriundoEscolaPublica;
    @Basic
    @Column(name = "pessoa_com_deficiencia")
    private Boolean pessoaComDeficiencia;
    @Basic
    @Column(name = "outros_grupos_nao_listados")
    private Boolean outrosGruposNaoListados;
    @Basic
    @Column(name = "is_reserva_vagas_cotas")
    private Boolean isReservaVagasCotas;
    @Basic
    @Column(name = "escola_possui_redes_comunicacao_institucional")
    private Boolean escolaPossuiRedesPComunicacaoInstitucional;
    @Basic
    @Column(name = "escola_compartilha_espacos_comunidade")
    private Boolean escolaCompartilhaEspacosComunidade;
    @Basic
    @Column(name = "espaco_usado_atividade_alunos")
    private Boolean espacoUsadoAtividadeAlunos;

    public ReservaVagasSistemaCotasEntity() {
    }

    public ReservaVagasSistemaCotasEntity(Long id, Boolean autoDeclaradoPretoPardoOuIndigena, Boolean condicaoDeRenda, Boolean oriundoEscolaPublica, Boolean pessoaComDeficiencia, Boolean outrosGruposNaoListados, Boolean isReservaVagasCotas, Boolean escolaPossuiRedesPComunicacaoInstitucional, Boolean escolaCompartilhaEspacosComunidade, Boolean espacoUsadoAtividadeAlunos) {
        this.id = id;
        this.autoDeclaradoPretoPardoOuIndigena = autoDeclaradoPretoPardoOuIndigena;
        this.condicaoDeRenda = condicaoDeRenda;
        this.oriundoEscolaPublica = oriundoEscolaPublica;
        this.pessoaComDeficiencia = pessoaComDeficiencia;
        this.outrosGruposNaoListados = outrosGruposNaoListados;
        this.isReservaVagasCotas = isReservaVagasCotas;
        this.escolaPossuiRedesPComunicacaoInstitucional = escolaPossuiRedesPComunicacaoInstitucional;
        this.escolaCompartilhaEspacosComunidade = escolaCompartilhaEspacosComunidade;
        this.espacoUsadoAtividadeAlunos = espacoUsadoAtividadeAlunos;
    }

    public ReservaVagasSistemaCotasEntity(Boolean autoDeclaradoPretoPardoOuIndigena, Boolean condicaoDeRenda, Boolean oriundoEscolaPublica, Boolean pessoaComDeficiencia, Boolean outrosGruposNaoListados, Boolean isReservaVagasCotas, Boolean escolaPossuiRedesPComunicacaoInstitucional, Boolean escolaCompartilhaEspacosComunidade, Boolean espacoUsadoAtividadeAlunos) {
        this.autoDeclaradoPretoPardoOuIndigena = autoDeclaradoPretoPardoOuIndigena;
        this.condicaoDeRenda = condicaoDeRenda;
        this.oriundoEscolaPublica = oriundoEscolaPublica;
        this.pessoaComDeficiencia = pessoaComDeficiencia;
        this.outrosGruposNaoListados = outrosGruposNaoListados;
        this.isReservaVagasCotas = isReservaVagasCotas;
        this.escolaPossuiRedesPComunicacaoInstitucional = escolaPossuiRedesPComunicacaoInstitucional;
        this.escolaCompartilhaEspacosComunidade = escolaCompartilhaEspacosComunidade;
        this.espacoUsadoAtividadeAlunos = espacoUsadoAtividadeAlunos;
    }

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
