package br.com.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.adapters.outbound.persistence.repositories.AreaConhecimentoRepository;
import br.com.coreeduc.adapters.outbound.persistence.repositories.SpringDataUnidadeEnsinoRepository;
import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import br.com.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static br.com.coreeduc.aplication.utils.Util.convertsUnidadeFromSpringToUnidadeEntity;

@Component
@Primary
public class PostgresUnidadeEnsinoRepositoryImpl implements UnidadeEnsinoRepositoryPort {

    @Autowired
    private ModelMapper modelMapper;

    private final SpringDataUnidadeEnsinoRepository unidadeEnsinoRepository;
    private final AreaConhecimentoRepository areaConhecimentoRepository;

    public PostgresUnidadeEnsinoRepositoryImpl(final SpringDataUnidadeEnsinoRepository unidadeEnsinoRepository,
                                               final AreaConhecimentoRepository areaConhecimentoRepository){
        this.unidadeEnsinoRepository = unidadeEnsinoRepository;
        this.areaConhecimentoRepository = areaConhecimentoRepository;
    }

    @Override
    public UnidadeEnsino save(UnidadeEnsino unidadeEnsino) {
        var unidadeEnsinoEntity = UnidadeEnsinoEntity.builder().build();
        BeanUtils.copyProperties(unidadeEnsino, unidadeEnsinoEntity);
        unidadeEnsinoEntity = unidadeEnsinoRepository.save(unidadeEnsinoEntity);
        return convertsUnidadeFromSpringToUnidadeEntity(unidadeEnsinoEntity);
    }

    @Override
    public List<UnidadeEnsino> findAll() {
        return unidadeEnsinoRepository
                .findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, UnidadeEnsino.class))
                .collect(Collectors.toList());

    }

    public UnidadeEnsino findById(Long id) {
        return convertsUnidadeFromSpringToUnidadeEntity(unidadeEnsinoRepository.findById(id).orElse(null));
    }
}
