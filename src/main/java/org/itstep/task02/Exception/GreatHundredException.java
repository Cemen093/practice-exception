package org.itstep.task02.Exception;

public class GreatHundredException extends RuntimeException{
    public GreatHundredException() {
    }

    public GreatHundredException(String message) {
        super(message);
    }

    public GreatHundredException(String message, Throwable cause) {
        super(message, cause);
    }

    public GreatHundredException(Throwable cause) {
        super(cause);
    }

    public GreatHundredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
