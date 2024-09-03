package br.com.coreeduc.architecture.authentication.security;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class JWTAuthorizationFilterTest {

    @Mock
    private AuthenticationManager authenticationManager;

    @Mock
    private JWTUtil jwtUtil;

    @Mock
    private UserDetailsService userDetailsService;

    @InjectMocks
    private JWTAuthorizationFilter jwtAuthorizationFilter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void doFilterInternal_ValidToken_AuthenticationSet() throws ServletException, IOException {
        var request = new MockHttpServletRequest();
        var response = new MockHttpServletResponse();
        var chain = mock(FilterChain.class);
        var token = new String("eyJhbGciOiJIUzUxMiJ9.eyJhdWQiOiJ0ZW5hbnRfMiIsInN1YiI6ImJ1dHRpZWxsZUBnbWFpbC5jb20iLCJleHAiOjE3MDA5NTU1NjB9.mDCB-bKuHrOh2QfOoWTQabpomifapdL6nqrWIRqKSnTAYFlubFihnzg--p9h1qsWFddBfoikAvTK1C-HshXSPg");
        var validToken = "Bearer " + token;
        var authentication = mock(UsernamePasswordAuthenticationToken.class);
        request.addHeader("Authorization", validToken);
        when(jwtUtil.getAuthentication(token)).thenReturn(authentication);
        jwtAuthorizationFilter.doFilterInternal(request, response, chain);
        verify(jwtUtil, times(1)).getAuthentication(token);
        verify(chain, times(1)).doFilter(request, response);
        verify(authenticationManager, never()).authenticate(any());
        var result = SecurityContextHolder.getContext().getAuthentication();
        assertNotNull(result);
        assertEquals(authentication, result);
    }

    @Test
    void doFilterInternal_InvalidToken_NoAuthenticationSet() throws ServletException, IOException {
        MockitoAnnotations.openMocks(this);
        var request = mock(HttpServletRequest.class);
        var response = mock(HttpServletResponse.class);
        var chain = mock(FilterChain.class);
        var invalidToken = "InvalidToken";
        when(request.getHeader("Authorization")).thenReturn(invalidToken);
        when(jwtUtil.getAuthentication(invalidToken)).thenReturn(null);
        jwtAuthorizationFilter.doFilterInternal(request, response, chain);
        verify(chain, times(1)).doFilter(request, response);
        verify(authenticationManager, never()).authenticate(any());
    }

    @Test
    void doFilterInternal_NoToken_NoAuthenticationSet() throws ServletException, IOException {
        var request = new MockHttpServletRequest();
        var response = new MockHttpServletResponse();
        var chain = mock(FilterChain.class);
        request.addHeader("Authorization", new String());
        jwtAuthorizationFilter.doFilterInternal(request, response, chain);
        verify(jwtUtil, never()).getAuthentication(any());
        verify(chain, times(1)).doFilter(request, response);
        verify(authenticationManager, never()).authenticate(any());
    }

}