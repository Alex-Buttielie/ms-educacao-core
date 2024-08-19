package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.dto.EmailAuthenticationDTO;

public interface AuthService {
    String sendNewPassword(EmailAuthenticationDTO email);
}
