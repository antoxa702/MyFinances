package by.etc.tolstoy.service.exception.transaction_type;

/**
 * Created by Home on 21.01.2020.
 */
public class TransferTransactionException extends Exception {
    public TransferTransactionException() {
    }

    public TransferTransactionException(String message) {
        super(message);
    }

    public TransferTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransferTransactionException(Throwable cause) {
        super(cause);
    }
}
