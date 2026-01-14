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
            dices.add(new Dice(sides));
        }

    }

    public List<int> rollAll() {
        return
    }

    public void setSides(int newSides) {

    }
}
