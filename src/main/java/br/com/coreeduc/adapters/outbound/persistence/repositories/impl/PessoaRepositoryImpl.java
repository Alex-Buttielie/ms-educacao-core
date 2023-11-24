package br.com.coreeduc.adapters.outbound.persistence.repositories.impl;

import br.com.coreeduc.adapters.outbound.persistence.entities.PessoaEntity;
import br.com.coreeduc.adapters.outbound.persistence.repositories.PessoaRepository;
import br.com.coreeduc.aplication.domains.Pessoa;
import br.com.coreeduc.aplication.ports.repositories.PessoaRepositoryPort;
import br.com.coreeduc.aplication.utils.UtilMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@Slf4j
public class PessoaRepositoryImpl implements PessoaRepositoryPort {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private PageRequest pageRequest;

    @Override
    public Pessoa save(Pessoa pessoa) {
        return Optional
                .ofNullable(pessoa)
                .map(convertsPessoaToPessoaEntity())
                .map(pessoaRepository::save)
                .map(this::convertsPessoaEntityFromPessoa)
                .orElseThrow(() -> new RuntimeException("Erro ao salvar"));
    }

    @Override
    public List<Pessoa> findAll() {
        try {
            var lista = pessoaRepository
                    .findAll(pageRequest)
                    .stream()
                    .map(this::convertsPessoaEntityFromPessoa)
                    .collect(Collectors.toList());

            log.info("Pessoas consultadas, quantidade: " + lista.stream().count());

            return lista;

        } catch (Exception e ){
            log.error("Pessoas não consultadas, erro: " + e.getMessage());
            return Collections.emptyList();
        }

    }

    @Override
    public Optional<Pessoa> findById(Long id) {
        return pessoaRepository.findById(id)
                .map(this::convertsPessoaEntityFromPessoa)
                .map(Optional::of)
                .orElse(Optional.empty());
    }

    Function<Pessoa, PessoaEntity> convertsPessoaToPessoaEntity() {
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
