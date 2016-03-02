package solutions;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last
 * word in the string.
 * <p>If the last word does not exist, return 0.</p>
 *
 * @see <a href="https://leetcode.com/problems/length-of-last-word/">58. Length of Last Word</a>
 */
public class Solution058 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        } else {
            char[] chars = s.toCharArray();
            int lastAlpha = positionOfLastAlpha(chars);
            for (int pos = lastAlpha; pos >= 0; pos--) {
                if (chars[pos] == ' ') {
                    return lastAlpha - pos;
                }
            }
            return lastAlpha + 1;
        }
    }

    private int positionOfLastAlpha(char[] chars) {
        for (int pos = chars.length - 1; pos >= 0; pos--) {
            if (chars[pos] != ' ') {
                return pos;
            }
        }
        return -1;
    }
}
