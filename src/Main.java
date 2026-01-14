import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player p1 = PlayerFactory.createPlayer("Manos");
        Player p2 = PlayerFactory.createPlayer("Markus");
        List<Player> players = List.of(p1, p2);

        DiceSet diceSet = new DiceSet(2, 6); // 2 tärningar, 6 sidor
        ScoreRule scoreRule = new SimpleScoreRule(); // vi behöver skapa denna

        Game game = new Game(players, diceSet, 5, 1, 0, scoreRule);
        game.start();

        ConsoleView consoleView = new ConsoleView(game);
        consoleView.startGame();
    }
}