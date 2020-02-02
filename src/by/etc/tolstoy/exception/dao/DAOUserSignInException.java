package by.etc.tolstoy.exception.dao;

/**
 * Created by Home on 21.01.2020.
 */
public class DAOUserSignInException extends Exception {
    public DAOUserSignInException() {
    }

    public DAOUserSignInException(String message) {
        super(message);
    }

    public DAOUserSignInException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOUserSignInException(Throwable cause) {
        super(cause);
    }
}
