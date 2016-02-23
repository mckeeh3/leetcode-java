package solutions;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p>Note: Your solution should be in logarithmic time complexity.</p>
 *
 * @see <a href="https://leetcode.com/problems/factorial-trailing-zeroes/">172. Factorial Trailing Zeroes</a>
 * @see <a href="https://en.wikipedia.org/wiki/Trailing_zero">Trailing zero</a>
 */
public class Solution172 {
    public int trailingZeroes(int n) {
        int zeros = 0;
        int p = 1;
        while (Math.pow(5, p) <= n) {
            zeros += n / (int) Math.pow(5, p++);
        }
        return zeros;
    }
}
