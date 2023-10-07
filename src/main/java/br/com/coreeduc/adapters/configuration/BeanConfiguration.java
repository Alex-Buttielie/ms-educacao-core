package br.com.coreeduc.adapters.configuration;

import br.com.coreeduc.CoreEducApplication;
import br.com.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;
import br.com.coreeduc.aplication.ports.services.UnidadeEnsinoServicePortServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CoreEducApplication.class)
public class BeanConfiguration {


    @Bean
    UnidadeEnsinoServicePortServiceImpl unidadeEnsinoServiceImpl(UnidadeEnsinoRepositoryPort unidadeEnsinoRepositoryPort) {
        return new UnidadeEnsinoServicePortServiceImpl(unidadeEnsinoRepositoryPort);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
