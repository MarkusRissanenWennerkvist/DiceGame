public class PlayerFactory {

    public static Player createPlayer(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name required");
        }
        return new Player(name);
    }
}