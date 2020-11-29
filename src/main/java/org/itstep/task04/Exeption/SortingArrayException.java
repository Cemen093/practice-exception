package org.itstep.task04.Exeption;

public class SortingArrayException extends Exception{
    public SortingArrayException() {
    }

    public SortingArrayException(String message) {
        super(message);
    }

    public SortingArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public SortingArrayException(Throwable cause) {
        super(cause);
    }

    public SortingArrayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
