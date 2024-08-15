package br.com.coreeduc.aplication.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AuthorizationExceptionTest {

    @Test
    public void testConstructorWithMessage() {
        String errorMessage = "Unauthorized access";
        AuthorizationException exception = new AuthorizationException(errorMessage);
        assertEquals(errorMessage, exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    public void testConstructorWithMessageAndCause() {
        String errorMessage = "Unauthorized access";
        Throwable cause = new RuntimeException("Root cause");
        AuthorizationException exception = new AuthorizationException(errorMessage, cause);
        assertEquals(errorMessage, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

}