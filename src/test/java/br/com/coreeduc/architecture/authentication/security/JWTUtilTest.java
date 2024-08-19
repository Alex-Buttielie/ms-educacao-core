package br.com.coreeduc.architecture.authentication.security;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.util.ReflectionTestUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class JWTUtilTest {

    @Mock
    private UserDetailsService userDetailsService;
    private String EXPECTED_SECRET = "SequenciaDeCaracteresParaAssinarToken";
    private Long EXPECTED_EXPIRATION = 86400000L;
    @InjectMocks
    private JWTUtil jwtUtil;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        ReflectionTestUtils.setField(jwtUtil, "secret", EXPECTED_SECRET);
        ReflectionTestUtils.setField(jwtUtil, "expiration", EXPECTED_EXPIRATION);
    }

    @Test
    void deveValidarGeracaoToken() {
        var token = jwtUtil.generateToken("alex", "tenant_1");
        var isValid = jwtUtil.validToken(token);
        assertTrue(isValid);
    }

    @Test
    void naoDeveValidarToken() {
        var invalidToken = "invalidToken";
        var isValid = jwtUtil.validToken(invalidToken);
        assertFalse(isValid);
    }

    @Test
    void deveGerarToken() {
        var username = "testUser";
        var tenant = "testTenant";
        var token = jwtUtil.generateToken(username, tenant);
        assertNotNull(token);
    }

    @Test
    void deveBuscarUsernameToken() {
        var username = "testUser";
        var token = jwtUtil.generateToken(username, "testTenant");
        var resultUsername = jwtUtil.getUsername(token);
        assertEquals(username, resultUsername);
    }

    @Test
    void naoDeveBuscarUsernameToken() {
        var invalidToken = "invalidToken";
        var resultUsername = jwtUtil.getUsername(invalidToken);
        assertNull(resultUsername);
    }

    @Test
    void deveTestarAutenticacaoToken() {
        var username = "testUser";
        var userDetails = new User(username, "password", Collections.emptyList());
        var token = jwtUtil.generateToken(username, "testTenant");
        when(userDetailsService.loadUserByUsername(username)).thenReturn(userDetails);
        var authenticationToken = jwtUtil.getAuthentication(token);
        assertNotNull(authenticationToken);
        var user = (User) authenticationToken.getPrincipal();
        assertEquals(username, user.getUsername());
    }

    @Test
    void naoDeveTestarAutenticacaoToken() {
        var invalidToken = "invalidToken";
        var authenticationToken = jwtUtil.getAuthentication(invalidToken);
        assertNull(authenticationToken);
    }

    @Test
    void deveBuscarClaimsValidos() {
        var username = "testUser";
        var token = jwtUtil.generateToken(username, "testTenant");
        var claims = jwtUtil.getClaims(token);
        assertNotNull(claims);
        assertEquals(username, claims.getSubject());
    }

    @Test
    void deveBuscarClaimsInvalidos() {
        var invalidToken = "invalidToken";
        var claims = jwtUtil.getClaims(invalidToken);
        assertNull(claims);
    }

    @Test
    void deveBuscarTenantsValidasToken() {
        var username = "testUser";
        var token = jwtUtil.generateToken(username, "testTenant");
        var request = mock(HttpServletRequest.class);
        when(request.getHeader("Authorization")).thenReturn("Bearer " + token);
        var resultTenant = jwtUtil.getTenant(request);
        assertEquals("testTenant", resultTenant);
    }

    @Test
    void deveTestarBuscaTenantsInvalidaToken() {
        var request = mock(HttpServletRequest.class);
        when(request.getHeader("Authorization")).thenReturn(null);
        var resultTenant = jwtUtil.getTenant(request);
        assertNull(resultTenant);
    }

}