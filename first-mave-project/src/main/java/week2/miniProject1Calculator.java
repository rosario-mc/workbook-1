package week2;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class miniProject1Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //enter nr1 -done
        double nr1 = getNumbers("Enter the first number: ");

        //enter nr2 - done
        double nr2 = getNumbers("Enter the second number: ");

        //operation and perform
        double result = operationAndPerform(nr1, nr2);
        //display
        System.out.println("Result: " + result);
    }

    public static double getNumbers(String message) {
        System.out.println(message);
        return Double.parseDouble(scanner.nextLine());

    }

    public static double operationAndPerform(double nr1, double nr2) {
        System.out.println("Choose an operation to perform( + , - , * , / ): ");
        String operation = scanner.nextLine();
        double result = 0;

        if (operation.equals("+")) {
            result = nr1 + nr2;
        } else if (operation.equals("-")) {
            result = nr1 - nr2;
        } else if (operation.equals("*")) {
            result = nr1 * nr2;
        } else if (operation.equals("/")) {
            result = nr1 / nr2;
        } else {
            System.out.println("Unknown operator!");
        }
    return result;
    }
}
