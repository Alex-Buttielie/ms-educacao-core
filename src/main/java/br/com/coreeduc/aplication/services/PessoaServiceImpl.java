package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.entities.PessoaEntity;
import br.com.coreeduc.aplication.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static br.com.coreeduc.aplication.utils.Util.isCpfValido;

@Service
public class PessoaServiceImpl implements PessoaService {

    private PessoaRepository repository;

    @Autowired
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

    @Override
    public Optional<PessoaEntity> rastrearPessoaCacteristicasIndiv(String cpf, String nome) {
        if (isCpfValido(cpf)) {
            var pessoaRastPorCpf = rastrearPessoaCpf(cpf);

            if (pessoaRastPorCpf.isPresent()) {
                return pessoaRastPorCpf;
            }

        }

        return rastrearPessoaNome(nome);

    }

    public Optional<PessoaEntity> rastrearPessoaCpf(String cpf) {
        return repository.findPessoaByCpf(cpf);
    }

    public Optional<PessoaEntity> rastrearPessoaNome(String nome) {
        return repository.findPessoaByNome(nome);
    }

}
