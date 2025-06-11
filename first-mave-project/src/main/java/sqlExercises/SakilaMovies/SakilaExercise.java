package sqlExercises.SakilaMovies;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SakilaExercise {
    static Scanner scanner = new Scanner(System.in);

    public static void start(String[] args) {
        if (args.length < 2) {
            System.out.println("MISSING 2 ARGUMENTS: (Usage: java App <username> <password>)");
            return;
        }

        DataSource ds = configureDatasource(args);
        getInput(ds);
    }

    public static DataSource configureDatasource(String[] args) {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/sakila");
        ds.setUsername(args[0]);
        ds.setPassword(args[1]);
        return ds;
    }

    public static void getInput(DataSource ds) {

        boolean run = true;
        while (run) {
            String menu = """
                    \nWhat do you want to do?
                    1) Display list of actors
                    0) Exit
                    Select an option:\s""";
            System.out.print(menu);
            String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "1", "DISPLAY LIST OF ACTORS":
                    System.out.print("\nPlease Enter The Last Name Of Your Favorite Actor: ");
                    displayListOfActors(ds, scanner.nextLine());
                    System.out.print("\nPlease Enter An Actor's First Name & Last Name To See List Of Films Featured: ");
                    displayListOfMovies(ds, scanner.nextLine());
                    break;
                case "0", "EXIT":
                    System.out.println("\nSystem Closing.......");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid Option. Please Enter One Of The Options:\n");
            }
        }
    }

    public static void displayListOfActors(DataSource ds, String s) {
        System.out.printf("%s%s%n%-15s %-35s%n", "\nALL ACTORS WITH LAST NAME: ", s, "FIRST NAME", "LAST NAME");
        System.out.println("-------------------------------");

        try (
                Connection connection = ds.getConnection();
                PreparedStatement ps = connection.prepareStatement("SELECT first_name, last_name FROM sakila.actor WHERE last_name = ?;");
        ) {
            ps.setString(1, s);
            try (
                    ResultSet rs = ps.executeQuery()
            ) {
                while (rs.next()) {
                    System.out.printf("%-15s %-35s%n", rs.getString("first_name"), rs.getString("last_name"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayListOfMovies(DataSource ds, String fullName) {
        System.out.printf("%s%n%s%n", "\nLIST OF FEATURED FILMS", "FILM LIST");
        System.out.println("-------------------------------");

        String[] nameParts = fullName.trim().split("\\s+");
        if (nameParts.length < 2) {
            System.out.println("Please enter both a first name and a last name.");
            return;
        }

        String firstName = nameParts[0];
        String lastName = nameParts[1];

        try (
                Connection connection = ds.getConnection();
                PreparedStatement ps = connection.prepareStatement("SELECT title FROM sakila.film AS f\n" +
                        "JOIN film_actor AS fa ON f.film_id= fa.film_id\n" +
                        "JOIN actor AS a ON fa.actor_id= a.actor_id\n" +
                        "WHERE first_name =? AND last_name = ?;");
        ) {
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            try (
                    ResultSet rs = ps.executeQuery()
            ) {
                while (rs.next()) {
                    System.out.printf("%s%n", rs.getString("title"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}