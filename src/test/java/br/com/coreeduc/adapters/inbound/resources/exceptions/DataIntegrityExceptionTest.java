package br.com.coreeduc.adapters.inbound.resources.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DataIntegrityExceptionTest {

    @Test
    public void testConstructorWithMessage() {
        String errorMessage = "Data integrity violation";
        DataIntegrityException exception = new DataIntegrityException(errorMessage);

        assertEquals(errorMessage, exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    public void testConstructorWithMessageAndCause() {
        String errorMessage = "Data integrity violation";
        Throwable cause = new RuntimeException("Root cause");
        DataIntegrityException exception = new DataIntegrityException(errorMessage, cause);

        assertEquals(errorMessage, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }
}