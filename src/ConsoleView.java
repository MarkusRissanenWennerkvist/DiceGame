import java.util.Scanner;

public class ConsoleView {

    private Game game;

    public ConsoleView(Game game) {
        this.game = game;
    }

    public void startGame() {
        Scanner scan = new Scanner(System.in);
        game.start();
        while (!game.isGameOver()) {
            Player current = game.getCurrentPlayer();
            System.out.println(current.getName() + "s tur. Tryck Enter för att rulla tärningarna.");
            scan.nextLine();

            TurnResult result = game.playTurn();

            System.out.println(current.getName() + " rullade " + result.getRoll() + " och fick " + result.getScore() + " poäng.");

        }

        System.out.println("Spelet är slut! Vinnaren är " + game.getWinner().getName());
    }
}