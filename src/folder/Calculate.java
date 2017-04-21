package folder;

public class Calculate {
    public static double div(double a, double b) throws CalcProblemZero, CalcProblemNegNum {

        if (b == 0) throw new CalcProblemZero("You can't divide by zero");
        if (b < 0) throw new CalcProblemNegNum("You can't divide by a negative number");

        return a / b;
    }
}
