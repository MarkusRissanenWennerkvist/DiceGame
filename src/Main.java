public class Main {

    public static void main(String[] args) {

        Player p1 = PlayerFactory.createPlayer("Manos");
        p1.addScore(2);
        System.out.println(p1.getName() + " har " + p1.getScore() + " poäng");

    }
}