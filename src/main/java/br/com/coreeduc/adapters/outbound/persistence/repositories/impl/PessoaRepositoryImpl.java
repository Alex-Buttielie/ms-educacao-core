package br.com.coreeduc.adapters.outbound.persistence.repositories.impl;

import br.com.coreeduc.adapters.outbound.persistence.entities.PessoaEntity;
import br.com.coreeduc.adapters.outbound.persistence.repositories.PessoaRepository;
import br.com.coreeduc.aplication.domains.Pessoa;
import br.com.coreeduc.aplication.ports.repositories.PessoaRepositoryPort;
import br.com.coreeduc.aplication.utils.UtilMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.function.Function;

@Component
@Primary
public class PessoaRepositoryImpl implements PessoaRepositoryPort {

    private final PessoaRepository unidadeEnsinoRepository;

    @Autowired
    public PessoaRepositoryImpl(final PessoaRepository unidadeEnsinoRepository){
        this.unidadeEnsinoRepository = unidadeEnsinoRepository;
    }


    @Override
    public Pessoa save(Pessoa pessoa) {
        return Optional
                .ofNullable(pessoa)
                .map(convertsPessoaToPessoaEntity())
                .map(unidadeEnsinoRepository::save)
                .map(this::convertsPessoaEntityFromPessoa)
                .orElseThrow(()-> new RuntimeException("Erro ao salvar"));
    }

    Function<Pessoa, PessoaEntity> convertsPessoaToPessoaEntity()  {
        return pessoa -> {
            var entity = PessoaEntity.builder().build();
            BeanUtils.copyProperties(pessoa, entity);
            return entity;
        };
    }

    public Pessoa convertsPessoaEntityFromPessoa(PessoaEntity pessoaEntity) {
        return (Pessoa) Optional.ofNullable(pessoaEntity)
                .map(UtilMapper.converts(Pessoa.class))
                .orElse(new Pessoa());
    }

}
