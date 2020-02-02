package by.etc.tolstoy.dao.exception;

import java.io.IOException;

/**
 * Created by Home on 21.01.2020.
 */
public class DAOCantCreateFileException extends Exception {
    public DAOCantCreateFileException() {
    }

    public DAOCantCreateFileException(String message) {
        super(message);
    }

    public DAOCantCreateFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOCantCreateFileException(Throwable cause) {
        super(cause);
    }
}
