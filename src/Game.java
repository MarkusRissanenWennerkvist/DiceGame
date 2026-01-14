import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private DiceSet diceSet;
    private int rounds;
    private int currentRound;
    private int currentPlayerIndex;
    private int scoreRule;

    public Game(){}

    public Game(List<Player> players, DiceSet diceSet, int rounds, int currentRound, int currentPlayerIndex, int scoreRule) {
        this.players = new ArrayList<>(players);
        this.diceSet = diceSet;
        this.rounds = rounds;
        this.currentRound = 1;
        this.currentPlayerIndex = 0;
        this.scoreRule = scoreRule;
    }

    public void start() {
        currentRound = 1;
        currentPlayerIndex = 0;
        //Fler initieringar? t ex Players mm
    }

    public TurnResult playTurn() {
        Player current = getCurrentPlayer();
        List<Integer> roll = diceSet.rollAll();
//        int score = scoreRule.calculateScore(current, roll);
//        current.addScore(score);

        TurnResult turnResult = new TurnResult(current, roll, score);

        nextPlayer();
        return turnResult;
    }

    public boolean isGameOver() {
        return currentRound > rounds;
    }

    public void nextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        if (currentPlayerIndex == 0) {
            currentRound++;
        }
    }

    public Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }

    public Player getWinner() {
        Player winner = null;
        int maxScore = 0;
        for (Player p : players) {
            if (p.getScore() > maxScore) {
                maxScore = p.getScore();
                winner = p;
            }
        }
        return winner;
    }
}