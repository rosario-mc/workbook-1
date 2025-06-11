package SakilaMovies.WithDataManager;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.util.List;
import java.util.Scanner;

public class Display {
    static Scanner scanner = new Scanner(System.in);
    private static SakilaDataManager dataManager;

    public static void start(String[] args) {
        if (args.length < 2) {
            System.out.println("MISSING 2 ARGUMENTS: (Usage: java App <username> <password>)");
            return;
        }
        String username = args[0];
        String password = args[1];
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/sakila");
        ds.setUsername(username);
        ds.setPassword(password);
        dataManager = new SakilaDataManager(ds);
        getInput(ds);
    }

    public static void getInput(DataSource ds) {

        boolean run = true;
        while (run) {
            String menu = """
                    \nWhat do you want to do?
                    1) Display list of actors
                    2) Display list of films
                    0) Exit
                    Select an option:\s""";
            System.out.print(menu);
            String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "1", "DISPLAY LIST OF ACTORS":
                    System.out.print("\nPlease Enter The Last Name Of Your Favorite Actor: ");
                    String lastName = scanner.nextLine();
                    List<Actor> actors = dataManager.getActor(lastName);
                    printActors(actors);
                    break;
                case "2", "DISPLAY LIST OF FILMS":
                    System.out.print("\nPlease Enter An Actor's ID To See List Of Films Featured: ");
                    int actorId = Integer.parseInt(scanner.nextLine());
                    List<Film> films = dataManager.getFilms(actorId);
                    printFilms(films);
                    break;
                case "0", "EXIT":
                    System.out.println("\nSystem Closing.......");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid Option. Please Enter One Of The Options:\n");
            }
        }
    }

    public static void printActors(List<Actor> actors) {
        System.out.printf("%-10s %-10s %-10s%n", "ACTOR ID", "FIRST", "LAST");
        System.out.println("-------------------------------");
        for (Actor actor : actors) {
            System.out.printf("%-10d %-10s %-10s%n", actor.getActor_id(), actor.getFirst_name(), actor.getLast_name());
        }
    }

    public static void printFilms(List<Film> films) {
        System.out.printf("%-10s %-25s %-120s %-20s %s %n", "FILM ID", "FILM NAME", "DESCRIPTION", "YEAR RELEASED", "FILM LENGTH");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Film film : films) {
            System.out.printf("%-10d %-25s %-120s %-20.0f %.2f%n",
                    film.getFilm_id(),
                    film.getTitle(),
                    film.getDescription(),
                    film.getRelease_year(),
                    film.getLength());
        }
    }
}