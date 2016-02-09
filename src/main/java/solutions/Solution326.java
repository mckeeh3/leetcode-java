package solutions;

/**
 * Given an integer, write a function to determine if it is a power of three.
 *
 * @see <a href="https://leetcode.com/problems/power-of-three/">326. Power of Three</a>
 */
public class Solution326 {

    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }

        return true;
    }
}
