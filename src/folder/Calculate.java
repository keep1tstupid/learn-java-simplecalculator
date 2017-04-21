package folder;

public class Calculate {
    public static double div(double a, double b) throws ExceptionZero, ExceptionNegNum {

        if (b == 0) throw new ExceptionZero("You can't divide by zero");
        if (b < 0) throw new ExceptionNegNum("You can't divide by a negative number");

        return a / b;
    }
}
