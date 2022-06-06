package Exceptions;

import java.io.Serial;

public class CpfIncorretoException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public CpfIncorretoException(String message) {
        super(message);
    }
}
