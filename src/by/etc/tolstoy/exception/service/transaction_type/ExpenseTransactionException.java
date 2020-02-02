package by.etc.tolstoy.exception.service.transaction_type;

/**
 * Created by Home on 21.01.2020.
 */
public class ExpenseTransactionException extends Exception {

    public ExpenseTransactionException() {
    }

    public ExpenseTransactionException(String message) {
        super(message);
    }

    public ExpenseTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExpenseTransactionException(Throwable cause) {
        super(cause);
    }
}
