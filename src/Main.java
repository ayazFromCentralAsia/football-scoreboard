import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard();

        Game game1 = scoreboard.startGame("Spain", "Brazil");
        scoreboard.updateScore(game1, 2, 2);

        Game game2 = scoreboard.startGame("Germany", "France");
        scoreboard.updateScore(game2, 3, 1);

//        List<Game> summary = scoreboard.getSummary();
//        for (Game game : summary) {
//            System.out.println(game);
//        }

        scoreboard.endGame(game1);
        scoreboard.endGame(game2);
        List<Game> summary = scoreboard.getSummary();
        for (Game game : summary) {
            System.out.println(game);
        }
    }
}