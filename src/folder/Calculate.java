package folder;

public class Calculate {
    public static double div(double a, double b) throws ZeroException, NegNumException {

        if (b == 0) throw new ZeroException("You can't divide by zero");
        if (b < 0) throw new NegNumException("You can't divide by a negative number");

        return a / b;
    }
}
