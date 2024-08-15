package br.com.coreeduc.aplication.resources;

import br.com.coreeduc.aplication.authentication.dto.EmailAuthenticationDTO;
import br.com.coreeduc.aplication.authentication.security.JWTUtil;
import br.com.coreeduc.aplication.authentication.services.AuthService;
import br.com.coreeduc.aplication.services.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/auth")
public class AuthResource {

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    private AuthService service;

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return this.userService;
    }

    public AuthService getService () {
        return this.service;
    }

    public JWTUtil getJwtUtil() {
        return this.jwtUtil;
    }

    @RequestMapping(value = "/refresh_token", method = RequestMethod.POST)
    public ResponseEntity<Void> refreshToken(HttpServletResponse response) {
        var user = this.getUserService().authenticated();
        String token = this.getJwtUtil().generateToken(user.getUsername(), jwtUtil.getTenant((HttpServletRequest) user));
        response.addHeader("Authorization", "Bearer " + token);
        response.addHeader("access-control-expose-headers", "Authorization");
        return ResponseEntity.noContent().build();
    }

    @ApiOperation(value = "Recuperar senha")
    @RequestMapping(value = "/forgot", method = RequestMethod.POST)
    public ResponseEntity<String> forgot(@Valid @RequestBody EmailAuthenticationDTO dto) {
        this.getService().sendNewPassword(dto);
        return ResponseEntity.ok().build();
    }

}
