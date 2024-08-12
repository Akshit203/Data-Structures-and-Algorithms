import java.util.*;

public class HashMaps {
    public static void main(String[] args) {

        HashMap <String, Integer> new_map = new HashMap<>();

        new_map.put("chandigarh", 10);
        new_map.put("panchkula", 20);
        new_map.put("mohali", 30);
        new_map.put("delhi", 40);

        System.out.println(new_map);

        new_map.put("Chandigarh", 100); // value change
        System.out.println(new_map);

        // Adding duplicate values for existing keys (no effect as the keys are the same)
        new_map.put("mohali", 30); // duplicate value
        new_map.put("delhi", 40); // duplicate value

        System.out.println(new_map);


        // Searching for specific keys and values using .containsKey() and .containsValue()

        System.out.println(new_map.containsKey("mohali")); // true
        System.out.println(new_map.containsValue(400)); // false

        // Retrieving the value associated with a specific key using .get()
        System.out.println(new_map.get("Chandigarh")); // 100

        // Attempting to retrieve a value with a non-existent key (incorrect usage)
        System.out.println("Value for the key 100: " + new_map.get(200)); // null (200 is not a key)
        
        // Iterating over keys using keySet()
        
        System.out.println("Iterating over keys using keySet():");
        
        for (String key : new_map.keySet()) {
            Integer value = new_map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

    }
}
