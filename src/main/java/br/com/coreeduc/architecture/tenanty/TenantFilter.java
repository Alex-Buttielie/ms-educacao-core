package br.com.coreeduc.architecture.tenanty;

import br.com.coreeduc.architecture.authentication.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Order(1)
class TenantFilter implements Filter {

    @Autowired
    private JWTUtil jwtUtil;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws ServletException, IOException {

        var req = (HttpServletRequest) request;
        var tenant = jwtUtil.getTenant(req);
        TenantContext.setCurrentTenant(tenant);

        try {
            chain.doFilter(request, response);
        }  catch (Exception e){
            e.printStackTrace();
        } finally {
            SecurityContextHolder.clearContext();
            TenantContext.setCurrentTenant(null);
        }
    }
}