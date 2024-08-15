package br.com.coreeduc.aplication.configuration;

import br.com.coreeduc.aplication.configTenanty.DataSourcesProperties;
import br.com.coreeduc.aplication.configTenanty.MultitenantDataSource;
import lombok.RequiredArgsConstructor;
import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class DataSourceConfiguration {

    private final DataSourcesProperties dataSourcesProperties;

    @Bean
    public DataSource dataSource() {
        var dataSource = new MultitenantDataSource();
        dataSource.setDefaultTargetDataSource(dataSourcesProperties.getResolvedDataSourcesDefault());
        dataSource.setTargetDataSources(dataSourcesProperties.getDatasources());
        dataSource.afterPropertiesSet();
        return dataSource;
    }

    @PostConstruct
    public void migrate() {
        for (Object dataSource : dataSourcesProperties.getDatasources().values()) {
            DataSource source = (DataSource) dataSource;
            var flyway = Flyway.configure().encoding("windows-1252").dataSource(source).load();
            flyway.migrate();
        }
    }
}
