package br.com.coreeduc.aplication.services;


import br.com.coreeduc.aplication.dto.EmailAuthenticationDTO;
import br.com.coreeduc.aplication.entities.UserEntity;
import br.com.coreeduc.aplication.repositories.UserRepository;
import br.com.coreeduc.architecture.exceptions.AuthorizationExceptionInvalidToken;
import br.com.coreeduc.architecture.http.EmailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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
                .ofNullable(getRepository().findByEmail(dto.email()))
                .map(functionValidarSenhaInformada(dto))
                .map(user -> createNewPassword(user, dto.newPassword(), dto.lastPassword()))
                .orElseThrow(() -> new AuthorizationExceptionInvalidToken("Verifique o e-mail informado, usuário não encontrado"));
    }

    protected Function<UserEntity, UserEntity> functionValidarSenhaInformada(EmailAuthenticationDTO dto) {
        return user -> {
            var isSenhaInformadaValida = pe.matches(dto.lastPassword(), user.getPasswordUser());
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


    public  String formatDuration(long seconds) {
        if(seconds == 0) {
            return "NOW";
        }

        LocalDateTime date = Instant.ofEpochSecond(seconds)
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'dias', MM 'meses', HH 'horas', ss 'segundos'");

        return date.format(formatter);
    }


}
