package week3;

import java.util.Scanner;

public class ScannerExeptionsExamples {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        /* Exercise 1
        int num1 = 0;

        int num2 = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                num2 = scanner.nextInt();

                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter whole numbers.");
                scanner.nextLine();
            }
        }

        try {
            int result = num1 / num2;
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        */

        /* Exercise 2
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered the number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Oops! That wasn't a valid number.");
        }
        */

        /* Exercise 3
        int age = 0;

        boolean valid = false;

        while (!valid) {
            System.out.print("Enter your age: ");
            String input = scanner.nextLine();

            try {
                age = Integer.parseInt(input);
                System.out.println("You are " + age + " years old!");
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid age. Please enter a number.");
            }
        }
        */

       /*Exercise 4
       int secret = 7; // Hardcoded number to guess
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            System.out.print("Guess the number (1–10): ");
            String input = scanner.nextLine();

            try {
                int guess = Integer.parseInt(input);
                if (guess == secret) {
                    System.out.println("Correct! 🎉");
                    guessedCorrectly = true;
                } else {
                    System.out.println("Wrong guess. Try again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a number. Try again.");
            }
        }
        */

        /*Exercise 5
        System.out.print("Enter temperature in Celsius: ");
        String input = scanner.nextLine();

        try {
            double celsius = Double.parseDouble(input);
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
         */

        /* Exercise 6
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter a whole number: ");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                if (number % 2 == 0) {
                    System.out.println("That's an even number.");
                } else {
                    System.out.println("That's an odd number.");
                }
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
         */


    }
}
