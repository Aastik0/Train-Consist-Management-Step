import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Train Consist Management Application
 *
 * Use Case 5: Preserve Insertion Order of Bogies using LinkedHashSet
 *
 * @author Aastik
 * @version 5.0
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // LinkedHashSet maintains order + uniqueness
        Set<String> bogieSet = new LinkedHashSet<>();

        // Add bogies (with duplicates)
        bogieSet.add("Engine");
        bogieSet.add("Sleeper");
        bogieSet.add("AC");
        bogieSet.add("Cargo");
        bogieSet.add("Guard");
        bogieSet.add("AC");       // duplicate
        bogieSet.add("Sleeper");  // duplicate

        // Display bogies
        System.out.println("\nTrain Consist (Ordered & Unique):");
        System.out.println(bogieSet);
    }
}