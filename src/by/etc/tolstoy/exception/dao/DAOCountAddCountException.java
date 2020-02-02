package by.etc.tolstoy.exception.dao;

/**
 * Created by Home on 21.01.2020.
 */
public class DAOCountAddCountException extends Exception {
    public DAOCountAddCountException() {
    }

    public DAOCountAddCountException(String message) {
        super(message);
    }

    public DAOCountAddCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOCountAddCountException(Throwable cause) {
        super(cause);
    }
}
