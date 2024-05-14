package br.com.coreeduc.adapters.outbound.configTenanty;

import br.com.coreeduc.adapters.outbound.authentication.security.JWTUtil;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.core.context.SecurityContextHolder;

import static org.mockito.Mockito.when;

public class TenantFilterTest {

    @Mock
    private JWTUtil jwtUtil;

    @InjectMocks
    private TenantFilter tenantFilter;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDoFilter() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addHeader("Authorization", "Bearer validToken");
        when(jwtUtil.getTenant(request)).thenReturn("testTenant");
        Assert.assertNull(TenantContext.getCurrentTenant());
        Assert.assertNotNull(SecurityContextHolder.getContext().getAuthentication());
    }

}