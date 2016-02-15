package solutions;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *
 * @see <a href="https://leetcode.com/problems/add-digits/">258. Add Digits</a>
 */
public class Solution258 {
    public int addDigits(int num) {
        String digits = "" + num;
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            sum += digits.charAt(i) - '0';
        }
        if (sum < 10) {
            return sum;
        } else {
            return addDigits(sum);
        }
    }
}
