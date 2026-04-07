import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Train Consist Management Application
 *
 * UC13: Performance Comparison (Loops vs Streams)
 *
 * @author Aastik
 * @version 13.0
 */

// Bogie class
class Bogie {

    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
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

        // Create large dataset
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
        }

        // ===== UC13 =====

        // 🔹 Loop-based filtering
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🔹 Stream-based filtering
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Results
        System.out.println("\nLoop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        System.out.println("\nLoop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());
    }
}