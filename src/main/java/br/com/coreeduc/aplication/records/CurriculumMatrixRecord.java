package br.com.coreeduc.aplication.records;

import javax.validation.constraints.NotBlank;

public record CurriculumMatrixRecord (
        Long id,
        @NotBlank(message = "Campo com preenchimento obrigatório: Nome.")
        String nome,
        @NotBlank(message = "Campo com preenchimento obrigatório: Carga Horária")
        String chHorariaTotal,
        Integer tipo
) {}
