import java.util.Scanner;

/**
 * Train Consist Management Application
 *
 * UC19: Binary Search for Bogie ID
 *
 * @author Aastik
 * @version 19.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // ===== UC19 =====
        // 🔥 MUST be sorted
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // 🔥 Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1;   // search right
            } else {
                high = mid - 1;  // search left
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie ID FOUND ✅");
        } else {
            System.out.println("Bogie ID NOT FOUND ❌");
        }

        scanner.close();
    }
}