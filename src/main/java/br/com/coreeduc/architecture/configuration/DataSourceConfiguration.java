package br.com.coreeduc.architecture.configuration;

import br.com.coreeduc.architecture.tenanty.DataSourcesProperties;
import br.com.coreeduc.architecture.tenanty.MultitenantDataSource;
import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j2
@Configuration
@RequiredArgsConstructor
public class DataSourceConfiguration {

    private final DataSourcesProperties dataSourcesProperties;
    @Value("${default_db_host}")
    private String DB_HOST;
    @Value("${default_db}")
    private String DB_DEFAULT;
    @Value("${default_port_db}")
    private String DB_PORT_DEFAULT;
    @Value("${ENCODDING}")
    private String encodding;
    private final static String MSG_SUCESS_CREATE_DATABASE = "Database '{}' created successfully.";
    private final static String MSG_EXISTING_DATABASE = "Database '{}' already exists.";

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
            var source = (DataSource) dataSource;
            var url = getUrlFormated(source);
            var username = ((HikariDataSource) source).getUsername();
            var password = ((HikariDataSource) source).getPassword();
            this.processCreateDatabaseTenant(url, username, password);
            var flyway = configureFlyway(source);
            flyway.migrate();
        }
    }

    private String getUrlFormated(DataSource source) {
        try {
            return String.format(((HikariDataSource) source).getJdbcUrl(), DB_HOST, DB_PORT_DEFAULT);
        }catch (Exception e) {
            throw new RuntimeException("Houve um problema ao identificar a URL do database" + e.getMessage());
        }
    }

    private void processCreateDatabaseTenant(String tenantUrl, String username, String password) {
        try (Connection connection = DriverManager.getConnection(getUrlDatabaseDefault(), username, password)) {
            this.createDatabaseTenant(connection, extractDbName(tenantUrl));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check or create database: " + e.getMessage(), e);
        }
    }

    private String getUrlDatabaseDefault() {
        return String.format("jdbc:postgresql://%s:%s/%s", DB_HOST, DB_PORT_DEFAULT, DB_DEFAULT);
    }

    private void createDatabaseTenant(Connection connection, String dbName) throws SQLException {
        try {
            connection.createStatement().execute(getComandCreateDatabase(dbName));
            log.info(MSG_SUCESS_CREATE_DATABASE, dbName);
        } catch (Exception e) {
            log.info(MSG_EXISTING_DATABASE, dbName);
        }
    }

    private String getComandCreateDatabase(String dbName) {
        return new StringBuilder("CREATE DATABASE  \"").append(dbName).append("\"").toString();
    }

    private String extractDbName(String tenantUrl) {
        String[] urlParts = tenantUrl.split("/");
        return urlParts[urlParts.length - 1];
    }

    private Flyway configureFlyway(DataSource source) {
        return Flyway.configure().encoding(encodding).dataSource(source).load();
    }

}
