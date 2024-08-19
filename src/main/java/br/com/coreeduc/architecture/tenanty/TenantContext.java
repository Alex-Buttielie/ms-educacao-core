package br.com.coreeduc.architecture.tenanty;

public class TenantContext {

    private static final ThreadLocal<String> CURRENT_TENANT = new ThreadLocal<>();

    public static String getCurrentTenant() {
        return CURRENT_TENANT.get();
    }

    public static void setCurrentTenant(final String tenant) {
        CURRENT_TENANT.set(tenant);
    }

}