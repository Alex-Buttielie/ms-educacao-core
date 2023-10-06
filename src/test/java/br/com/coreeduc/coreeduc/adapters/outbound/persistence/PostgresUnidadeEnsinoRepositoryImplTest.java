package br.com.coreeduc.coreeduc.adapters.outbound.persistence;

import br.com.coreeduc.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.coreeduc.adapters.outbound.persistence.repositories.SpringDataUnidadeEnsinoRepository;
import br.com.coreeduc.coreeduc.aplication.domains.UnidadeEnsino;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PostgresUnidadeEnsinoRepositoryImplTest {

    @InjectMocks
    private PostgresUnidadeEnsinoRepositoryImpl repository;
    @Mock
    private SpringDataUnidadeEnsinoRepository springDataUnidadeEnsinoRepository;
    private UnidadeEnsinoEntity unidadeEnsinoEntity;
    private Optional<UnidadeEnsinoEntity> unidadeEnsinoEntityOptional;
    private UnidadeEnsino unidadeEnsino;


    @BeforeEach
    void init() {
       unidadeEnsinoEntity =  UnidadeEnsinoEntity.builder().codigoInep(1l).build();
       unidadeEnsinoEntityOptional =  Optional.of(UnidadeEnsinoEntity.builder().codigoInep(1l).build());
       unidadeEnsino = new UnidadeEnsino();
       unidadeEnsino.setCodigoInep(unidadeEnsinoEntity.getCodigoInep());

    }

    @Test
    void deveBuscarPeloCodigoInep() {
        when(springDataUnidadeEnsinoRepository.findById(any())).thenReturn(unidadeEnsinoEntityOptional);
        UnidadeEnsino unidadeRetorno = repository.findById(1l);
        Assert.assertEquals(unidadeEnsino.getCodigoInep(), unidadeRetorno.getCodigoInep());
    }

    @Test
    void deveBuscarListaDeUnidades() {
        List<UnidadeEnsinoEntity> listaMock = new ArrayList<>();
        listaMock.add(unidadeEnsinoEntity);
        when(springDataUnidadeEnsinoRepository.findAll()).thenReturn(Collections.singletonList(unidadeEnsinoEntity));
        var retorno = repository.findAll();
        Assert.assertNotNull(retorno);
    }

    @Test
    void deveSalvarUnidadeEnsino() {
        when(springDataUnidadeEnsinoRepository.save(any(UnidadeEnsinoEntity.class))).thenReturn(unidadeEnsinoEntity);
        UnidadeEnsino unidadeRetorno = repository.save(unidadeEnsino);
        Assert.assertEquals(unidadeEnsino.getCodigoInep(), unidadeRetorno.getCodigoInep());
    }

}
