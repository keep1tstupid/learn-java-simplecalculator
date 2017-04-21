package folder;

public class Calculate {
    public static double div(double a, double b) throws ZeroException, NegNumException {

        if (b == 0) throw new ZeroException();
        if (b < 0) throw new NegNumException();

        return a / b;
    }
}
