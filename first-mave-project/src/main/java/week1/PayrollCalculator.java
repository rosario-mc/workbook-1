package week1;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print( "Hello! What is your name?: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);

        System.out.print("What is your pay rate? ($/hr): ");
        double payRate = scanner.nextDouble();

        System.out.print("How many hours have you worked this week?: ");
        double hoursWorked = scanner.nextDouble();

        double grossPay = 0;

        if(hoursWorked > 40) {
            grossPay += (hoursWorked - 40) * payRate * 1.5;
            grossPay += 40 * payRate;
        } else {
            grossPay += hoursWorked * payRate;
        }

        System.out.printf("%s, your gross pay for this week is: %.2f" , name ,grossPay);

        scanner.close();

    }
}
