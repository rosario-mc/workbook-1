package week1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the first number: ");
        double number = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double total = number * number2;

        System.out.println(total);

        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option: ");
        scanner.nextLine();
        String option = scanner.nextLine();

        scanner.close();


    }
}
