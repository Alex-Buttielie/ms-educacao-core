package br.com.coreeduc.aplication.ports.services;


import br.com.coreeduc.aplication.domains.UnidadeEnsino;

import java.util.List;
import java.util.Optional;

public interface UnidadeEnsinoServicePort {

    UnidadeEnsino salvar(UnidadeEnsino unidade);

    List<UnidadeEnsino> buscar();

    Optional findById(Long codigoInep);
}
