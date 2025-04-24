package miniProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomQuoteGenerator {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        //10 quotes
        List<String> quotes =new ArrayList<>();
            quotes.add("\"With great power comes great responsibility.\"- Uncle Ben | Spider-Man");
            quotes.add("\"I love you 3000.\"- Tony Stark | Avengers: Endgame");
            quotes.add("\"No amount of money ever bought a second of time.\"- Tony Stark | Avengers: Endgame");
            quotes.add("\"The hardest choices require the strongest wills.\"- Thanos | Avengers: Infinity Wars");
            quotes.add("\"Dobby is free.\"- Dobby | Harry Potter and the Chamber of Secrets");
            quotes.add("\"You’re just as sane as I am.\"- Luna Lovegood | Harry Potter and the Order of the Phoenix");
            quotes.add("\"Do not pity the dead, Harry. Pity the living, and, above all, those who live without love.\"- Albus Dumbledore | Harry Potter and the Deathly Hallows");
            quotes.add("\"I am the one who knocks.\"- Walter White | Breaking Bad");
            quotes.add("\"I am not in danger, Skyler. I am the danger.\"- Walter White | Breaking Bad");
            quotes.add("\"Some experiences are so big they change your DNA.\"- Dexter Morgan | Dexter ");
            quotes.add("\"Smile even when you aren’t happy. It’s how you fit in.\"- Harry Morgan | Dexter");

        //prompt user selection
        System.out.println("Welcome to the Movie/TV Show Quote Generator!");

        while (true) {
            System.out.println("\nPress enter to see a quote or type 'exit' to stop: ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("exit")){
                System.out.println("Goodbye! :)");
                break;
            }

            //randomize pick
            int index = random.nextInt(quotes.size());
            System.out.println("Quote: " + quotes.get(index));
        }
        scanner.close();
    }
}
