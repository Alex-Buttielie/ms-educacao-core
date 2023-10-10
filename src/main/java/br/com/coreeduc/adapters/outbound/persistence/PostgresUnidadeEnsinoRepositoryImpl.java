package br.com.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.adapters.outbound.persistence.repositories.SpringDataUnidadeEnsinoRepository;
import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import br.com.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;
import br.com.coreeduc.aplication.utils.UtilMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@Primary
public class PostgresUnidadeEnsinoRepositoryImpl implements UnidadeEnsinoRepositoryPort {

    private final SpringDataUnidadeEnsinoRepository unidadeEnsinoRepository;
    private final String MSG_ERRO_SALVAR_UNIDADE = "Ocorreu algum erro ao salvar a unidade de ensino";

    @Autowired
    public PostgresUnidadeEnsinoRepositoryImpl(final SpringDataUnidadeEnsinoRepository unidadeEnsinoRepository){
        this.unidadeEnsinoRepository = unidadeEnsinoRepository;
    }

    @Override
    public UnidadeEnsino save(UnidadeEnsino unidadeEnsino) {
        return Optional
                .ofNullable(unidadeEnsino)
                .map(convertsUnidadeEntityFromSpringToUnidade())
                .map(unidadeEnsinoRepository::save)
                .map(this::convertsUnidadeFromSpringToUnidadeEntity)
                .orElseThrow(()-> new RuntimeException(MSG_ERRO_SALVAR_UNIDADE));
    }

    Function <UnidadeEnsino, UnidadeEnsinoEntity>convertsUnidadeEntityFromSpringToUnidade()  {
        return unidade -> {
            var entity = UnidadeEnsinoEntity.builder().build();
            BeanUtils.copyProperties(unidade, entity);
            return entity;
        };
    }

    @Override
    public List<UnidadeEnsino> findAll() {
        return unidadeEnsinoRepository
                .findAll()
                .stream()
                .map(this::convertsUnidadeFromSpringToUnidadeEntity)
                .collect(Collectors.toList());

    }

    public Optional<UnidadeEnsino> findById(Long id) {
        return unidadeEnsinoRepository.findById(id)
                .map(this::convertsUnidadeFromSpringToUnidadeEntity)
                .map(Optional::of)
                .orElse(Optional.empty());
    }

    public UnidadeEnsino convertsUnidadeFromSpringToUnidadeEntity(UnidadeEnsinoEntity unidadeEnsinoEntity) {
        return (UnidadeEnsino) Optional.ofNullable(unidadeEnsinoEntity)
                .map(entity -> UtilMapper.converts(entity, UnidadeEnsino.class))
                .orElse(new UnidadeEnsino());
    }


}
