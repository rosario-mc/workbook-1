package sqlExercises.Mod03;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

public class NorthwindExercise2 {
    public static void main(String[] args) throws SQLException {
        String userinput = getUserInput();

        if (args.length != 2) {
            System.out.println("Application needs 2 parameters to run.");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password);

        /*
        Exercise 1

        PreparedStatement ps = connection.prepareStatement("SELECT CompanyName, CustomerID, ContactName FROM northwind.customers\n" +
                "WHERE CompanyName LIKE ?");

        ps.setString(1, "%" + userinput + "%");
        ResultSet rs = ps.executeQuery();

        System.out.printf("%60s%n%-45s %-35s %-15s%n", "MATCHING CUSTOMERS", "Company Name", "Customer ID", "Contact Name");
        System.out.println("----------------------------------------------------------------------------------------------------");

        while (rs.next()) {
            System.out.printf("%-45s %-35s %-15s%n", rs.getString("CompanyName"), rs.getString("CustomerID"), rs.getString("ContactName"));
        }


        //Exercise 2
        PreparedStatement ps = connection.prepareStatement("SELECT FirstName, LastName, Title FROM northwind.employees\n" +
                "WHERE City LIKE ?;");
        ps.setString(1, "%" + userinput + "%");
        ResultSet rs = ps.executeQuery();

        System.out.printf("%n%s %s%n%n%-28s %s%n","EMPLOYEES IN ", userinput, "EMPLOYEE NAME", "TITLE");
        System.out.println("-----------------------------------------------------");

        while (rs.next()) {
            System.out.printf(
                    "%-7s %-20s %s%n",
                    rs.getString("FirstName"),
                    rs.getString("LastName"),
                    rs.getString("Title"));
        }
        */
        PreparedStatement ps = connection.prepareStatement("SELECT OrderID, OrderDate FROM northwind.orders\n" +
                "WHERE CustomerID = ?");

        ps.setString(1, "%" + userinput + "%");
        ResultSet rs = ps.executeQuery();

        System.out.printf("%s%s%n%-45s %-35s%n", "ORDERS FOR ", userinput, "Order ID", "Order Date");
        System.out.println("--------------------------------------------------------------------");

        while (rs.next()) {
            System.out.printf("%-45s %-35s%n", rs.getString("OrderID"), rs.getString("OrderDate"));
        }
    }

        public static String getUserInput () {
            Scanner input = new Scanner(System.in);
            /*
            Exercise 1
            System.out.print("Enter the full Company Name or part of it: ");

            Exercise 2
            System.out.print("Enter City: ");

            */
            System.out.print("Enter Customer ID: ");

            return input.nextLine();
        }
    }