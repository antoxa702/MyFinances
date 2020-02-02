package by.etc.tolstoy.exception.service;

/**
 * Created by Home on 22.01.2020.
 */
public class NullUserException extends Exception {

    public NullUserException() {
    }

    public NullUserException(String message) {
        super(message);
    }

    public NullUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullUserException(Throwable cause) {
        super(cause);
    }
}
