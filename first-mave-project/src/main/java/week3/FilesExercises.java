package week3;

import java.io.*;
import java.util.*;

public class FilesExercises {
    public static void main(String[] args) {
        writeSingleLine();
        readSingleLine();
        writeArrayLines();
        readPoemLineByLine();
        saveUserInput();
        countWordOccurrences();
    }

    // 1. Write a single line to a file
    public static void writeSingleLine() {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, file world!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 2. Read that line back
    public static void readSingleLine() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 3. Write multiple lines from an array
    public static void writeArrayLines() {
        String[] lines = {"Roses are red", "Violets are blue", "Java is sweet", "And so are you"};
        try {
            FileWriter writer = new FileWriter("poem.txt");
            for (int i = 0; i < lines.length; i++) {
                writer.write(lines[i] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 4. Read file line-by-line and print
    public static void readPoemLineByLine() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 5. Ask the user for lines and save to a file
    public static void saveUserInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("user_input.txt");
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter line " + (i + 1) + ": ");
                String input = scanner.nextLine();
                writer.write(input + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 6. Count how many times a word appears
    public static void countWordOccurrences() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String search = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("user_input.txt"));
            int count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(search)) {
                    count++;
                }
            }
            reader.close();
            System.out.println("The word '" + search + "' appeared in " + count + " line(s). ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}