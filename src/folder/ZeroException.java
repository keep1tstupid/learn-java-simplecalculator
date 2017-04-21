package folder;

import java.lang.*;

public class ZeroException extends Exception {

    public ZeroException(String message) {
        super(message);
    }

    public ZeroException() {
        super("You can't divide by zero");
    }
}

