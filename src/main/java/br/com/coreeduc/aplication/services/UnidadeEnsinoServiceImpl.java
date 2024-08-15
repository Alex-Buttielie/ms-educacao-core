package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.aplication.repositories.UnidadeEnsinoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnidadeEnsinoServiceImpl implements UnidadeEnsinoService {

    private UnidadeEnsinoRepository repository;

    public UnidadeEnsinoServiceImpl(UnidadeEnsinoRepository repository) {
        this.repository = repository;
    }

    public UnidadeEnsinoEntity salvar(UnidadeEnsinoEntity unidadeEnsino) {
        return repository.save(unidadeEnsino);
    }

    @Override
    public List<UnidadeEnsinoEntity> buscar() {
        return repository.findAll();
    }

    @Override
    public Optional<UnidadeEnsinoEntity> findById(Long codigoInep) {
        return repository.findById(codigoInep);
    }

}
