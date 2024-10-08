package br.com.coreeduc.architecture.tenanty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultitenantDataSourceTest {

    @Test
    public void testDetermineCurrentLookupKey() {
        var dataSource = new MultitenantDataSource();
        TenantContext.setCurrentTenant("tenant123");
        assertEquals("tenant123", dataSource.determineCurrentLookupKey());
    }

    @Test
    public void testDetermineCurrentLookupKeyWithoutSettingTenant() {
        var dataSource = new MultitenantDataSource();
        TenantContext.setCurrentTenant(null);
        assertEquals(null, dataSource.determineCurrentLookupKey());
    }
}