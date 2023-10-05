package br.com.coreeduc.coreeduc.adapters.outbound.persistence;
import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.coreeduc.adapters.outbound.persistence.repositories.AreaConhecimentoRepository;
import br.com.coreeduc.coreeduc.adapters.outbound.persistence.repositories.SpringDataUnidadeEnsinoRepository;
import br.com.coreeduc.coreeduc.aplication.domains.UnidadeEnsino;
import br.com.coreeduc.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;
import br.com.coreeduc.coreeduc.aplication.utils.Util;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
import static br.com.coreeduc.coreeduc.aplication.utils.Util.convertsUnidadeFromSpringToUnidadeEntity;

@Component
@Primary
public class PostgresUnidadeEnsinoRepositoryImpl implements UnidadeEnsinoRepositoryPort {

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
        return unidadeEnsinoRepository.findAll()
                .stream()
                .map(Util::convertsUnidadeFromSpringToUnidadeEntity)
                .collect(Collectors.toList());
    }

    public UnidadeEnsino findById(Long id) {
        return convertsUnidadeFromSpringToUnidadeEntity(unidadeEnsinoRepository.findById(id).orElse(null));
    }

}
