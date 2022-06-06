package Exceptions;

import java.io.Serial;

public class SobreNomeIncorretoException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public SobreNomeIncorretoException(String message) {
        super(message);
    }
}
