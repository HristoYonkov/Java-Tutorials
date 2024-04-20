import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // exception = An event that occurs during the execution of a program that,
        // disrupts the normal flow of instructions.

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            
            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result is: " + z);

        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero!");

        } catch (InputMismatchException e) {
            System.out.println("Pleas use a whole numbers!");

        } catch (Exception e) {
            // This will catch all exceptions!
            System.out.println("Something went wrong!");
        } finally {
            // Always executes whatever is with finally block!
            scanner.close();
            System.out.println("This will always print..");
        }

    }
}