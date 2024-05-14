package br.com.coreeduc.adapters.outbound.authentication.services.impl;


import br.com.coreeduc.adapters.inbound.exceptions.AuthorizationException;
import br.com.coreeduc.adapters.outbound.authentication.dto.EmailAuthenticationDTO;
import br.com.coreeduc.adapters.outbound.authentication.services.AuthService;
import br.com.coreeduc.adapters.outbound.authentication.services.EmailService;
import br.com.coreeduc.adapters.outbound.http.EmailDto;
import br.com.coreeduc.adapters.outbound.persistence.entities.UserEntity;
import br.com.coreeduc.adapters.outbound.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Function;


@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private BCryptPasswordEncoder pe;
    @Autowired
    private EmailService emailService;

    protected UserRepository getRepository() {
        return this.repository;
    }

    @Override
    public String sendNewPassword(EmailAuthenticationDTO dto) {
        return Optional
                .ofNullable(getRepository().findByEmail(dto.getEmail()))
                .map(functionValidarSenhaInformada(dto))
                .map(user -> createNewPassword(user, dto.getNewPassword(), dto.getLastPassword()))
                .orElseThrow(() -> new AuthorizationException("Verifique o e-mail informado, usuário não encontrado"));
    }

    protected Function<UserEntity, UserEntity> functionValidarSenhaInformada(EmailAuthenticationDTO dto) {
        return user -> {
            var isSenhaInformadaValida = pe.matches(dto.getLastPassword(), user.getPasswordUser());
            return user;
        };
    }

    private String createNewPassword(UserEntity user, String newPass, String lastPassword) {
        var newPasswordEncrypted = getSenhaCriptografada(newPass);
        user.setPasswordUser(newPasswordEncrypted);
        user = getRepository().save(user);
        EmailDto email = getEmailNewPassword(user, newPass);
        return emailService.sendMail(email);
    }
     protected String getSenhaCriptografada(String password) {
        return pe.encode(password);
     }

    private EmailDto getEmailNewPassword(UserEntity user, String newPass) {
        return EmailDto
                .builder()
                .emailFrom(user.getEmail())
                .ownerRef(user.getEmail())
                .emailTo(user.getEmail())
                .subject("Solicitação de nova senha do sistema Educacional: ".concat(newPass))
                .text("Sua nova senha é: " + newPass)
                .build();
    }

}
