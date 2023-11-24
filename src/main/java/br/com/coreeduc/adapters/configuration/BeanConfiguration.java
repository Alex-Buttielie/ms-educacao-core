package br.com.coreeduc.adapters.configuration;

import br.com.coreeduc.CoreEducApplication;
import br.com.coreeduc.aplication.ports.repositories.PessoaRepositoryPort;
import br.com.coreeduc.aplication.ports.repositories.UnidadeEnsinoRepositoryPort;
import br.com.coreeduc.aplication.ports.services.PessoaServicePortServiceImpl;
import br.com.coreeduc.aplication.ports.services.UnidadeEnsinoServicePortServiceImpl;
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
    UnidadeEnsinoServicePortServiceImpl unidadeEnsinoServiceImpl(UnidadeEnsinoRepositoryPort unidadeEnsinoRepositoryPort) {
        return new UnidadeEnsinoServicePortServiceImpl(unidadeEnsinoRepositoryPort);
    }

    @Bean
    PessoaServicePortServiceImpl pessoaServicePortServiceImpl(PessoaRepositoryPort pessoaRepositoryPort) {
        return new PessoaServicePortServiceImpl(pessoaRepositoryPort);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public PageRequest pageRequest() {
        return PageRequest.of(INICIO_PAGES, default_quantidade_pages);
    }

}
