package br.com.coreeduc.adapters.outbound.authentication.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

import static org.yaml.snakeyaml.nodes.Tag.PREFIX;


public class JWTUtil {

    @Value("${jwt.secret}")
    private static String secret;

    public static boolean tokenValido(String token) {
        Claims claims = getClaims(token);
        if (claims != null) {
            String username = claims.getSubject();
            Date expirationDate = claims.getExpiration();
            Date now = new Date(System.currentTimeMillis());
            if (username != null && expirationDate != null && now.before(expirationDate)) {
                return true;
            }
        }
        return false;
    }

    public static String getUsername(String token) {
        Claims claims = getClaims(token);
        if (claims != null) {
            return claims.getSubject();
        }
        return null;
    }

    private static Claims getClaims(String token) {
        try {
            return Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            return null;
        }
    }

    public static String getTenant(HttpServletRequest req) {
        String token = req.getHeader("Authorization");
        if (token == null) {
            return null;
        }
        String tenant = Jwts.parser()
                .setSigningKey(secret.getBytes())
                .parseClaimsJws(token.replace(PREFIX, ""))
                .getBody()
                .getAudience();
        return tenant;
    }


}
