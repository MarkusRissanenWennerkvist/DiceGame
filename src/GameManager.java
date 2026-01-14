public class GameManager {
    private Game game;
    private NameRegistry registry;
    private PlayerFactory playerFactory;

    public GameManager getInstance() {
        return new GameManager();
    }

    public Game createGame() { //Behöver parametrar?
        return new Game();
    }

    public Game getGame() {
        return new Game();
    }
}