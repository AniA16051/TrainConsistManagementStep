import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * ========================================================
 * MAIN CLASS - TrainConsistMgmtApp
 * ========================================================
 * Combined Use Cases 1 - 4:
 * 1. Initialize Train (ArrayList)
 * 2. Passenger Bogie Management (ArrayList CRUD)
 * 3. Unique Bogie IDs (HashSet)
 * 4. Ordered Bogie Consist (LinkedList)
 * ========================================================
 * @author Developer
 * @version 4.0
 */
class TrainConsistMgmtApp {

    public static void main(String[] args) {

        // --- UC1 & UC2: INITIALIZATION & LIST OPERATIONS ---
        System.out.println("========================================");
        System.out.println(" === Train Consist Management App ===");
        System.out.println("========================================\n");

        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies Managed (UC2): " + passengerBogies);
        System.out.println("----------------------------------------\n");


        // --- UC3: UNIQUE BOGIE IDs (HashSet) ---
        System.out.println("UC3 - Track Unique Bogie IDs");
        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // Duplicate

        System.out.println("Unique IDs (Duplicates Ignored): " + bogieIds);
        System.out.println("----------------------------------------\n");


        // --- UC4: MAINTAIN ORDERED BOGIE CONSIST (LinkedList) ---
        System.out.println("========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("========================================\n");

        // Create a LinkedList to model physical chaining
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add initial bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        // Insert 'Pantry Car' at position 2
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        trainConsist.add(2, "Pantry Car");
        System.out.println(trainConsist + "\n");

        // Remove the first and last bogie
        System.out.println("After Removing First and Last Bogie:");
        trainConsist.removeFirst(); // Removes Engine
        trainConsist.removeLast();  // Removes Guard
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 ordered consist operations completed...");
    }
}