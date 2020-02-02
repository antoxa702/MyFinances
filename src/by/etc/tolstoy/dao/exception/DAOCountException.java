package by.etc.tolstoy.dao.exception;

/**
 * Created by Home on 20.01.2020.
 */
public class DAOCountException extends Exception {

    private static final long serialVersionUID = 1L;

    public DAOCountException() {
    }

    public DAOCountException(String message) {
        super(message);
    }

    public DAOCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOCountException(Throwable cause) {
        super(cause);
    }
}
