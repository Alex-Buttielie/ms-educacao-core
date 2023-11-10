package br.com.coreeduc.adapters.outbound.authentication.services.impl;

import br.com.coreeduc.adapters.outbound.authentication.services.EmailService;
import br.com.coreeduc.adapters.outbound.http.EmailClient;
import br.com.coreeduc.adapters.outbound.http.EmailDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private static final String MENSAGEM_EMAIL_ENVIADO_COM_SUCESSO = "Email enviado com sucesso!";
    private static final String MENSAGEM_EMAIL_NAO_ENVIADO = "Erro ao enviar email." ;

    private static final Logger LOG = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private EmailClient client;

    @Override
    public String sendMail(EmailDto dto) {
        try {
            client.enviarEmail(dto);
            LOG.info(this.MENSAGEM_EMAIL_ENVIADO_COM_SUCESSO);
            return this.MENSAGEM_EMAIL_ENVIADO_COM_SUCESSO;
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error(this.MENSAGEM_EMAIL_NAO_ENVIADO);
            return this.MENSAGEM_EMAIL_NAO_ENVIADO;
        }
    }

}
