package week7.interfacesWorkbookExercise;

import java.util.Scanner;

public class FinanceApplication {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Rosario", "123", 12500);
        BankAccount account2 = new BankAccount("Myles", "234", 1500);

        account1.deposit(100);
        account2.deposit(100);
        account1.withdraw(50);
        account2.withdraw(10);

        Portfolio portfolio = new Portfolio("Rosario", "My Portfolio");

        while (true) {
            System.out.println("\nWould you like to add a new asset? (yes/no)");
            String response = input.nextLine();

            if (response.equalsIgnoreCase("no")) {
                break;
            }

            System.out.println("Enter asset type (House, Gold, Jewelry): ");
            String type = input.nextLine();

            System.out.println("Enter asset name or description: ");
            String name = input.nextLine();

            System.out.println("Enter asset value: ");
            double value = Double.parseDouble(input.nextLine());

            switch (type.toLowerCase()) {
                case "house":
                    portfolio.add(new House(name, value));
                    break;
                case "gold":
                    portfolio.add(new Gold(name, value));
                    break;
                case "jewelry":
                    portfolio.add(new Jewelry(name, value));
                    break;
                default:
                    System.out.println("Unknown asset type. Please enter House, Gold, or Jewelry.");
            }
        }

        portfolio.add(new BankAccount("Rosario", "123", 56123));
        portfolio.add(new BankAccount("Joint Account", "456", 3456123));
        portfolio.add(new CreditCard("Affirm Credit Card", "789", 561));
        portfolio.add(new CreditCard("Paypal Credit Card", "788", 156));
        portfolio.add(new House("Summer House", 2050600));
        portfolio.add(new House("Condo", 800900));
        portfolio.add(new Gold("Necklace with Pendant", 5000));
        portfolio.add(new Gold("14k Solid Gold Earings", 600));
        portfolio.add(new Jewelry("Jade Bracelet", 450));
        portfolio.add(new Jewelry("Wedding Ring (Stacked)", 15000));

        System.out.printf("\nTotal Portfolio Value: $%.2f%n", portfolio.getValue());
        Valuable most = portfolio.getMostValuable();
        System.out.println("Most Valuable Asset:\n" + most);
        Valuable least = portfolio.getLeastValuable();
        System.out.println("\nLeast Valuable Asset:\n" + least);
    }
}
