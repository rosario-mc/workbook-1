package Mod03;

import java.sql.*;

public class Northwind {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "yearup");

        Statement statement = connection.createStatement();

        String query = "SELECT * FROM products";

        ResultSet rs = statement.executeQuery(query);

        System.out.println("Products Sold By Northwind:");

        while(rs.next()){
            String products = rs.getString("ProductName");
            System.out.println(products);
        }
        connection.close();
    }
}
