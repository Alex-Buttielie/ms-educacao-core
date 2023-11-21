package br.com.coreeduc.aplication.ports.repositories;

import br.com.coreeduc.aplication.domains.UnidadeEnsino;

import java.util.List;
import java.util.Optional;

public interface UnidadeEnsinoRepositoryPort {

    UnidadeEnsino save(UnidadeEnsino email);

    List<UnidadeEnsino> findAll();

    Optional<UnidadeEnsino> findById(Long codigoInep);
}
