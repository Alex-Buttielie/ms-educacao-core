package br.com.coreeduc.aplication.services;

import br.com.coreeduc.aplication.records.EmailAuthenticationRecord;

public interface AuthService {
    String sendNewPassword(EmailAuthenticationRecord email);
}
