package solutions;

/**
 * Reverse digits of an integer.
 * <p><b>Example1:</b> x = 123, return 321
 * </p><b>Example2:</b> x = -123, return -321</p>
 *
 * @see <a href="https://leetcode.com/problems/reverse-integer/">7. Reverse Integer</a>
 */
public class Solution007 {
    public int reverse(int x) {
        long reversed = 0;
        boolean negate = false;
        if (x < 0) {
            x = x * -1;
            negate = true;
        }

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return reversed > Integer.MAX_VALUE ? 0 : negate ? (int) reversed * -1 : (int) reversed;
    }
}
