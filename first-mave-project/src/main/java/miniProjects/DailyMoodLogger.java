package miniProjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class DailyMoodLogger {
    static Scanner scanner = new Scanner(System.in);
    static LocalDate today = LocalDate.now();
    boolean running = true;




    public static void main(String[] args){
        boolean running = true;

        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("[1] Log today’s mood");
            System.out.println("[2] View past moods");
            System.out.println("[3] Exit");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    String mood = getUserMood();
                    saveEntry(mood);
                    break;
                case "2":
                    readPastEntries();
                    break;
                case "3":
                    running = false;
                    System.out.println("Goodbye! :)");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }


    private static String getUserMood(){
        System.out.println("Hello, this is your Daily Mood Log! \nHow are you feeling today?: ");
        String input = scanner.nextLine();
        return today + ": " + input;
    }


    private static void saveEntry(String moodEntry){
        FileWriter writer = null;
        try{
            writer = new FileWriter("data/dailyMoodLog.txt", true);
            writer.write(moodEntry + "\n");
            System.out.println("Saved!");
        } catch (IOException e){
            System.out.println("Oops, error saving! :(" + e.getMessage());
        }finally {
            try {
                if (writer != null) {
                    writer.close(); // Close the writer in the finally block
                }
            } catch (IOException e) {
                System.out.println("Error closing the file writer: " + e.getMessage());
            }
        }
    }


    private static void readPastEntries(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("data/dailyMoodLog.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch(IOException e){
            System.out.println("Oops, error reading file! :(" + e.getMessage());
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file reader: " + e.getMessage());
            }
        }
    }
}
