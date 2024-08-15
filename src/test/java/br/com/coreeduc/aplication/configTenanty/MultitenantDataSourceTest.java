package br.com.coreeduc.aplication.configTenanty;

import br.com.coreeduc.aplication.configTenanty.MultitenantDataSource;
import br.com.coreeduc.aplication.configTenanty.TenantContext;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultitenantDataSourceTest {

    @Test
    public void testDetermineCurrentLookupKey() {
        MultitenantDataSource dataSource = new MultitenantDataSource();
        TenantContext.setCurrentTenant("tenant123");
        assertEquals("tenant123", dataSource.determineCurrentLookupKey());
    }

    @Test
    public void testDetermineCurrentLookupKeyWithoutSettingTenant() {
        MultitenantDataSource dataSource = new MultitenantDataSource();
        TenantContext.setCurrentTenant(null);
        assertEquals(null, dataSource.determineCurrentLookupKey());
    }
}