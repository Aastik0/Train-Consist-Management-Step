/**
 * Train Consist Management Application
 *
 * UC16: Bubble Sort for Passenger Bogie Capacities
 *
 * @author Aastik
 * @version 16.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================");

        // ===== UC16 =====
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("\nBefore Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // 🔥 Bubble Sort
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nAfter Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}