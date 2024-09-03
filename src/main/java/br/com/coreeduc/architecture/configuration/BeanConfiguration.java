package br.com.coreeduc.architecture.configuration;

import br.com.coreeduc.CoreEducApplication;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;

@Configuration
@ComponentScan(basePackageClasses = CoreEducApplication.class)
public class BeanConfiguration {
    private static int INICIO_PAGES = 0;
    @Value("${default_quantidade_pages}")
    private int default_quantidade_pages;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public PageRequest pageRequest() {
        return PageRequest.of(INICIO_PAGES, default_quantidade_pages);
    }

}
