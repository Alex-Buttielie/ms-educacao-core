package br.com.coreeduc.architecture.configuration;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class SwaggerConfigurationTest {

    private final SwaggerConfiguration swaggerConfiguration = new SwaggerConfiguration();
    private final String EXPECTED_HOST = new String("localhost");
    private final String EXPECTED_PORT = new String("8080");
    private final String EXPECTED_VERSION = new String("1.0");

    @BeforeEach
    public void init() {
        ReflectionTestUtils.setField(swaggerConfiguration, "host", EXPECTED_HOST);
        ReflectionTestUtils.setField(swaggerConfiguration, "port", EXPECTED_PORT);
        ReflectionTestUtils.setField(swaggerConfiguration, "version", EXPECTED_VERSION);
    }

    @Test
    public void testGetHost() {
        var actualHost = swaggerConfiguration.getHost();
        var expectedHostAndPort = EXPECTED_HOST + ":" + EXPECTED_PORT;
        assertEquals(expectedHostAndPort, actualHost);
    }

    @Test
    public void testApiInfo() {
        var actualApiInfo = new ApiInfoBuilder().title("Sistema educacional")
                .description("End-points do sistema")
                .version(EXPECTED_VERSION)
                .build();

        var expectedApiInfo = swaggerConfiguration.apiInfo();
        assertEquals(actualApiInfo.getDescription(), expectedApiInfo.getDescription());
        assertEquals(actualApiInfo.getVersion(), expectedApiInfo.getVersion());
        assertEquals(actualApiInfo.getTitle(), expectedApiInfo.getTitle());
    }

    @Test
    public void deveTestarCriacaoBeanApiKey() {
        var actualApiKey = new ApiKey("Authorization", "Authorization", "header");
        var expectedApiKey = swaggerConfiguration.apiKey();
        assertEquals(actualApiKey.getKeyname(), expectedApiKey.getName());
        assertEquals(actualApiKey.getType(), expectedApiKey.getType());
    }

    @Test
    public void deveTestarRetornoDocket() {
        var docketActual = new Docket(DocumentationType.SWAGGER_2);
        var expectedDocket = swaggerConfiguration.productApi();
        Assert.assertEquals(docketActual.getDocumentationType(), expectedDocket.getDocumentationType());

    }

}