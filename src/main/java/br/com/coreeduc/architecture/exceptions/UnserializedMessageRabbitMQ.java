package br.com.coreeduc.architecture.exceptions;

public class UnserializedMessageRabbitMQ extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UnserializedMessageRabbitMQ(String msg) {
        super(msg);
    }

    public UnserializedMessageRabbitMQ(String msg, Throwable cause) {
        super(msg, cause);
    }

}
