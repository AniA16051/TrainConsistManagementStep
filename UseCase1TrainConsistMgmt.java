import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ========================================================
 * MAIN CLASS - TrainConsistMgmtApp
 * ========================================================
 * Combined Use Case 1, 2, & 3:
 * 1. Initialize Train (List)
 * 2. Manage Passenger Bogies (ArrayList CRUD)
 * 3. Track Unique Bogie IDs (HashSet Uniqueness)
 * ========================================================
 * @author Developer
 * @version 3.0
 */
class TrainConsistMgmtApp {

    public static void main(String[] args) {

        // --- UC1: INITIALIZATION ---
        System.out.println("========================================");
        System.out.println(" === Train Consist Management App ===");
        System.out.println("========================================\n");

        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist + "\n");


        // --- UC2: PASSENGER BOGIE OPERATIONS ---
        System.out.println("========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("========================================\n");

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + trainConsist + "\n");

        trainConsist.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + trainConsist + "\n");

        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + trainConsist.contains("Sleeper") + "\n");


        // --- UC3: TRACK UNIQUE BOGIE IDs ---
        System.out.println("========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("========================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values and is unordered
        Set<String> bogieIds = new HashSet<>();

        // Adding IDs, including intentional duplicates to test HashSet
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");

        // Duplicate entries will be ignored internally by HashSet
        bogieIds.add("BG101"); // Duplicate entry
        bogieIds.add("BG102"); // Duplicate entry

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds + "\n");

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...");
    }
}