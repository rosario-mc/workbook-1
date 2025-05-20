package week7.miniProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessingGame implements PlayableGame {
    static Scanner input = new Scanner(System.in);
    private double targetNr;
    private List<Integer> guesses;


    public GuessingGame() {
        this.targetNr = Math.floor(Math.random() * 100) + 1;
        this.guesses = new ArrayList<>();
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        GuessingGame.input = input;
    }

    public double getTargetNr() {
        return targetNr;
    }

    public void setTargetNr(double targetNr) {
        this.targetNr = targetNr;
    }

    public List<Integer> getGuesses() {
        return guesses;
    }

    public void setGuesses(List<Integer> guesses) {
        this.guesses = guesses;
    }

    @Override
    public void startGame() {
        System.out.println("WELCOME TO THE GUESSING GAME!");

        boolean run = true;

        while (run) {

            guesses.clear();
            targetNr = Math.floor(Math.random() * 100) + 1;

            System.out.println("\nENTER A NUMBER BETWEEN 1-100:");

            int guess;
            do {
                while (!input.hasNextInt()) {
                    System.out.println("PLEASE ENTER A VALID NUMBER:");
                    input.next(); // clear invalid input
                }
                guess = input.nextInt();
                guesses.add(guess);

                if (guess > targetNr) {
                    System.out.println("TOO HIGH! TRY AGAIN!");
                } else if (guess < targetNr) {
                    System.out.println("TOO LOW! TRY AGAIN!");
                }

            } while (guess != targetNr);

            System.out.println("\nCONGRATS!!!! YOU GOT IT RIGHT!");
            System.out.println("HERE ARE ALL YOUR GUESSES:\n" + getGuesses());

            input.nextLine(); // consume leftover newline
            System.out.println("\nWOULD YOU LIKE TO PLAY AGAIN? (Y/N)");
            String keepPlaying = input.nextLine();

            if (!keepPlaying.equalsIgnoreCase("y")) {
                run = false;
                System.out.println("THANKS FOR PLAYING!");
            }
        }
    }
}