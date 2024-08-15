package br.com.coreeduc.aplication.authentication.services;

import br.com.coreeduc.aplication.authentication.dto.EmailAuthenticationDTO;

public interface AuthService {
    String sendNewPassword(EmailAuthenticationDTO email);
}
