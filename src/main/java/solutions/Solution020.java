package solutions;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is
 * valid.
 * <p>The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.</p>
 *
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
 */
public class Solution020 {
    public boolean isValid(String s) {
        return s == null || s.isEmpty() || balance(s, 0, ' ') >= 0;
    }

    private int balance(String s, int pos, char close) {
        char[] chars = s.toCharArray();

        while (pos >= 0 && pos < chars.length) {
            if (chars[pos] == close && close != ' ') {
                return pos + 1;
            } else if (isCloseParentheses(chars[pos])) {
                return -1;
            } else if (isOpenParentheses(chars[pos])) {
                pos = balance(s, pos + 1, closeCharacter(chars[pos]));
            } else {
                pos++;
            }
        }
        return close == ' ' ? pos : -1;
    }

    private boolean isOpenParentheses(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean isCloseParentheses(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private char closeCharacter(char openCharacter) {
        if (openCharacter == '(') {
            return ')';
        } else if (openCharacter == '{') {
            return '}';
        } else if (openCharacter == '[') {
            return ']';
        } else {
            return openCharacter;
        }
    }
}
