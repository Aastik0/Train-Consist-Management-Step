import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Train Consist Management Application
 *
 * UC11: Validate Train ID & Cargo Code using Regex
 *
 * @author Aastik
 * @version 11.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("\nEnter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // ===== UC11 =====

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // Validate using matches()
        if (trainMatcher.matches()) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        scanner.close();
    }
}