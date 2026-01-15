public class PlayerFactory {

    public static Player createPlayer(PlayerType type, String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name required");
        }

        return switch (type) {
            case OFFLINE -> new OfflinePlayer(name);
            case AI -> new AIPlayer(name);
            case ONLINE -> new OnlinePlayer(name);
            default -> throw new IllegalArgumentException("Unknown player type");
        };
    }
}