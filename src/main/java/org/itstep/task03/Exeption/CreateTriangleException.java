package org.itstep.task03.Exeption;

public class CreateTriangleException extends Exception{
    public CreateTriangleException() {
    }

    public CreateTriangleException(String message) {
        super(message);
    }

    public CreateTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateTriangleException(Throwable cause) {
        super(cause);
    }

    public CreateTriangleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
