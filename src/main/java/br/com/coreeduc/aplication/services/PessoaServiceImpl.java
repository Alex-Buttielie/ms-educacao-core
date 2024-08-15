package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.PessoaEntity;
import br.com.coreeduc.aplication.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    private PessoaRepository repository;

    public PessoaServiceImpl(PessoaRepository repository) {
        this.repository = repository;
    }

    public PessoaEntity salvar(PessoaEntity Pessoa) {
        return repository.save(Pessoa);
    }

    @Override
    public List<PessoaEntity> buscar() {
        return repository.findAll();
    }

    @Override
    public Optional<PessoaEntity> findById(Long codigoInep) {
        return repository.findById(codigoInep);
    }

}
