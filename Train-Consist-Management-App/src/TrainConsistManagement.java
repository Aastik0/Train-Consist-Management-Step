import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management Application
 *
 * UC14: Custom Exception for Invalid Capacity
 *
 * @author Aastik
 * @version 14.0
 */

// 🔴 Custom Exception
class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie class
class PassengerBogie {

    String type;
    int capacity;

    // Constructor with validation
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " → Capacity: " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // ✅ Valid bogie
            bogies.add(new PassengerBogie("Sleeper", 72));

            // ❌ Invalid bogie (will throw exception)
            bogies.add(new PassengerBogie("AC Chair", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}