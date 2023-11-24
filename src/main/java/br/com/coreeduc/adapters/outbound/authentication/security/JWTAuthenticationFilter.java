package br.com.coreeduc.adapters.outbound.authentication.security;

import br.com.coreeduc.adapters.outbound.authentication.dto.CredentialsDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;


public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private AuthenticationManager authenticationManager;
    private JWTUtil jwtUtil;

    public JWTAuthenticationFilter(AuthenticationManager authManager, JWTUtil jwtUtil) {
        setAuthenticationFailureHandler(new JWTAuthenticationFailureHandler());
        setAuthenticationManager(authManager);
        this.jwtUtil = jwtUtil;
        this.authenticationManager = authManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res) throws AuthenticationException {

        try {
            var creds = new ObjectMapper().readValue(req.getInputStream(), CredentialsDTO.class);
            var authToken = new UsernamePasswordAuthenticationToken(creds.getEmail(), creds.getPassword());
            var auth = this.authenticationManager.authenticate(authToken);
            return auth;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest req,
                                            HttpServletResponse res,
                                            FilterChain chain,
                                            Authentication auth) throws IOException, ServletException {

        var authorities = auth.getAuthorities();
        String tenant = new String();
        for (GrantedAuthority gauth : authorities) {
            tenant = gauth.getAuthority();
        }
        var username = ((UserSS) auth.getPrincipal()).getUsername();
        var token = jwtUtil.generateToken(username, tenant);
        res.addHeader("Authorization", "Bearer " + token);
        res.addHeader("access-control-expose-headers", "Authorization");
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        res.getWriter().append(jsonUsuario(auth, token));

        logger.info("Login realizado com sucesso!");
    }

    private String jsonUsuario(Authentication auth, String token) {
        return "{\"nome\": \"" + ((UserSS) auth.getPrincipal()).getUsername() + "\", "
                + "\"token\": \"" + token + "\"}";
    }

    private class JWTAuthenticationFailureHandler implements AuthenticationFailureHandler {

        @Override
        public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception)
                throws IOException {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.setContentType("application/json");
            response.getWriter().append(json());
        }

        private String json() {
            var date = new Date().getTime();
            logger.fatal("Login não realizado!");
            return "{\"timestamp\": " + date + ", "
                    + "\"status\": 401, "
                    + "\"error\": \"Não autorizado\", "
                    + "\"message\": \"Email ou senha inválidos\", "
                    + "\"path\": \"/login\"}";
        }
    }
}
