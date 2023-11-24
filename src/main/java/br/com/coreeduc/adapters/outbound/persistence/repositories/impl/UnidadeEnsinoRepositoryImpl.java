package br.com.coreeduc.adapters.outbound.persistence.repositories.impl;

import br.com.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.adapters.outbound.persistence.repositories.UnidadeEnsinoRepository;
import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import br.com.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;
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
public class UnidadeEnsinoRepositoryImpl implements UnidadeEnsinoRepositoryPort {
    private final String MSG_ERRO_SALVAR_UNIDADE = "Ocorreu algum erro ao salvar a unidade de ensino";
    @Autowired
    private UnidadeEnsinoRepository unidadeEnsinoRepository;

    @Autowired
    private PageRequest pageRequest;

    @Override
    public UnidadeEnsino save(UnidadeEnsino unidadeEnsino) {
        return Optional
                .ofNullable(unidadeEnsino)
                .map(converterUnidadeFromToUnidadeEntity())
                .map(unidadeEnsinoRepository::save)
                .map(this::converterUnidadeEntityToUnidade)
                .orElseThrow(() -> new RuntimeException(MSG_ERRO_SALVAR_UNIDADE));
    }

    @Override
    public List<UnidadeEnsino> findAll() {
        try {
            var lista = unidadeEnsinoRepository
                    .findAll(pageRequest)
                    .stream()
                    .map(this::converterUnidadeEntityToUnidade)
                    .collect(Collectors.toList());

            log.info("Unidades consultadas, quantidade: " + lista.stream().count());

            return lista;

        } catch (Exception e ){
            log.error("Unidades não consultadas, erro: " + e.getMessage());
            return Collections.emptyList();
        }

    }

    public Optional<UnidadeEnsino> findById(Long id) {
        return unidadeEnsinoRepository.findById(id)
                .map(this::converterUnidadeEntityToUnidade)
                .map(Optional::of)
                .orElse(Optional.empty());
    }

    public UnidadeEnsino converterUnidadeEntityToUnidade(UnidadeEnsinoEntity unidadeEnsinoEntity) {
        return (UnidadeEnsino) Optional.ofNullable(unidadeEnsinoEntity)
                .map(UtilMapper.converts(UnidadeEnsino.class))
                .orElse(new UnidadeEnsino());
    }

    Function<UnidadeEnsino, UnidadeEnsinoEntity> converterUnidadeFromToUnidadeEntity() {
        return unidade -> {
            var entity = UnidadeEnsinoEntity.builder().build();
            BeanUtils.copyProperties(unidade, entity);
            return entity;
        };
    }

}
