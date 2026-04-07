import java.util.*;

/**
 * Train Consist Management Application
 *
 * UC15: Safe Cargo Assignment using try-catch-finally
 *
 * @author Aastik
 * @version 15.0
 */

// 🔴 Custom Runtime Exception
class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {

    String type;
    String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {

        try {
            // ❌ Unsafe rule
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum");
            }

            // ✅ Safe assignment
            this.cargo = cargo;
            System.out.println(type + " bogie assigned with " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.\n");
        }
    }

    @Override
    public String toString() {
        return type + " → " + (cargo != null ? cargo : "No Cargo");
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // ===== UC15 =====
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ✅ Safe
        b1.assignCargo("Petroleum");

        // ❌ Unsafe (handled safely)
        b2.assignCargo("Petroleum");

        // Continue execution
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);
    }
}