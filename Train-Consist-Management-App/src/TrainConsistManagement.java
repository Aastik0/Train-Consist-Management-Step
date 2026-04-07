import java.util.Arrays;

/**
 * Train Consist Management Application
 *
 * UC17: Sorting using Arrays.sort()
 *
 * @author Aastik
 * @version 17.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // ===== UC17 =====
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // 🔥 Built-in sorting
        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}