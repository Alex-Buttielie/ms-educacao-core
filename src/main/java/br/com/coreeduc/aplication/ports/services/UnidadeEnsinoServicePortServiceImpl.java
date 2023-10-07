package br.com.coreeduc.aplication.ports.services;

import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import br.com.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;

import java.util.List;

public class UnidadeEnsinoServicePortServiceImpl implements UnidadeEnsinoServicePort {

    private UnidadeEnsinoRepositoryPort repository;

    public UnidadeEnsinoServicePortServiceImpl(UnidadeEnsinoRepositoryPort repository) {
        this.repository = repository;
    }

    public UnidadeEnsino salvar (UnidadeEnsino unidadeEnsino) {
        return repository.save(unidadeEnsino);
    }

    @Override
    public List<UnidadeEnsino> buscar() {
        return repository.findAll();
    }

}
