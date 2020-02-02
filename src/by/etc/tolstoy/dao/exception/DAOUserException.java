package by.etc.tolstoy.dao.exception;

/**
 * Created by Home on 20.01.2020.
 */
public class DAOUserException extends Exception {

    public static final long serialVersionUID = 1L;
    public DAOUserException() {
    }

    public DAOUserException(String message) {
        super(message);
    }

    public DAOUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOUserException(Throwable cause) {
        super(cause);
    }
}
