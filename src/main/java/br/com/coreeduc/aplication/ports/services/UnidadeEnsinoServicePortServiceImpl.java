package br.com.coreeduc.aplication.ports.services;

import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import br.com.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;

import java.util.List;
import java.util.Optional;

public class UnidadeEnsinoServicePortServiceImpl implements UnidadeEnsinoServicePort {

    private UnidadeEnsinoRepositoryPort repository;

    public UnidadeEnsinoServicePortServiceImpl(UnidadeEnsinoRepositoryPort repository) {
        this.repository = repository;
    }

    public UnidadeEnsino salvar(UnidadeEnsino unidadeEnsino) {
        return repository.save(unidadeEnsino);
    }

    @Override
    public List<UnidadeEnsino> buscar() {
        return repository.findAll();
    }

    @Override
    public Optional<UnidadeEnsino> findById(Long codigoInep) {
        return repository.findById(codigoInep);
    }

}
