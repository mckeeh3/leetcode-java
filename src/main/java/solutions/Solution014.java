package solutions;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">14. Longest Common Prefix</a>
 */
public class Solution014 {
    public String longestCommonPrefix(String[] strs) {
        int prefixLength = 0;
        boolean looking = true;

        if (strs == null || strs.length < 1) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        } else {
            while (looking) {
                for (int w = 0; w < strs.length && looking; w++) {
                    if (w > 0 && !compareCharacters(prefixLength, strs[w], strs[w - 1])) {
                        looking = false;
                    }
                }
                prefixLength += looking ? 1 : 0;
            }
        }
        return strs[0].substring(0, prefixLength);
    }

    private boolean compareCharacters(int pos, String s1, String s2) {
        return s1 != null && s2 != null && s1.length() > pos && s2.length() > pos && s1.charAt(pos) == s2.charAt(pos);
    }
}
