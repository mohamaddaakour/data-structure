package test.src;
import java.util.*;

class App {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> occurences = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Calculate the missing number to get the target
            // per example: 9 - 2 = 7 we need 7 to get the target
            int complement = target - nums[i];

            if (occurences.containsKey(complement)) {
                // If the complement is in the map so we have its index and the other
                // number index
                return new int[] { occurences.get(complement), i };
            }

            occurences.put(nums[i], i);
        }

        // If nothing found return an empty array
        return new int[] { };
    }

    public static void main(String[] args) {
        App solution = new App();

        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3}, 6)));
    }
}