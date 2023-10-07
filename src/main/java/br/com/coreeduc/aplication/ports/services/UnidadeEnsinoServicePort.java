package br.com.coreeduc.aplication.ports.services;


import br.com.coreeduc.aplication.domains.UnidadeEnsino;

import java.util.List;

public interface UnidadeEnsinoServicePort {

    UnidadeEnsino salvar(UnidadeEnsino unidade);

    List<UnidadeEnsino> buscar();

}
