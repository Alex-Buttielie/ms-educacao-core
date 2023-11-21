package br.com.coreeduc.adapters.outbound.authentication.services;

import br.com.coreeduc.adapters.outbound.authentication.dto.EmailAuthenticationDTO;

public interface AuthService {
    String sendNewPassword(EmailAuthenticationDTO email);
}
