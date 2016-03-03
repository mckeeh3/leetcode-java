package solutions;

/**
 * implement strStr().
 * <p>Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.</p>
 *
 * @see <a href="https://leetcode.com/problems/implement-strstr/">28. Implement strStr()</a>
 */
public class Solution028 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        } else {
            return haystack.indexOf(needle);
        }
    }
}
