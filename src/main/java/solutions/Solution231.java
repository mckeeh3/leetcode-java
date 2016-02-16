package solutions;

/**
 * Given an integer, write a function to determine if it is a power of two.
 *
 * @see <a href="https://leetcode.com/problems/power-of-two/">231. Power of Two</a>
 */
public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
