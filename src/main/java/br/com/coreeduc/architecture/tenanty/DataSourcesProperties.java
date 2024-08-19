package br.com.coreeduc.architecture.tenanty;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

@Log4j2
@Component
@ConfigurationProperties(prefix = "tenants")
@Getter
@Setter
public class DataSourcesProperties {

    @Value("${defaultTenant}")
    private String defaultTenant;
    private static final String CAMINHO_TENANTS = "src/main/allTenants";
    private static final String PROP_NAME_TENANT = "name";
    private static final String PROP_NAME_DATASOURCE_TENANT = "datasource.driver-class-name";
    private static final String PROP_USERNAME_TENANT = "datasource.username";
    private static final String PROP_PASSWORD_TENANT = "datasource.password";
    private static final String PROP_URL_TENANT = "datasource.url";
    private Object resolvedDataSourcesDefault;
    private Map<Object, Object> resolvedDataSources = new HashMap<>();
    private Map<Object, Object> datasources = new LinkedHashMap<>();

    public void setDatasources(Map<String, String> datasources) {
        var files = buscarFilesTenants(datasources);

        for (File propertyFile : files) {
            var tenantProperties = new Properties();
            var dataSourceBuilder = DataSourceBuilder.create();

            this.carregarPropriedadesTenant(tenantProperties, propertyFile);

            String tenantId = tenantProperties.getProperty(PROP_NAME_TENANT);
            dataSourceBuilder.driverClassName(tenantProperties.getProperty(PROP_NAME_DATASOURCE_TENANT));
            dataSourceBuilder.username(tenantProperties.getProperty(PROP_USERNAME_TENANT));
            dataSourceBuilder.password(tenantProperties.getProperty(PROP_PASSWORD_TENANT));
            dataSourceBuilder.url(tenantProperties.getProperty(PROP_URL_TENANT));
            resolvedDataSources.put(tenantId, dataSourceBuilder.build());

            this.datasources.put(tenantProperties.getProperty(PROP_NAME_TENANT), dataSourceBuilder.build());

        }

        resolvedDataSourcesDefault = resolvedDataSources.get(defaultTenant);

        var dataSource = new MultitenantDataSource();
        dataSource.setTargetDataSources(resolvedDataSources);
        dataSource.afterPropertiesSet();

    }

    protected void carregarPropriedadesTenant (Properties tenantProperties, File propertyFile) {
        try {
            tenantProperties.load(new FileInputStream(propertyFile));
        } catch (IOException | NullPointerException exp) {
            throw new RuntimeException("Problem in tenant datasource:" + exp);
        }
    }

    public File[] buscarFilesTenants(Map<String, String> datasources) {
        if (!datasources.isEmpty()) {
            File[] files = new File[datasources.size()];
            int contadorTenantsConfiguradas = 0;
            for (Map.Entry<String, String> entry : datasources.entrySet()) {
                String key = entry.getKey();
                files[contadorTenantsConfiguradas] = new File(CAMINHO_TENANTS + File.separator + key + ".properties");
                contadorTenantsConfiguradas++;
            }

            return files;

        }

        return buscarFilesTenants();
    }

    public File[] buscarFilesTenants() {
        return Paths.get(CAMINHO_TENANTS).toFile().listFiles();
    }

}