package br.com.coreeduc.architecture.tenanty;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
    @Value("${default_db_host}")
    private String DB_HOST;
    @Value("${default_port_db}")
    private String DB_PORT_DEFAULT;

    private static final String CAMINHO_TENANTS = "allTenants";
    private static final String PROP_NAME_TENANT = "name";
    private static final String PROP_NAME_DATASOURCE_TENANT = "datasource.driver-class-name";
    private static final String PROP_USERNAME_TENANT = "datasource.username";
    private static final String PROP_PASSWORD_TENANT = "datasource.password";
    private static final String PROP_URL_TENANT = "datasource.url";

    private Object resolvedDataSourcesDefault;
    private Map<Object, Object> resolvedDataSources = new HashMap<>();
    private Map<Object, Object> datasources = new LinkedHashMap<>();

    public void setDatasources(Map<String, String> datasources) {
        for (Map.Entry<String, String> entry : datasources.entrySet()) {
            String tenantFileName = entry.getValue() + ".properties";
            var tenantProperties = new Properties();
            var dataSourceBuilder = DataSourceBuilder.create();
            this.carregarPropriedadesTenant(tenantProperties, tenantFileName);
            var tenantId = tenantProperties.getProperty(PROP_NAME_TENANT);
            dataSourceBuilder.driverClassName(tenantProperties.getProperty(PROP_NAME_DATASOURCE_TENANT));
            dataSourceBuilder.username(tenantProperties.getProperty(PROP_USERNAME_TENANT));
            dataSourceBuilder.password(tenantProperties.getProperty(PROP_PASSWORD_TENANT));
            var url = String.format(tenantProperties.getProperty(PROP_URL_TENANT), DB_HOST, DB_PORT_DEFAULT);
            dataSourceBuilder.url(url);
            resolvedDataSources.put(tenantId, dataSourceBuilder.build());
            this.datasources.put(tenantId, dataSourceBuilder.build());
        }

        resolvedDataSourcesDefault = resolvedDataSources.get(defaultTenant);
        var dataSource = new MultitenantDataSource();
        dataSource.setTargetDataSources(resolvedDataSources);
        dataSource.afterPropertiesSet();
    }

    protected void carregarPropriedadesTenant(Properties tenantProperties, String propertyFileName) {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CAMINHO_TENANTS + "/" + propertyFileName)) {
            if (inputStream == null) {
                throw new IOException("Property file not found: " + propertyFileName);
            }
            tenantProperties.load(inputStream);
        } catch (Exception exp) {
            throw new RuntimeException("Problem in tenant datasource: " + exp);
        }
    }
}
