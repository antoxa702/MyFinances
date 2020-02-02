package by.etc.tolstoy.service.exception;

/**
 * Created by Home on 22.01.2020.
 */
public class NullLoginException extends Throwable {

    public NullLoginException() {
    }

    public NullLoginException(String message) {
        super(message);
    }

    public NullLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullLoginException(Throwable cause) {
        super(cause);
    }
}
