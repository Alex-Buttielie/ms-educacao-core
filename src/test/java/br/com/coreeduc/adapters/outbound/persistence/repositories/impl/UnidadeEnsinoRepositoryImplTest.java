package br.com.coreeduc.adapters.outbound.persistence.repositories.impl;


import br.com.coreeduc.adapters.outbound.persistence.entities.UnidadeEnsinoEntity;
import br.com.coreeduc.adapters.outbound.persistence.repositories.UnidadeEnsinoRepository;
import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UnidadeEnsinoRepositoryImplTest {

    @InjectMocks
    private UnidadeEnsinoRepositoryImpl repository;
    @Mock
    private UnidadeEnsinoRepository unidadeEnsinoRepository;
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
    void deveSalvarUnidadeEnsino() {
        when(unidadeEnsinoRepository.save(any())).thenReturn(unidadeEnsinoEntity);
        UnidadeEnsino unidadeRetorno = repository.save(unidadeEnsino);
        Assert.assertEquals(unidadeEnsino.getCodigoInep(), unidadeRetorno.getCodigoInep());
    }

    @Test
    void deveBuscarListaDeUnidades() {
        when(unidadeEnsinoRepository.findAll()).thenReturn(Collections.singletonList(unidadeEnsinoEntity));
        var retorno = repository.findAll();
        Assert.assertFalse(retorno.isEmpty());
    }

    @Test
    void deveBuscarPeloCodigoInep() {
        when(unidadeEnsinoRepository.findById(any())).thenReturn(unidadeEnsinoEntityOptional);
        UnidadeEnsino unidadeRetorno = repository.findById(1l).get();
        Assert.assertEquals(unidadeEnsino.getCodigoInep(), unidadeRetorno.getCodigoInep());
    }

    @Test
    void deveConverterUnidadeEntityToUnidade() {
        var retorno = repository.converterUnidadeEntityToUnidade(unidadeEnsinoEntity);
        Assert.assertEquals(retorno.getCodigoInep(), unidadeEnsino.getCodigoInep());
    }

    @Test
    void deveConverterUnidadeFromToUnidadeEntity() {
        var retorno = Optional.ofNullable(unidadeEnsino)
                .map(repository.converterUnidadeFromToUnidadeEntity())
                .orElse(null);

        Assert.assertNotNull(retorno);
        Assert.assertNotNull(retorno.getCodigoInep());
    }

}
