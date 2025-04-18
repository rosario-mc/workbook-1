package week2;

import java.util.Scanner;

public class exercise5 {
    static Scanner scanner= new Scanner(System.in);


    public static void main(String[] args) {

        String fullAddress = getUserInput();  // Get all the user input
        System.out.println(fullAddress);      // Display the full formatted address
    }

    public static String getUserInput() {
        StringBuilder address = new StringBuilder();

        // Collect user input and format it
        String name = getAnswer("Full name");
        String billingStreet = getAnswer("Billing Street");
        String billingCity = getAnswer("Billing City");
        String billingState = getAnswer("Billing State");
        String billingZipCode = getAnswer("Billing Zip Code");
        String shippingStreet = getAnswer("Shipping Street");
        String shippingCity = getAnswer("Shipping City");
        String shippingState = getAnswer("Shipping State");
        String shippingZipCode = getAnswer("Shipping Zip Code");

        // Build the formatted output
        address.append(name).append("\n\n") // Name
                .append("Billing Address:\n")
                .append(billingStreet).append("\n")
                .append(billingCity).append(", ").append(billingState).append(" ").append(billingZipCode).append("\n\n")
                .append("Shipping Address:\n")
                .append(shippingStreet).append("\n")
                .append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZipCode).append("\n");

        return address.toString();
    }

    // Helper method to get user input
    public static String getAnswer(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }
}
