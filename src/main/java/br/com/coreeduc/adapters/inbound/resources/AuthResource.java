package br.com.coreeduc.adapters.inbound.resources;

import br.com.coreeduc.adapters.outbound.authentication.dto.EmailAuthenticationDTO;
import br.com.coreeduc.adapters.outbound.authentication.services.AuthService;
import br.com.coreeduc.adapters.outbound.persistence.services.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/auth")
public class AuthResource {

    private AuthService service;

    private UserService userService;

    public UserService getUserService() {
        return this.userService;
    }

    @Autowired
    public AuthResource(AuthService service, UserService userService) {
        this.service = service;
        this.userService = userService;
    }


    public AuthService getService() {
        return this.service;
    }

    //public JWTUtil getJwtUtil() {
    //   return this.jwtUtil;
    //}

    @RequestMapping(value = "/refresh_token", method = RequestMethod.POST)
    public ResponseEntity<Void> refreshToken(HttpServletResponse response) {
        /**
         * Lembrar de pegar as tenant e colocar regra aqui para geração de novo token
         *
         var user = this.getUserService().authenticated();
         String token = this.getJwtUtil().generateToken(user.getUsername(), tenant);
         response.addHeader("Authorization", "Bearer " + token);
         response.addHeader("access-control-expose-headers", "Authorization");
         */
        return ResponseEntity.noContent().build();
    }

    @ApiOperation(value = "Recuperar senha")
    @RequestMapping(value = "/forgot", method = RequestMethod.POST)
    public ResponseEntity<String> forgot(@Valid @RequestBody EmailAuthenticationDTO dto) {
        this.getService().sendNewPassword(dto);
        return ResponseEntity.ok().build();
    }

}
