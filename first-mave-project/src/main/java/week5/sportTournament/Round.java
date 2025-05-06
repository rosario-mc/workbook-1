package week5.sportTournament;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private List<Match> matches;

    public Round() {
        this.matches = new ArrayList<>();
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public List<Match> getMatches(){
        return matches;
    }

    public void playRound() {
        for (Match match : matches) {
            match.playMatch();
        }
    }
}
