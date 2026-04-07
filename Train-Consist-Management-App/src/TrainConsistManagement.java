import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management Application
 *
 * UC20: Prevent search on empty collection
 *
 * @author Aastik
 * @version 20.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // ===== UC20 =====
        List<String> bogieIds = new ArrayList<>();

        // 🔴 No bogies added (empty list)

        try {
            searchBogie(bogieIds, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 🔥 Search method with validation
    public static void searchBogie(List<String> bogies, String key) {

        // 🚨 Defensive check
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies");
        }

        // (Normal search logic - not executed if empty)
        for (String id : bogies) {
            if (id.equals(key)) {
                System.out.println("Bogie Found ✅");
                return;
            }
        }

        System.out.println("Bogie Not Found ❌");
    }
}