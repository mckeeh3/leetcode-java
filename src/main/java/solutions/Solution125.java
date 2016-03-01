package solutions;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * @see <a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a>
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        } else if (s.isEmpty()) {
            return true;
        } else {
            char[] forward = forward(s);
            char[] reverse = reverse(forward);

            return compare(forward, reverse);
        }
    }

    private char[] forward(String s) {
        char[] forward = new char[s.length()];
        int pos = 0;
        int toLowerCase = 'a' - 'A';

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                forward[pos++] = c;
            } else if (c >= 'A' && c <= 'Z') {
                forward[pos++] = (char) (c + toLowerCase);
            }
        }
        return forward;
    }

    private char[] reverse(char[] forward) {
        char[] reverse = new char[forward.length];
        int posForward = forward.length;
        int posReverse = 0;

        for (int i = 0; i < reverse.length; i++) {
            if (forward[--posForward] > 0) {
                reverse[posReverse++] = forward[posForward];
            }
        }
        return reverse;
    }

    private boolean compare(char[] forward, char[] reverse) {
        for (int i = 0; i < forward.length; i++) {
            if (forward[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }
}
