package br.com.coreeduc.architecture.exceptions;

public class AuthorizationExceptionInvalidToken extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private static final String invalidToken = "Problema ao autenticar o token";

    public AuthorizationExceptionInvalidToken(String msg) {
        super(msg);
    }

    public AuthorizationExceptionInvalidToken() {
        super(invalidToken);
    }

    public AuthorizationExceptionInvalidToken(String msg, Throwable cause) {
        super(msg, cause);
    }

}
