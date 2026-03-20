import java.util.HashMap;
import java.util.Map;

/**
 * Train Consist Management Application
 *
 * Use Case 6: Map Bogie to Capacity using HashMap
 *
 * @author Aastik
 * @version 6.0
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display bogie capacity details
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }
    }
}