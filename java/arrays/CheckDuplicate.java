package arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        // Create a Set.
        Set<Integer> s = new HashSet<>();

        for (int num: nums) {
            s.add(num);
        }

        // Check if the size of the created set is the
        // same as the original array, if they are different
        // return true
        return s.size() == nums.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 5};

        System.out.println(hasDuplicate(numbers));
    }
}
