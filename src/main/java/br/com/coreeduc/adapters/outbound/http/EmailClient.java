package br.com.coreeduc.adapters.outbound.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("ms-email")
public interface EmailClient {
    @RequestMapping(method = RequestMethod.POST, value = "/sending-email")
    void enviarEmail(@RequestBody EmailDto email);

}
