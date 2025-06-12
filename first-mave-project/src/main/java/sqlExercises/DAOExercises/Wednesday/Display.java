package sqlExercises.DAOExercises.Wednesday;

import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
import java.util.List;
import java.util.Scanner;

public class Display {
    static Scanner scanner = new Scanner(System.in);
    private static LanguageDAO lan_dao;

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
        lan_dao = new LanguageDAO(ds);
        getInput(ds);
    }

    public static void getInput(DataSource ds) {

        boolean run = true;
        while (run) {
            String menu = """
                    \nWhat do you want to do?
                    1) Display All languanges
                    2) Display Language by ID
                    3) Display Languange by Name
                    0) Exit
                    Select an option:\s""";
            System.out.print(menu);
            String choice = scanner.nextLine().toUpperCase();
            List<Language> languageList;
            switch (choice) {
                case "1":
                    languageList = lan_dao.getAll();
                    printLanguages(languageList);
                    break;
                case "2":
                    System.out.print("\nPlease Enter A Language ID: ");
                    int lan_id = Integer.parseInt(scanner.nextLine());
                    languageList = lan_dao.getById(lan_id);
                    printLanguages(languageList);
                    break;
                case "3":
                    System.out.print("\nPlease Enter A Language Name: ");
                    String lanName = scanner.nextLine();
                    languageList = lan_dao.getByName(lanName);
                    printLanguages(languageList);
                    break;
                case "0":
                    System.out.println("\nSystem Closing.......");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid Option. Please Enter One Of The Options:\n");
            }
        }
    }

    public static void printLanguages(List<Language> languages) {
        System.out.printf("%-5s %s%n", "ID", "NAME");
        System.out.println("----------------");
        for (Language language : languages) {
            System.out.printf("%-5d %s%n", language.getId(), language.getName());
        }
    }
}
