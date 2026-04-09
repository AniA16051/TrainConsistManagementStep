import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * ========================================================
 * MAIN CLASS - TrainConsistMgmtApp
 * ========================================================
 * Combined Use Cases 1 - 5:
 * 1. Initialize Train (ArrayList)
 * 2. Passenger Bogie Management (ArrayList CRUD)
 * 3. Unique Bogie IDs (HashSet)
 * 4. Ordered Bogie Consist (LinkedList)
 * 5. Preserve Insertion Order with Uniqueness (LinkedHashSet)
 * ========================================================
 * @author Developer
 * @version 5.0
 */
class TrainConsistMgmtApp {

    public static void main(String[] args) {

        // --- UC1 & UC2: LIST OPERATIONS ---
        System.out.println("========================================");
        System.out.println(" === Train Consist Management App ===");
        System.out.println("========================================\n");

        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        System.out.println("UC2 - Passenger Bogies: " + passengerBogies + "\n");


        // --- UC3: HASHSET (Uniqueness, no order) ---
        Set<String> uniqueIds = new HashSet<>();
        uniqueIds.add("BG101");
        uniqueIds.add("BG101"); // Duplicate ignored
        System.out.println("UC3 - Unique IDs (HashSet): " + uniqueIds + "\n");


        // --- UC4: LINKEDLIST (Order, no uniqueness) ---
        LinkedList<String> linkedListConsist = new LinkedList<>();
        linkedListConsist.add("Engine");
        linkedListConsist.add("Cargo");
        System.out.println("UC4 - Ordered Consist (LinkedList): " + linkedListConsist + "\n");


        // --- UC5: PRESERVE INSERTION ORDER OF BOGIES (LinkedHashSet) ---
        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("========================================\n");

        // LinkedHashSet maintains insertion order while enforcing uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies in order
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie intentionally
        trainFormation.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(trainFormation + "\n");

        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.\n");

        System.out.println("UC5 Formation setup completed...");
    }
}