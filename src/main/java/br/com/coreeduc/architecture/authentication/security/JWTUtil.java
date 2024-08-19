package br.com.coreeduc.architecture.authentication.security;

import br.com.coreeduc.architecture.exceptions.AuthorizationExceptionInvalidToken;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Objects;


@Component
public class JWTUtil {

    private static final String PREFIX = "Bearer";

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    private final UserDetailsService userDetailsService;

    @Autowired
    public JWTUtil(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public boolean validToken(String token) {
        try {
            validParseClaims(token);
            return validTokenAtributes(getClaims(token));
        }catch (Exception e){
            return false;
        }
    }

    private boolean validTokenAtributes(Claims claims) {
        if (Objects.nonNull(claims)) {
            var username = claims.getSubject();
            var expirationDate = claims.getExpiration();
            var now = new Date(System.currentTimeMillis());
            return username != null && expirationDate != null && now.before(expirationDate);
        }
        return false;
    }

    public String generateToken(String username, String tenant) {
        return Jwts
                .builder()
                .setAudience(tenant)
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(SignatureAlgorithm.HS512, secret.getBytes())
                .compact();
    }

    public String getUsername(String token) {
        var claims = getClaims(token);
        return claims.getSubject();
    }

    public UsernamePasswordAuthenticationToken getAuthentication(String token) {
        if (validToken(token)) {
            var username = getUsername(token);
            var user = userDetailsService.loadUserByUsername(username);
            return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
        }
        return null;
    }

    protected Claims getClaims(String token) {
        validParseClaims(token);
        return Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token).getBody();
    }

    protected void validParseClaims(String token) {
        try {
            Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token);
        }catch (Exception e) {
            throw new AuthorizationExceptionInvalidToken();
        }
    }

    public String getTenant(HttpServletRequest req) {
        var token = req.getHeader("Authorization");
        if (token == null) {
            return null;
        }

        var tenant = "";

        tenant = Jwts.parser()
                .setSigningKey(secret.getBytes())
                .parseClaimsJws(token.replace(PREFIX, ""))
                .getBody()
                .getAudience();
        return tenant;
    }


}
