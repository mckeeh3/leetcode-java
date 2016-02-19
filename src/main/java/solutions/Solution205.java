package solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p>Two strings are isomorphic if the characters in s can be replaced to get t.</p>
 * <p>All occurrences of a character must be replaced with another character while preserving the order of characters
 * . No two characters may map to the same character but a character may map to itself.</p>
 * <p>For example,
 * <br>Given "egg", "add", return true.
 * <br>Given "foo", "bar", return false.
 * <br>Given "paper", "title", return true.
 * </p>
 *
 * @see <a href="https://leetcode.com/problems/isomorphic-strings/">205. Isomorphic Strings</a>
 */
public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        return s != null && t != null && s.length() == t.length() && s.equals(toIsomorphic(s, t));
    }

    private String toIsomorphic(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Map<Integer, Integer> replacements = new HashMap<>(s.length());
        Map<Integer, Integer> replaced = new HashMap<>(s.length());

        for (int i = 0; i < sChars.length; i++) {
            int sChar = sChars[i];
            int tChar = tChars[i];
            if (replacements.containsKey(sChar)) {
                if (tChar == replacements.get(sChar)) {
                    tChars[i] = (char) sChar;
                } else {
                    return null;
                }
            } else if (replaced.containsKey(tChar) && sChar != replaced.get(tChar)){
                return null;
            } else {
                replacements.put(sChar, tChar);
                replaced.put(tChar, sChar);
                tChars[i] = (char) sChar;
            }
        }
        return new String(tChars);
    }
}
