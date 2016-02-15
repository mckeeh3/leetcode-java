package solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 *
 * @see <a href="https://leetcode.com/problems/valid-anagram/">242. Valid Anagram</a>
 */
public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }

        Map<Integer, Integer> word = new HashMap<>(t.length());
        for (char c : t.toCharArray()) {
            int key = Character.getNumericValue(c);
            if (word.containsKey(key)) {
                word.put(key, word.get(key) + 1);
            } else {
                word.put(key, 1);
            }
        }

        for (char c : s.toCharArray()) {
            int key = Character.getNumericValue(c);
            if (word.containsKey(key)) {
                word.put(key, word.get(key) - 1);
            }
        }

        for (int key : word.keySet()) {
            if (word.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}
