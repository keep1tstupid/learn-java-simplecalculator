import java.util.Scanner;
import java.lang.*;
import java.util.InputMismatchException;
import folder.*;

public class Main {
    public static void main(String[] args) throws InputMismatchException, ZeroException, NegNumException {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the first digit, please");
                double a = s.nextDouble();

                System.out.println("Enter the second digit, please");
                double b = s.nextDouble();

                System.out.println("Result is: " + Calculate.div(a, b));
            }
            catch (ZeroException ex) {
                System.out.println(ex.getMessage());
            } catch (NegNumException ex) {
                System.out.println(ex.getMessage());
            } catch (InputMismatchException ex) {
                System.out.println(ex.toString());
            }

            finally {
                System.out.println("Try again");
            }
        }
    }
}
