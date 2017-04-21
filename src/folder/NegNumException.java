package folder;

import java.lang.*;

public class NegNumException extends Exception{

    public NegNumException(String message){
        super(message);
    }

    public NegNumException() {
        super("You can't divide by a negative number");
    }
}

