import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class criteriaSorter {

    public static int countvowels(String str) {
        int count = 0;
        String vowels = "aeiuo";

        // `toCharArray()` is used to convert a string to an array
        // of characters to enable iterating over it
        for (char c: str.toCharArray()) {
            // `indexOf` is used with strings to get a character index
            // and return -1 if character not found
            if (vowels.indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static List<String> criteriaSorter(List<String> arr) {
        List<String> sorted = new ArrayList<>(arr);

        sorted.sort(
            Comparator.comparingInt(criteriaSorter::countvowels)
                .thenComparingInt(String::length)
                .thenComparing(Comparator.naturalOrder())
        );

        return sorted;
    }

    public static void main(String[] args) throws Exception {
        List<String> arr = Arrays.asList("dog", "cat", "hi", "a");

        System.out.println(criteriaSorter.criteriaSorter(arr));
    }
}