import java.util.ArrayList;
import java.util.List;

/**
 * ========================================================
 * MAIN CLASS - UseCaseCombinedTrainMgmt
 * ========================================================
 * Combined Use Case 1 & 2
 * ========================================================
 */
class UseCaseCombinedTrainMgmt {

    public static void main(String[] args) {

        // --- UC1: Initialization ---
        System.out.println("========================================");
        System.out.println(" === Train Consist Management App ===");
        System.out.println("========================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist + "\n");

        // --- UC2: Operations ---
        System.out.println("========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("========================================\n");

        // After Adding Bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + trainConsist + "\n");

        // After Removing 'AC Chair'
        trainConsist.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + trainConsist + "\n");

        // Checking if 'Sleeper' exists
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + trainConsist.contains("Sleeper") + "\n");

        // Final Summary
        System.out.println("Final Train Passenger Consist:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC2 operations completed successfully...");
    }
}