package Exceptions;

import java.io.Serial;

public class NomeIncorretoException  extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public NomeIncorretoException(String message) {
        super(message);
    }
}
