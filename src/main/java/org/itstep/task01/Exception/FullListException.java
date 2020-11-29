package org.itstep.task01.Exception;

public class FullListException extends ListException{
    public FullListException() {
    }

    public FullListException(String message) {
        super(message);
    }

    public FullListException(String message, Throwable cause) {
        super(message, cause);
    }

    public FullListException(Throwable cause) {
        super(cause);
    }

    public FullListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
