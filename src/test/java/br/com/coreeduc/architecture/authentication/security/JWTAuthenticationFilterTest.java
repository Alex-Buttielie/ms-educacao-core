package br.com.coreeduc.architecture.authentication.security;

import br.com.coreeduc.architecture.authentication.security.JWTAuthenticationFilter;
import br.com.coreeduc.architecture.authentication.security.JWTUtil;
import br.com.coreeduc.architecture.authentication.security.UserSS;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class JWTAuthenticationFilterTest {

    @Mock
    private AuthenticationManager authenticationManager;

    @Mock
    private JWTUtil jwtUtil;
    @Mock
    private AuthenticationException authenticationException;
    @InjectMocks
    private JWTAuthenticationFilter jwtAuthenticationFilter;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void attemptAuthenticationTest() throws IOException, ServletException {
        var request = new MockHttpServletRequest();
        request.setContentType(MediaType.APPLICATION_JSON_VALUE);
        request.setContent("{\"email\":\"test@example.com\",\"password\":\"password\"}".getBytes());
        var authResult = new UsernamePasswordAuthenticationToken("test@example.com", "password", Collections.emptyList());
        when(authenticationManager.authenticate(any())).thenReturn(authResult);
        var authentication = jwtAuthenticationFilter.attemptAuthentication(request, null);
        verify(authenticationManager, times(1)).authenticate(any());
        assertEquals(authResult, authentication);
    }

    @Test
    public void successfulAuthenticationTest() throws IOException, ServletException {
        var request = mock(HttpServletRequest.class);
        var response = mock(HttpServletResponse.class);
        var filterChain = mock(FilterChain.class);
        var writerMock = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(writerMock);
        Authentication authentication = new UsernamePasswordAuthenticationToken(
                new UserSS(1l, "test@example.com", "password", "token", "tenant_1"),
                "password",
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        when(jwtUtil.generateToken(anyString(), anyString())).thenReturn("mocked-token");
        jwtAuthenticationFilter.successfulAuthentication(request, response, filterChain, authentication);
        verify(response, times(1)).addHeader(eq("Authorization"), eq("Bearer mocked-token"));
        verify(response, times(1)).addHeader(eq("access-control-expose-headers"), eq("Authorization"));
        verify(response, times(1)).setContentType(eq("application/json"));
        verify(response, times(1)).setCharacterEncoding(eq("UTF-8"));
        verify(writerMock, times(1)).append(eq("{\"nome\": \"test@example.com\", \"token\": \"mocked-token\"}"));
    }

    @Test
    public void authenticationFailureHandlerTest() throws IOException, ServletException {
        MockitoAnnotations.openMocks(this);
        var request = mock(HttpServletRequest.class);
        var response = spy(new MockHttpServletResponse());
        jwtAuthenticationFilter.handleAuthenticationFailure(request, response, authenticationException);
        verify(response, times(1)).setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        verify(response, times(1)).setContentType("application/json");
    }

}