import java.util.*;
import java.util.stream.Collectors;

/**
 * Train Consist Management Application
 *
 * UC9: Group Bogies by Type using Stream API
 *
 * @author Aastik
 * @version 9.0
 */

// Bogie class (same as UC7)
class Bogie {

    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + "(" + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // ===== UC7 base =====
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));   // duplicate type
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nAll Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ===== UC9 =====
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}