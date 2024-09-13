package br.com.coreeduc.architecture.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AuthorizationExceptionInvalidTokenTest {

    @Test
    public void testConstructorWithMessage() {
        var errorMessage = "Unauthorized access";
        var exception = new AuthorizationExceptionInvalidToken(errorMessage);
        assertEquals(errorMessage, exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    public void testConstructorWithMessageAndCause() {
        var errorMessage = "Unauthorized access";
        Throwable cause = new RuntimeException("Root cause");
        var exception = new AuthorizationExceptionInvalidToken(errorMessage, cause);
        assertEquals(errorMessage, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

}