package Mod03;

import java.sql.*;


//WITHOUT TRY/CATCH
public class Northwind {
    public static void main(String[] args) throws SQLException {

        if (args.length != 2) {
            System.out.println("Application needs 2 parameters to run.");
        }

        String username = args[0];
        String password = args[1];

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password);

        PreparedStatement ps = connection.prepareStatement("SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM northwind.products;");

        ResultSet rs = ps.executeQuery();

        System.out.printf("%50s %n%-5s %-35s %-15s %-10s%n","ALL PRODUCTS IN NORTHWIND DATABASE", "ID", "PRODUCT NAME", "UNIT PRICE", "UNITS IN STOCK");

        while (rs.next()){
            System.out.printf("%-5s %-35s %-15s %-10s%n", rs.getString("ProductID"), rs.getString("ProductName"), rs.getString("UnitPrice"), rs.getString("UnitsInStock"));
        }

        rs.close();
        ps.close();
        connection.close();

    }
}
        /*
        Exercise 1
        Statement statement = connection.createStatement();

        String query = "SELECT * FROM products";

        ResultSet rs = statement.executeQuery(query);

        System.out.println("Products Sold By Northwind:");

        while(rs.next()){
            String products = rs.getString("ProductName");
            System.out.println(products);
        }
        connection.close();

         */