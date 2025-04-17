package week2;

import java.util.Scanner;
public class fullNamePasser {

    public static void main(String[] args) {
        String fullName = getUserInput();
        parseAndDisplayName(fullName);
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name (first last OR first middle last): ");
        String input = scanner.nextLine();
        scanner.close();
        return input.trim();
    }

    public static void parseAndDisplayName(String name) {
        // Split by one or more spaces
        String[] nameParts = name.split("\\s+");

    if (nameParts.length == 2) {
        System.out.println("First name: " + nameParts[0]);
        System.out.println("Last name: " + nameParts[1]);
    } else if (nameParts.length == 3) {
        System.out.println("First name: " + nameParts[0]);
        System.out.println("Middle name: " + nameParts[1]);
        System.out.println("Last name: " + nameParts[2]);
    } else {
        System.out.println("Invalid name format. Please enter either 2 or 3 names.");
    }
}
}
