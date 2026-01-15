public class AIPlayer implements Player {

    private String name;
    private int score;

    public AIPlayer(String name) {
        this.name = name;
        this.score = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void addScore(int addScore) {
        this.score += addScore;
    }
}