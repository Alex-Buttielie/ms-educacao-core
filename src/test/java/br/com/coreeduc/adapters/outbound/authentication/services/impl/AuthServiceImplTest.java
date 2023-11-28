package br.com.coreeduc.adapters.outbound.authentication.services.impl;


import br.com.coreeduc.adapters.outbound.authentication.dto.EmailAuthenticationDTO;
import br.com.coreeduc.adapters.outbound.authentication.services.EmailService;
import br.com.coreeduc.adapters.outbound.persistence.entities.UserEntity;
import br.com.coreeduc.adapters.outbound.persistence.repositories.UserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class AuthServiceImplTest {

    @InjectMocks
    private AuthServiceImpl service;
    @Mock
    private UserRepository repository;
    @Mock
    private BCryptPasswordEncoder pe;
    @Mock
    private EmailService emailService;
    private  EmailAuthenticationDTO email;
    private UserEntity userEntity;

    @BeforeEach
    public void init() {
        userEntity = UserEntity.builder()
                .email("teste@gmail.com")
                .passwordUser("$2a$10$3XhhrCOssmvwSty2jH2CveJFyaybagNXzND2WC0SPFGcROvZt5ze.")
                .build();

        email = EmailAuthenticationDTO.builder()
                .email(userEntity.getEmail())
                .lastPassword("123456")
                .newPassword("654321")
                .build();

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        service.pe = passwordEncoder;
    }

    @Test
    public void deveTestarFuncaoValidarSenhaComSucesso() {
        Assert.assertNotNull(Optional.of(userEntity).map(service.functionValidarSenhaInformada(email)));
    }


}
