package br.com.coreeduc.adapters.configuration;

import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.util.Arrays;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class MultitenantConfigurationTest {

    @InjectMocks
    private MultitenantConfiguration multitenantConfiguration;

    @Test
    public void deveBuscarFilesTenants() {
        var file = MultitenantConfiguration.buscarFilesTenants();
        Assert.isTrue(Arrays.stream(file).count() > 0);
        Assert.notNull(file);
    }

    @Test
    public void deveBuscarDataSource() {
        var dataSource = multitenantConfiguration.dataSource();
        Assert.notNull(dataSource);
    }

    @Test
    public void deveSoltarExceptionAoCarregarPropriedadesTenant() {
        assertThrows(RuntimeException.class, () -> multitenantConfiguration.carregarPropriedadesTenant(null, null));
        assertThrows(RuntimeException.class, () -> multitenantConfiguration.carregarPropriedadesTenant(new Properties(), new File("")));
    }

}