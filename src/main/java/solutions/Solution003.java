package solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters. For example, the longest
 * substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest
 * substring is "b", with the length of 1.
 *
 * @see
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">3. Longest Substring Without Repeating Characters</a>
 */
public class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        int pos = 0;
        SubString subString = null;
        SubString nextSubString;
        char[] chars = s.toCharArray();

        do {
            nextSubString = findSubString(chars, pos);
            if (nextSubString.length() > (subString == null ? 0 : subString.length())) {
                subString = nextSubString;
            }

            pos = nextSubString.to;
        } while (pos < s.length());

        return subString == null ? 0 : subString.length();
    }

    private SubString findSubString(char[] chars, int pos) {
        int from = pos;
        int to = pos + 1;
        Set<Character> seen = new HashSet<>();
        boolean noDuplicates = true;

        for (int i = from; noDuplicates && i >= 0; i--) {
            if (seen.contains(chars[i])) {
                from = i + 1;
                noDuplicates = false;
            } else {
                seen.add(chars[i]);
            }
        }

        noDuplicates = true;
        for (int i = to; noDuplicates && i <= chars.length; i++) {
            if (i == chars.length) {
                to = i;
            } else if (seen.contains(chars[i])) {
                to = i;
                noDuplicates = false;
            } else {
                seen.add(chars[i]);
            }
        }

        return new SubString(from, to);
    }

    private static class SubString {
        final int from;
        final int to;

        SubString(int from, int to) {
            this.from = from;
            this.to = to;
        }

        int length() {
            return to - from;
        }

        @Override
        public String toString() {
            return String.format("%s[%d, %d (%d)]", getClass().getSimpleName(), from, to, length());
        }
    }
}
