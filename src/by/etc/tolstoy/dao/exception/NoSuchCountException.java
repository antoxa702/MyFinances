package by.etc.tolstoy.dao.exception;

/**
 * Created by Home on 22.01.2020.
 */
public class NoSuchCountException extends Exception {
    public NoSuchCountException() {
    }

    public NoSuchCountException(String message) {
        super(message);
    }

    public NoSuchCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchCountException(Throwable cause) {
        super(cause);
    }
}
