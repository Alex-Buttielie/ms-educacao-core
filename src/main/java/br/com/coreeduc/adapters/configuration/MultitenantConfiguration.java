package br.com.coreeduc.adapters.configuration;

import br.com.coreeduc.adapters.outbound.configTenanty.MultitenantDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class MultitenantConfiguration {

    @Value("${defaultTenant}")
    private String defaultTenant;
    private static final String CAMINHO_TENANTS = "src/main/allTenants";
    private static final String PROP_NAME_TENANT = "name";
    private static final String PROP_NAME_DATASOURCE_TENANT = "datasource.driver-class-name";
    private static final String PROP_USERNAME_TENANT = "datasource.username";
    private static final String PROP_PASSWORD_TENANT = "datasource.password";
    private static final String PROP_URL_TENANT = "datasource.url";

    @Bean
    @ConfigurationProperties(prefix = "tenants")
    public DataSource dataSource() {
        var files = buscarFilesTenants();
        var resolvedDataSources = new HashMap<>();

        for (File propertyFile : files) {
            var tenantProperties = new Properties();
            var dataSourceBuilder = DataSourceBuilder.create();

            try {
                tenantProperties.load(new FileInputStream(propertyFile));
                String tenantId = tenantProperties.getProperty(PROP_NAME_TENANT);
                dataSourceBuilder.driverClassName(tenantProperties.getProperty(PROP_NAME_DATASOURCE_TENANT));
                dataSourceBuilder.username(tenantProperties.getProperty(PROP_USERNAME_TENANT));
                dataSourceBuilder.password(tenantProperties.getProperty(PROP_PASSWORD_TENANT));
                dataSourceBuilder.url(tenantProperties.getProperty(PROP_URL_TENANT));
                resolvedDataSources.put(tenantId, dataSourceBuilder.build());
            } catch (IOException exp) {
                throw new RuntimeException("Problem in tenant datasource:" + exp);
            }
        }

        var dataSource = new MultitenantDataSource();
        dataSource.setDefaultTargetDataSource(resolvedDataSources.get(defaultTenant));
        dataSource.setTargetDataSources(resolvedDataSources);
        dataSource.afterPropertiesSet();
        return dataSource;
    }

    public static File[] buscarFilesTenants() {
        return Paths.get(CAMINHO_TENANTS).toFile().listFiles();
    }

}