package br.com.coreeduc.architecture.tenanty;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TenantContextTest {

    @BeforeEach
    public void setUp() {
        TenantContext.setCurrentTenant(null);
    }

    @AfterEach
    public void tearDown() {
        TenantContext.setCurrentTenant(null);
    }

    @Test
    public void testGetCurrentTenantWhenNotSet() {
        assertThat(TenantContext.getCurrentTenant()).isNull();
    }

    @Test
    public void testSetAndGetTenant() {
        TenantContext.setCurrentTenant("testTenant");
        assertThat(TenantContext.getCurrentTenant()).isEqualTo("testTenant");
    }

    @Test
    public void testClearTenantAfterSet() {
        TenantContext.setCurrentTenant("testTenant");
        TenantContext.setCurrentTenant(null);
        assertThat(TenantContext.getCurrentTenant()).isNull();
    }

    @Test
    public void testMultipleThreads() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            TenantContext.setCurrentTenant("Thread1Tenant");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            TenantContext.setCurrentTenant("Thread2Tenant");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        assertThat(TenantContext.getCurrentTenant()).isNull();
    }
}