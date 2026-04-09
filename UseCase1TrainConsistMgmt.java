import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class TrainConsistMgmtApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" === Train Consist Management App ===");
        System.out.println("========================================\n");

        List<String> trainConsistList = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsistList.size());
        System.out.println("Current Train Consist : " + trainConsistList + "\n");

        System.out.println("========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("========================================\n");

        trainConsistList.add("Sleeper");
        trainConsistList.add("AC Chair");
        trainConsistList.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + trainConsistList + "\n");

        trainConsistList.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + trainConsistList + "\n");

        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + trainConsistList.contains("Sleeper") + "\n");

        System.out.println("Final Train Passenger Consist:");
        System.out.println(trainConsistList + "\n");
        System.out.println("UC2 operations completed successfully...\n");

        System.out.println("========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("========================================\n");

        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds + "\n");
        System.out.println("Note:\nDuplicates are automatically ignored by HashSet.\n");
        System.out.println("UC3 uniqueness validation completed...\n");

        System.out.println("========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("========================================\n");

        LinkedList<String> orderedConsist = new LinkedList<>();
        orderedConsist.add("Engine");
        orderedConsist.add("Sleeper");
        orderedConsist.add("AC");
        orderedConsist.add("Cargo");
        orderedConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(orderedConsist + "\n");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        orderedConsist.add(2, "Pantry Car");
        System.out.println(orderedConsist + "\n");

        System.out.println("After Removing First and Last Bogie:");
        orderedConsist.removeFirst();
        orderedConsist.removeLast();
        System.out.println(orderedConsist + "\n");
        System.out.println("UC4 ordered consist operations completed...\n");

        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("========================================\n");

        Set<String> linkedFormation = new LinkedHashSet<>();
        linkedFormation.add("Engine");
        linkedFormation.add("Sleeper");
        linkedFormation.add("Cargo");
        linkedFormation.add("Guard");
        linkedFormation.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(linkedFormation + "\n");
        System.out.println("Note:\nLinkedHashSet preserves insertion order and removes duplicates automatically.\n");
        System.out.println("UC5 Formation setup completed...\n");

        System.out.println("========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("========================================\n");

        Map<String, Integer> capacityMap = new HashMap<>();
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}