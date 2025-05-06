package week5.sportTournament;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private String name;
    private List<Team> teams;
    private Team teamWinner;
    private List<Round> rounds;

    public Tournament(String name, List<Team> teams) {
        this.name = name;
        this.teams = teams;
        this.rounds = new ArrayList<>();
    }

    public void startTournament() {
        System.out.println("       Starting the World Series!!\n");

        //ROUND 1 SET MATCHES
        System.out.println("      ========= Round 1 ========= ");
        List<Match> firstRoundMatches = List.of(
                new Match(teams.get(0), teams.get(7)),
                new Match(teams.get(1), teams.get(6)),
                new Match(teams.get(2), teams.get(5)),
                new Match(teams.get(3), teams.get(4))
        );
        Round round1 = new Round();
        for (Match match : firstRoundMatches) {
            round1.addMatch(match);
        }
        round1.playRound();
        //COLLECTING WINNING TEAMS TO LIST
        List<Team> round1Winners = new ArrayList<>();
        for (Match match : round1.getMatches()) {
            round1Winners.add(match.getTeamWinner());
        }

        //ROUND 2 SET MATCHES
        System.out.println("\n      ========= Round 2 ========= ");
        List<Match> secondRoundMatches = List.of(
                new Match(round1Winners.get(0), round1Winners.get(3)),
                new Match(round1Winners.get(1), round1Winners.get(2))
        );
        Round round2 = new Round();
        for (Match match : secondRoundMatches) {
            round2.addMatch(match);
        }
        round2.playRound();
        //COLLECTING WINNING TEAMS TO LIST
        List<Team> round2Winners = new ArrayList<>();
        for (Match match : round2.getMatches()){
            round2Winners.add(match.getTeamWinner());
        }

        //ROUND 3 SET FINAL MATCH
        System.out.println("\n      ========= Round 3 ========= ");
        List<Match> thirdRoundMatches = List.of(
              new Match(round2Winners.get(0), round2Winners.get(1))
        );
        Round round3 = new Round();
        for (Match match : thirdRoundMatches){
            round3.addMatch(match);
        }
        round3.playRound();
        //COLLECTING WINNER
        Match finalMatch= round3.getMatches().get(0);
        teamWinner= finalMatch.getTeamWinner();
        System.out.println("\nThe World Series Champion is " + teamWinner.getName() + "!!!!");
    }
}
