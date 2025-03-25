package br.com.coreeduc.architecture.tenanty;

import br.com.coreeduc.architecture.authentication.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

@Component
public class TenantInterceptor implements WebRequestInterceptor {
    public static final String TENANT_HEADER = "X-tenant";

    private final JWTUtil jwtUtil;

    @Autowired
    public TenantInterceptor(JWTUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    public void preHandle(WebRequest webRequest) throws Exception {
        var token = webRequest.getHeader("Authorization");
        var tenant = jwtUtil.getTenant(token);
        TenantContext.setCurrentTenant(tenant);
    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {

    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }
}
