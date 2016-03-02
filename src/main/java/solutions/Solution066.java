package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * <p>The digits are stored such that the most significant digit is at the head of the list.</p>
 *
 * @see <a href="https://leetcode.com/problems/plus-one/">66. Plus One</a>
 */
public class Solution066 {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        List<Integer> result = new ArrayList<>();
        for (int d = digits.length - 1; d >= 0; d--) {
            if (digits[d] == 9) {
                if (carry == 1) {
                    result.add(0);
                } else {
                    result.add(9);
                    carry = 0;
                }
            } else {
                result.add(digits[d] + carry);
                carry = 0;
            }
        }
        if (carry == 1) {
            result.add(1);
        }
        return reverse(result);
    }

    private int[] reverse(List<Integer> result) {
        int[] answer = new int[result.size()];
        int pos = result.size() - 1;
        for (int digit : result) {
            answer[pos--] = digit;
        }
        return answer;
    }
}
