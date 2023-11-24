package br.com.coreeduc.aplication.ports.services;

import br.com.coreeduc.aplication.domains.Pessoa;
import br.com.coreeduc.aplication.ports.repositories.PessoaRepositoryPort;

import java.util.List;
import java.util.Optional;

public class PessoaServicePortServiceImpl implements PessoaServicePort {

    private PessoaRepositoryPort repository;

    public PessoaServicePortServiceImpl(PessoaRepositoryPort repository) {
        this.repository = repository;
    }

    public Pessoa salvar(Pessoa Pessoa) {
        return repository.save(Pessoa);
    }

    @Override
    public List<Pessoa> buscar() {
        return repository.findAll();
    }

    @Override
    public Optional<Pessoa> findById(Long codigoInep) {
        return repository.findById(codigoInep);
    }

}
