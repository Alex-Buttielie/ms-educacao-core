package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.repositories.CityRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class CityServiceIntegrationTest {


    private CityRepository cityRepository;
    private CityServiceImpl companyService;

    @BeforeEach
    void setUp() {
        cityRepository = Mockito.mock(CityRepository.class);
        companyService = new CityServiceImpl(cityRepository);
    }

}
