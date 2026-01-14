public class Main {

    public static void main(String[] args) {

        ConsoleView view = new ConsoleView();
        GameController controller = new GameController(view);
        controller.start(); // frågar namn, kör spel-loop
    }
}
