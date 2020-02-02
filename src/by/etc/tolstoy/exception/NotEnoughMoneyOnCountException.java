package by.etc.tolstoy.exception;

/**
 * Created by Home on 21.01.2020.
 */
public class NotEnoughMoneyOnCountException  extends Exception {
    public NotEnoughMoneyOnCountException() {
    }

    public NotEnoughMoneyOnCountException(String message) {
        super(message);
    }

    public NotEnoughMoneyOnCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughMoneyOnCountException(Throwable cause) {
        super(cause);
    }
}
