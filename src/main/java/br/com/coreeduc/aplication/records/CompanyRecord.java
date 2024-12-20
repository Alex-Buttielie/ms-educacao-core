package br.com.coreeduc.aplication.records;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public record CompanyRecord(
        Long id,
        @NotBlank(message = "Campo com preenchimento obrigatório: Nome da empresa.")
        String nameCompany,
        @NotBlank(message = "Campo com preenchimento obrigatório: CNPJ.")
        String cnpj,
        @NotNull(message = "Campo com preenchimento obrigatório: Data de abertura.")
        Date openingDate,
        @NotBlank(message = "Campo com preenchimento obrigatório: Nome fantasia.")
        String fantasyName,
        @NotNull(message = "Campo com preenchimento obrigatório: Capital Social.")
        Integer socialCapital,
        @NotNull(message = "Campo com preenchimento obrigatório: Data Situação Cadastral.")
        Date dateStatusRegistry,
        @NotBlank(message = "Campo com preenchimento obrigatório: Situação de cadastro.")
        String statusRegistry,
        @NotNull(message = "Campo com preenchimento obrigatório: Cidade.")
        Long cityRegistry,
        @NotBlank(message = "Campo com preenchimento obrigatório: Estado.")
        String stateRegistry,
        @NotBlank(message = "Campo com preenchimento obrigatório: Tamanho da Empresa.")
        String companySize,
        @NotBlank(message = "Campo com preenchimento obrigatório: Ramo de Atividade.")
        String actingBranch,
        @NotBlank(message = "Campo com preenchimento obrigatório: Natureza.")
        String natureLegal,
        @NotBlank(message = "Campo com preenchimento obrigatório: Tipo de unidade.")
        String typeUnitCompany,
        @NotNull(message = "Campo com preenchimento obrigatório: Código Sicom.")
        Integer sicomCode,
        @NotBlank(message = "Campo com preenchimento obrigatório: CEP.")
        String postalCode,
        @NotBlank(message = "Campo com preenchimento obrigatório: Bairro.")
        String neighbordhood,
        @NotNull(message = "Campo com preenchimento obrigatório: Cidade Endereço.")
        Long idCity,
        @NotNull(message = "Campo com preenchimento obrigatório: Número.")
        Integer number,
        @NotBlank(message = "Campo com preenchimento obrigatório: Logradouro.")
        String publicPlace,
        @NotNull(message = "Campo com preenchimento obrigatório: Estado Endereço.")
        String state,
        @NotBlank(message = "Campo com preenchimento obrigatório: Complemento.")
        String complement
) {

}
