package br.com.luankenzley.helpdesk.api.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {


    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
