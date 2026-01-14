public class GameResult {

    private final String player1Name;
    private final int player1Score;

    private final String player2Name;
    private final int player2Score;

    public GameResult(Player p1, Player p2) {
        this.player1Name = p1.getName();
        this.player1Score = p1.getScore();
        this.player2Name = p2.getName();
        this.player2Score = p2.getScore();
    }

    public String getWinnerName() {
        if (player1Score > player2Score) return player1Name;
        if (player2Score > player1Score) return player2Name;
        return "Oavgjort";
    }

    @Override
    public String toString() {
        return "Slutresultat:\n" +
                player1Name + ": " + player1Score + " poäng\n" +
                player2Name + ": " + player2Score + " poäng\n" +
                "Vinnare: " + getWinnerName();
    }
}
