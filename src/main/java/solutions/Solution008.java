package solutions;

/**
 * Implement atoi to convert a string to an integer.
 *
 * @see <a href="https://leetcode.com/problems/string-to-integer-atoi/">8. String to Integer (atoi)</a>
 */
public class Solution008 {
    public int myAtoi(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        long result = 0;
        boolean negate = false;
        String digits = parseNumber(str);

        for (char d : digits.toCharArray()) {
            if (d >= '0' && d <= '9') {
                result = result * 10 + d - '0';
            } else if (d == '-') {
                negate = true;
            }
        }

        if (!negate && (digits.length() > 11 || result < 0)) {
            result = Integer.MAX_VALUE;
        } else if (negate && (digits.length() > 11 || result < 0)) {
            result = Integer.MIN_VALUE;
            negate = false;
        }

        result = negate ? result * -1 : result;

        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }
        return (int) result;
    }

    private String parseNumber(String str) {
        boolean inDigits = false;
        String number = "";
        for (char d : str.trim().toCharArray()) {
            if (!inDigits && (d == '-' || d == '+' || d >= '0' && d <= '9')) {
                inDigits = true;
                number = String.valueOf(d);
            } else if (inDigits && !(d >= '0' && d <= '9')) {
                return number.length() == 1 && (number.charAt(0) == '-' || number.charAt(0) == '+') ? "" : number;
            } else if (inDigits && d >= '0' && d <= '9') {
                number += d;
            } else if (!inDigits) {
                break;
            }
        }
        return number;
    }
}
