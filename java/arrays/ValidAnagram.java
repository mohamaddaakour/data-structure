import java.util.HashMap;
import java.util.Map;

public class validAnagram {

    public static boolean validAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> occurences1 = new HashMap<>();
        Map<Character, Integer> occurences2 = new HashMap<>();

        for (char c: str1.toCharArray()) {
            if (occurences1.containsKey(c)) {
                occurences1.put(c, occurences1.get(c) + 1);
            } else {
                occurences1.put(c, 1);
            }
        }

        for (char c: str2.toCharArray()) {
            if (occurences2.containsKey(c)) {
                occurences2.put(c, occurences2.get(c) + 1);
            } else {
                occurences2.put(c, 1);
            }
        }

        System.out.println(occurences1);
        System.out.println(occurences2);

        return occurences1.equals(occurences2);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(validAnagram.validAnagram("anagram", "nagaram"));
        System.out.println(validAnagram.validAnagram("rat", "car"));
    }
}