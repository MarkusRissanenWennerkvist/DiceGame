import java.util.List;

public class SimpleScoreRule implements ScoreRule {

    @Override
    public int calculateScore(List<Integer> results) {
        int sum = 0;
        for (int value : results) {
            sum += value;
        }
        return sum;
    }
}
