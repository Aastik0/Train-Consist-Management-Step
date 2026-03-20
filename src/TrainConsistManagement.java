import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management Application
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * @author Aastik
 * @version 1.0
 */

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // Initialize empty consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());
    }
}