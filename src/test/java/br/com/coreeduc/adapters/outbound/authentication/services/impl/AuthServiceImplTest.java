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

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

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


    }
    @Test
    public void deveTestarFuncaoValidarSenhaComSucesso() {
        when(pe.matches(anyString(), anyString())).thenReturn(Boolean.TRUE);
        var retorno = Optional.of(userEntity).map(service.functionValidarSenhaInformada(email));
        Assert.assertTrue(retorno.isPresent());
        Assert.assertEquals(email.getEmail(), retorno.get().getEmail());
        Assert.assertEquals(userEntity.getPasswordUser(), retorno.get().getPasswordUser());
    }


}
