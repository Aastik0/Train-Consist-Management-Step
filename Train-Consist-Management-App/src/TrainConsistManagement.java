import java.util.Scanner;

/**
 * Train Consist Management Application
 *
 * UC18: Linear Search for Bogie ID
 *
 * @author Aastik
 * @version 18.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // ===== UC18 =====
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = false;

        // 🔥 Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // stop early
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