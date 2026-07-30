package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDifferentCriteria {

    public static List<String> criteriaSorter(List<String> arr) {

        // The vowels we want to count.
        String vowels = "aeiou";

        // Create a copy so we don't modify the original list.
        List<String> sortedList = new ArrayList<>(arr);

        // Sort using three criteria:
        // 1. Number of vowels (ascending)
        // 2. Length (ascending)
        // 3. Alphabetical order (ascending)
        sortedList.sort(
            Comparator
                .comparingInt((String word) -> countVowels(word, vowels))
                .thenComparingInt(String::length)
                .thenComparing(word -> word)
        );

        return sortedList;
    }

    // Count the vowels in one word.
    private static int countVowels(String word, String vowels) {
        int count = 0;

        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("dog", "cat", "hi", "a");

        System.out.println(criteriaSorter(words));
    }
}