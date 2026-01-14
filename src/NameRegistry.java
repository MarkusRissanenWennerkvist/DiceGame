import java.util.ArrayList;
import java.util.List;

public class NameRegistry {

    private List<String> names = new ArrayList<>();

    public boolean isAvailable(String name) {
        if (name == null || name.isBlank()) {
            return false;
        }
        for (String existingName : names) {
            if (existingName.equals(name)) {
                return false;
            }
        }
        return true;
    }

    public void register(String name) {
        if (!isAvailable(name)) {
            throw new IllegalArgumentException("Name is not available");
        }
        names.add(name);
    }
}