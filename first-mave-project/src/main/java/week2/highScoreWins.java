package week2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class highScoreWins {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //get game score
        String gameScore = getUserInput();

        //determine higher score
        String winningTeam = getWinningTeam(gameScore);
        System.out.println("Winning Team: " + winningTeam);
        scanner.close();
    }

    public static String getUserInput(){
        System.out.println("What is the game score (e.g. Home:Visitor|21:9)?: ");
        String gameScore = scanner.nextLine();
        return gameScore;
    }
    public static String getWinningTeam(String gameScore) {
        //split |
        String[] parts = gameScore.split(Pattern.quote("|"));
        String[] teamName = (parts[0].split(":"));
        String[] scores = (parts[1].split(":"));

        //split: team
        String homeTeam = teamName[0];
        String visitorTeam = teamName[1];

        //split : score
        int homePoints = Integer.parseInt(scores[0]);
        int visitorPoints = Integer.parseInt(scores[1]);

        if (homePoints > visitorPoints) {
            return homeTeam;
        } else if (visitorPoints > homePoints) {
            return visitorTeam;
        } else {
            return "TIE!";
        }
    }
}
