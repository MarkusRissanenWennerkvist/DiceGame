import java.util.List;
import java.util.Scanner;

public class GameController {

    private Game game; // kan starta som null
    private ConsoleView view;
    private Scanner scanner = new Scanner(System.in);

    public GameController(ConsoleView view) { // ta bort Game från konstruktorn
        this.view = view;
    }

    private Player readPlayerName(int playerNumber) {
        while (true) {
            System.out.print("Ange namn för spelare " + playerNumber + ": ");
            String name = scanner.nextLine();

            try {
                return PlayerFactory.createPlayer(name);
            } catch (IllegalArgumentException e) {
                System.out.println("Ogiltigt namn, försök igen.");
            }
        }
    }

    public void start() {
        // Skapa spelare dynamiskt
        Player p1 = readPlayerName(1);
        Player p2 = readPlayerName(2);
        List<Player> players = List.of(p1, p2);

        // Skapa Game med dessa spelare
        DiceSet diceSet = new DiceSet(2, 6);
        ScoreRule rule = new SimpleScoreRule(); // eller din ScoreRule
        game = new Game(players, diceSet, 5, 1, 0, rule);

        game.start(); // starta spelet

        // Spel-loop
        while (!game.isGameOver()) {
            Player current = game.getCurrentPlayer();
            view.promptRoll(current.getName());

            TurnResult result = game.playTurn();
            view.showTurnResult(result);
        }

        GameResult result = new GameResult(p1, p2);
        view.showGameResult(result);

    }
}
