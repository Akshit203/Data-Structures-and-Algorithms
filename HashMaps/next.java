import java.util.HashMap;
import java.util.Map;

public class next {
    public static void frequency(int arr[]){
        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!h1.containsKey(arr[i])) {
                h1.put(arr[i], 1);
            } else {
                h1.put(arr[i], h1.get(arr[i]) + 1);
            }
        }

        // Print the key-value pairs (element and its frequency)
        for (Map.Entry<Integer, Integer> entry : h1.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " Frequency: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3};
        frequency(arr);
    }
}
