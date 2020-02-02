package by.etc.tolstoy.dao.exception;

/**
 * Created by Home on 21.01.2020.
 */
public class DAOUserRegistrationException extends Exception {
    public DAOUserRegistrationException() {
    }

    public DAOUserRegistrationException(String message) {
        super(message);
    }

    public DAOUserRegistrationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOUserRegistrationException(Throwable cause) {
        super(cause);
    }
}
