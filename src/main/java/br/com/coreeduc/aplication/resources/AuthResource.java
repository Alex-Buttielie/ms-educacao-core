package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.records.EmailAuthenticationRecord;
import br.com.coreeduc.aplication.services.AuthService;
import br.com.coreeduc.architecture.authentication.security.JWTUtil;
import br.com.coreeduc.aplication.services.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/auth")
public class AuthResource {

    private JWTUtil jwtUtil;
    private AuthService service;
    private UserService userService;

    @Autowired
    public AuthResource(JWTUtil jwtUtil, AuthService service, UserService userService) {
        this.jwtUtil = jwtUtil;
        this.service = service;
        this.userService = userService;
    }

    public UserService getUserService() {
        return this.userService;
    }

    public AuthService getService () {
        return this.service;
    }

    public JWTUtil getJwtUtil() {
        return this.jwtUtil;
    }

    @PostMapping(value = "/refresh_token")
    public ResponseEntity<Void> refreshToken(HttpServletResponse response) {
        var user = this.getUserService().authenticated();
        String token = this.getJwtUtil().generateToken(user.getUsername(), jwtUtil.getTenant((HttpServletRequest) user));
        response.addHeader("Authorization", "Bearer " + token);
        response.addHeader("access-control-expose-headers", "Authorization");
        return ResponseEntity.noContent().build();
    }

    @ApiOperation(value = "Recuperar senha")
    @PostMapping(value = "/forgot")
    public ResponseEntity<String> forgot(@Valid @RequestBody EmailAuthenticationRecord dto) {
        this.getService().sendNewPassword(dto);
        return ResponseEntity.ok().build();
    }

}
