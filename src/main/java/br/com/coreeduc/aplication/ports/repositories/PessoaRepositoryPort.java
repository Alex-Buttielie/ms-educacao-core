package br.com.coreeduc.aplication.ports.repositories;

import br.com.coreeduc.aplication.domains.Pessoa;

import java.util.List;
import java.util.Optional;

public interface PessoaRepositoryPort {

    Pessoa save(Pessoa pessoa);
    List<Pessoa> findAll();
    Optional<Pessoa> findById(Long codigoInep);

}
