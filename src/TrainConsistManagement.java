import java.util.LinkedList;

/**
 * Train Consist Management Application
 *
 * Use Case 4: Maintain Ordered Bogie IDs using LinkedList
 *
 * @author Aastik
 * @version 4.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // Create LinkedList for ordered consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);

        // Final consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);
    }
}