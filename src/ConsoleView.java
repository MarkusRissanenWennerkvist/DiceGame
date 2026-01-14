import java.util.Scanner;

public class ConsoleView {

    private Scanner scanner = new Scanner(System.in);

    public void promptRoll(String playerName) {
        System.out.println(playerName + "s tur. Tryck Enter för att rulla tärningarna.");
        scanner.nextLine();
    }

    public void showTurnResult(TurnResult result) {
        System.out.println(result.getPlayer().getName() + " rullade " + result.getRoll() +
                " och fick " + result.getScore() + " poäng.");
    }

    public void showWinner(Player winner) {
        System.out.println("Spelet är slut! Vinnaren är " + winner.getName());
    }
}