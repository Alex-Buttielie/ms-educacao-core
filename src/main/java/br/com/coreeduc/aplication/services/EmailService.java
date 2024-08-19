package br.com.coreeduc.aplication.services;

import br.com.coreeduc.architecture.http.EmailDto;


public interface EmailService {
    String sendMail(EmailDto email);
}
