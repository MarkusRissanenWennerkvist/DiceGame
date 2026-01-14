import java.util.List;

public class TurnResult {

    private Player player;
    private List<Integer> roll;
    private int score;

    public TurnResult (Player player, List<Integer> roll, int score) {
        this.player = player;
        this.roll = roll;
        this.score = score;
    }

    public Player getPlayer() {
        return player;
    }

    public List<Integer> getRoll() {
        return roll;
    }

    public int getScore() {
        return score;
    }
}