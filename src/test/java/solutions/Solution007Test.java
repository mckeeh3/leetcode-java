package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution007.
 */
public class Solution007Test {
    @Test
    public void reverse123is321() {
        Solution007 solution007 = new Solution007();
        assertEquals(321, solution007.reverse(123));
    }

    @Test
    public void reverseNegative123isNegative321() {
        Solution007 solution007 = new Solution007();
        assertEquals(-321, solution007.reverse(-123));
    }

    @Test
    public void reverse1534236469is0() {
        Solution007 solution007 = new Solution007();
        assertEquals(0, solution007.reverse(1534236469));
    }

    @Test
    public void reverse1463847412is2147483641() {
        Solution007 solution007 = new Solution007();
        assertEquals(2147483641, solution007.reverse(1463847412));
    }
}
