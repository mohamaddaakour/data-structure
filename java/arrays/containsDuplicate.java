package test.src;

import java.util.HashMap;
import java.util.Map;

public class containsDuplicate {

    public static boolean containsDuplicate(int[] numbers) {
        Map<Integer, Integer> occurences = new HashMap<>();

        for (int num: numbers) {
            if (!occurences.containsKey(num)) {
                occurences.put(num, 1);
            } else {
                occurences.put(num, occurences.get(num) + 1);
            }
        }

        for (int occurence: occurences.values()) {
            if (occurence > 1)
                return true;
        }

        return false;
    }
    public static void main(String[] args) throws Exception {
        int[] numbers = {1, 2, 3, 4, 5, 6, 6};

       System.out.println(containsDuplicate.containsDuplicate(numbers));
    }
}