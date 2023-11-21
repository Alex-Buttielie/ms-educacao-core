package br.com.coreeduc.adapters.outbound.authentication.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.Date;

public abstract class AuthenticationService {

    private static final String SIGNINGKEY = "SecretKey";
    private static final String PREFIX = "Bearer";
    @Value("${jwt.secret}")
    private static String secret;

    @Value("${jwt.expiration}")
    private static Long expiration;

    public static String generateToken(String username, String tenant) {
        return Jwts
                .builder()
                .setAudience(tenant)
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(SignatureAlgorithm.HS512, secret.getBytes())
                .compact();
    }

    public static Authentication getAuthentication(HttpServletRequest req) {
        String token = req.getHeader("Authorization");
        if (token != null) {
            String user = Jwts.parser()
                    .setSigningKey(SIGNINGKEY)
                    .parseClaimsJws(token.replace(PREFIX, ""))
                    .getBody()
                    .getSubject();
            if (user != null) {
                return new UsernamePasswordAuthenticationToken(user, null, Collections.emptyList());
            }
        }

        return null;
    }

}
