package br.com.coreeduc.aplication.ports.services;


import br.com.coreeduc.aplication.domains.Pessoa;

import java.util.List;
import java.util.Optional;

public interface PessoaServicePort {

    Pessoa salvar(Pessoa pessoa);

    List<Pessoa> buscar();

    Optional findById(Long id);
}
