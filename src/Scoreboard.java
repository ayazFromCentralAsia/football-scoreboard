import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Scoreboard {
    private List<Game> games;

    public Scoreboard(){
        games = new ArrayList<>();
    }

    public Game startGame(String homeTeam, String awayTeam){
        Game game = new Game(homeTeam, awayTeam);
        games.add(game);
        return game;
    }

    public void endGame(Game game){
        games.remove(game);
    }

    public Game updateScore(Game game, int homeScore, int awayScore){
        game.updateScore(homeScore, awayScore);
        return game;
    }

    public List<Game> getSummary() {
        List<Game> summary = new ArrayList<>(games);
        summary.sort(
                Comparator.comparingInt(Game::getTotalScore).reversed()
                        .thenComparing(Game::getStartTime).reversed()
        );
        return summary;
    }
}
