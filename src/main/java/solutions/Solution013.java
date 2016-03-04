package solutions;

/**
 * Given a roman numeral, convert it to an integer.
 * <p>Input is guaranteed to be within the range from 1 to 3999.</p>
 *
 * @see <a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a>
 */
public class Solution013 {
    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        } else {
            char[] numerals = s.toCharArray();
            char previous;
            char current;
            int value = 0;

            for (int n = 0; n < numerals.length; n++) {
                previous = n > 0 ? numerals[n - 1] : ' ';
                current = numerals[n];

                if (n > 0 && previous == 'I' && current == 'V') {
                    value = value - 1 + 4;
                } else if (n > 0 && previous == 'I' && current == 'X') {
                    value = value - 1 + 9;
                } else if (n > 0 && previous == 'X' && current == 'L') {
                    value = value - 10 + 40;
                } else if (n > 0 && previous == 'X' && current == 'C') {
                    value = value - 10 + 90;
                } else if (n > 0 && previous == 'C' && current == 'D') {
                    value = value - 100 + 400;
                } else if (n > 0 && previous == 'C' && current == 'M') {
                    value = value - 100 + 900;
                } else if (current == 'I') {
                    value += 1;
                } else if (current == 'V') {
                    value += 5;
                } else if (current == 'X') {
                    value += 10;
                } else if (current == 'L') {
                    value += 50;
                } else if (current == 'C') {
                    value += 100;
                } else if (current == 'D') {
                    value += 500;
                } else if (current == 'M') {
                    value += 1000;
                }
            }
            return value;
        }
    }
}
