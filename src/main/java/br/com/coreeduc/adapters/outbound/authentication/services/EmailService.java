package br.com.coreeduc.adapters.outbound.authentication.services;

import br.com.coreeduc.adapters.outbound.http.EmailDto;


//@Service
public interface EmailService {

    String sendMail(EmailDto email);
}
