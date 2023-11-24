package br.com.coreeduc.application.ports.services;

import br.com.coreeduc.aplication.domains.UnidadeEnsino;
import br.com.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;
import br.com.coreeduc.aplication.ports.services.UnidadeEnsinoServicePortServiceImpl;
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
public class UnidadeEnsinoServicePortServiceImplTest {

    @Mock
    UnidadeEnsinoRepositoryPort unidadeEnsinoRepositoryPort;

    @InjectMocks
    UnidadeEnsinoServicePortServiceImpl unidadeEnsinoServicePortService;

    private UnidadeEnsino unidadeEnsino;

    @BeforeEach
    public void init() {
        unidadeEnsino = new UnidadeEnsino();
        unidadeEnsino.setCodigoInep(1l);
    }

    @Test
    public void deveSalvar() {
        when(unidadeEnsinoRepositoryPort.save(any())).thenReturn(unidadeEnsino);
        var unidadeRetorno = unidadeEnsinoServicePortService.salvar(unidadeEnsino);
        Assert.assertEquals(unidadeEnsino.getCodigoInep(), unidadeRetorno.getCodigoInep());
    }

    @Test
    public void deveBuscarUnidades() {
        when(unidadeEnsinoRepositoryPort.findAll()).thenReturn(Collections.singletonList(unidadeEnsino));
        var unidades = unidadeEnsinoServicePortService.buscar();
        Assert.assertFalse(unidades.isEmpty());
    }

    @Test
    public void deveBuscarPorId() {
        when(unidadeEnsinoRepositoryPort.findById(any())).thenReturn(Optional.of(unidadeEnsino));
        var unidadeRetorno = unidadeEnsinoServicePortService.findById(1l);
        Assert.assertTrue(unidadeRetorno.isPresent());
    }


}
