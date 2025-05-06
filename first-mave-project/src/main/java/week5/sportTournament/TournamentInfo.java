package week5.sportTournament;

import java.util.ArrayList;
import java.util.List;

public class TournamentInfo {

    //TEAMS
    public Team team1 = new Team("Los Angeles Dodgers");
    public Team team2 = new Team("San Francisco Giants");
    public Team team3 = new Team("San Diego Padres");
    public Team team4 = new Team("Los Angeles Angeles");
    public Team team5 = new Team("Philadelphia Phillies");
    public Team team6 = new Team("New York Yankees");
    public Team team7 = new Team("New York Mets");
    public Team team8 = new Team("Chicago Cubs");

    private Round round1 = new Round();
    private Round round2 = new Round();
    private Round round3 = new Round();
    private Round round4 = new Round();

    public TournamentInfo() {

        //ADD PLAYERS TO TEAMS
        team1.addPlayer(new Player("Roki Sasaki", "Starting Pitcher", "11"));
        team1.addPlayer(new Player("Mookie Betts", "Infielder", "50"));

        team2.addPlayer(new Player("Camilo Doval", "Starting Pitcher", "75"));
        team2.addPlayer(new Player("Luis Matos ", "Outfielder", "29"));

        team3.addPlayer(new Player("Randy Vasquez", "Starting Pitcher", "98"));
        team3.addPlayer(new Player("Fernando Tatis Jr.", "Outfielder", "23"));

        team4.addPlayer(new Player("Ryan Zeferjahn", "Starting Pitcher", "56"));
        team4.addPlayer(new Player("Zach Neto", "Infielder", "9"));

        team5.addPlayer(new Player("Jose Alvarado", "Starting Pitcher", "46"));
        team5.addPlayer(new Player("Max Kepler", "Outfielder", "8"));

        team6.addPlayer(new Player("Tim Hill", "Starting Pitcher", "41"));
        team6.addPlayer(new Player("Aaron Judge", "Outfield", "99"));

        team7.addPlayer(new Player("Genesis Cabrera", "Starting Pitcher", "92"));
        team7.addPlayer(new Player("Juan Soto", "Outfielder", "22"));

        team8.addPlayer(new Player("Colin Rea", "Starting Pitcher", "53"));
        team8.addPlayer(new Player("Ian Happ", "Outfielder", "8"));

    }

    public List<Team> getTeams() {
        return List.of(team1, team2, team3, team4, team5, team6, team7, team8);
    }

    public List<Round> getRounds() {
        return List.of(round1, round2, round3, round4); // or however many rounds you use
    }
}