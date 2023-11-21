package br.com.coreeduc.aplication.ports.repositories;

import br.com.coreeduc.aplication.domains.Pessoa;

public interface PessoaRepositoryPort {

    Pessoa save(Pessoa pessoa);

}
