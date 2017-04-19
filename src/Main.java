import java.util.Scanner;
import java.lang.*;
import folder.Calculate;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the first digit, please");
                double a = s.nextDouble();

                System.out.println("Enter the second digit, please");
                double b = s.nextDouble();


                System.out.println("Result is: " + Calculate.div(a, b));
            } catch (ArithmeticException | InputMismatchException ex) {
                if (ex instanceof InputMismatchException) {
                    System.out.println("You are stupid, it is not a number!");
                } else {
                System.out.println(ex.toString());
                }
            } finally {
                System.out.println("kek");
            }
        }
    }
}
