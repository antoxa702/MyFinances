package by.etc.tolstoy.dao.exception;

/**
 * Created by Home on 22.01.2020.
 */
public class DAOFileNotFoundException extends Throwable {
    public DAOFileNotFoundException() {
    }

    public DAOFileNotFoundException(String message) {
        super(message);
    }

    public DAOFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOFileNotFoundException(Throwable cause) {
        super(cause);
    }
}
