import java.util.ArrayList;
import java.util.List;

public class DiceSet {
    private List<Dice> dices;

    public DiceSet(){
        this.dices = new ArrayList<>();
    }

    public DiceSet(int count, int sides) {
        this.dices = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            dices.add(new StandardDice(sides));
        }

    }

    public List<Integer> rollAll() {
        List<Integer> results = new ArrayList<>();
        for (Dice dice : dices) {
            results.add(dice.roll());
        }
        return results;
    }

    public void setSides(int newSides) {
        for (Dice dice : dices) {
            dice.setSides(newSides);
        }
    }
}