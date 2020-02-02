package by.etc.tolstoy.dao.exception;

import java.io.IOException;

/**
 * Created by Home on 22.01.2020.
 */
public class DAOCountAddTransactionException extends Exception {

    public DAOCountAddTransactionException() {
    }

    public DAOCountAddTransactionException(String message) {
        super(message);
    }

    public DAOCountAddTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOCountAddTransactionException(Throwable cause) {
        super(cause);
    }
}
