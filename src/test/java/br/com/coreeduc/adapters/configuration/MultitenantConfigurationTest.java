package br.com.coreeduc.adapters.configuration;

import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

@ExtendWith(MockitoExtension.class)
public class MultitenantConfigurationTest {

    @InjectMocks
    private MultitenantConfiguration multitenantConfiguration;

    @BeforeEach
    private void init() {

    }

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

}