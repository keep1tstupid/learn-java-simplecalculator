package folder;

import java.util.InputMismatchException;

public class Calculate {
    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("zero");
        }
        if (b < 0) {
            throw new ArithmeticException("enter smth > 0");
        }
        return a / b;

    }
}
