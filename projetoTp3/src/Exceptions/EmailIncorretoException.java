package Exceptions;

import java.io.Serial;

public class EmailIncorretoException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public EmailIncorretoException(String message) {
        super(message);
    }
}
