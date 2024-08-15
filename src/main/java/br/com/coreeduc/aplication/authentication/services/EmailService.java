package br.com.coreeduc.aplication.authentication.services;

import br.com.coreeduc.aplication.http.EmailDto;


//@Service
public interface EmailService {

    String sendMail(EmailDto email);
}
