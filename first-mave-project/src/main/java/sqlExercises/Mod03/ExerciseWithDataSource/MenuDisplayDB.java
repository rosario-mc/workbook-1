package sqlExercises.Mod03.ExerciseWithDataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class MenuDisplayDB {
    static Scanner scanner = new Scanner(System.in);

    public static void start(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java App <username> <password>");
            return;
        }

        DataSource ds = configureDatasource(args);
        displayHomeScreen(ds);
    }

    public static DataSource configureDatasource(String[] args) {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/northwind");
        ds.setUsername(args[0]);
        ds.setPassword(args[1]);
        return ds;
    }

    public static void displayHomeScreen(DataSource ds) {

        boolean run = true;
        while (run) {
            String menu = """
                    \nWhat do you want to do?
                    1) Display all products
                    2) Display all customers
                    3) Display all categories
                    0) Exit
                    Select an option:
                    """;
            System.out.print(menu);
            String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "1", "DISPLAY ALL PRODUCTS":
                    displayProducts(ds);
                    break;
                case "2", "DISPLAY ALL CUSTOMERS":
                    displayCustomers(ds);
                    break;
                case "3", "DISPLAY ALL CATEGORIES":
                    displayAllCategories(ds);
                    System.out.println("\nWhat categoryId would you like to see the products of?");
                    displaySpecificProduct(ds, scanner.nextLine());
                    break;
                case "0", "EXIT":
                    System.out.println("\nHave a great day!");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid Option. Please Enter One Of The Options:\n");
            }
        }
    }

    public static void displayProducts(DataSource ds) {
        System.out.printf("%50s %n%-5s %-35s %-15s %-10s%n", "ALL PRODUCTS IN NORTHWIND DATABASE", "ID", "PRODUCT NAME", "UNIT PRICE", "UNITS IN STOCK");
        System.out.println("-------------------------------------------------------------------------");

        try (
                Connection connection = ds.getConnection();
                PreparedStatement ps = connection.prepareStatement("SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM northwind.products;");
        ) {
            try (
                    ResultSet rs = ps.executeQuery()
            ) {
                while (rs.next()) {
                    System.out.printf("%-5s %-35s %-15s %-10s%n", rs.getString("ProductID"), rs.getString("ProductName"), rs.getString("UnitPrice"), rs.getString("UnitsInStock"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displaySpecificProduct(DataSource ds, String s) {

        System.out.printf("%50s %n%-5s %-35s %-15s %-10s%n", "PRODUCTS IN NORTHWIND DATABASE", "ID", "PRODUCT NAME", "UNIT PRICE", "UNITS IN STOCK");
        System.out.println("-------------------------------------------------------------------------");

        try (
                Connection connection = ds.getConnection();
                PreparedStatement ps = connection.prepareStatement("SELECT * FROM products WHERE CategoryID = ?;");
        ) {
            ps.setInt(1, Integer.parseInt(s));
            try (
                    ResultSet rs = ps.executeQuery()
            ) {
                while (rs.next()) {
                    System.out.printf("%-5s %-35s %-15s %-10s%n", rs.getString("ProductID"), rs.getString("ProductName"), rs.getString("UnitPrice"), rs.getString("UnitsInStock"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayCustomers(DataSource ds) {
        System.out.printf("%55s%n%-45s %-35s %-15s%n", "CUSTOMERS", "Company Name", "Customer ID", "Contact Name");
        System.out.println("----------------------------------------------------------------------------------------------------");
        try (
                Connection connection = ds.getConnection();
                PreparedStatement ps = connection.prepareStatement("SELECT CompanyName, CustomerID, ContactName FROM northwind.customers;");
        ) {
            try (
                    ResultSet rs = ps.executeQuery()
            ) {
                while (rs.next()) {
                    System.out.printf("%-45s %-35s %-15s%n", rs.getString("CompanyName"), rs.getString("CustomerID"), rs.getString("ContactName"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayAllCategories(DataSource ds) {
        System.out.printf("     CATEGORIES\n");
        System.out.println("---------------------");
        System.out.printf("%-5s %s%n", "ID", "CATEGORY NAME");
        try (
                Connection connection = ds.getConnection();
                PreparedStatement ps = connection.prepareStatement("SELECT * FROM categories;");
        ) {
            try (
                    ResultSet rs = ps.executeQuery();
            ) {
                while (rs.next()) {
                    System.out.printf("%-5s %3" +
                            "s%n", rs.getInt("CategoryId"), rs.getString("CategoryName"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}