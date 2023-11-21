package br.com.coreeduc.adapters.outbound.authentication.security;

import br.com.coreeduc.adapters.outbound.authentication.dto.CredentialsDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;


public class JWTAuthenticationFilter extends AbstractAuthenticationProcessingFilter {


    public JWTAuthenticationFilter(String url, AuthenticationManager authManager) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res) throws AuthenticationException {

        try {
            CredentialsDTO creds = new ObjectMapper().readValue(req.getInputStream(), CredentialsDTO.class);
            UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(creds.getEmail(), creds.getPassword());
            Authentication auth = getAuthenticationManager().authenticate(authToken);
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

        Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
        String tenant = "";
        for (GrantedAuthority gauth : authorities) {
            tenant = gauth.getAuthority();
        }
        String username = ((UserSS) auth.getPrincipal()).getUsername();
        String token = AuthenticationService.generateToken(username, tenant);
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
            response.setStatus(401);
            response.setContentType("application/json");
            response.getWriter().append(json());
        }

        private String json() {
            long date = new Date().getTime();
            logger.fatal("Login não realizado!");
            return "{\"timestamp\": " + date + ", "
                    + "\"status\": 401, "
                    + "\"error\": \"Não autorizado\", "
                    + "\"message\": \"Email ou senha inválidos\", "
                    + "\"path\": \"/login\"}";
        }
    }
}
