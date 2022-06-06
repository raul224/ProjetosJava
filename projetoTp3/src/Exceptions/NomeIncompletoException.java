package Exceptions;

import java.io.Serial;

public class NomeIncompletoException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public NomeIncompletoException(String message) {
        super(message);
    }
}
