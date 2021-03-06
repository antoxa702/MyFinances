package by.etc.tolstoy.service.exception.transaction_type;

import by.etc.tolstoy.bean.exception.NegativeMoneyException;

/**
 * Created by Home on 21.01.2020.
 */
public class IncomingTransactionException extends Exception {
    public IncomingTransactionException() {
    }

    public IncomingTransactionException(String message) {
        super(message);
    }

    public IncomingTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncomingTransactionException(Throwable cause) {
        super(cause);
    }

    public IncomingTransactionException(String s, NegativeMoneyException e) {
    }
}
