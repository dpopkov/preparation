package learn.core.jcproblems.p01stringsnumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Counting duplicate characters.
 */
public class P01CountDupes {
    /**
     * Returns the count of first non-unique character.
     */
    public int countDuplicatesNaiveWay(String s) {
        int len = s.length();
        for (int i = 0; i < len - 1; i++) {
            int count = 1;
            char ch = s.charAt(i);
            for (int j = i + 1; j < len; j++) {
                if (ch == s.charAt(j)) {
                    count++;
                }
            }
            if (count != 1) {
                return count;
            }
        }
        return -1;
    }

    /**
     * Counts all characters.
     * @return map of characters to number of occurrencies
     */
    public Map<Character, Long> countAllDuplicates(String s) {
        Map<Character, Long> result = new HashMap<>();
        for (char ch : s.toCharArray()) {
            result.compute(ch, (c, oldCount) -> oldCount == null ? 1L : ++oldCount);
        }
        return result;
    }

    public Map<Character, Long> countAllDuplicatesUsingStream(String s) {
        return s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
