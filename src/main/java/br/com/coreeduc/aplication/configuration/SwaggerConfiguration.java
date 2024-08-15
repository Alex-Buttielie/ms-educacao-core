package br.com.coreeduc.aplication.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Value("${versao}")
    private String version;
    @Value("${host-swagger}")
    private String host;
    @Value("${server.port}")
    private String port;

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.coreeduc.adapters.inbound.resources"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .securitySchemes(Collections.singletonList(apiKey()))
                .useDefaultResponseMessages(true)
                .host(getHost());

    }

    @Bean
    protected SecurityScheme apiKey() {
        return new ApiKey("Authorization", "Authorization", "header");
    }

    protected String getHost() {
        return host.concat(":").concat(port);
    }

    protected ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Sistema educacional")
                .description("End-points do sistema")
                .version(version)
                .build();
    }

}