package by.etc.tolstoy.exception.service;

/**
 * Created by Home on 20.01.2020.
 */
public class ServiceClientException extends Exception {

    public static final long serialVersionUID = 1L;
    public ServiceClientException() {
    }

    public ServiceClientException(String message) {
        super(message);
    }

    public ServiceClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceClientException(Throwable cause) {
        super(cause);
    }
}
