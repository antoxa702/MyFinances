package by.etc.tolstoy.bean.exception;

/**
 * Created by Home on 21.01.2020.
 */
public class NegativeMoneyException extends Exception {

    public NegativeMoneyException() {
    }

    public NegativeMoneyException(String message) {
        super(message);
    }

    public NegativeMoneyException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeMoneyException(Throwable cause) {
        super(cause);
    }
}
