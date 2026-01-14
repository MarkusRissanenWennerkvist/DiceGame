public class GameController {

    private Game game;
    private ConsoleView view;

    public GameController(Game game, ConsoleView view) {
        this.game = game;
        this.view = view;
    }

    public void start() {
        game.start();

        while (!game.isGameOver()) {
            Player current = game.getCurrentPlayer();
            view.promptRoll(current.getName());

            TurnResult result = game.playTurn();

            view.showTurnResult(result);
        }

        view.showWinner(game.getWinner());
    }
}
