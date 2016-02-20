package solutions;

/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the
 * Hamming weight).
 * <p>For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the
 * function should return 3.</p>
 *
 * @see <a href="https://leetcode.com/problems/number-of-1-bits/">191. Number of 1 Bits</a>
 */
public class Solution191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if (n == Integer.MIN_VALUE) {
            return 1;
        } else {
            int bitCount = 0;
            boolean negative = n < 0;
            n = n < 0 ? ~n : n;

            while (n != 0) {
                bitCount += (n >> 1) << 1 == n ? 0 : 1;
                n = n >> 1;
            }
            return negative ? 32 - bitCount : bitCount;
        }
    }
}
