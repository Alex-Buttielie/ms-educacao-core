package br.com.coreeduc.adapters.configuration;

import br.com.coreeduc.aplication.ports.repositories.PessoaRepositoryPort;
import br.com.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;
import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BeanConfigurationTest {

    @Mock
    private UnidadeEnsinoRepositoryPort unidadeEnsinoRepositoryPort;
    @Mock
    private PessoaRepositoryPort pessoaRepositoryPort;

    @InjectMocks
    private BeanConfiguration beanConfiguration;

    @BeforeEach
    private void init() {

    }

    @Test
    public void deveBuscarBeanUnidadeEnsinoServiceImpl() {
        var bean = beanConfiguration.unidadeEnsinoServiceImpl(unidadeEnsinoRepositoryPort);
        Assert.notNull(bean);
    }

    @Test
    public void deveBuscarBeanPessoaServicePortServiceImpl() {
        var bean = beanConfiguration.pessoaServicePortServiceImpl(pessoaRepositoryPort);
        Assert.notNull(bean);
    }

    @Test
    public void deveBuscarBeanModelMapper() {
        var bean = beanConfiguration.modelMapper();
        Assert.notNull(bean);
    }

}
