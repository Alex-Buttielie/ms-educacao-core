package br.com.coreeduc.coreeduc.adapters.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguracao {

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
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(true)
                .host(getHost());

    }

    private String getHost() {
        return host.concat(":").concat(port);
    }
    ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Sistema educacional")
                .description("Enspoint sistema")
                .version(version)
                .build();
    }

}