package solutions;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>For example, given input 43261596 (represented in binary as <b>00000010100101000001111010011100</b>), return
 * 964176192 (represented in binary as <b>00111001011110000010100101000000</b>).</p>
 *
 * @see <a href="https://leetcode.com/problems/reverse-bits/">190. Reverse Bits</a>
 */
public class Solution190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == Integer.MIN_VALUE) {
            return 1;
        } else {
            int reversed = n < 0 ? 1 : 0;
            int bit;

            for (int i = 1; i <= 32; i++) {
                bit = (n >>> 1) << 1 == n ? 0 : 1;
                reversed = (reversed << 1) + bit;
                n = n >>> 1;
            }
            return reversed;
        }
    }
}
