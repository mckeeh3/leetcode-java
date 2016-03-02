package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:<br>1, 11, 21, 1211, 111221, ...
 * <p>1 is read off as "one 1" or 11.<br>
 * 11 is read off as "two 1s" or 21.<br>
 * 21 is read off as "one 2, then one 1" or 1211.</p>
 * <p>Given an integer n, generate the nth sequence.</p>
 *
 * @see <a href="https://leetcode.com/problems/count-and-say/">38. Count and Say</a>
 */
public class Solution038 {
    public String countAndSay(int n) {
        if (n < 1) {
            return "";
        } else if (n == 1) {
            return "1";
        } else {
            return countAndSay(n - 1, "1");
        }
    }

    private String countAndSay(int n, String said) {
        List<Character> say = new ArrayList<>();
        char currentDigit = ' ';
        int count = 1;
        char[] digits = said.toCharArray();

        for (char digit : digits) {
            if (currentDigit == ' ') {
                currentDigit = digit;
                count = 1;
            } else if (digit == currentDigit) {
                count++;
            } else {
                appendCountAndSay(count, currentDigit, say);
                currentDigit = digit;
                count = 1;
            }
        }
        appendCountAndSay(count, currentDigit, say);

        if (n <= 1) {
            return String.valueOf(result(say));
        } else {
            return countAndSay(--n, String.valueOf(result(say)));
        }
    }

    private void appendCountAndSay(int count, char digit, List<Character> say) {
        for (char c : String.valueOf(count).toCharArray()) {
            say.add(c);
        }
        say.add(digit);
    }

    private String result(List<Character> result) {
        char[] say = new char[result.size()];
        for (int i = 0; i < result.size(); i++) {
            say[i] = result.get(i);
        }
        return new String(say);
    }
}
