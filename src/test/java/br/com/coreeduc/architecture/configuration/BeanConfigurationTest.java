package br.com.coreeduc.architecture.configuration;

import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BeanConfigurationTest {

    @InjectMocks
    private BeanConfiguration beanConfiguration;


    @Test
    public void deveBuscarBeanModelMapper() {
        var bean = beanConfiguration.modelMapper();
        Assert.notNull(bean);
    }

}
