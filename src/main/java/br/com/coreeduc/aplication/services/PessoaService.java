package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.entities.PessoaEntity;

import java.util.List;
import java.util.Optional;

public interface PessoaService {

    PessoaEntity salvar(PessoaEntity pessoa);

    List<PessoaEntity> buscar();

    Optional findById(Long id);

    Optional<PessoaEntity> rastrearPessoaCacteristicasIndiv(String cpf, String name);
}
