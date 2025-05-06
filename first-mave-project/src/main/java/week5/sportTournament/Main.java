package week5.sportTournament;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TournamentInfo tournamentInfo = new TournamentInfo();

        List<Team> teams = List.of(
                tournamentInfo.team1,
                tournamentInfo.team2,
                tournamentInfo.team3,
                tournamentInfo.team4,
                tournamentInfo.team5,
                tournamentInfo.team6,
                tournamentInfo.team7,
                tournamentInfo.team8
        );

        // You don't need to use the rounds from TournamentInfo anymore
        Tournament tournament = new Tournament("World Series", teams);
        tournament.startTournament();
    }
}
