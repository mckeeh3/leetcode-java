package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * @see <a href="https://leetcode.com/problems/add-binary/">67. Add Binary</a>
 */
public class Solution067 {
    public String addBinary(String a, String b) {
        char carry = '0';
        List<Character> result = new ArrayList<>();
        char[] aChars = a == null ? new char[0] : a.toCharArray();
        char[] bChars = b == null ? new char[0] : b.toCharArray();
        int aPos = aChars.length - 1;
        int bPos = bChars.length - 1;

        for (int c = 0; c < Math.max(aChars.length, bChars.length); c++) {
            char aChar = charAt(aChars, aPos--);
            char bChar = charAt(bChars, bPos--);

            if (aChar == '0' && bChar == '0') {
                result.add(carry);
                carry = '0';
            } else if (aChar == '1' && bChar == '1') {
                result.add(carry);
                carry = '1';
            } else if (carry == '1') {
                result.add('0');
                carry = '1';
            } else {
                result.add('1');
                carry = '0';
            }
        }
        if (carry == '1') {
            result.add('1');
        }
        return resultReverse(result);
    }

    private char charAt(char[] chars, int pos) {
        return pos >= 0 ? chars[pos] : '0';
    }

    private String resultReverse(List<Character> result) {
        char[] reverse = new char[result.size()];
        int pos = 0;

        for (int c = result.size() - 1; c >= 0; c--) {
            reverse[pos++] = result.get(c);
        }
        return new String(reverse);
    }
}
