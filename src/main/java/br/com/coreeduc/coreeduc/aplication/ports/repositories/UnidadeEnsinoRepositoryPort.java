package br.com.coreeduc.coreeduc.aplication.ports.repositories;

import br.com.coreeduc.coreeduc.aplication.domains.UnidadeEnsino;

import java.util.List;

public interface UnidadeEnsinoRepositoryPort {

    UnidadeEnsino save (UnidadeEnsino email);

    List<UnidadeEnsino> findAll();

}
