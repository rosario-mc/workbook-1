package week5.sportTournament;

import java.util.List;

public class Match {
    private Team team1;
    private Team team2;
    private Team teamWinner;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public Team getTeam1(){
        return team1;
    }

    public Team getTeam2(){
        return team2;
    }

    public void playMatch() {
        if (Math.random() < 0.5) {
            teamWinner = team1;
        } else {
            teamWinner = team2;
        }

        List<Player> players = teamWinner.getPlayers();
        Player starPlayer = players.get((int)(Math.random() * players.size()));

        System.out.println("Match: " +team1.getName() + " vs. " + team2.getName() );
        System.out.println("Winner: " + teamWinner.getName() + "\nWinning Run Scored By: " + starPlayer.getPosition() + " " + starPlayer.getName() + " #" + starPlayer.getNumber() + "\n");
    }

    public Team getTeamWinner(){
        return teamWinner;
    }
}
