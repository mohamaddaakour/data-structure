package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {
    // The return will be an object that takes as keys integers
    // and as values integers
    public static Map<Integer, Integer> count_occurence(int[] numbers) {
        // Create a Hash Map.
        Map<Integer, Integer> occurences = new HashMap<>();
        
        // forEach loop iterate the keys of the hash map
        for (int number: numbers) {
            // we check if the hash map contain this key
            if (occurences.containsKey(number)) {
                occurences.put(number, occurences.get(number) + 1);
            } else {
                occurences.put(number, 1);
            }
        }
        
        return occurences;
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 5};
        
        System.out.println(count_occurence(numbers));
    }
}
