import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management Application
 *
 * UC2: Add Passenger Bogies (with UC1 included)
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // ===== UC2 =====
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println(trainConsist);

        trainConsist.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(trainConsist);

        boolean exists = trainConsist.contains("Sleeper");

        System.out.println("\nIs Sleeper Present? " + exists);

        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}