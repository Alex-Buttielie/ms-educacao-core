package br.com.coreeduc.coreeduc.aplication.ports.services;

import br.com.coreeduc.coreeduc.aplication.domains.UnidadeEnsino;
import br.com.coreeduc.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;

public class UnidadeEnsinoServicePortServiceImpl implements UnidadeEnsinoServicePort {

    private UnidadeEnsinoRepositoryPort repository;

    public UnidadeEnsinoServicePortServiceImpl(UnidadeEnsinoRepositoryPort repository) {
        this.repository = repository;
    }

    public UnidadeEnsino save (UnidadeEnsino unidadeEnsino) {
        return repository.save(unidadeEnsino);
    }

}
