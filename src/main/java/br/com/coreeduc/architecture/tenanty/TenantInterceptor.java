package br.com.coreeduc.architecture.tenanty;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

@Component
public class TenantInterceptor implements WebRequestInterceptor {
    public static final String TENANT_HEADER = "X-tenant";

    @Override
    public void preHandle(WebRequest webRequest) throws Exception {
        TenantContext.setCurrentTenant(webRequest.getHeader(TENANT_HEADER));
    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {

    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }
}
