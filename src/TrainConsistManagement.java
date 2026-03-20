import java.util.HashSet;
import java.util.Set;

/**
 * Train Consist Management Application
 *
 * Use Case 3: Track Unique Bogie IDs using HashSet
 *
 * @author Aastik
 * @version 3.0
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);
    }
}