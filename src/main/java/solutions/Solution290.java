package solutions;

import java.util.Map;
import java.util.TreeMap;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 *
 * @see <a href="https://leetcode.com/problems/word-pattern/">290. Word Pattern</a>
 */
public class Solution290 {
    private final String patternChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public boolean wordPattern(String pattern, String str) {
        String patternFound = "";
        Map<String, String> tokens = new TreeMap<>();
        int pos = 0;

        for (String word : str.split(" ")) {
            if (!tokens.containsKey(word)) {
                tokens.put(word, patternChars.substring(pos, pos+1));
                pos++;
            }
            patternFound += tokens.get(word);
        }

        return patternConvert(pattern).equals(patternFound.replaceAll(" ", "").toLowerCase());
    }

    private String patternConvert(String pattern) {
        int pos = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pos < patternChars.length() && pattern.charAt(i) >= 'a') {
                pattern = pattern.replace(pattern.charAt(i), patternChars.charAt(pos++));
            }
        }
        return pattern.toLowerCase();
    }
}
