package by.etc.tolstoy.bean.exception;

/**
 * Created by Home on 21.01.2020.
 */
public class NullCountException extends Exception {
    public NullCountException() {
    }

    public NullCountException(String message) {
        super(message);
    }

    public NullCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullCountException(Throwable cause) {
        super(cause);
    }
}
