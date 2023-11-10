package br.com.coreeduc.adapters.outbound.authentication.services.impl;


import br.com.coreeduc.adapters.outbound.authentication.services.AuthService;
import br.com.coreeduc.adapters.outbound.authentication.services.EmailService;
import br.com.coreeduc.adapters.outbound.http.EmailDto;
import br.com.coreeduc.adapters.outbound.persistence.entities.UserEntity;
import br.com.coreeduc.adapters.outbound.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private BCryptPasswordEncoder pe;

    protected UserRepository getRepository () {
        return this.repository;
    }

    @Autowired
    private EmailService emailService;

    @Override
    public String sendNewPassword(String email) {
        return Optional
                .ofNullable(getRepository().findByEmail(email))
                .map(user -> createNewPassword(user))
                .orElseThrow(()-> new RuntimeException("Verifique o e-mail informado, usuário não encontrado"));
    }

    private String createNewPassword(UserEntity user) {
        String newPass = "Alex@99592706";
        String newPasswordEncrypted = pe.encode(newPass);
        user.setPasswordUser(newPasswordEncrypted);
        user = getRepository().save(user);
        EmailDto email = getEmailNewPassword(user, newPass);
        return emailService.sendMail(email);
    }

    private EmailDto getEmailNewPassword(UserEntity user, String newPass) {
        return EmailDto
                .builder()
                .emailFrom(user.getEmail())
                .ownerRef(user.getEmail())
                .emailTo(user.getEmail())
                .subject("Solicitação de nova senha")
                .text("Olá! Sua nova senha é: " + newPass)
                .build();
    }

}
