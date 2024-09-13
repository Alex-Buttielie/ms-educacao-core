package br.com.coreeduc.architecture.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DataIntegrityExceptionTest {

    @Test
    public void testConstructorWithMessage() {
        var errorMessage = "Data integrity violation";
        var exception = new DataIntegrityException(errorMessage);
        assertEquals(errorMessage, exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    public void testConstructorWithMessageAndCause() {
        var errorMessage = "Data integrity violation";
        var cause = new RuntimeException("Root cause");
        var exception = new DataIntegrityException(errorMessage, cause);
        assertEquals(errorMessage, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }
}