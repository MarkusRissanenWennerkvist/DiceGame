public class TurnResult {

    private Player player;
    private int roll;
    private int score;

    public TurnResult (Player player, int roll, int score) {
        this.player = player;
        this.roll = roll;
        this.score = score;
    }

    public Player getPlayer() {
        return player;
    }

    public int getRoll() {
        return roll;
    }

    public int getScore() {
        return score;
    }
}