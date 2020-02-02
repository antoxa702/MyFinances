package by.etc.tolstoy.exception.service;

/**
 * Created by Home on 21.01.2020.
 */
public class ServiceCountException extends Exception {
    public ServiceCountException() {
    }

    public ServiceCountException(String message) {
        super(message);
    }

    public ServiceCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceCountException(Throwable cause) {
        super(cause);
    }
}
