import java.util.Random;

public class StandardDice implements Dice {
    private int sides;
    private Random random = new Random();

    public StandardDice(int sides) {
        this.sides = sides;
    }

    @Override
    public int roll() {
        return random.nextInt(sides) + 1;
    }

    @Override
    public int getSides() {
        return sides;
    }

    @Override
    public void setSides(int sides) {
        this.sides = sides;
    }
}