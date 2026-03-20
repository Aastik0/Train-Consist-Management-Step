import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management Application
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * @author Aastik
 * @version 2.0
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // Create ArrayList for bogies
        List<String> trainConsist = new ArrayList<>();

        // Add bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display bogies
        System.out.println("\nTrain Bogies after addition:");
        System.out.println(trainConsist);

        // Remove one bogie
        trainConsist.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(trainConsist);

        // Check existence
        boolean exists = trainConsist.contains("Sleeper");

        System.out.println("\nIs Sleeper present? " + exists);

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}