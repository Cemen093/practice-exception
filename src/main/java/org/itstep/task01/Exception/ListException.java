package org.itstep.task01.Exception;

public class ListException extends Exception{
    public ListException() {
    }

    public ListException(String message) {
        super(message);
    }

    public ListException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListException(Throwable cause) {
        super(cause);
    }

    public ListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
